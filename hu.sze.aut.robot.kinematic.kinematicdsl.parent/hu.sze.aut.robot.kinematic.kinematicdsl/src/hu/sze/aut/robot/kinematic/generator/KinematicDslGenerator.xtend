/*
 * generated by Xtext 2.23.0
 */
package hu.sze.aut.robot.kinematic.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Joint
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.TemplateInstantiation
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Link
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.KinematicmodelFactory
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.JointType
import org.eclipse.emf.ecore.util.EcoreUtil
import javax.xml.transform.stream.StreamResult
import javax.xml.transform.TransformerFactory
import javax.xml.transform.Transformer
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.OutputKeys
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import java.util.HashMap
import java.io.ByteArrayOutputStream
import java.io.ByteArrayInputStream
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Sensor
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.DocumentBuilder
import org.w3c.dom.Document

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class KinematicDslGenerator extends AbstractGenerator {
	
	def connectTemplateWithJoint(Robot robot, Link root, TemplateInstantiation module){
		// Create a joint that connects root link with
		val Joint jnt_template = KinematicmodelFactory.eINSTANCE.createJoint
		jnt_template.name = '''jnt_«module.name.toLowerCase»_«module.kinematicmodule.name.toLowerCase»'''
		jnt_template.jointtype = JointType.FIXED
		jnt_template.parent = root
		jnt_template.pose = module.pose
		robot.joint.add(jnt_template)
		// Instantiate EMF copier
		val copier = new Copier
		// Store copied links to refer original names (used for joints)
		val link_map = new HashMap<String, Link>
		// Copy links from template		
		for (Link l: module.kinematicmodule.link){
			val new_link = copier.copy(l) as Link
			new_link.name = '''«module.name.toLowerCase»_«l.name.toLowerCase»'''
			robot.link.add(new_link)
			// Add to map
			link_map.put(l.name, robot.link.last)
		}
		// Update template root link element
		jnt_template.child = link_map.get(module.kinematicmodule.root_element.name)
		// Copy joints from template
		// And assign module names
		for (Joint j: module.kinematicmodule.joint){
			val new_joint = copier.copy(j) as Joint
			new_joint.name = '''jnt_«module.name.toLowerCase»_«j.name.toLowerCase»'''
			new_joint.parent = link_map.get(j.parent.name)
			new_joint.parent.name = '''«module.name.toLowerCase»_«j.parent.name.toLowerCase»'''
			new_joint.child = link_map.get(j.child.name)
			new_joint.child.name = '''«module.name.toLowerCase»_«j.child.name.toLowerCase»'''
			if (module.invert){
				new_joint.axis.ax = -1.0*j.axis.ax
				new_joint.axis.ay = -1.0*j.axis.ay
				new_joint.axis.az = -1.0*j.axis.az 
			}
			robot.joint.add(new_joint)
		}
		// Append sensor to robot
		for (Sensor s: module.kinematicmodule.sensor){
			val new_sensor = copier.copy(s) as Sensor
			new_sensor.name = '''«module.name.toLowerCase»_«s.name»'''
			new_sensor.parent = link_map.get(s.parent.name)
			robot.sensor.add(new_sensor)
		}
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Robot _r = resource.contents.filter[it instanceof Robot].head as Robot		
		if (_r!==null){
			val robot_original = EcoreUtil.copy(_r)
			val robot = EcoreUtil.copy(_r)
			
			val root = robot.root_element
			// 1. Instantiate and connect templates with a fixed joint
			for (TemplateInstantiation tmpl: root.templateinstantiation){
				connectTemplateWithJoint(robot, root, tmpl)
			}
			// 2. Generate Description formats
			val TransformerFactory transformerFactory = TransformerFactory.newInstance
			val Transformer transformer = transformerFactory.newTransformer
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			// Lots of formats are possible iterate all over them
			for (format: robot.description_format)
			{
				System.out.println("Generating for format: "+format)
				var ModelGenerator generator = null
				var file_extension = ""
			
				if (format=="urdf")
				{
					generator = new GenerateUrdf();
					file_extension = "urdf"
				}
				else if (format=="sdf")
				{
					generator = new GenerateSdf()
					file_extension = "sdf"				
				}
				// Generator
				if (generator !== null)
				{
					// Typical steps to create XML file
					val DocumentBuilderFactory factory_doc_builder = DocumentBuilderFactory.newInstance()
					val DocumentBuilder doc_builder = factory_doc_builder.newDocumentBuilder
					val Document doc = doc_builder.newDocument		
					val xml_root = generator.constructDescription(doc, robot)
					// Generate gazebo plugin configuration
					if (generator instanceof GenerateSdf){
						GenerateControlPlugin.generateControlConfigurationElement(doc, generator.model_element, robot_original, "");	
					}
					val DOMSource source = new DOMSource(xml_root)
					val ByteArrayOutputStream bos = new ByteArrayOutputStream()
					val StreamResult streamresult = new StreamResult(bos)
					transformer.transform(source, streamresult)
					val ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray)
					if (generator instanceof GenerateSdf)
					{
						fsa.generateFile('''«robot.name»/model.«file_extension»''', bin)
						val config_xml = GenerateSdf.generateConfig(robot)
						val DOMSource source_config = new DOMSource(config_xml)
						val ByteArrayOutputStream bos_config = new ByteArrayOutputStream()
						val StreamResult streamresult_config = new StreamResult(bos_config)
						transformer.transform(source_config, streamresult_config)
						val ByteArrayInputStream bin_config = new ByteArrayInputStream(bos_config.toByteArray)
						fsa.generateFile('''«robot.name»/model.config''', bin_config)
					}
					else
					{
						fsa.generateFile('''«robot.name».«file_extension»''', bin)
					}
					//
					fsa.generateFile('''«robot.name».spawn.py''', GenerateRos2.generateSpawnEntity(robot))
					// Generate a TF from ROBOT
					val tf_joints = GenerateStaticTfLaunch.traverseTfLaunchSensors(robot)
					for (Joint j: tf_joints){
						System.out.println('''«j.parent.name»->«j.child.name»''')
					}
					fsa.generateFile('''«robot.name».statictf.py''', GenerateStaticTfLaunch.generateTfLaunch(tf_joints))
					System.out.println("Finished generation of artifacts")
				}
				else
				{
					System.err.println("Unavailable generator for specified format")
				}
			
			}
			// Compile control plugin
			// Compile launch files
			fsa.generateFile('''«robot.name».robotstate.launch.py''', GenerateRos2.generateRobotStatePublisher(robot))
		}
	}
}
