## BoudningBox installation from scratch
Open workspace
Create a new "Empty EMF Project" called "tue.glt.boundingbox"
Then we added a BoundingBox.ecore model as defined in "tue.glt.boundingbox/model/BoundingBox.ecore"
After that the genmodel was created with the default settings
Then the 4 projects files are exported as "Deployable plug-ins and fragments" to the current IDE installation folder
    Note: in Ubuntu this should not be exported to the eclipse folder, but to the eclips/dropins folder
Eclips is restarted to load in the plugins
A new "XText Project From Existing Ecore Models" is created form the BoudningBox.genmodel package with World as entry rule.
    The project name is "tue.glt.boundingbox.dsl"
    The language name is "tue.glt.boundingbox.dsl.BoundingBoxDsl"
    The extension is "bb"

After this we modified the xText file to fit the image
The xText file can then be runned as "Generate Xtext artifacts" to generate the corresponding dsl projects
Now the "tue.glt.boundingbox.dsl" project can be runned as an "Eclipse application".
Then create a new "General">"Project" called "BoundingBoxTest"
When opening a ".bb" file you should confirm it to make a xText project.

