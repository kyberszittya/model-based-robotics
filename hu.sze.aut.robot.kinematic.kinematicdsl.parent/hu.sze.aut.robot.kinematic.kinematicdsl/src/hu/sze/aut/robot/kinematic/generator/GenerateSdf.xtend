package hu.sze.aut.robot.kinematic.generator

import org.w3c.dom.Document
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.GeometryDescription
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Visual
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Collision
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Inertia
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Geometry
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.BeamBlockDefinition
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.RangeDefinition
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.LaserScanner
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Camera
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.CameraObjective
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Imu
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sensor
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.TranslationalFriction
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.TorsionalFriction
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Link
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Joint
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.ControlModel
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.DocumentBuilder
import org.w3c.dom.Element
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Cube
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sphere
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Cylinder
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Mesh
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.JointType
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.CustomControlModel
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.DifferentialRobotModel
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Lidar

class GenerateSdf extends AbstractGazeboGenerator {
	
	def static generateConfig(Robot robot){
		// Typical steps to create XML file
		val DocumentBuilderFactory factory_doc_builder = DocumentBuilderFactory.newInstance()
		val DocumentBuilder doc_builder = factory_doc_builder.newDocumentBuilder
		val Document doc = doc_builder.newDocument
		val Element root_element = doc.createElement("model")
		
		val name_element = doc.createElement("name")
		name_element.textContent = robot.name
		root_element.appendChild(name_element)
		val version_element = doc.createElement("sdf")
		version_element.setAttribute("version", "1.6")
		version_element.textContent = "model.sdf"
		root_element.appendChild(version_element)
		
		return root_element
	}
	
	override generateGeometryElement(Document doc, GeometryDescription geometry) {
		val Element element = doc.createElement("geometry")
		// Generate cube
		if (geometry instanceof Cube){
			val Cube geom = geometry as Cube
			val Element geom_element = doc.createElement("box")
			val Element size_element = doc.createElement("size")
			size_element.textContent = '''«geom.sx» «geom.sy» «geom.sz»'''
			geom_element.appendChild(size_element)
			element.appendChild(geom_element)
		}
		// Generate sphere
		else if (geometry instanceof Sphere){
			val Sphere geom = geometry as Sphere
			val Element geom_element = doc.createElement("sphere")
			val Element radius_element = doc.createElement("radius")
			radius_element.textContent = geom.radius.toString
			geom_element.appendChild(radius_element)
			element.appendChild(geom_element)
		}
		// Generate cylinder
		else if (geometry instanceof Cylinder){
			val Cylinder geom = geometry as Cylinder
			val Element geom_element = doc.createElement("cylinder")
			val Element radius_element = doc.createElement("radius")
			radius_element.textContent = geom.radius.toString
			geom_element.appendChild(radius_element)
			val Element length_element = doc.createElement("length")
			length_element.textContent = geom.height.toString
			geom_element.appendChild(length_element)
			element.appendChild(geom_element)
		}
		// Generate mesh element
		else if (geometry instanceof Mesh){
			val Element geom_element = doc.createElement("mesh")
			// Filename
			val Element filename_element = doc.createElement("uri")
			filename_element.textContent = geometry.filepath
			geom_element.appendChild(filename_element)
			// Scale
			val Element scale_element = doc.createElement("scale")
			scale_element.textContent = '''«geometry.sx» «geometry.sy» «geometry.sz»'''
			geom_element.appendChild(scale_element)
			element.appendChild(geom_element)
		}		
		return element
	}
	
	override generateVisualElement(Document doc, Link link, Visual visual) {
		val Element element = doc.createElement("visual")
		element.setAttribute("name", "viz_"+link.name)
		// Add origin if it exists
		if (visual.offset!==null){
			val Element origin_element = doc.createElement("pose")
			origin_element.textContent = '''«visual.offset.position.x» «
											 visual.offset.position.y» «
											 visual.offset.position.z» «
											 UtilityMath.degToRad(visual.offset.rotation.roll)» «
							 				 UtilityMath.degToRad(visual.offset.rotation.pitch)» «
							 				 UtilityMath.degToRad(visual.offset.rotation.yaw)»'''
			element.appendChild(origin_element)
		}
		// Geometry added
		element.appendChild(generateGeometryElement(doc, visual.geometrydescription))
		return element
	}
	
