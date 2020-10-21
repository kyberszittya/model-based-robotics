package hu.sze.aut.robotics.vehicle.generator

import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Vehicle
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.KinematicmodelFactory
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Link
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Axis
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Joint

class GenerateKinematicModel {
	val Link root_link
	val Robot robot 
	
	new(){
		// Create root link
		root_link = KinematicmodelFactory.eINSTANCE.createLink
		root_link.name = "base_link"
		// Create robot
		robot = KinematicmodelFactory.eINSTANCE.createRobot		
	}
	
	def axesTransformation(Axis axis, Link parent_node){
		val Link axis_child = KinematicmodelFactory.eINSTANCE.createLink
		axis_child.name = axis.name
		val Joint jnt = KinematicmodelFactory.eINSTANCE.createJoint
		jnt.child = axis_child
		jnt.parent = parent_node
		jnt.name = '''jnt_«parent_node.name»_«axis_child.name»'''
		// create pose
		jnt.pose = KinematicmodelFactory.eINSTANCE.createPose
		jnt.pose.position = KinematicmodelFactory.eINSTANCE.createPosition
		jnt.pose.rotation = KinematicmodelFactory.eINSTANCE.createRotation
		//
		jnt.pose.position.x = axis.pose.displacement.x
		jnt.pose.position.y = axis.pose.displacement.y
		jnt.pose.position.z = axis.pose.displacement.z
		//
		if (axis.pose.rotation!==null){
			jnt.pose.rotation.roll = axis.pose.rotation.roll
			jnt.pose.rotation.pitch = axis.pose.rotation.pitch
			jnt.pose.rotation.yaw = axis.pose.rotation.yaw			
		}else{
			jnt.pose.rotation.roll = 0.0
			jnt.pose.rotation.pitch = 0.0
			jnt.pose.rotation.yaw = 0.0
		}
		// There are many choices depending on steering type
		// Follow SAE convention of coordinate systems
		switch (axis.type){
			case INDEPENDENT:{
				// Left side of axis
				val Joint jnt_left = KinematicmodelFactory.eINSTANCE.createJoint
				jnt_left.pose.position.y = axis.length/2.0
				val Link axis_left_child = KinematicmodelFactory.eINSTANCE.createLink
				jnt_left.child = axis_left_child
				jnt_left.parent = axis_child
				// Right side of axis
				val Joint jnt_right = KinematicmodelFactory.eINSTANCE.createJoint
				jnt_right.pose.position.y = -axis.length/2.0 
				val Link axis_right_child = KinematicmodelFactory.eINSTANCE.createLink
				jnt_right.parent = axis_child
				jnt_right.child = axis_right_child
			}
			case CASTER: {
				
			}
		}
	}
	
	def transformVehicleModelToKinematicModel(Vehicle vehicle)	{
		
		robot.name = vehicle.name
		// Set base link (base reference point)
		root_link.mass = vehicle.physicalparameter.mass		
		// Iterate over axis
		for (ax: vehicle.axes){
			axesTransformation(ax, root_link)
		}
		//
		for (s: vehicle.sensorplacement){
			
		}
	}
	
	
	
}