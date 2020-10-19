package hu.sze.aut.robotics.vehicle.generator

import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Vehicle
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Sensor
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.GPS
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.IMU
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.SensorPlacement
import java.util.List
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Camera
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.StereoCamera
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Pose
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.LiDAR
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.LaserScanner

class LgsvlConfiguration {
	
	static def generateLgsvlSensorConfiguration(List<SensorPlacement> placements)'''
	[
		«FOR s: placements SEPARATOR ','»
		«IF s.sensor instanceof GPS»
		«generateGpsSensor(s)»
		«ELSEIF s.sensor instanceof IMU»
		«generateImuSensor(s)»
		«ELSEIF s.sensor instanceof LiDAR»
		«generateLidar(s)»
		«ELSEIF s.sensor instanceof LaserScanner»
		«generateLaserScanner(s)»
		«ELSEIF s.sensor instanceof Camera»
		«IF s.sensor instanceof StereoCamera»
		«generateStereoCamera(s)»
		«ELSE»
		«generateCamera(s)»
		«ENDIF»
		«ENDIF»	
		«ENDFOR»,
		«generateControlPlugins»
	]
	'''
	
	static def generateGpsSensor(SensorPlacement sensorplacement)'''
		{
			"type": "«lgsvlSensorType(sensorplacement.sensor)»",
			"name": "«sensorplacement.name»",
			"params": {
				"Frequency": «sensorplacement.sensor.frequency»,
				"Topic": "«sensorplacement.name»/«sensorplacement.sensor.topic_name»",
				"Frame": "«sensorplacement.frame»",
				"IgnoreMapOrigin": true
			},
			«lgsvlTransform(sensorplacement.pose)»
		}«IF (sensorplacement.sensor as GPS).isOdometry»,
		{
			"type": "GPS Odometry",
			"name": "«sensorplacement.name» GPS Odometry",
			"params": {
				"Frequency": «sensorplacement.sensor.frequency»,
				"Topic": "«sensorplacement.sensor.name»/«sensorplacement.sensor.topic_name»",
				"Frame": "«sensorplacement.frame»"
			},
			«lgsvlTransform(sensorplacement.pose)»
		}
		«ENDIF»
	'''
	
	static def generateImuSensor(SensorPlacement sensorplacement)'''
		{
			"type": "«lgsvlSensorType(sensorplacement.sensor)»",
			"name": "«sensorplacement.name»",
			"params": {
				"Topic": "«sensorplacement.name»/«sensorplacement.sensor.topic_name»",
				"Frame": "«sensorplacement.frame»"
			},
			«lgsvlTransform(sensorplacement.pose)»
		}
	'''
	
	static def generateLidar(SensorPlacement sensorplacement)'''
		{
		    "type": "«lgsvlSensorType(sensorplacement.sensor)»",
			"name": "«sensorplacement.name»",
		    "params": {
		      "LaserCount": «(sensorplacement.sensor as LiDAR).laser_count»,
		      "MinDistance": «(sensorplacement.sensor as LiDAR).min_distance»,
		      "MaxDistance": «(sensorplacement.sensor as LiDAR).max_distance»,
		      "RotationFrequency": «sensorplacement.sensor.frequency»,
		      "MeasurementsPerRotation": «(sensorplacement.sensor as LiDAR).meas_per_rotation»,
		      "FieldOfView": «(sensorplacement.sensor as LiDAR).field_of_view»,
		      "CenterAngle": «(sensorplacement.sensor as LiDAR).center_angle»,
		      "Compensated": true,
		      "PointColor": "#ff000000",
		      "Topic": "«sensorplacement.sensor.topic_name»/points_raw",
		      "Frame": "«sensorplacement.frame»"
		    },
		    «lgsvlTransform(sensorplacement.pose)»
		}
	'''
	
	static def generateLaserScanner(SensorPlacement sensorplacement)'''
		{
		   "type": "«lgsvlSensorType(sensorplacement.sensor)»",
		   "name": "«sensorplacement.name»",
		   "params": {
		   	 "LaserCount": 10,
		   	 "MinDistance": 0.5,
		   	 "MaxDistance": 100,
		   	 "RotationFrequency": 10,
		   	 "MeasurementsPerRotation": 360,
		   	 "FieldOfView": 1,
		   	 "CenterAngle": 10,
		   	 "Compensated": true,
		   	 "PointColor": "#00ff00",
		   	 "Topic": "«sensorplacement.name»/«sensorplacement.sensor.topic_name»",
		   	 "Frame": "«sensorplacement.frame»"
		   },
		   «lgsvlTransform(sensorplacement.pose)»
		}
	'''
	
