package hu.sze.aut.robotics.vehicle.generator

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.VehiclemodelPackage
import java.io.File
import org.eclipse.emf.common.util.URI
import hu.sze.aut.robotics.vehicle.model.vehiclemodel.Vehicle
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.KinematicmodelPackage

class ExampleGenerateKinematicModel {
	def static void main(String[] args) {
		val ResourceSet resset = new ResourceSetImpl()
		resset.resourceFactoryRegistry.extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl)
		resset.packageRegistry.put(VehiclemodelPackage.eNS_URI, VehiclemodelPackage.eINSTANCE)
		resset.packageRegistry.put(KinematicmodelPackage.eNS_URI, KinematicmodelPackage.eINSTANCE)
		val File file = new File("/home/kyberszittya/robotlabor_ws/utility/model-based-robotics/hu.sze.aut.vehicle.description/src-gen/nissanleaf.xmi")
		val URI uri = URI.createFileURI(file.absolutePath)
		try{
			val Resource resource = resset.getResource(uri, true)			
			val Vehicle vehicle = resource.contents.filter[it instanceof Vehicle].head as Vehicle
			val GenerateKinematicModel kinematic_model = new GenerateKinematicModel
			kinematic_model.transformVehicleModelToKinematicModel(vehicle)
		} catch(RuntimeException exception){
			System.out.println("Problem loading " + uri)
			exception.printStackTrace
		}
	}
}