package hu.sze.aut.robot.kinematic.generator

import org.w3c.dom.Document
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.BeamBlockDefinition
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.RangeDefinition
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.LaserScanner
import org.w3c.dom.Element
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Camera
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Lidar
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.CameraObjective
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Imu
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.GpsSensor
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sensor

abstract class AbstractGazeboGenerator implements ModelGenerator {
	
	override final createBeamBlockDefinition(Document doc, BeamBlockDefinition beamblock, String beam_placement) {
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
	
	override final createRangeDefinition(Document doc, RangeDefinition rangedef) {
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
	
	override final createRangePluginElement(Document doc, LaserScanner scanner) {
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
	
	override final createCameraPlugin(Document doc, Camera camera) {
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
	
	override final createCameraObjectiveElement(Document doc, CameraObjective camera) {
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
	
	def final Element createRos2Definitons(Document doc, Sensor sensor)
	{
		//
		val Element ros_element = doc.createElement("ros");	
		
		// Set ROS attributes
		val Element el_namespace = doc.createElement("namespace")
		el_namespace.textContent = sensor.namespace
		ros_element.appendChild(el_namespace)
		val Element el_topic_remap = doc.createElement("argument")
		el_topic_remap.textContent = '''~/out:=«sensor.topic_name»'''
		ros_element.appendChild(el_topic_remap)
		return ros_element
	}
	
	override final createImuPluginElement(Document doc, Imu imu){
		val Element plugin_element = doc.createElement("plugin")
		plugin_element.setAttribute("name", imu.name)
		plugin_element.setAttribute("filename", "libgazebo_ros_imu_sensor.so")
		plugin_element.appendChild(createRos2Definitons(doc, imu))
		return plugin_element
	}
	
	override final createGpsPluginElement(Document doc, GpsSensor sensor)
	{
		val Element plugin_element = doc.createElement("plugin")
		plugin_element.setAttribute("name", sensor.name);
		plugin_element.setAttribute("filename", "libgazebo_ros_gps_sensor.so")
		plugin_element.appendChild(createRos2Definitons(doc, sensor))
		// Return with wrapped up element
		return plugin_element
	}
	
}