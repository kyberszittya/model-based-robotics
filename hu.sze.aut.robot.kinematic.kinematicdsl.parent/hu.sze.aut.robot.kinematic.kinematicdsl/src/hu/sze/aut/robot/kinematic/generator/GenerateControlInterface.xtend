package hu.sze.aut.robot.kinematic.generator

import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.JointType
import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.JointControlType

class GenerateControlInterface {
	def templateJointControlCpp(Robot robot, String prefix)'''
	ControlInterface_«robot.name»
	{
	private:
		std::string name;
		std::unique_ptr<JointStateController> jointstatecontroller;
	public:
		ControlInterface_«robot.name»(std::string name = "«robot.name»", std::string link_name = "base_link")
		{
			
		}
		
		~ControlInterface_«robot.name»()
		{
			jointstatecontroller.reset();
		}
		
		void initializeControl()
		{
			«FOR j: robot.joint»
			// Adding «j.name»
			std::shared_ptr<common_control_library::AbstractJoint> _jnt_«j.name»;
			std::unique_ptr<common_control_library::JointControlMethod> _jnt_method_«j.name»;
			«IF j.jointcontrol==JointControlType.POSITION»
			_jnt_method = std::make_unique<GzPositionJointControl>(gz_joint, this->model, pid);
			«ELSEIF j.jointcontrol==JointControlType.VELOCITY»
			_jnt_method = std::make_unique<GzVelocityJointControl>(gz_joint, jcont, pid);
			«ELSEIF j.jointcontrol==JointControlType.EFFORT»
			«ENDIF»
			«ENDFOR»
		}
	};
	'''
	
	
}