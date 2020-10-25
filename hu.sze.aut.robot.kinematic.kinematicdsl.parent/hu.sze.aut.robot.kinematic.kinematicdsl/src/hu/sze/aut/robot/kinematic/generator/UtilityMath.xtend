package hu.sze.aut.robot.kinematic.generator

import org.eclipse.xtend.lib.annotations.Accessors

class Quaternion {
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) double qx
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) double qy
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) double qz
	@Accessors(PUBLIC_GETTER, PRIVATE_SETTER) double qw
	
	new (double qx, double qy, double qz, double qw){
		this.qx = qx
		this.qy = qy
		this.qz = qz
		this.qw = qw
	}	
	
	new (double roll, double pitch, double yaw){
		val double cy = Math.cos(yaw * 0.5)
		val double sy = Math.sin(yaw * 0.5)
		val double cp = Math.cos(pitch * 0.5)
		val double sp = Math.sin(pitch * 0.5)
		val double cr = Math.cos(roll * 0.5)
		val double sr = Math.sin(roll * 0.5)
		// Quaternion set
		this.qw = cr * cp * cy + sr * sp * sy
		this.qx = sr * cp * cy - cr * sp * sy
		this.qy = cr * sp * cy + sr * cp * sy
		this.qz = cr * cp * sy - sr * sp * cy
	}
}

class UtilityMath {
	
	static def degToRad(double angle){
		return angle*Math.PI/180.0
	}

}