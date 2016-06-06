# General Workflow
We started out by installing the required software, following the installation guide.
After that we followed the DSL modeling tutorial step-by-step to get to know the tool a bit better.

We started the assignment by creating initial meta-models on paper, derived from the images.
These models were then recreated as an ECore models in Eclipse.

A small inheritance mistake was made, but this was quickly resolved.

We also encountered a more elegant problem.
We could not generate the plug-in if the 'containment' flag was missing.
Although it is stated in the guide we also found another group that had this exact same problem.

After this was resolved we could create the plug-ins.
On Windows these could be exported to the main `eclipse` folder, but we found out that on Ubuntu these should reside in the `eclipse/dropins` folder.

From both projects we generated the Xtext projects from the existing EModels.
These projects ran out of the box, and allowed the desired models to be expressed. In a default syntax.
Only the tests were not functional. We wanted to add these but could not find a way to do this. It seemed like the `World` class was not found in the testcases.

When altering the grammar of the platoon language we stumbled upon the problem of not having IDs for vehicles and routes.
We adapted the ECore model and regenerated the Xtext project.

With the IDs in place, the conversion to the desired syntax was quite straightforward.

# Design Decisions:
We could create a slightly smaller meta-model for the platooning language.
Currently an instance has a 'constraints' field, which refers to a single 'Constraints' object.
This 'Constraints' object is currently a list of length 1 of 'Constraint' objects.
Constraint objects are abstract and the only subtype is 'headway'.
This means that 'constraints' is a singleton list of a single 'headway', which could simply be replaced by a simple 'headway' field in the instance.
However it is not clear from the assignment what the desired extend of the proposed language should be.

Therefor we chose this approach because it is easier to extend, as seems to be the intention, since the constraints section is written in plural form.

