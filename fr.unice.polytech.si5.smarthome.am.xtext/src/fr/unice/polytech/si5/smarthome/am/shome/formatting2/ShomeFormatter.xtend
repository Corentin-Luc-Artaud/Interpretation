/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.smarthome.am.shome.formatting2

import com.google.inject.Inject
import fr.unice.polytech.si5.smarthome.am.shome.services.ShomeGrammarAccess
import fr.unice.polytech.si5.smarthome.am.smart_home.Home
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ShomeFormatter extends AbstractFormatter2 {
	
	@Inject extension ShomeGrammarAccess

	def dispatch void format(Home home, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (subject : home.ownedSubjects) {
			subject.format
		}
		for (actor : home.ownedActors) {
			actor.format
		}
		for (barrier : home.ownedBarrier) {
			barrier.format
		}
		for (occurence : home.ownedOccurences) {
			occurence.format
		}
	}

	def dispatch void format(Subject subject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (action : subject.ownedActions) {
			action.format
		}
	}
	
	// TODO: implement for 
}
