package hu.sze.aut.robot.kinematic.generator

import org.w3c.dom.Element
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
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Pose
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.GpsSensor

interface ModelGenerator {
	// Geometry basics
	abstract def Element generatePoseElement(Document doc, Pose element);
	// Structural elements
	abstract def Element generateGeometryElement(Document doc, GeometryDescription geometry);
	abstract def Element generateVisualElement(Document doc, Link link, Visual visual);
	abstract def Element generateCollisionElement(Document doc, Link link, Collision collision);
	// Inertia elements
	abstract def Element generateInertiaElement(Document doc, Inertia inertia, Geometry ref_geometry);
	// Sensor definition
	abstract def Element createBeamBlockDefinition(Document doc, BeamBlockDefinition beamblock, String beam_placement);
	abstract def Element createRangeDefinition(Document doc, RangeDefinition rangedef)
	abstract def Element createRangePluginElement(Document doc, LaserScanner scanner);
	abstract def Element createCameraPlugin(Document doc, Camera camera);
	abstract def Element createCameraObjectiveElement(Document doc, CameraObjective camera);
	abstract def Element createImuPluginElement(Document doc, Imu imu);
	abstract def Element createGpsPluginElement(Document doc, GpsSensor gps)
	abstract def Element createSensorElement(Document doc, Sensor sensor)
	// Friction element
	abstract def Element createLinkTranslationalFriction(Document doc, TranslationalFriction friction)
	abstract def Element createLinkTorsionalFriction(Document doc, TorsionalFriction friction)
	abstract def Element createFrictionElement(Document doc, Link link)
	// Link element
	abstract def Element createLinkElement(Document doc, Link link)
	// Joint element
	abstract def Element createJointElement(Document doc, Joint jnt)
	// Control
	abstract def Element constructControlPluginElement(Document doc, Robot robot, ControlModel controlmodel)
	// Robot
	abstract def Element constructDescription(Document doc, Robot robot)
}