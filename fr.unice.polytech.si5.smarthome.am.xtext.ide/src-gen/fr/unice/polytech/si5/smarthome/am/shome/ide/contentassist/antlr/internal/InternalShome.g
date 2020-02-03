/*
 * generated by Xtext 2.14.0
 */
grammar InternalShome;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.unice.polytech.si5.smarthome.am.shome.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.unice.polytech.si5.smarthome.am.shome.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.unice.polytech.si5.smarthome.am.shome.services.ShomeGrammarAccess;

}
@parser::members {
	private ShomeGrammarAccess grammarAccess;

	public void setGrammarAccess(ShomeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleHome
entryRuleHome
:
{ before(grammarAccess.getHomeRule()); }
	 ruleHome
{ after(grammarAccess.getHomeRule()); } 
	 EOF 
;

// Rule Home
ruleHome 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHomeAccess().getGroup()); }
		(rule__Home__Group__0)
		{ after(grammarAccess.getHomeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubject
entryRuleSubject
:
{ before(grammarAccess.getSubjectRule()); }
	 ruleSubject
{ after(grammarAccess.getSubjectRule()); } 
	 EOF 
;

// Rule Subject
ruleSubject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubjectAccess().getGroup()); }
		(rule__Subject__Group__0)
		{ after(grammarAccess.getSubjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActor
entryRuleActor
:
{ before(grammarAccess.getActorRule()); }
	 ruleActor
{ after(grammarAccess.getActorRule()); } 
	 EOF 
;

// Rule Actor
ruleActor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActorAccess().getGroup()); }
		(rule__Actor__Group__0)
		{ after(grammarAccess.getActorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOccurence
entryRuleOccurence
:
{ before(grammarAccess.getOccurenceRule()); }
	 ruleOccurence
{ after(grammarAccess.getOccurenceRule()); } 
	 EOF 
;

// Rule Occurence
ruleOccurence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOccurenceAccess().getGroup()); }
		(rule__Occurence__Group__0)
		{ after(grammarAccess.getOccurenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvent
entryRuleEvent
:
{ before(grammarAccess.getEventRule()); }
	 ruleEvent
{ after(grammarAccess.getEventRule()); } 
	 EOF 
;

// Rule Event
ruleEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventAccess().getGroup()); }
		(rule__Event__Group__0)
		{ after(grammarAccess.getEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getGroup()); }
		(rule__Action__Group__0)
		{ after(grammarAccess.getActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEDate
entryRuleEDate
:
{ before(grammarAccess.getEDateRule()); }
	 ruleEDate
{ after(grammarAccess.getEDateRule()); } 
	 EOF 
;

// Rule EDate
ruleEDate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEDateAccess().getEDateKeyword()); }
		'EDate'
		{ after(grammarAccess.getEDateAccess().getEDateKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__0__Impl
	rule__Home__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getHomeAction_0()); }
	()
	{ after(grammarAccess.getHomeAccess().getHomeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__1__Impl
	rule__Home__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getHomeKeyword_1()); }
	'Home'
	{ after(grammarAccess.getHomeAccess().getHomeKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__2__Impl
	rule__Home__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__3__Impl
	rule__Home__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_3()); }
	(rule__Home__OwnedSubjectsAssignment_3)
	{ after(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__4__Impl
	rule__Home__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_4()); }
	(rule__Home__OwnedSubjectsAssignment_4)*
	{ after(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__5__Impl
	rule__Home__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedActorsAssignment_5()); }
	(rule__Home__OwnedActorsAssignment_5)
	{ after(grammarAccess.getHomeAccess().getOwnedActorsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__6__Impl
	rule__Home__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedActorsAssignment_6()); }
	(rule__Home__OwnedActorsAssignment_6)*
	{ after(grammarAccess.getHomeAccess().getOwnedActorsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__7__Impl
	rule__Home__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedEventsAssignment_7()); }
	(rule__Home__OwnedEventsAssignment_7)
	{ after(grammarAccess.getHomeAccess().getOwnedEventsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__8__Impl
	rule__Home__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedEventsAssignment_8()); }
	(rule__Home__OwnedEventsAssignment_8)*
	{ after(grammarAccess.getHomeAccess().getOwnedEventsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__9__Impl
	rule__Home__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedConditionsAssignment_9()); }
	(rule__Home__OwnedConditionsAssignment_9)
	{ after(grammarAccess.getHomeAccess().getOwnedConditionsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__10__Impl
	rule__Home__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedConditionsAssignment_10()); }
	(rule__Home__OwnedConditionsAssignment_10)*
	{ after(grammarAccess.getHomeAccess().getOwnedConditionsAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__11__Impl
	rule__Home__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_11()); }
	(rule__Home__OwnedOccurencesAssignment_11)
	{ after(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__12__Impl
	rule__Home__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_12()); }
	(rule__Home__OwnedOccurencesAssignment_12)*
	{ after(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Home__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subject__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group__0__Impl
	rule__Subject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); }
	'Subject'
	{ after(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group__1__Impl
	rule__Subject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getNameAssignment_1()); }
	(rule__Subject__NameAssignment_1)
	{ after(grammarAccess.getSubjectAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group__2__Impl
	rule__Subject__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2()); }
	'ownedActions'
	{ after(grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group__3__Impl
	rule__Subject__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getSubjectAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group__4__Impl
	rule__Subject__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_4()); }
	(rule__Subject__OwnedActionsAssignment_4)
	{ after(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getGroup_5()); }
	(rule__Subject__Group_5__0)*
	{ after(grammarAccess.getSubjectAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Subject__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group_5__0__Impl
	rule__Subject__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0()); }
	'-'
	{ after(grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Subject__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_5_1()); }
	(rule__Subject__OwnedActionsAssignment_5_1)
	{ after(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Actor__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Actor__Group__0__Impl
	rule__Actor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Actor__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActorAccess().getActorAction_0()); }
	()
	{ after(grammarAccess.getActorAccess().getActorAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Actor__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Actor__Group__1__Impl
	rule__Actor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Actor__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActorAccess().getActorKeyword_1()); }
	'Actor'
	{ after(grammarAccess.getActorAccess().getActorKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Actor__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Actor__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Actor__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActorAccess().getNameAssignment_2()); }
	(rule__Actor__NameAssignment_2)
	{ after(grammarAccess.getActorAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Occurence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Occurence__Group__0__Impl
	rule__Occurence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOccurenceAccess().getOccurenceKeyword_0()); }
	'Occurence'
	{ after(grammarAccess.getOccurenceAccess().getOccurenceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Occurence__Group__1__Impl
	rule__Occurence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOccurenceAccess().getTimeAssignment_1()); }
	(rule__Occurence__TimeAssignment_1)?
	{ after(grammarAccess.getOccurenceAccess().getTimeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Occurence__Group__2__Impl
	rule__Occurence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOccurenceAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getOccurenceAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Occurence__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOccurenceAccess().getEventAssignment_3()); }
	(rule__Occurence__EventAssignment_3)
	{ after(grammarAccess.getOccurenceAccess().getEventAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getIfKeyword_0()); }
	'if'
	{ after(grammarAccess.getConditionAccess().getIfKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
	rule__Condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getEventAssignment_1()); }
	(rule__Condition__EventAssignment_1)
	{ after(grammarAccess.getConditionAccess().getEventAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__2__Impl
	rule__Condition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getThenKeyword_2()); }
	'then'
	{ after(grammarAccess.getConditionAccess().getThenKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__3__Impl
	rule__Condition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getActionsAssignment_3()); }
	(rule__Condition__ActionsAssignment_3)
	{ after(grammarAccess.getConditionAccess().getActionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getGroup_4()); }
	(rule__Condition__Group_4__0)*
	{ after(grammarAccess.getConditionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_4__0__Impl
	rule__Condition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAndKeyword_4_0()); }
	'and'
	{ after(grammarAccess.getConditionAccess().getAndKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getActionsAssignment_4_1()); }
	(rule__Condition__ActionsAssignment_4_1)
	{ after(grammarAccess.getConditionAccess().getActionsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Event__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__0__Impl
	rule__Event__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getEventKeyword_0()); }
	'Event'
	{ after(grammarAccess.getEventAccess().getEventKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__1__Impl
	rule__Event__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getNameAssignment_1()); }
	(rule__Event__NameAssignment_1)
	{ after(grammarAccess.getEventAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__2__Impl
	rule__Event__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getEventAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__3__Impl
	rule__Event__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getActorAssignment_3()); }
	(rule__Event__ActorAssignment_3)
	{ after(grammarAccess.getEventAccess().getActorAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__4__Impl
	rule__Event__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getDoKeyword_4()); }
	'do'
	{ after(grammarAccess.getEventAccess().getDoKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getActionAssignment_5()); }
	(rule__Event__ActionAssignment_5)
	{ after(grammarAccess.getEventAccess().getActionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getActionAction_0()); }
	()
	{ after(grammarAccess.getActionAccess().getActionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getNameAssignment_1()); }
	(rule__Action__NameAssignment_1)
	{ after(grammarAccess.getActionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Home__OwnedSubjectsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_3_0()); }
		ruleSubject
		{ after(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedSubjectsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_4_0()); }
		ruleSubject
		{ after(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedActorsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_5_0()); }
		ruleActor
		{ after(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedActorsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_6_0()); }
		ruleActor
		{ after(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedEventsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedEventsEventParserRuleCall_7_0()); }
		ruleEvent
		{ after(grammarAccess.getHomeAccess().getOwnedEventsEventParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedEventsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedEventsEventParserRuleCall_8_0()); }
		ruleEvent
		{ after(grammarAccess.getHomeAccess().getOwnedEventsEventParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedConditionsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_9_0()); }
		ruleCondition
		{ after(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedConditionsAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_10_0()); }
		ruleCondition
		{ after(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedOccurencesAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_11_0()); }
		ruleOccurence
		{ after(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Home__OwnedOccurencesAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_12_0()); }
		ruleOccurence
		{ after(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__OwnedActionsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0()); }
		ruleAction
		{ after(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subject__OwnedActionsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0()); }
		ruleAction
		{ after(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Actor__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__TimeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOccurenceAccess().getTimeEDateParserRuleCall_1_0()); }
		ruleEDate
		{ after(grammarAccess.getOccurenceAccess().getTimeEDateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Occurence__EventAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOccurenceAccess().getEventEventCrossReference_3_0()); }
		(
			{ before(grammarAccess.getOccurenceAccess().getEventEventEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getOccurenceAccess().getEventEventEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getOccurenceAccess().getEventEventCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__EventAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getEventEventCrossReference_1_0()); }
		(
			{ before(grammarAccess.getConditionAccess().getEventEventEStringParserRuleCall_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getConditionAccess().getEventEventEStringParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getConditionAccess().getEventEventCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ActionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getActionsActionCrossReference_3_0()); }
		(
			{ before(grammarAccess.getConditionAccess().getActionsActionEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getConditionAccess().getActionsActionEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getConditionAccess().getActionsActionCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__ActionsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getActionsActionCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getConditionAccess().getActionsActionEStringParserRuleCall_4_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getConditionAccess().getActionsActionEStringParserRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getConditionAccess().getActionsActionCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__ActorAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getActorActorCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEventAccess().getActorActorEStringParserRuleCall_3_0_1()); }
			ruleEString
			{ after(grammarAccess.getEventAccess().getActorActorEStringParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEventAccess().getActorActorCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__ActionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getActionActionCrossReference_5_0()); }
		(
			{ before(grammarAccess.getEventAccess().getActionActionEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getEventAccess().getActionActionEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getEventAccess().getActionActionCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;