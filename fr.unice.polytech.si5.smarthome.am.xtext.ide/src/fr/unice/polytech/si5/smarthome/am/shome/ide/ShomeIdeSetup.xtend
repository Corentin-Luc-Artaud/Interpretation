/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.smarthome.am.shome.ide

import com.google.inject.Guice
import fr.unice.polytech.si5.smarthome.am.shome.ShomeRuntimeModule
import fr.unice.polytech.si5.smarthome.am.shome.ShomeStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ShomeIdeSetup extends ShomeStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ShomeRuntimeModule, new ShomeIdeModule))
	}
	
}
