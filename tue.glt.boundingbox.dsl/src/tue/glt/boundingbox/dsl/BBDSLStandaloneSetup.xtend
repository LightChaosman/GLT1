/*
 * generated by Xtext 2.10.0
 */
package tue.glt.boundingbox.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BBDSLStandaloneSetup extends BBDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new BBDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