	override generateCollisionElement(Document doc, Link link, Collision collision) {
		val Element element = doc.createElement("collision")
		element.setAttribute("name", "coll_"+link.name)
		if (collision.offset!==null){
			val Element origin_element = doc.createElement("pose")
			origin_element.textContent = '''«collision.offset.position.x» «
											 collision.offset.position.y» «
											 collision.offset.position.z» «
											 UtilityMath.degToRad(collision.offset.rotation.roll)» «
							 				 UtilityMath.degToRad(collision.offset.rotation.pitch)» «
							 				 UtilityMath.degToRad(collision.offset.rotation.yaw)»'''
			element.appendChild(origin_element)
		}
		element.appendChild(generateGeometryElement(doc, collision.geometrydescription))
		return element
	}
	
	override generateInertiaElement(Document doc, Inertia inertia, Geometry ref_geometry) {
		val Element element = doc.createElement("inertial")
		// Mass
		val Element mass_element = doc.createElement("mass")
		mass_element.textContent = inertia.mass.toString
		element.appendChild(mass_element)
		// Inertia matrix
		val Element inertia_element = doc.createElement("inertia")
		if (inertia.inertiamatrix!==null){
			val ixx_element = doc.createElement("ixx")
			ixx_element.textContent = inertia.inertiamatrix.ixx.toString
			inertia_element.appendChild(ixx_element)
			val ixy_element = doc.createElement("ixy")
			ixy_element.textContent = inertia.inertiamatrix.ixy.toString
			inertia_element.appendChild(ixy_element)
			val ixz_element = doc.createElement("ixz") 
			ixz_element.textContent = inertia.inertiamatrix.ixz.toString
			inertia_element.appendChild(ixz_element)
			val iyy_element = doc.createElement("iyy") 
			iyy_element.textContent = inertia.inertiamatrix.iyy.toString
			inertia_element.appendChild(iyy_element)
			val iyz_element = doc.createElement("iyz") 
			iyz_element.textContent = inertia.inertiamatrix.iyz.toString
			inertia_element.appendChild(iyz_element)
			val izz_element = doc.createElement("izz") 
			izz_element.textContent = inertia.inertiamatrix.izz.toString
			inertia_element.appendChild(izz_element)
		}
		else
		{
			val new_inertia = PhysicalCalculations.calcInertia(ref_geometry.geometrydescription, inertia)
			val ixx_element = doc.createElement("ixx")
			ixx_element.textContent = new_inertia.inertiamatrix.ixx.toString
			inertia_element.appendChild(ixx_element)
			val ixy_element = doc.createElement("ixy")
			ixy_element.textContent = new_inertia.inertiamatrix.ixy.toString
			inertia_element.appendChild(ixy_element)
			val ixz_element = doc.createElement("ixz") 
			ixz_element.textContent = new_inertia.inertiamatrix.ixz.toString
			inertia_element.appendChild(ixz_element)
			val iyy_element = doc.createElement("iyy") 
			iyy_element.textContent = new_inertia.inertiamatrix.iyy.toString
			inertia_element.appendChild(iyy_element)
			val iyz_element = doc.createElement("iyz") 
			iyz_element.textContent = new_inertia.inertiamatrix.iyz.toString
			inertia_element.appendChild(iyz_element)
			val izz_element = doc.createElement("izz") 
			izz_element.textContent = new_inertia.inertiamatrix.izz.toString
			inertia_element.appendChild(izz_element)
		}
		element.appendChild(inertia_element)
		if (inertia.pose !== null)
		{
			val Element origin_element = doc.createElement("pose")
			origin_element.textContent = '''«inertia.pose.position.x» «
											inertia.pose.position.y» «
											inertia.pose.position.z» «
											UtilityMath.degToRad(inertia.pose.rotation.roll)» «
											UtilityMath.degToRad(inertia.pose.rotation.pitch)» «
											UtilityMath.degToRad(inertia.pose.rotation.yaw)»'''
			element.appendChild(origin_element)
		}
		return element
	}	
	
	
	override createSensorElement(Document doc, Sensor sensor) {
		val Element sensor_element = doc.createElement("sensor")
		sensor_element.setAttribute("type", "ray")
		sensor_element.setAttribute("name", "sensor_"+sensor.name)
		// Update freq rate
		val freq_element = doc.createElement("update_rate")
		freq_element.textContent = sensor.freq.toString
		sensor_element.appendChild(freq_element)
		// Set it always on
		val always_on_element = doc.createElement("always_on")
		always_on_element.textContent = "true"
		sensor_element.appendChild(always_on_element)
		// Sensor specific stuff
		// Setup cameras
		if (sensor instanceof Camera){
			if (sensor.cameraobjective.length == 1){
				switch (sensor.image_type){
					case RGB: {
						sensor_element.setAttribute("type", "camera")					
					}
					case DEPTH: {
						sensor_element.setAttribute("type", "depth")
					} 
				}			
			}
			else {
				sensor_element.setAttribute("type", "multicamera")
			}
			for (c: sensor.cameraobjective){
				sensor_element.appendChild(createCameraObjectiveElement(doc, c))
				
			}
			sensor_element.appendChild(createCameraPlugin(doc, sensor))
		}
		// Setup laser scanner and LiDAR
		else if (sensor instanceof LaserScanner){
			val ray_element = doc.createElement("ray")
			val scan_element = doc.createElement("scan")
			scan_element.appendChild(createBeamBlockDefinition(doc, sensor.horizontal, "horizontal"))
				
			if (sensor instanceof Lidar){
				// This is a LIDAR there is setup for vertical beam range too
				scan_element.appendChild(createBeamBlockDefinition(doc, sensor.vertical, "vertical"))								
			}
			ray_element.appendChild(scan_element)
			ray_element.appendChild(createRangeDefinition(doc, sensor.range))
			sensor_element.appendChild(createRangePluginElement(doc, sensor))
			sensor_element.appendChild(ray_element)		
		}
		// Setup IMU
		else if (sensor instanceof Imu){
			sensor_element.setAttribute("type", "imu")
			
		}
		return sensor_element
	}
	
