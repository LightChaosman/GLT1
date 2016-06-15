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
Also we had little experiance with programming in any language that resembles the
NXC language so it was also a bit tricky to create a good program for this.
However with the response on our questions and some trail and error we managed to come up with a decent implementation of the platoon in NXC.

While waiting for the response we started on the platoon to bounding box conversion. 
<!--TODO: @Helmond this whent smoothly right?-->

We wanted to make it possible to generate the files from models written in the DSL itself, using Eclips.
However we could not find an effcient way of adding this functionality to eclipse.
Terefor we used .launch files in combination with predefined models to test our scripts.

# Design Decisions:
* The robots will not follow eachother correctly like its hinted at in the assignment. However we did include all the requested snippet functionalities.
 * The end user should manually change the `FWD_STEPS` and `TURN_STEPS` to their likings
* We tried to minimize the calculations by the templating language in the generation of the java files.
* We assume the turn commands make angles of 90 degrees and the bounding box itself is axis alignd with the starting position.
* When a platoon is created from a bounding box we intended to include the zero path lenghts. For the model to be converted as tracable as possible it is better to include them.
* There was no output for all the conversion operations. So we added a "pre" and "post" box to each conversion to give confirmation that the conversion has taken place.

