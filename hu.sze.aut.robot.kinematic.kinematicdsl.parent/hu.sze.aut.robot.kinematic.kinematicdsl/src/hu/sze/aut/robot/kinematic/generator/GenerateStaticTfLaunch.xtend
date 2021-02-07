package hu.sze.aut.robot.kinematic.generator

import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Link
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Set
import java.util.HashSet
import java.util.Deque
import java.util.LinkedList
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Joint
import java.util.HashMap
import java.util.Map
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sensor
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.DocumentBuilder
import org.w3c.dom.Document
import org.w3c.dom.Element
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Pose

class LinkNode{
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) Link link
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) Joint joint
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) LinkNode parent
	
	new(Link link, Joint joint, LinkNode parent){
		this.link = link
		this.joint = joint
		this.parent = parent
	}
	
	new(Link link){
		this.link = link
		this.joint = null
		this.parent = null
	}
}



class GenerateStaticTfLaunch {
	
	def static generatePoseArguments(Pose pose){
		if (pose.rotation !== null && pose.position !== null){
			return '''«pose.position.x»', '«pose.position.y»', '«pose.position.z»','«
				            	UtilityMath.degToRad(pose.rotation.roll)»', '«
				            	UtilityMath.degToRad(pose.rotation.pitch)»', '«
				            	UtilityMath.degToRad(pose.rotation.yaw)»'''
		}
		else if (pose.position !== null){
			return '''«pose.position.x»', '«pose.position.y»', '«pose.position.z»','«
				            	0.0»', '«0.0»', '«0.0»'''
		}
	}	
	
	def static generateTfLaunch(Set<Joint> joints)'''
	import launch
	import launch.actions
	import launch.substitutions
	import launch_ros.actions
	
	
	def generate_launch_description():
	    return launch.LaunchDescription([
	        launch.actions.DeclareLaunchArgument(
	            'node_prefix',
	            default_value=[launch.substitutions.EnvironmentVariable('USER'), '_'],
	            description='Prefix for node names'),
	        «FOR Joint j: joints SEPARATOR ','»
	        launch_ros.actions.Node(
	            package='tf2_ros', node_executable='static_transform_publisher', 
	            output='screen',
	            arguments=['«generatePoseArguments(j.pose)»', '«j.parent.name»', '«j.child.name»'],
	            node_name=[launch.substitutions.LaunchConfiguration('node_prefix'), 'broadcast_«j.name»'])
	        «ENDFOR»          
	    ])
	'''
	
	def static traverseTfLaunchSensors(Robot robot){
		val Set<String> visited_link_name = new HashSet
		val first_node = new LinkNode(robot.root_element)
		val Deque<LinkNode> fringe = new LinkedList
		fringe.push(first_node)
		// Store sensors map
		val Map<String, Link> sensor_map = new HashMap
		for (Sensor s: robot.sensor){
			sensor_map.put(s.parent.name, s.parent)
		}
		// Store resultant paths (only edges are required i.e joints)
		val Set<Joint> result_joints =  new HashSet()
		// BFS the whole
		while (!fringe.isEmpty){
			val current_node = fringe.pop
			visited_link_name.add(current_node.link.name)
			if (sensor_map.containsKey(current_node.link.name)){
				// Found a backtrack path, iterate back
				var backtrack_node = current_node
				while (backtrack_node.parent!==null){
					result_joints.add(backtrack_node.joint)
					backtrack_node = backtrack_node.parent
				}
			}
			else{
				for (Joint j: current_node.link.child_joint){
					if (!visited_link_name.contains(j.child.name)){
						val visited_node = new LinkNode(j.child, j, current_node)
						fringe.add(visited_node)			
					}
				}
			}			
		}
		return result_joints
	}
}