	override createLinkTranslationalFriction(Document doc, TranslationalFriction friction) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override createLinkTorsionalFriction(Document doc, TorsionalFriction friction) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override createFrictionElement(Document doc, Link link) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override createLinkElement(Document doc, Link link) {
		val Element link_element = doc.createElement("link")
		link_element.setAttribute("name", link.name)
		var Element pose_element = null;
		if (link.pose !== null)
		{
			pose_element = doc.createElement("pose")
			pose_element.appendChild(doc.createTextNode('''«link.pose.position.x» «
				link.pose.position.y» «
				link.pose.position.z» «
				UtilityMath.degToRad(link.pose.rotation.roll)» «
				UtilityMath.degToRad(link.pose.rotation.pitch)» «
				UtilityMath.degToRad(link.pose.rotation.yaw)»'''
			))
		}
		if (link.parent_joint !== null)
		{
			if (pose_element === null)
				pose_element = doc.createElement("pose")
			pose_element.setAttribute("relative_to", link.parent_joint.name)
			
		}
		// Set up origin
		if (link.parent_joint?.jointtype === JointType::FIXED){
			if (pose_element === null)
				pose_element = doc.createElement("pose")
			pose_element.setAttribute("relative_to", "frame_"+link.parent_joint.name)
			
		}
		if (pose_element !== null)
		{
			link_element.appendChild(pose_element)
		}
		// Add visual elements of the link
		for (Visual v: link.visual){	
			link_element.appendChild(generateVisualElement(doc, link, v))			
		}
		// Add collision elements of the link
		for (Collision c: link.collision){
			link_element.appendChild(generateCollisionElement(doc, link, c))
		}
		// Add inertia elements
		for (Inertia i: link.inertia){
			// TODO: think a little about 
			link_element.appendChild(generateInertiaElement(doc, i, link.collision.head))
		}
		// Sensors
		if (link.sensor !== null)
		{
			link_element.appendChild(createSensorElement(doc, link.sensor))		
		}
		return link_element
	}
	
