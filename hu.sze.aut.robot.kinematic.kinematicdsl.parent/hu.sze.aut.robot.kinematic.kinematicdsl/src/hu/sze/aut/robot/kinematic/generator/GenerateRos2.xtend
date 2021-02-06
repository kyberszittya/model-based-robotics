package hu.sze.aut.robot.kinematic.generator

import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot

class GenerateRos2 {
	def static generateRobotStatePublisher(Robot robot)'''
	import os
	from ament_index_python.packages import get_package_share_directory
	from launch import LaunchDescription
	from launch.actions import DeclareLaunchArgument
	from launch.substitutions import LaunchConfiguration
	from launch_ros.actions import Node
	
	def generate_launch_description():
	
	  use_sim_time = LaunchConfiguration('use_sim_time', default='true')
	  urdf_file_name = '«robot.name».urdf'
	
	  print("urdf_file_name : {}".format(urdf_file_name))
	  urdf = os.path.join(
	      get_package_share_directory('«robot.name»_bringup'),
	      urdf_file_name)  
	
	  return LaunchDescription([
	      DeclareLaunchArgument(
	          'use_sim_time',
	          default_value='false',
	          description='Use simulation (Gazebo) clock if true'),
	      Node(
	          package='robot_state_publisher',
	          executable='robot_state_publisher',
	          name='«robot.name»_robot_state_publisher',
	          output='screen',
	          parameters=[{'use_sim_time': use_sim_time}],
	          remappings=[
	              ("/joint_states", "/«robot.name»/joint_state")
	          ],
	          arguments=[urdf])      
	  ])
	'''
	
	def static generateSpawnEntity(Robot robot)'''
	import sys
	import rclpy
	from gazebo_msgs.srv import SpawnEntity
	from ament_index_python.packages import get_pacakge_share_directory
	
	
	def request_spawn(xml: str):
	    rclpy.init()
	    node = rclpy.create_node('spawn_entity')
	    client = node.create_client(SpawnEntity, 'spawn_entity')
	    if not client.service_is_ready():
	        client.wait_for_service()
	    request = SpawnEntity.Request()
	    request.xml = xml
	    request.name = "«robot.name.toLowerCase»"
	    future = client.call_async(request)
	    rclpy.spin_until_future_complete(node, future)
	    if future.result() is not None:
	        print('response: %r' % future.result())
	    else:
	        raise RuntimeError('exception while calling service: %r' % future.exception())
	    node.destroy_node()
	    rclpy.shutdown()
	
	f = open(get_package_share_directory("covidea_description")+"/urdf/"+"«robot.name».urdf", 'r')
	request_spawn(f.read())
	'''
}