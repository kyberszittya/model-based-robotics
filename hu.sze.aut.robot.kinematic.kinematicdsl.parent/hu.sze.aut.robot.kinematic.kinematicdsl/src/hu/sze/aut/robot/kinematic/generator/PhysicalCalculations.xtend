package hu.sze.aut.robot.kinematic.generator

import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.GeometryDescription
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Cube
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sphere
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Cylinder
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Inertia
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.KinematicmodelFactory

class PhysicalCalculations {
	def static calcInertia(GeometryDescription geom, Inertia original){
		val Inertia inertia = KinematicmodelFactory.eINSTANCE.createInertia
		inertia.inertiamatrix = KinematicmodelFactory.eINSTANCE.createInertiaMatrix
		val double mass = original.mass
		if (geom instanceof Cube){
			val d = geom.sx
			val w = geom.sy
			val h = geom.sz
			inertia.inertiamatrix.ixx = 1.0/12.0*(w*w + h*h)
			inertia.inertiamatrix.iyy = 1.0/12.0*(d*d + h*h)
			inertia.inertiamatrix.izz = 1.0/12.0*(w*w + d*d)
		}
		else if (geom instanceof Sphere){
			val double r = geom.radius 
			inertia.inertiamatrix.ixx = 2.0/5.0*mass*r*r
			inertia.inertiamatrix.iyy = inertia.inertiamatrix.ixx
			inertia.inertiamatrix.izz = inertia.inertiamatrix.izz
		}
		else if (geom instanceof Cylinder){
			val double r = geom.radius
			val double h = geom.height
			inertia.inertiamatrix.izz = 0.5*mass*r*r
			inertia.inertiamatrix.ixx = 1.0/12.0*mass*(3*r*r + h*h)
			inertia.inertiamatrix.iyy = inertia.inertiamatrix.ixx 
		}
		return inertia
	}
}