	def createFrame(Document doc, Joint jnt){
		val Element frame_element = doc.createElement("frame")
		frame_element.setAttribute("name", "frame_"+jnt.name)
		// Pose
		val Element pose_element = doc.createElement("pose")
		pose_element.textContent = '''«jnt.pose.position.x» «
									   jnt.pose.position.y» «
									   jnt.pose.position.z» «
									   UtilityMath.degToRad(jnt.pose.rotation.roll)» «
							 		   UtilityMath.degToRad(jnt.pose.rotation.pitch)» «
    					 			   UtilityMath.degToRad(jnt.pose.rotation.yaw)»'''
    	frame_element.appendChild(pose_element)
		// Attach to a top joint
		frame_element.setAttribute("attached_to", jnt.parent.name)
		return frame_element
	}
	
	override createJointElement(Document doc, Joint jnt) {
		val Element jnt_element = doc.createElement("joint")
		jnt_element.setAttribute("name", jnt.name)
		// Set type
		switch (jnt.jointtype){
			case CONTINUOUS: {
				jnt_element.setAttribute("type", "revolute")
			}
			case FIXED: {
				jnt_element.setAttribute("type", "fixed")				
			}
			case ROTATIONAL: {
				jnt_element.setAttribute("type", "revolute")
			}
			case TRANSLATIONAL: {
				jnt_element.setAttribute("type", "prismatic")
			}
		}
		// Set axis
		if (jnt.axis !==null){
			val Element axis_element = doc.createElement("axis")
			val Element axis_xyz_element = doc.createElement("xyz")
			axis_xyz_element.textContent = '''«jnt.axis.ax» «jnt.axis.ay» «jnt.axis.az»'''
			axis_element.appendChild(axis_xyz_element)
			jnt_element.appendChild(axis_element)
		}
		// Physical parameter
		val Element dynamic_element = doc.createElement("dynamics")
		dynamic_element.setAttribute("damping", jnt.damping.toString)
		dynamic_element.setAttribute("friction", jnt.friction.toString)
		jnt_element.appendChild(dynamic_element)
		// Origin set up
		val Element pose_element = doc.createElement("pose")
		pose_element.setAttribute("relative_to", jnt.parent.name)
		pose_element.textContent = '''«jnt.pose.position.x» «
	  								   jnt.pose.position.y» «
									   jnt.pose.position.z» «
									   UtilityMath.degToRad(jnt.pose.rotation.roll)» «
							 		   UtilityMath.degToRad(jnt.pose.rotation.pitch)» «
    					 			   UtilityMath.degToRad(jnt.pose.rotation.yaw)»'''	
		jnt_element.appendChild(pose_element)
		// Parent & child links
		val Element child_link = doc.createElement("child")
		child_link.textContent = jnt.child.name
		jnt_element.appendChild(child_link)
		val Element parent_link = doc.createElement("parent")
		parent_link.textContent = jnt.parent.name
		jnt_element.appendChild(parent_link)
		return jnt_element
	}
	
