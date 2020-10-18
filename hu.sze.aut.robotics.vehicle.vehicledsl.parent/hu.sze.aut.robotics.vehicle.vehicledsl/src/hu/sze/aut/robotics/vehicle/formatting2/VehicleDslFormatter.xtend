/*
 * generated by Xtext 2.23.0
 */
package hu.sze.aut.robotics.vehicle.formatting2

import com.google.inject.Inject
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Axis
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Vehicle
import hu.sze.aut.robotics.vehicle.services.VehicleDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class VehicleDslFormatter extends AbstractFormatter2 {
	
	@Inject extension VehicleDslGrammarAccess

	def dispatch void format(Vehicle vehicle, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (axis : vehicle.axis) {
			axis.format
		}
		for (wheelParameter : vehicle.wheelparameters) {
			wheelParameter.format
		}
		for (sensor : vehicle.sensor) {
			sensor.format
		}
		for (physicalParameter : vehicle.physicalparameter) {
			physicalParameter.format
		}
	}

	def dispatch void format(Axis axis, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (drive : axis.drive) {
			drive.format
		}
		axis.pose.format
	}
	
	// TODO: implement for Drive, Pose, Wheel
}
