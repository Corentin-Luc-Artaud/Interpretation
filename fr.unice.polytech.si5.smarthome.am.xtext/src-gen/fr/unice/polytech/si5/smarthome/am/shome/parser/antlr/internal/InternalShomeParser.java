package fr.unice.polytech.si5.smarthome.am.shome.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.si5.smarthome.am.shome.services.ShomeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShomeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'Subject'", "'ownedActions'", "':'", "'-'", "'Actor'", "'->'", "'if'", "'then'", "'and'", "'Event'", "'do'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalShomeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShomeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShomeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShome.g"; }



     	private ShomeGrammarAccess grammarAccess;

        public InternalShomeParser(TokenStream input, ShomeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Home";
       	}

       	@Override
       	protected ShomeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHome"
    // InternalShome.g:64:1: entryRuleHome returns [EObject current=null] : iv_ruleHome= ruleHome EOF ;
    public final EObject entryRuleHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHome = null;


        try {
            // InternalShome.g:64:45: (iv_ruleHome= ruleHome EOF )
            // InternalShome.g:65:2: iv_ruleHome= ruleHome EOF
            {
             newCompositeNode(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHome=ruleHome();

            state._fsp--;

             current =iv_ruleHome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalShome.g:71:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedEvents_7_0= ruleEvent ) ) ( (lv_ownedEvents_8_0= ruleEvent ) )* ( (lv_ownedConditions_9_0= ruleCondition ) ) ( (lv_ownedConditions_10_0= ruleCondition ) )* ( (lv_ownedOccurences_11_0= ruleOccurence ) ) ( (lv_ownedOccurences_12_0= ruleOccurence ) )* otherlv_13= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_13=null;
        EObject lv_ownedSubjects_3_0 = null;

        EObject lv_ownedSubjects_4_0 = null;

        EObject lv_ownedActors_5_0 = null;

        EObject lv_ownedActors_6_0 = null;

        EObject lv_ownedEvents_7_0 = null;

        EObject lv_ownedEvents_8_0 = null;

        EObject lv_ownedConditions_9_0 = null;

        EObject lv_ownedConditions_10_0 = null;

        EObject lv_ownedOccurences_11_0 = null;

        EObject lv_ownedOccurences_12_0 = null;



        	enterRule();

        try {
            // InternalShome.g:77:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedEvents_7_0= ruleEvent ) ) ( (lv_ownedEvents_8_0= ruleEvent ) )* ( (lv_ownedConditions_9_0= ruleCondition ) ) ( (lv_ownedConditions_10_0= ruleCondition ) )* ( (lv_ownedOccurences_11_0= ruleOccurence ) ) ( (lv_ownedOccurences_12_0= ruleOccurence ) )* otherlv_13= '}' ) )
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedEvents_7_0= ruleEvent ) ) ( (lv_ownedEvents_8_0= ruleEvent ) )* ( (lv_ownedConditions_9_0= ruleCondition ) ) ( (lv_ownedConditions_10_0= ruleCondition ) )* ( (lv_ownedOccurences_11_0= ruleOccurence ) ) ( (lv_ownedOccurences_12_0= ruleOccurence ) )* otherlv_13= '}' )
            {
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedEvents_7_0= ruleEvent ) ) ( (lv_ownedEvents_8_0= ruleEvent ) )* ( (lv_ownedConditions_9_0= ruleCondition ) ) ( (lv_ownedConditions_10_0= ruleCondition ) )* ( (lv_ownedOccurences_11_0= ruleOccurence ) ) ( (lv_ownedOccurences_12_0= ruleOccurence ) )* otherlv_13= '}' )
            // InternalShome.g:79:3: () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedEvents_7_0= ruleEvent ) ) ( (lv_ownedEvents_8_0= ruleEvent ) )* ( (lv_ownedConditions_9_0= ruleCondition ) ) ( (lv_ownedConditions_10_0= ruleCondition ) )* ( (lv_ownedOccurences_11_0= ruleOccurence ) ) ( (lv_ownedOccurences_12_0= ruleOccurence ) )* otherlv_13= '}'
            {
            // InternalShome.g:79:3: ()
            // InternalShome.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getHomeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalShome.g:94:3: ( (lv_ownedSubjects_3_0= ruleSubject ) )
            // InternalShome.g:95:4: (lv_ownedSubjects_3_0= ruleSubject )
            {
            // InternalShome.g:95:4: (lv_ownedSubjects_3_0= ruleSubject )
            // InternalShome.g:96:5: lv_ownedSubjects_3_0= ruleSubject
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_ownedSubjects_3_0=ruleSubject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedSubjects",
            						lv_ownedSubjects_3_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Subject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:113:3: ( (lv_ownedSubjects_4_0= ruleSubject ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShome.g:114:4: (lv_ownedSubjects_4_0= ruleSubject )
            	    {
            	    // InternalShome.g:114:4: (lv_ownedSubjects_4_0= ruleSubject )
            	    // InternalShome.g:115:5: lv_ownedSubjects_4_0= ruleSubject
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedSubjects_4_0=ruleSubject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedSubjects",
            	    						lv_ownedSubjects_4_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Subject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalShome.g:132:3: ( (lv_ownedActors_5_0= ruleActor ) )
            // InternalShome.g:133:4: (lv_ownedActors_5_0= ruleActor )
            {
            // InternalShome.g:133:4: (lv_ownedActors_5_0= ruleActor )
            // InternalShome.g:134:5: lv_ownedActors_5_0= ruleActor
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_ownedActors_5_0=ruleActor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedActors",
            						lv_ownedActors_5_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Actor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:151:3: ( (lv_ownedActors_6_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShome.g:152:4: (lv_ownedActors_6_0= ruleActor )
            	    {
            	    // InternalShome.g:152:4: (lv_ownedActors_6_0= ruleActor )
            	    // InternalShome.g:153:5: lv_ownedActors_6_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_ownedActors_6_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedActors",
            	    						lv_ownedActors_6_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalShome.g:170:3: ( (lv_ownedEvents_7_0= ruleEvent ) )
            // InternalShome.g:171:4: (lv_ownedEvents_7_0= ruleEvent )
            {
            // InternalShome.g:171:4: (lv_ownedEvents_7_0= ruleEvent )
            // InternalShome.g:172:5: lv_ownedEvents_7_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedEventsEventParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_ownedEvents_7_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedEvents",
            						lv_ownedEvents_7_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:189:3: ( (lv_ownedEvents_8_0= ruleEvent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShome.g:190:4: (lv_ownedEvents_8_0= ruleEvent )
            	    {
            	    // InternalShome.g:190:4: (lv_ownedEvents_8_0= ruleEvent )
            	    // InternalShome.g:191:5: lv_ownedEvents_8_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedEventsEventParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_ownedEvents_8_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedEvents",
            	    						lv_ownedEvents_8_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalShome.g:208:3: ( (lv_ownedConditions_9_0= ruleCondition ) )
            // InternalShome.g:209:4: (lv_ownedConditions_9_0= ruleCondition )
            {
            // InternalShome.g:209:4: (lv_ownedConditions_9_0= ruleCondition )
            // InternalShome.g:210:5: lv_ownedConditions_9_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_ownedConditions_9_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedConditions",
            						lv_ownedConditions_9_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:227:3: ( (lv_ownedConditions_10_0= ruleCondition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalShome.g:228:4: (lv_ownedConditions_10_0= ruleCondition )
            	    {
            	    // InternalShome.g:228:4: (lv_ownedConditions_10_0= ruleCondition )
            	    // InternalShome.g:229:5: lv_ownedConditions_10_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ownedConditions_10_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedConditions",
            	    						lv_ownedConditions_10_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalShome.g:246:3: ( (lv_ownedOccurences_11_0= ruleOccurence ) )
            // InternalShome.g:247:4: (lv_ownedOccurences_11_0= ruleOccurence )
            {
            // InternalShome.g:247:4: (lv_ownedOccurences_11_0= ruleOccurence )
            // InternalShome.g:248:5: lv_ownedOccurences_11_0= ruleOccurence
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_ownedOccurences_11_0=ruleOccurence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedOccurences",
            						lv_ownedOccurences_11_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Occurence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:265:3: ( (lv_ownedOccurences_12_0= ruleOccurence ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShome.g:266:4: (lv_ownedOccurences_12_0= ruleOccurence )
            	    {
            	    // InternalShome.g:266:4: (lv_ownedOccurences_12_0= ruleOccurence )
            	    // InternalShome.g:267:5: lv_ownedOccurences_12_0= ruleOccurence
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_ownedOccurences_12_0=ruleOccurence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedOccurences",
            	    						lv_ownedOccurences_12_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Occurence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleSubject"
    // InternalShome.g:292:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalShome.g:292:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalShome.g:293:2: iv_ruleSubject= ruleSubject EOF
            {
             newCompositeNode(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubject=ruleSubject();

            state._fsp--;

             current =iv_ruleSubject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalShome.g:299:1: ruleSubject returns [EObject current=null] : (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedActions_4_0 = null;

        EObject lv_ownedActions_6_0 = null;



        	enterRule();

        try {
            // InternalShome.g:305:2: ( (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* ) )
            // InternalShome.g:306:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* )
            {
            // InternalShome.g:306:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* )
            // InternalShome.g:307:3: otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectAccess().getSubjectKeyword_0());
            		
            // InternalShome.g:311:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:312:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:312:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:313:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSubjectAccess().getColonKeyword_3());
            		
            // InternalShome.g:338:3: ( (lv_ownedActions_4_0= ruleAction ) )
            // InternalShome.g:339:4: (lv_ownedActions_4_0= ruleAction )
            {
            // InternalShome.g:339:4: (lv_ownedActions_4_0= ruleAction )
            // InternalShome.g:340:5: lv_ownedActions_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_ownedActions_4_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					add(
            						current,
            						"ownedActions",
            						lv_ownedActions_4_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:357:3: (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalShome.g:358:4: otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalShome.g:362:4: ( (lv_ownedActions_6_0= ruleAction ) )
            	    // InternalShome.g:363:5: (lv_ownedActions_6_0= ruleAction )
            	    {
            	    // InternalShome.g:363:5: (lv_ownedActions_6_0= ruleAction )
            	    // InternalShome.g:364:6: lv_ownedActions_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_ownedActions_6_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedActions",
            	    							lv_ownedActions_6_0,
            	    							"fr.unice.polytech.si5.smarthome.am.shome.Shome.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleActor"
    // InternalShome.g:386:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalShome.g:386:46: (iv_ruleActor= ruleActor EOF )
            // InternalShome.g:387:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalShome.g:393:1: ruleActor returns [EObject current=null] : ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalShome.g:399:2: ( ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalShome.g:400:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalShome.g:400:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalShome.g:401:3: () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalShome.g:401:3: ()
            // InternalShome.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActorKeyword_1());
            		
            // InternalShome.g:412:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShome.g:413:4: (lv_name_2_0= ruleEString )
            {
            // InternalShome.g:413:4: (lv_name_2_0= ruleEString )
            // InternalShome.g:414:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleOccurence"
    // InternalShome.g:435:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalShome.g:435:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalShome.g:436:2: iv_ruleOccurence= ruleOccurence EOF
            {
             newCompositeNode(grammarAccess.getOccurenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOccurence=ruleOccurence();

            state._fsp--;

             current =iv_ruleOccurence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurence"


    // $ANTLR start "ruleOccurence"
    // InternalShome.g:442:1: ruleOccurence returns [EObject current=null] : ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedTime_0_0 = null;



        	enterRule();

        try {
            // InternalShome.g:448:2: ( ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ruleEString ) ) ) )
            // InternalShome.g:449:2: ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            {
            // InternalShome.g:449:2: ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ruleEString ) ) )
            // InternalShome.g:450:3: ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ruleEString ) )
            {
            // InternalShome.g:450:3: ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) )
            // InternalShome.g:451:4: (lv_ownedTime_0_0= ruleHomeTimeStamp )
            {
            // InternalShome.g:451:4: (lv_ownedTime_0_0= ruleHomeTimeStamp )
            // InternalShome.g:452:5: lv_ownedTime_0_0= ruleHomeTimeStamp
            {

            					newCompositeNode(grammarAccess.getOccurenceAccess().getOwnedTimeHomeTimeStampParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_ownedTime_0_0=ruleHomeTimeStamp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOccurenceRule());
            					}
            					set(
            						current,
            						"ownedTime",
            						lv_ownedTime_0_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.HomeTimeStamp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOccurenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalShome.g:473:3: ( ( ruleEString ) )
            // InternalShome.g:474:4: ( ruleEString )
            {
            // InternalShome.g:474:4: ( ruleEString )
            // InternalShome.g:475:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOccurenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOccurenceAccess().getEventEventCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurence"


    // $ANTLR start "entryRuleCondition"
    // InternalShome.g:493:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalShome.g:493:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalShome.g:494:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalShome.g:500:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'then' ( ( ruleEString ) ) (otherlv_4= 'and' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShome.g:506:2: ( (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'then' ( ( ruleEString ) ) (otherlv_4= 'and' ( ( ruleEString ) ) )* ) )
            // InternalShome.g:507:2: (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'then' ( ( ruleEString ) ) (otherlv_4= 'and' ( ( ruleEString ) ) )* )
            {
            // InternalShome.g:507:2: (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'then' ( ( ruleEString ) ) (otherlv_4= 'and' ( ( ruleEString ) ) )* )
            // InternalShome.g:508:3: otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'then' ( ( ruleEString ) ) (otherlv_4= 'and' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            // InternalShome.g:512:3: ( ( ruleEString ) )
            // InternalShome.g:513:4: ( ruleEString )
            {
            // InternalShome.g:513:4: ( ruleEString )
            // InternalShome.g:514:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getEventEventCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getThenKeyword_2());
            		
            // InternalShome.g:532:3: ( ( ruleEString ) )
            // InternalShome.g:533:4: ( ruleEString )
            {
            // InternalShome.g:533:4: ( ruleEString )
            // InternalShome.g:534:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getActionsActionCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:548:3: (otherlv_4= 'and' ( ( ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalShome.g:549:4: otherlv_4= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getAndKeyword_4_0());
            	    			
            	    // InternalShome.g:553:4: ( ( ruleEString ) )
            	    // InternalShome.g:554:5: ( ruleEString )
            	    {
            	    // InternalShome.g:554:5: ( ruleEString )
            	    // InternalShome.g:555:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConditionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConditionAccess().getActionsActionCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleHomeTimeStamp"
    // InternalShome.g:574:1: entryRuleHomeTimeStamp returns [EObject current=null] : iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF ;
    public final EObject entryRuleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomeTimeStamp = null;


        try {
            // InternalShome.g:574:54: (iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF )
            // InternalShome.g:575:2: iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF
            {
             newCompositeNode(grammarAccess.getHomeTimeStampRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHomeTimeStamp=ruleHomeTimeStamp();

            state._fsp--;

             current =iv_ruleHomeTimeStamp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHomeTimeStamp"


    // $ANTLR start "ruleHomeTimeStamp"
    // InternalShome.g:581:1: ruleHomeTimeStamp returns [EObject current=null] : ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) ;
    public final EObject ruleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        Token lv_hour_0_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_sec_4_0=null;


        	enterRule();

        try {
            // InternalShome.g:587:2: ( ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) )
            // InternalShome.g:588:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            {
            // InternalShome.g:588:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            // InternalShome.g:589:3: ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) )
            {
            // InternalShome.g:589:3: ( (lv_hour_0_0= RULE_INT ) )
            // InternalShome.g:590:4: (lv_hour_0_0= RULE_INT )
            {
            // InternalShome.g:590:4: (lv_hour_0_0= RULE_INT )
            // InternalShome.g:591:5: lv_hour_0_0= RULE_INT
            {
            lv_hour_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_hour_0_0, grammarAccess.getHomeTimeStampAccess().getHourINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHomeTimeStampRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hour",
            						lv_hour_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeTimeStampAccess().getColonKeyword_1());
            		
            // InternalShome.g:611:3: ( (lv_min_2_0= RULE_INT ) )
            // InternalShome.g:612:4: (lv_min_2_0= RULE_INT )
            {
            // InternalShome.g:612:4: (lv_min_2_0= RULE_INT )
            // InternalShome.g:613:5: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_min_2_0, grammarAccess.getHomeTimeStampAccess().getMinINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHomeTimeStampRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getHomeTimeStampAccess().getColonKeyword_3());
            		
            // InternalShome.g:633:3: ( (lv_sec_4_0= RULE_INT ) )
            // InternalShome.g:634:4: (lv_sec_4_0= RULE_INT )
            {
            // InternalShome.g:634:4: (lv_sec_4_0= RULE_INT )
            // InternalShome.g:635:5: lv_sec_4_0= RULE_INT
            {
            lv_sec_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_sec_4_0, grammarAccess.getHomeTimeStampAccess().getSecINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHomeTimeStampRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sec",
            						lv_sec_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHomeTimeStamp"


    // $ANTLR start "entryRuleEvent"
    // InternalShome.g:655:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalShome.g:655:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalShome.g:656:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalShome.g:662:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'do' ( ( ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalShome.g:668:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'do' ( ( ruleEString ) ) ) )
            // InternalShome.g:669:2: (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'do' ( ( ruleEString ) ) )
            {
            // InternalShome.g:669:2: (otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'do' ( ( ruleEString ) ) )
            // InternalShome.g:670:3: otherlv_0= 'Event' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= 'do' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalShome.g:674:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:675:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:675:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:676:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalShome.g:697:3: ( ( ruleEString ) )
            // InternalShome.g:698:4: ( ruleEString )
            {
            // InternalShome.g:698:4: ( ruleEString )
            // InternalShome.g:699:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventAccess().getActorActorCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getDoKeyword_4());
            		
            // InternalShome.g:717:3: ( ( ruleEString ) )
            // InternalShome.g:718:4: ( ruleEString )
            {
            // InternalShome.g:718:4: ( ruleEString )
            // InternalShome.g:719:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventAccess().getActionActionCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEString"
    // InternalShome.g:737:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShome.g:737:47: (iv_ruleEString= ruleEString EOF )
            // InternalShome.g:738:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalShome.g:744:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalShome.g:750:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalShome.g:751:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalShome.g:751:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalShome.g:752:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:760:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // InternalShome.g:771:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalShome.g:771:47: (iv_ruleAction= ruleAction EOF )
            // InternalShome.g:772:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalShome.g:778:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalShome.g:784:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalShome.g:785:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalShome.g:785:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalShome.g:786:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalShome.g:786:3: ()
            // InternalShome.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalShome.g:793:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:794:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:794:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:795:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000844000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000944000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000944010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000946010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}