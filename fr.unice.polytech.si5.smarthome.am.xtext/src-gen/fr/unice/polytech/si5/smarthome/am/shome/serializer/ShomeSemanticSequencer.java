/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.smarthome.am.shome.serializer;

import com.google.inject.Inject;
import fr.unice.polytech.si5.smarthome.am.shome.services.ShomeGrammarAccess;
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor;
import fr.unice.polytech.si5.smarthome.am.smart_home.Barrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ShomeSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ShomeGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmartHomePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmartHomePackage.ACTION:
				sequence_Action(context, (fr.unice.polytech.si5.smarthome.am.smart_home.Action) semanticObject); 
				return; 
			case SmartHomePackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case SmartHomePackage.BARRIER:
				sequence_Barrier(context, (Barrier) semanticObject); 
				return; 
			case SmartHomePackage.COMPOSE_CONDITION:
				sequence_ComposeCondition(context, (ComposeCondition) semanticObject); 
				return; 
			case SmartHomePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case SmartHomePackage.DIFFERED_BARRIER:
				sequence_DifferedBarrier(context, (DifferedBarrier) semanticObject); 
				return; 
			case SmartHomePackage.HOME:
				sequence_Home(context, (Home) semanticObject); 
				return; 
			case SmartHomePackage.HOME_TIME_STAMP:
				sequence_HomeTimeStamp(context, (HomeTimeStamp) semanticObject); 
				return; 
			case SmartHomePackage.OCCURENCE:
				sequence_Occurence(context, (Occurence) semanticObject); 
				return; 
			case SmartHomePackage.SUBJECT:
				sequence_Subject(context, (Subject) semanticObject); 
				return; 
			case SmartHomePackage.TIME_ELEAPSED_CONDITION:
				sequence_TimeEleapsedCondition(context, (TimeEleapsedCondition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Action(ISerializationContext context, fr.unice.polytech.si5.smarthome.am.smart_home.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartHomePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartHomePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Actor returns Actor
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Actor(ISerializationContext context, Actor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartHomePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartHomePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ABarrier returns Barrier
	 *     Barrier returns Barrier
	 *
	 * Constraint:
	 *     (ownedCondition=ACondition actions+=[Action|EString] actions+=[Action|EString]*)
	 */
	protected void sequence_Barrier(ISerializationContext context, Barrier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ACondition returns ComposeCondition
	 *     ComposeCondition returns ComposeCondition
	 *
	 * Constraint:
	 *     (ownedConditions+=TerminalCondition ownedConditions+=TerminalCondition ownedConditions+=TerminalCondition*)
	 */
	protected void sequence_ComposeCondition(ISerializationContext context, ComposeCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ACondition returns Condition
	 *     Condition returns Condition
	 *     TerminalCondition returns Condition
	 *
	 * Constraint:
	 *     (actor=[Actor|EString]? action=[Action|EString])
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ABarrier returns DifferedBarrier
	 *     DifferedBarrier returns DifferedBarrier
	 *
	 * Constraint:
	 *     (ownedCondition=ACondition TriggerAfter=HomeTimeStamp actions+=[Action|EString] actions+=[Action|EString]*)
	 */
	protected void sequence_DifferedBarrier(ISerializationContext context, DifferedBarrier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     HomeTimeStamp returns HomeTimeStamp
	 *
	 * Constraint:
	 *     (hour=INT min=INT sec=INT)
	 */
	protected void sequence_HomeTimeStamp(ISerializationContext context, HomeTimeStamp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartHomePackage.Literals.HOME_TIME_STAMP__HOUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartHomePackage.Literals.HOME_TIME_STAMP__HOUR));
			if (transientValues.isValueTransient(semanticObject, SmartHomePackage.Literals.HOME_TIME_STAMP__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartHomePackage.Literals.HOME_TIME_STAMP__MIN));
			if (transientValues.isValueTransient(semanticObject, SmartHomePackage.Literals.HOME_TIME_STAMP__SEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartHomePackage.Literals.HOME_TIME_STAMP__SEC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHomeTimeStampAccess().getHourINTTerminalRuleCall_0_0(), semanticObject.getHour());
		feeder.accept(grammarAccess.getHomeTimeStampAccess().getMinINTTerminalRuleCall_2_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getHomeTimeStampAccess().getSecINTTerminalRuleCall_4_0(), semanticObject.getSec());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Home returns Home
	 *
	 * Constraint:
	 *     (
	 *         ownedSubjects+=Subject 
	 *         ownedSubjects+=Subject* 
	 *         ownedActors+=Actor* 
	 *         ownedBarrier+=ABarrier 
	 *         ownedBarrier+=ABarrier* 
	 *         ownedOccurences+=Occurence 
	 *         ownedOccurences+=Occurence*
	 *     )
	 */
	protected void sequence_Home(ISerializationContext context, Home semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Occurence returns Occurence
	 *
	 * Constraint:
	 *     (ownedTime=HomeTimeStamp actor=[Actor|EString]? action=[Action|EString])
	 */
	protected void sequence_Occurence(ISerializationContext context, Occurence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Subject returns Subject
	 *
	 * Constraint:
	 *     (name=EString ownedActions+=Action ownedActions+=Action*)
	 */
	protected void sequence_Subject(ISerializationContext context, Subject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ACondition returns TimeEleapsedCondition
	 *     TimeEleapsedCondition returns TimeEleapsedCondition
	 *     TerminalCondition returns TimeEleapsedCondition
	 *
	 * Constraint:
	 *     (actor=[Actor|EString]? action=[Action|EString] ownedTimestampEleapsed=HomeTimeStamp)
	 */
	protected void sequence_TimeEleapsedCondition(ISerializationContext context, TimeEleapsedCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