	static def generateCamera(SensorPlacement sensorplacement)'''
		{
		    "type": "Color Camera",
		    "name": "«sensorplacement.name»",
		    "params": {
		      "Width": «(sensorplacement.sensor as Camera).image_width»,
		      "Height": «(sensorplacement.sensor as Camera).image_height»,
		      "Frequency": «(sensorplacement.sensor as Camera).frequency»,
		      "JpegQuality": «(sensorplacement.sensor as Camera).quality»,
		      "FieldOfView": «(sensorplacement.sensor as Camera).field_of_view»,
		      "MinDistance": «(sensorplacement.sensor as Camera).min_distance»,
		      "MaxDistance": «(sensorplacement.sensor as Camera).max_distance»,
		      "Topic": "«sensorplacement.name»/«sensorplacement.sensor.topic_name»/image/compressed",
		      "Frame": "«sensorplacement.frame»"
		    },
		    «lgsvlTransform(sensorplacement.pose)»
		}
	'''
	
	static def generateStereoCamera(SensorPlacement sensorplacement)'''
		{
		    "type": "Color Camera",
		    "name": "«sensorplacement.name»_left",
		    "params": {
		      "Width": «(sensorplacement.sensor as Camera).image_width»,
		      "Height": «(sensorplacement.sensor as Camera).image_height»,
		      "Frequency": «(sensorplacement.sensor as Camera).frequency»,
		      "JpegQuality": «(sensorplacement.sensor as Camera).quality»,
		      "FieldOfView": «(sensorplacement.sensor as Camera).field_of_view»,
		      "MinDistance": «(sensorplacement.sensor as Camera).min_distance»,
		      "MaxDistance": «(sensorplacement.sensor as Camera).max_distance»,
		      "Topic": "«sensorplacement.name»/«sensorplacement.sensor.topic_name»/image/compressed",
		      "Frame": "«sensorplacement.frame»"
		    },
		    «lgsvlTransformOffsetY(sensorplacement.pose, -(sensorplacement.sensor as StereoCamera).baseline/2.0)»
		},
		{
		    "type": "Color Camera",
		    "name": "«sensorplacement.name»_right",
		    "params": {
		      "Width": «(sensorplacement.sensor as Camera).image_width»,
		      "Height": «(sensorplacement.sensor as Camera).image_height»,
		      "Frequency": «(sensorplacement.sensor as Camera).frequency»,
		      "JpegQuality": «(sensorplacement.sensor as Camera).quality»,
		      "FieldOfView": «(sensorplacement.sensor as Camera).field_of_view»,
		      "MinDistance": «(sensorplacement.sensor as Camera).min_distance»,
		      "MaxDistance": «(sensorplacement.sensor as Camera).max_distance»,
		      "Topic": "«sensorplacement.name»/«sensorplacement.sensor.topic_name»/image/compressed",
		      "Frame": "«sensorplacement.frame»"
		    },
		    «lgsvlTransformOffsetY(sensorplacement.pose, (sensorplacement.sensor as StereoCamera).baseline/2.0)»
		}
	'''
	
	static def radToDeg(double rad){
		return rad*180.0/Math.PI		
	}
	
	static def lgsvlTransform(Pose pose){
		return lgsvlTransformOffset(pose, 0.0, 0.0)
	}
	
	static def lgsvlTransformOffsetX(Pose pose, double x){
		return lgsvlTransformOffset(pose, x, 0.0)
	}
	
	static def lgsvlTransformOffsetY(Pose pose, double y){
		return lgsvlTransformOffset(pose, 0.0, y)
	}
	
	static def lgsvlTransformOffset(Pose pose, double x, double y)'''
	"transform": {
		"x": «-(pose.displacement.y + y)»,
		"y": «pose.displacement.z»,
		"z": «pose.displacement.x + x»,
		"roll": «-radToDeg(pose.rotation.pitch)»,
		"pitch": «radToDeg(pose.rotation.yaw)»,
		"yaw": «radToDeg(pose.rotation.roll)»
	}
	'''
	
	static def lgsvlSensorType(Sensor sensor){
		if (sensor instanceof GPS){
			return "GPS Device"
		}
		else if (sensor instanceof IMU)	{
			return "IMU"
		}
		else if (sensor instanceof LiDAR || sensor instanceof LaserScanner){
			return "Lidar"
		}
		else if (sensor instanceof Camera){
			return "Camera"
		}
	}
	
	static def generateControlPlugins()'''
	  {
	    "type": "Keyboard Control",
	    "name": "Keyboard Car Control"
	  },
	  {
	    "type": "Wheel Control",
	    "name": "Wheel Car Control"
	  },
	  {
	    "type": "Vehicle Control",
	    "name": "Autoware Car Control",
	    "params": { "Topic": "/vehicle_cmd" }
	  }
	'''
}