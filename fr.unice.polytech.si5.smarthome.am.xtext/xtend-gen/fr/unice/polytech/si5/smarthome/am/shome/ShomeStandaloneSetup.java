/**
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.smarthome.am.shome;

import fr.unice.polytech.si5.smarthome.am.shome.ShomeStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ShomeStandaloneSetup extends ShomeStandaloneSetupGenerated {
  public static void doSetup() {
    new ShomeStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}