package hu.sze.aut.robot.kinematic.generator

import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Document
import org.w3c.dom.Element
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Link
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Joint
import org.w3c.dom.Attr
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Collision
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Geometry
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Visual
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.GeometryDescription
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Inertia
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Cube
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sphere
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Cylinder
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sensor
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Camera
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Lidar
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.BeamBlockDefinition
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.RangeDefinition
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.LaserScanner
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.CameraObjective
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Imu
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.ControlModel
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.DifferentialRobotModel
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.CustomControlModel

class GenerateUrdf {
	
	static def generateGeometryElement(Document doc, GeometryDescription geometry){
		val Element element = doc.createElement("geometry")
		// Generate cube
		if (geometry instanceof Cube){
			val Cube geom = geometry as Cube
			val Element geom_element = doc.createElement("box")
			geom_element.setAttribute("size", '''«geom.sx» «geom.sy» «geom.sz»''')
			element.appendChild(geom_element)
		}
		// Generate sphere
		else if (geometry instanceof Sphere){
			val Sphere geom = geometry as Sphere
			val Element geom_element = doc.createElement("sphere")
			geom_element.setAttribute("radius", '''«geom.radius»''')
			element.appendChild(geom_element)
		}
		// Generate cylinder
		else if (geometry instanceof Cylinder){
			val Cylinder geom = geometry as Cylinder
			val Element geom_element = doc.createElement("cylinder")
			geom_element.setAttribute("radius", '''«geom.radius»''')
			geom_element.setAttribute("length", '''«geom.height»''')
			element.appendChild(geom_element)
		}
		return element
	}
	
	static def generateVisualElement(Document doc, Visual visual){
		val Element element = doc.createElement("visual")
		element.appendChild(generateGeometryElement(doc, visual.geometrydescription))
		return element
	}
	
	static def generateCollisionElement(Document doc, Collision collision){		
		val Element element = doc.createElement("collision")
		element.appendChild(generateGeometryElement(doc, collision.geometrydescription))
		return element
	}
	
	static def generateInertiaElement(Document doc, Inertia inertia, Geometry ref_geometry){
		val Element element = doc.createElement("inertial")
		// Mass
		val Element mass_element = doc.createElement("mass")
		mass_element.setAttribute("value", inertia.mass.toString)
		element.appendChild(mass_element)
		// Inertia matrix
		val Element inertia_element = doc.createElement("inertia")
		if (inertia.inertiamatrix!==null){
			inertia_element.setAttribute("ixx", inertia.inertiamatrix.ixx.toString)
			inertia_element.setAttribute("ixy", inertia.inertiamatrix.ixy.toString)
			inertia_element.setAttribute("iyy", inertia.inertiamatrix.iyy.toString)
			inertia_element.setAttribute("ixz", inertia.inertiamatrix.ixz.toString)
			inertia_element.setAttribute("iyz", inertia.inertiamatrix.iyz.toString)
			inertia_element.setAttribute("izz", inertia.inertiamatrix.izz.toString)
		}
		else
		{
			val new_inertia = PhysicalCalculations.calcInertia(ref_geometry.geometrydescription, inertia)
			inertia_element.setAttribute("ixx", new_inertia.inertiamatrix.ixx.toString)
			inertia_element.setAttribute("ixy", new_inertia.inertiamatrix.ixy.toString)
			inertia_element.setAttribute("iyy", new_inertia.inertiamatrix.iyy.toString)
			inertia_element.setAttribute("ixz", new_inertia.inertiamatrix.ixz.toString)
			inertia_element.setAttribute("iyz", new_inertia.inertiamatrix.iyz.toString)
			inertia_element.setAttribute("izz", new_inertia.inertiamatrix.izz.toString)
		}
		element.appendChild(inertia_element)
		return element
	}
	
	static def createBeamBlockDefinition(Document doc, BeamBlockDefinition beamblock, String beam_placement){
		val beam_element = doc.createElement(beam_placement)
		// Max angle for LiDAR
		val max_angle_element = doc.createElement("max_angle")
		max_angle_element.textContent = UtilityMath.degToRad(beamblock.max_angle).toString
		beam_element.appendChild(max_angle_element)
		// Min angle for LiDAR
		val min_angle_element = doc.createElement("min_angle")
		min_angle_element.textContent = UtilityMath.degToRad(beamblock.min_angle).toString
		beam_element.appendChild(min_angle_element)
		// Resolution element
		val resolution_element = doc.createElement("resolution")
		resolution_element.textContent = beamblock.resolution.toString
		beam_element.appendChild(resolution_element)
		// Samples element add for LiDAR
		val samples_element = doc.createElement("samples")
		samples_element.textContent = beamblock.samples.toString
		beam_element.appendChild(samples_element)
		return beam_element
	}	
	
