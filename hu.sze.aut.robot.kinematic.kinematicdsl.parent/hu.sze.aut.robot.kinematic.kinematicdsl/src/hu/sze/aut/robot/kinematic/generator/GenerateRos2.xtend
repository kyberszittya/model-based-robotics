package hu.sze.aut.robot.kinematic.generator

import hu.sze.aut.robotics.robot.kinematic.description.model.kinematicmodel.Robot

class GenerateRos2 {
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