# General Workflow
We started with simpelest generation example: boundingbox to java code.
So we made an small example bounding box and looked online for a quick tutorial
on how to use the Epsilon Generation Language.
It turned out there was an exmaple project avaliable in Eclips.
This quickly showed us how to use the egx files for loading in the templates and
writing the output to some file.

Then we created an example in Java on how it should look like.
Using the epsilon book we replaced all the values in the template with the values from the model.
Only on the retrieval of lists from the provided models there was a small hiccup.

The next task was to think of a good design for the NXC code.
This turned out te be quite difficult.
We found multiple issues in the generation of the code and send an email for
clarification on how to tackle these shortcomings.
Also we had little experience with programming in any language that resembles the
NXC language so it was also a bit tricky to create a good program for this.
However with the response on our questions and some trail and error we managed to come up with a decent implementation of the platoon in NXC.
The protocols executed by the platoon are explained below.

While waiting for the response we started on the platoon to bounding box conversion. 
After figuring out the ETL syntax, this was a straightforward procedure

We wanted to make it possible to generate the files from models written in the DSL itself, using Eclipse.
However we could not find an effcient way of adding this functionality to eclipse.
Terefor we used .launch files in combination with predefined models to test our scripts.

# Design Decisions:
* The robots will not follow eachother correctly like its hinted at in the assignment. However we did include all the requested snippet functionalities.
* The end user should manually change the `FWD_STEPS` and `TURN_STEPS` to their likings
* We tried to minimize the calculations by the templating language in the generation of the java files.
* We assume the turn commands make angles of 90 degrees and the bounding box itself is axis alignd with the starting position.
* When a platoon is created from a bounding box we intended to include the zero path lenghts. For the model to be converted as tracable as possible it is better to include them.
* There was no output for all the conversion operations. So we added a "pre" and "post" box to each conversion to give confirmation that the conversion has taken place.



- 	Each vehicle starts by checking at what index it is in the platoon.
	The leader as index 0, its follower has index 1, etc.

-	Next, the communication channels are initialized.
	If a robot has an odd index, it communicates with it's slave on channel 1, and recieves commands from its master at channel 2.
	If a robot has an even index, these channels are flipped.

-	The leader has a list of all commands it will execute

-	Each vehicle keeps track of all commands it has recieved. For every robot except the leader, this array is initialized as an empty array with adequate length (ammount of steps in the route)

-	When a vehicle is executing a certain command, it will be transmitted to its follower.

- 	A recieved message is stored on the correct index in the command array.

-	Messages are formatted as follows: <ID>_<COMMANDTYPE>, where <COMMANDTYPE> is eithe 'l', 'r' or 'f_'<DISTANCE>.	
	When recieved, these commands are stored in the command array at index <ID>

-	Each robot keeps track of the progress made towards the current command.
	When it starts a new command a variable 'progressreq' is set to a certain integer, depending on the commad.
	Each time step (5ms), a part of the command is executed. Depending on the speed, a variable 'progress' is increased.
	Once 'progress' exceeds 'progressreq' we are done with this command.

-	Once we are done with a command, we move towards the next command.
	If there is no such command, we stay at the current position, and listen to incoming messages

-	When executing a 'forward command', the leader always moves at 33% of the maximum speed.
	Let the headway be between 'lb' (lowbound) and 'ub', and let 'range'='ub'-'lb'
	If a following vehicle is closer than 'lb' then it follows with speed 0 (i.e. it is stopped)
	If a following vehicle is withing 'lb'+'range'/3 it follows casually, at 33% of max speed
	If a following vehicle is withing 'lb' + 2*'range'/3 it follows in a hurry, at 66% of max speed
	If a following vehicle is further than 'lb'+2*'range'/3 it follows at panic speed, at 100% of max speed.

-	There will be no commands to align the initial positions of the vehicles. i.e. the paths traced out by each vehicles will be offset by their initial position.

-	A vehicle will not stop to allow its follower to catch up.
	This could be added, but it only add more NXC code, complicating the program, without using model transformations.

# Deplyment
- Platoon to NXC is in the `tue.glt.platoon` project, under templates
- Platoon to bounding box is in the `tue.gtl.platoon2boundingbox` project, in the root
- Bounding box to Java is in the `tue.glt.boundingbox` project, under templates