	static def createRangeDefinition(Document doc, RangeDefinition rangedef){
		val range_element = doc.createElement("range")
		// Min range
		val min_element = doc.createElement("min")
		min_element.textContent = rangedef.min_range.toString		
		range_element.appendChild(min_element)
		// Max range
		val max_element = doc.createElement("max")
		max_element.textContent = rangedef.max_range.toString
		range_element.appendChild(max_element)
		return range_element
	}
	
	static def createRangePluginElement(Document doc, LaserScanner scanner){
		val Element plugin_element = doc.createElement("plugin")
		plugin_element.setAttribute("filename", "libgazebo_ros_ray_sensor.so")
		val Element plugin_ros_element = doc.createElement("ros")
		// Namespace		
		val Element namespace_element = doc.createElement("namespace")
		namespace_element.textContent = scanner.name
		plugin_ros_element.appendChild(namespace_element)
		// Argument
		val Element argument_element = doc.createElement("argument")
		argument_element.textContent = '''~/out:=«scanner.topic_name»'''
		plugin_ros_element.appendChild(argument_element)
		// Output type definition
		val Element output_type = doc.createElement("output_type")
		plugin_element.appendChild(output_type)
		// Type-specific setup
		if (scanner instanceof Lidar){
			plugin_element.setAttribute("name", "lidar_"+scanner.name)
			output_type.textContent = "sensor_msgs/PointCloud2"
			
		}else{
			plugin_element.setAttribute("name", "laser"+scanner.name)
			output_type.textContent = "sensor_msgs/LaserScan"
		}
		plugin_element.appendChild(output_type)
		plugin_element.appendChild(plugin_ros_element)
		// Add frame name
		val Element plugin_frame_name = doc.createElement("frame_name")
		plugin_frame_name.textContent = scanner.parent.name
		plugin_element.appendChild(plugin_frame_name)		
		//
		return plugin_element
	}
	
	static def createCameraPlugin(Document doc, Camera camera)
	{
		val Element plugin_element = doc.createElement("plugin")
		plugin_element.setAttribute("name", "camera_sensor_"+camera.name)
		plugin_element.setAttribute("filename", "libgazebo_ros_camera.so")
		// Param name
		val Element name_element = doc.createElement("camera_name")
		name_element.textContent = camera.name
		plugin_element.appendChild(name_element)
		// Set frame
		val Element frame_name = doc.createElement("frame_name")
		frame_name.textContent = camera.parent.name
		plugin_element.appendChild(frame_name)
		return plugin_element
	}
	
	static def createCameraObjectiveElement(Document doc, CameraObjective camera){
		val Element camera_element = doc.createElement("camera")
		camera_element.setAttribute("name", camera.name)
		val Element pose_element = doc.createElement("pose")
		pose_element.textContent = '''«camera.offset.position.x» «camera.offset.position.y» «camera.offset.position.z» «
			UtilityMath.degToRad(camera.offset.rotation.roll)» «UtilityMath.degToRad(camera.offset.rotation.pitch)» «
			UtilityMath.degToRad(camera.offset.rotation.yaw)»'''
		camera_element.appendChild(pose_element)
		// Camera parameters
		// FOV
		val Element fov_element = doc.createElement("horizontal_fov")
		fov_element.textContent = UtilityMath.degToRad(camera.fov).toString
		camera_element.appendChild(fov_element)
		// Image (width/height)
		val Element image_element = doc.createElement("image")
		val Element width_element = doc.createElement("width")
		width_element.textContent = camera.image_width.toString
		image_element.appendChild(width_element)
		val Element height_element = doc.createElement("height")
		height_element.textContent = camera.image_height.toString
		image_element.appendChild(height_element)
		val Element format_element = doc.createElement("format")
		format_element.textContent = "R8G8B8"
		image_element.appendChild(format_element)
		camera_element.appendChild(image_element)
		// Clip
		val Element clip_element = doc.createElement("clip")
		val Element near_element = doc.createElement("near")
		near_element.textContent = camera.clip_near.toString
		clip_element.appendChild(near_element)
		val Element far_element = doc.createElement("far")
		far_element.textContent = camera.image_height.toString
		clip_element.appendChild(far_element)
		camera_element.appendChild(clip_element)
		// Done, return
		return camera_element
	}
	
