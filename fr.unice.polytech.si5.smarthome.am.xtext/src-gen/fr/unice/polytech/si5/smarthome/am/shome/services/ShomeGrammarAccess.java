/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.smarthome.am.shome.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ShomeGrammarAccess extends AbstractGrammarElementFinder {
	
	public class HomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Home");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cHomeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cHomeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cOwnedSubjectsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOwnedSubjectsSubjectParserRuleCall_3_0 = (RuleCall)cOwnedSubjectsAssignment_3.eContents().get(0);
		private final Assignment cOwnedSubjectsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedSubjectsSubjectParserRuleCall_4_0 = (RuleCall)cOwnedSubjectsAssignment_4.eContents().get(0);
		private final Assignment cOwnedActorsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOwnedActorsActorParserRuleCall_5_0 = (RuleCall)cOwnedActorsAssignment_5.eContents().get(0);
		private final Assignment cOwnedActorsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOwnedActorsActorParserRuleCall_6_0 = (RuleCall)cOwnedActorsAssignment_6.eContents().get(0);
		private final Assignment cOwnedEventsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cOwnedEventsEventParserRuleCall_7_0 = (RuleCall)cOwnedEventsAssignment_7.eContents().get(0);
		private final Assignment cOwnedEventsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOwnedEventsEventParserRuleCall_8_0 = (RuleCall)cOwnedEventsAssignment_8.eContents().get(0);
		private final Assignment cOwnedConditionsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cOwnedConditionsConditionParserRuleCall_9_0 = (RuleCall)cOwnedConditionsAssignment_9.eContents().get(0);
		private final Assignment cOwnedConditionsAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cOwnedConditionsConditionParserRuleCall_10_0 = (RuleCall)cOwnedConditionsAssignment_10.eContents().get(0);
		private final Assignment cOwnedOccurencesAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cOwnedOccurencesOccurenceParserRuleCall_11_0 = (RuleCall)cOwnedOccurencesAssignment_11.eContents().get(0);
		private final Assignment cOwnedOccurencesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cOwnedOccurencesOccurenceParserRuleCall_12_0 = (RuleCall)cOwnedOccurencesAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Home:
		//	{Home} 'Home' '{' ownedSubjects+=Subject ownedSubjects+=Subject* ownedActors+=Actor ownedActors+=Actor*
		//	ownedEvents+=Event ownedEvents+=Event* ownedConditions+=Condition ownedConditions+=Condition*
		//	ownedOccurences+=Occurence ownedOccurences+=Occurence* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Home} 'Home' '{' ownedSubjects+=Subject ownedSubjects+=Subject* ownedActors+=Actor ownedActors+=Actor*
		//ownedEvents+=Event ownedEvents+=Event* ownedConditions+=Condition ownedConditions+=Condition*
		//ownedOccurences+=Occurence ownedOccurences+=Occurence* '}'
		public Group getGroup() { return cGroup; }
		
		//{Home}
		public Action getHomeAction_0() { return cHomeAction_0; }
		
		//'Home'
		public Keyword getHomeKeyword_1() { return cHomeKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//ownedSubjects+=Subject
		public Assignment getOwnedSubjectsAssignment_3() { return cOwnedSubjectsAssignment_3; }
		
		//Subject
		public RuleCall getOwnedSubjectsSubjectParserRuleCall_3_0() { return cOwnedSubjectsSubjectParserRuleCall_3_0; }
		
		//ownedSubjects+=Subject*
		public Assignment getOwnedSubjectsAssignment_4() { return cOwnedSubjectsAssignment_4; }
		
		//Subject
		public RuleCall getOwnedSubjectsSubjectParserRuleCall_4_0() { return cOwnedSubjectsSubjectParserRuleCall_4_0; }
		
		//ownedActors+=Actor
		public Assignment getOwnedActorsAssignment_5() { return cOwnedActorsAssignment_5; }
		
		//Actor
		public RuleCall getOwnedActorsActorParserRuleCall_5_0() { return cOwnedActorsActorParserRuleCall_5_0; }
		
		//ownedActors+=Actor*
		public Assignment getOwnedActorsAssignment_6() { return cOwnedActorsAssignment_6; }
		
		//Actor
		public RuleCall getOwnedActorsActorParserRuleCall_6_0() { return cOwnedActorsActorParserRuleCall_6_0; }
		
		//ownedEvents+=Event
		public Assignment getOwnedEventsAssignment_7() { return cOwnedEventsAssignment_7; }
		
		//Event
		public RuleCall getOwnedEventsEventParserRuleCall_7_0() { return cOwnedEventsEventParserRuleCall_7_0; }
		
		//ownedEvents+=Event*
		public Assignment getOwnedEventsAssignment_8() { return cOwnedEventsAssignment_8; }
		
		//Event
		public RuleCall getOwnedEventsEventParserRuleCall_8_0() { return cOwnedEventsEventParserRuleCall_8_0; }
		
		//ownedConditions+=Condition
		public Assignment getOwnedConditionsAssignment_9() { return cOwnedConditionsAssignment_9; }
		
		//Condition
		public RuleCall getOwnedConditionsConditionParserRuleCall_9_0() { return cOwnedConditionsConditionParserRuleCall_9_0; }
		
		//ownedConditions+=Condition*
		public Assignment getOwnedConditionsAssignment_10() { return cOwnedConditionsAssignment_10; }
		
		//Condition
		public RuleCall getOwnedConditionsConditionParserRuleCall_10_0() { return cOwnedConditionsConditionParserRuleCall_10_0; }
		
		//ownedOccurences+=Occurence
		public Assignment getOwnedOccurencesAssignment_11() { return cOwnedOccurencesAssignment_11; }
		
		//Occurence
		public RuleCall getOwnedOccurencesOccurenceParserRuleCall_11_0() { return cOwnedOccurencesOccurenceParserRuleCall_11_0; }
		
		//ownedOccurences+=Occurence*
		public Assignment getOwnedOccurencesAssignment_12() { return cOwnedOccurencesAssignment_12; }
		
		//Occurence
		public RuleCall getOwnedOccurencesOccurenceParserRuleCall_12_0() { return cOwnedOccurencesOccurenceParserRuleCall_12_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}
	public class SubjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Subject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cOwnedActionsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cOwnedActionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedActionsActionParserRuleCall_4_0 = (RuleCall)cOwnedActionsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cHyphenMinusKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cOwnedActionsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cOwnedActionsActionParserRuleCall_5_1_0 = (RuleCall)cOwnedActionsAssignment_5_1.eContents().get(0);
		
		//Subject:
		//	'Subject' name=EString 'ownedActions' ':' ownedActions+=Action ("-" ownedActions+=Action)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Subject' name=EString 'ownedActions' ':' ownedActions+=Action ("-" ownedActions+=Action)*
		public Group getGroup() { return cGroup; }
		
		//'Subject'
		public Keyword getSubjectKeyword_0() { return cSubjectKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'ownedActions'
		public Keyword getOwnedActionsKeyword_2() { return cOwnedActionsKeyword_2; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//ownedActions+=Action
		public Assignment getOwnedActionsAssignment_4() { return cOwnedActionsAssignment_4; }
		
		//Action
		public RuleCall getOwnedActionsActionParserRuleCall_4_0() { return cOwnedActionsActionParserRuleCall_4_0; }
		
		//("-" ownedActions+=Action)*
		public Group getGroup_5() { return cGroup_5; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_5_0() { return cHyphenMinusKeyword_5_0; }
		
		//ownedActions+=Action
		public Assignment getOwnedActionsAssignment_5_1() { return cOwnedActionsAssignment_5_1; }
		
		//Action
		public RuleCall getOwnedActionsActionParserRuleCall_5_1_0() { return cOwnedActionsActionParserRuleCall_5_1_0; }
	}
	public class ActorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Actor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Actor:
		//	{Actor} 'Actor' name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Actor} 'Actor' name=EString
		public Group getGroup() { return cGroup; }
		
		//{Actor}
		public Action getActorAction_0() { return cActorAction_0; }
		
		//'Actor'
		public Keyword getActorKeyword_1() { return cActorKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class OccurenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Occurence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOwnedTimeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOwnedTimeHomeTimeStampParserRuleCall_0_0 = (RuleCall)cOwnedTimeAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEventAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEventEventCrossReference_2_0 = (CrossReference)cEventAssignment_2.eContents().get(0);
		private final RuleCall cEventEventEStringParserRuleCall_2_0_1 = (RuleCall)cEventEventCrossReference_2_0.eContents().get(1);
		
		//Occurence:
		//	ownedTime=HomeTimeStamp '->' event=[Event|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//ownedTime=HomeTimeStamp '->' event=[Event|EString]
		public Group getGroup() { return cGroup; }
		
		//ownedTime=HomeTimeStamp
		public Assignment getOwnedTimeAssignment_0() { return cOwnedTimeAssignment_0; }
		
		//HomeTimeStamp
		public RuleCall getOwnedTimeHomeTimeStampParserRuleCall_0_0() { return cOwnedTimeHomeTimeStampParserRuleCall_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//event=[Event|EString]
		public Assignment getEventAssignment_2() { return cEventAssignment_2; }
		
		//[Event|EString]
		public CrossReference getEventEventCrossReference_2_0() { return cEventEventCrossReference_2_0; }
		
		//EString
		public RuleCall getEventEventEStringParserRuleCall_2_0_1() { return cEventEventEStringParserRuleCall_2_0_1; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEventAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEventEventCrossReference_1_0 = (CrossReference)cEventAssignment_1.eContents().get(0);
		private final RuleCall cEventEventEStringParserRuleCall_1_0_1 = (RuleCall)cEventEventCrossReference_1_0.eContents().get(1);
		private final Keyword cThenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cActionsActionCrossReference_3_0 = (CrossReference)cActionsAssignment_3.eContents().get(0);
		private final RuleCall cActionsActionEStringParserRuleCall_3_0_1 = (RuleCall)cActionsActionCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAndKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cActionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cActionsActionCrossReference_4_1_0 = (CrossReference)cActionsAssignment_4_1.eContents().get(0);
		private final RuleCall cActionsActionEStringParserRuleCall_4_1_0_1 = (RuleCall)cActionsActionCrossReference_4_1_0.eContents().get(1);
		
		//Condition:
		//	'if' event=[Event|EString] 'then' actions+=[Action|EString] ('and' actions+=[Action|EString])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'if' event=[Event|EString] 'then' actions+=[Action|EString] ('and' actions+=[Action|EString])*
		public Group getGroup() { return cGroup; }
		
		//'if'
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }
		
		//event=[Event|EString]
		public Assignment getEventAssignment_1() { return cEventAssignment_1; }
		
		//[Event|EString]
		public CrossReference getEventEventCrossReference_1_0() { return cEventEventCrossReference_1_0; }
		
		//EString
		public RuleCall getEventEventEStringParserRuleCall_1_0_1() { return cEventEventEStringParserRuleCall_1_0_1; }
		
		//'then'
		public Keyword getThenKeyword_2() { return cThenKeyword_2; }
		
		//actions+=[Action|EString]
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }
		
		//[Action|EString]
		public CrossReference getActionsActionCrossReference_3_0() { return cActionsActionCrossReference_3_0; }
		
		//EString
		public RuleCall getActionsActionEStringParserRuleCall_3_0_1() { return cActionsActionEStringParserRuleCall_3_0_1; }
		
		//('and' actions+=[Action|EString])*
		public Group getGroup_4() { return cGroup_4; }
		
		//'and'
		public Keyword getAndKeyword_4_0() { return cAndKeyword_4_0; }
		
		//actions+=[Action|EString]
		public Assignment getActionsAssignment_4_1() { return cActionsAssignment_4_1; }
		
		//[Action|EString]
		public CrossReference getActionsActionCrossReference_4_1_0() { return cActionsActionCrossReference_4_1_0; }
		
		//EString
		public RuleCall getActionsActionEStringParserRuleCall_4_1_0_1() { return cActionsActionEStringParserRuleCall_4_1_0_1; }
	}
	public class HomeTimeStampElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.HomeTimeStamp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHourAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHourINTTerminalRuleCall_0_0 = (RuleCall)cHourAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinINTTerminalRuleCall_2_0 = (RuleCall)cMinAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSecAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSecINTTerminalRuleCall_4_0 = (RuleCall)cSecAssignment_4.eContents().get(0);
		
		//HomeTimeStamp:
		//	hour=INT ':' min=INT ':' sec=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//hour=INT ':' min=INT ':' sec=INT
		public Group getGroup() { return cGroup; }
		
		//hour=INT
		public Assignment getHourAssignment_0() { return cHourAssignment_0; }
		
		//INT
		public RuleCall getHourINTTerminalRuleCall_0_0() { return cHourINTTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//min=INT
		public Assignment getMinAssignment_2() { return cMinAssignment_2; }
		
		//INT
		public RuleCall getMinINTTerminalRuleCall_2_0() { return cMinINTTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//sec=INT
		public Assignment getSecAssignment_4() { return cSecAssignment_4; }
		
		//INT
		public RuleCall getSecINTTerminalRuleCall_4_0() { return cSecINTTerminalRuleCall_4_0; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cActorActorCrossReference_3_0 = (CrossReference)cActorAssignment_3.eContents().get(0);
		private final RuleCall cActorActorEStringParserRuleCall_3_0_1 = (RuleCall)cActorActorCrossReference_3_0.eContents().get(1);
		private final Keyword cDoKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cActionActionCrossReference_5_0 = (CrossReference)cActionAssignment_5.eContents().get(0);
		private final RuleCall cActionActionEStringParserRuleCall_5_0_1 = (RuleCall)cActionActionCrossReference_5_0.eContents().get(1);
		
		//Event:
		//	'Event' name=EString ':' actor=[Actor|EString] 'do' action=[Action|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//'Event' name=EString ':' actor=[Actor|EString] 'do' action=[Action|EString]
		public Group getGroup() { return cGroup; }
		
		//'Event'
		public Keyword getEventKeyword_0() { return cEventKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//actor=[Actor|EString]
		public Assignment getActorAssignment_3() { return cActorAssignment_3; }
		
		//[Actor|EString]
		public CrossReference getActorActorCrossReference_3_0() { return cActorActorCrossReference_3_0; }
		
		//EString
		public RuleCall getActorActorEStringParserRuleCall_3_0_1() { return cActorActorEStringParserRuleCall_3_0_1; }
		
		//'do'
		public Keyword getDoKeyword_4() { return cDoKeyword_4; }
		
		//action=[Action|EString]
		public Assignment getActionAssignment_5() { return cActionAssignment_5; }
		
		//[Action|EString]
		public CrossReference getActionActionCrossReference_5_0() { return cActionActionCrossReference_5_0; }
		
		//EString
		public RuleCall getActionActionEStringParserRuleCall_5_0_1() { return cActionActionEStringParserRuleCall_5_0_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.si5.smarthome.am.shome.Shome.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Action:
		//	{Action} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Action} name=EString
		public Group getGroup() { return cGroup; }
		
		//{Action}
		public Action getActionAction_0() { return cActionAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	
	
	private final HomeElements pHome;
	private final SubjectElements pSubject;
	private final ActorElements pActor;
	private final OccurenceElements pOccurence;
	private final ConditionElements pCondition;
	private final HomeTimeStampElements pHomeTimeStamp;
	private final EventElements pEvent;
	private final EStringElements pEString;
	private final ActionElements pAction;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ShomeGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pHome = new HomeElements();
		this.pSubject = new SubjectElements();
		this.pActor = new ActorElements();
		this.pOccurence = new OccurenceElements();
		this.pCondition = new ConditionElements();
		this.pHomeTimeStamp = new HomeTimeStampElements();
		this.pEvent = new EventElements();
		this.pEString = new EStringElements();
		this.pAction = new ActionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.polytech.si5.smarthome.am.shome.Shome".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Home:
	//	{Home} 'Home' '{' ownedSubjects+=Subject ownedSubjects+=Subject* ownedActors+=Actor ownedActors+=Actor*
	//	ownedEvents+=Event ownedEvents+=Event* ownedConditions+=Condition ownedConditions+=Condition*
	//	ownedOccurences+=Occurence ownedOccurences+=Occurence* '}';
	public HomeElements getHomeAccess() {
		return pHome;
	}
	
	public ParserRule getHomeRule() {
		return getHomeAccess().getRule();
	}
	
	//Subject:
	//	'Subject' name=EString 'ownedActions' ':' ownedActions+=Action ("-" ownedActions+=Action)*;
	public SubjectElements getSubjectAccess() {
		return pSubject;
	}
	
	public ParserRule getSubjectRule() {
		return getSubjectAccess().getRule();
	}
	
	//Actor:
	//	{Actor} 'Actor' name=EString;
	public ActorElements getActorAccess() {
		return pActor;
	}
	
	public ParserRule getActorRule() {
		return getActorAccess().getRule();
	}
	
	//Occurence:
	//	ownedTime=HomeTimeStamp '->' event=[Event|EString];
	public OccurenceElements getOccurenceAccess() {
		return pOccurence;
	}
	
	public ParserRule getOccurenceRule() {
		return getOccurenceAccess().getRule();
	}
	
	//Condition:
	//	'if' event=[Event|EString] 'then' actions+=[Action|EString] ('and' actions+=[Action|EString])*;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//HomeTimeStamp:
	//	hour=INT ':' min=INT ':' sec=INT;
	public HomeTimeStampElements getHomeTimeStampAccess() {
		return pHomeTimeStamp;
	}
	
	public ParserRule getHomeTimeStampRule() {
		return getHomeTimeStampAccess().getRule();
	}
	
	//Event:
	//	'Event' name=EString ':' actor=[Actor|EString] 'do' action=[Action|EString];
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Action:
	//	{Action} name=EString;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