	override constructControlPluginElement(Document doc, Robot robot, ControlModel controlmodel) {
		val Element plugin_element = doc.createElement("plugin")		
		if (controlmodel instanceof DifferentialRobotModel){
			// Plugin element parameters			
			plugin_element.setAttribute("name", robot.name+"_diff_drive")
			plugin_element.setAttribute("filename", "libgazebo_ros_diff_drive.so")
			// Joint
			// Left joint
			val Element left_joint_element = doc.createElement("left_joint")
			left_joint_element.textContent = controlmodel.left_joint
			plugin_element.appendChild(left_joint_element)
			// Right joint
			val Element right_joint_element = doc.createElement("right_joint")
			right_joint_element.textContent = controlmodel.right_joint
			plugin_element.appendChild(right_joint_element)
			// Kinematic parameters
			val Element wheel_separation_element = doc.createElement("wheel_separation")
			wheel_separation_element.textContent = controlmodel.wheel_separation.toString
			plugin_element.appendChild(wheel_separation_element)
			val Element wheel_diameter_element = doc.createElement("wheel_diameter")
			wheel_diameter_element.textContent = controlmodel.wheel_diameter.toString
			plugin_element.appendChild(wheel_diameter_element)
			// Limits
			val Element max_wheel_torque_element = doc.createElement("max_wheel_torque")
			max_wheel_torque_element.textContent = (20.0).toString
			plugin_element.appendChild(max_wheel_torque_element)
			val Element max_wheel_acceleration_element = doc.createElement("max_wheel_acceleration")
			max_wheel_acceleration_element.textContent = (1.0).toString
			plugin_element.appendChild(max_wheel_acceleration_element)
			// ROS
			val Element ros_element = doc.createElement("ros")
			val Element namespace_element = doc.createElement("namespace")
			namespace_element.textContent = robot.name
			ros_element.appendChild(namespace_element)
			plugin_element.appendChild(ros_element)
			// Output
			val Element publish_odom_element = doc.createElement("publish_odom")
			publish_odom_element.textContent = "true"
			plugin_element.appendChild(publish_odom_element)
			val Element publish_odom_tf_element = doc.createElement("publish_odom_tf")
			publish_odom_tf_element.textContent = "true"
			plugin_element.appendChild(publish_odom_tf_element)
			val Element publish_wheel_tf_element = doc.createElement("publish_wheel_tf")
			publish_wheel_tf_element.textContent = "true"
			plugin_element.appendChild(publish_wheel_tf_element)
			// Frame
			val Element base_frame_element = doc.createElement("robot_base_frame")
			base_frame_element.textContent = robot.root_element.name
			plugin_element.appendChild(base_frame_element)
			
		}
		else if (controlmodel instanceof CustomControlModel){
			
		}
		// Wrap-up everything
		return plugin_element
	}
	
	override constructDescription(Robot robot) {
		// Typical steps to create XML file
		val DocumentBuilderFactory factory_doc_builder = DocumentBuilderFactory.newInstance()
		val DocumentBuilder doc_builder = factory_doc_builder.newDocumentBuilder
		val Document doc = doc_builder.newDocument
		// Root element
		val Element root_element = doc.createElement("sdf")
		root_element.setAttribute("version", "1.6")
		val Element model_element = doc.createElement("model")
		model_element.setAttribute("name", robot.name)
		// Iterate all over the links
		model_element.appendChild(doc.createComment("GEN: links"))
		for (Link l: robot.link){
			// Add to robot element
			model_element.appendChild(doc.createComment('''GEN LINK: «l.name»'''))
			model_element.appendChild(createLinkElement(doc, l))
			// Handle friction
			// Add friction			
		}
		// Iterate all over the joint elements
		root_element.appendChild(doc.createComment("GEN: Joints"))
		for (Joint j: robot.joint){
			// Add to robot element
			model_element.appendChild(doc.createComment('''GEN JOINT: «j.name»'''))		
			if (j.jointtype==JointType::FIXED)	{
				model_element.appendChild(createFrame(doc, j))				
			}
			model_element.appendChild(createJointElement(doc, j))
		}
		// Urdf control
		if (robot.controlmodel !== null)
		{
			model_element.appendChild(doc.createComment("GEN: Control model"))
			model_element.appendChild(constructControlPluginElement(doc, robot, robot.controlmodel))
		}
		
		root_element.appendChild(model_element)
		return root_element
		
	}
	
}