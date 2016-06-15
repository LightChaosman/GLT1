We start by explaining the common ground between all vehicles.

- 	Each vehicle starts by checking at what index it is in the platoon.
	The leader as index 0, its follower has index 1, etc.

-	Next, the communication channels are initialized.
	If a robot has an odd index, it communicates with it's slave on channel 1, and recieves commands from its master at channel 2.
	If a robot has an even index, these channels are flipped.

-	The leader has a list of all commands it will execute

-	Each vehicle keeps track of all commands it has recieved. For every robot except the leader, this array is initialized as an empty array with adequate length (ammount of steps in the route)

-	When a vehicle is executing a certain command, it will be transmitted to its follower

- 	A recieved message is stored on the correct index in the command array

-	Messages are formatted as follows: <ID>_<COMMANDTYPE>, where <COMMANDTYPE> is eithe 'l', 'r' or 'f_'<DISTANCE>.	
	When recieved, these commands are stored in the command array at index <ID>

-	Each robot keeps track of the progress made towards the current command.
	When it starts a new command a variable 'progressreq' is set to a certain integer, depending on the commad
	Each time step (5ms), a part of the command is executed. Depending on the speed, a variable 'progress' is increased
	Once 'progress' exceeds 'progressreq' we are done with this command

-	Once we are done with a command, we move towards the next command.
	If there is no such command, we stay at the current position, and listen to incoming messages

-	When executing a 'forward command', the leader always moves at 33% of the maximum speed.
	Let the headway be between 'lb' (lowbound) and 'ub', and let 'range'='ub'-'lb'
	If a following vehicle is closer than 'lb' then it follows with speed 0 (i.e. it is stopped)
	If a followinf vehicle is withing 'lb'+'range'/3 it follows casually, at 33% of max speed
	If a following vehicle is withing 'lb' + 2*'range'/3 it follows in a hurry, at 66% of max speed
	If a following vehicle is further than 'lb'+2*'range'/3 it follows at panic speed, at 100% of max speed.

-	There will be no commands to align the initial positions of the vehicles. i.e. the paths traced out by each vehicles will be offset by their initial position.

-	A vehicle will not stop to allow its follower to catch up