	static def createImuPluginElement(Document doc, Imu imu){
		val Element plugin_element = doc.createElement("plugin")
		plugin_element.setAttribute("name", imu.name)
		plugin_element.setAttribute("filename", "libgazebo_ros_imu_sensor.so")
		
		return plugin_element
	}
	
	
	static def createSensorElement(Document doc, Sensor sensor){
		val Element gazebo_element = doc.createElement("gazebo")
		gazebo_element.setAttribute("reference", sensor.parent.name)
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
		gazebo_element.appendChild(sensor_element)
		return gazebo_element
	}
	
	static def createLinkElement(Document doc, Link link){
		val Element link_element = doc.createElement("link")
		link_element.setAttribute("name", link.name)
		// Add visual elements of the link
		for (Visual v: link.visual){	
			link_element.appendChild(generateVisualElement(doc, v))			
		}
		// Add collision elements of the link
		for (Collision c: link.collision){
			link_element.appendChild(generateCollisionElement(doc, c))
		}
		// Add inertia elements
		for (Inertia i: link.inertia){
			// TODO: think a little about 
			link_element.appendChild(generateInertiaElement(doc, i, link.collision.head))
		}
		return link_element
	}
	
	
	
	static def createJointElement(Document doc, Joint jnt){
		val Element jnt_element = doc.createElement("joint")
		jnt_element.setAttribute("name", jnt.name)
		// Set type
		switch (jnt.jointtype){
			case CONTINUOUS: {
				jnt_element.setAttribute("type", "continuous")
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
			axis_element.setAttribute("xyz", '''«jnt.axis.ax» «jnt.axis.ay» «jnt.axis.az»''')
			jnt_element.appendChild(axis_element)
		}
		// Physical parameter
		val Element dynamic_element = doc.createElement("dynamics")
		dynamic_element.setAttribute("damping", jnt.damping.toString)
		dynamic_element.setAttribute("friction", jnt.friction.toString)
		jnt_element.appendChild(dynamic_element)
		// Origin set up
		val Element pose_element = doc.createElement("origin")
		pose_element.setAttribute("xyz", '''«jnt.pose.position.x» «jnt.pose.position.y» «jnt.pose.position.z»''')
		pose_element.setAttribute("rpy", '''«UtilityMath.degToRad(jnt.pose.rotation.roll)» «
			UtilityMath.degToRad(jnt.pose.rotation.pitch)» «UtilityMath.degToRad(jnt.pose.rotation.yaw)»'''
		)
		jnt_element.appendChild(pose_element)
		// Parent & child links
		val Element child_link = doc.createElement("child")
		child_link.setAttribute("link", jnt.child.name)
		jnt_element.appendChild(child_link)
		val Element parent_link = doc.createElement("parent")
		parent_link.setAttribute("link", jnt.parent.name)
		jnt_element.appendChild(parent_link)
		return jnt_element
	}
	
	static def constructControlPluginElement(Document doc, Robot robot, ControlModel controlmodel){
		val Element gazebo_element = doc.createElement("gazebo")
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
		gazebo_element.appendChild(plugin_element)
		return gazebo_element
	}
	
	static def constructUrdf(Robot robot){
		// Typical steps to create XML file
		val DocumentBuilderFactory factory_doc_builder = DocumentBuilderFactory.newInstance()
		val DocumentBuilder doc_builder = factory_doc_builder.newDocumentBuilder
		val Document doc = doc_builder.newDocument
		// Root element
		val Element root_element = doc.createElement("robot")
		root_element.setAttribute("name", robot.name)
		// Iterate all over the links
		root_element.appendChild(doc.createComment("GEN: Links"))
		for (Link l: robot.link){
			// Add to robot element
			root_element.appendChild(createLinkElement(doc, l))
		}
		// Iterate all over the joint elements
		root_element.appendChild(doc.createComment("GEN: Joints"))
		for (Joint j: robot.joint){
			// Add to robot element		
			root_element.appendChild(createJointElement(doc, j))
		}
		// Iterate all over the sensor elements
		root_element.appendChild(doc.createComment("GEN: Sensor model"))
		for (Sensor s: robot.sensor){
			root_element.appendChild(createSensorElement(doc, s))
		}
		// Urdf control
		root_element.appendChild(doc.createComment("GEN: Control model"))
		root_element.appendChild(constructControlPluginElement(doc, robot, robot.controlmodel))
		// Return with root of the URDF-XML
		return root_element
	}
}