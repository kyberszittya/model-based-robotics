package hu.sze.aut.robot.kinematic.generator

import org.w3c.dom.Element
import org.w3c.dom.Document
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import java.util.ArrayList
import java.util.List
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Joint
import java.util.ArrayList
import org.eclipse.emf.ecore.util.EcoreUtil
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.JointControlType

class GenerateControlPlugin {
	
	public static def void generateControlConfigurationElement(Document doc, Element root_model, Robot robot, String prefix){
		val sub_robots = robot.templateinstantiation.filter[it.kinematicmodule instanceof Robot]
		System.out.println('''Generating control configuration for: «robot.name»''');
		if (sub_robots.size > 0){
			for (r: sub_robots)	{
				if (prefix.length > 0)
				{
					generateControlConfigurationElement(doc, root_model, r.kinematicmodule as Robot, prefix+"_"+r.name+"_")					
				}
				else
				{
					generateControlConfigurationElement(doc, root_model, r.kinematicmodule as Robot, r.name+"_")
				}
			}			
		}
		val root_control_plugin_element = doc.createElement("plugin")
		root_control_plugin_element.setAttribute("filename", "librobotlabor_control_ros2_gazebo.so")
		root_control_plugin_element.setAttribute("name", '''control_plugin_«robot.name»''')
		val root_robot_name = doc.createElement("robot_name")
		root_robot_name.textContent = prefix+robot.name
		root_control_plugin_element.appendChild(root_robot_name)
		val ArrayList<Joint> controlled_joints = new ArrayList<Joint>()
		robot.joint.filter[it.jointcontrol!==null].forEach[controlled_joints.add(it)]
		for (_t: robot.templateinstantiation.filter[!(it.kinematicmodule instanceof Robot)]){
			for (_j: _t.kinematicmodule.joint)
			{
				if (_j.jointcontrol!==null)
				{
					val Joint j = EcoreUtil.copy(_j)
					j.name = _t.name + "_" + j.name
					controlled_joints.add(j)
				}
			}
		}
		
		for (j: controlled_joints){
			val joint_element = doc.createElement("joint")
			val x_joint_name = doc.createElement("name")
			val x_control_type = doc.createElement("control_type")
			x_joint_name.textContent = "jnt_" + prefix + j.name
			switch(j.jointcontrol.type)
			{
				case JointControlType::POSITION: {
					x_control_type.textContent = "position"
				}
				case JointControlType::VELOCITY: {
					x_control_type.textContent = "velocity"
				}
				case JointControlType::EFFORT: {
					x_control_type.textContent = "effort"
				}
			}
			joint_element.appendChild(x_control_type)
			joint_element.appendChild(x_joint_name)
			root_control_plugin_element.appendChild(joint_element)
		}
		if (controlled_joints.size > 0)
		{
			root_model.appendChild(root_control_plugin_element)
		}
		
	}	
	
}