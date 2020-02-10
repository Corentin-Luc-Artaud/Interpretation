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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'Subject'", "'ownedActions'", "':'", "'-'", "'Actor'", "'->'", "'do'", "'if'", "'then'", "'and'"
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
    // InternalShome.g:71:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedConditions_7_0= ruleCondition ) ) ( (lv_ownedConditions_8_0= ruleCondition ) )* ( (lv_ownedOccurences_9_0= ruleOccurence ) ) ( (lv_ownedOccurences_10_0= ruleOccurence ) )* otherlv_11= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_11=null;
        EObject lv_ownedSubjects_3_0 = null;

        EObject lv_ownedSubjects_4_0 = null;

        EObject lv_ownedActors_5_0 = null;

        EObject lv_ownedActors_6_0 = null;

        EObject lv_ownedConditions_7_0 = null;

        EObject lv_ownedConditions_8_0 = null;

        EObject lv_ownedOccurences_9_0 = null;

        EObject lv_ownedOccurences_10_0 = null;



        	enterRule();

        try {
            // InternalShome.g:77:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedConditions_7_0= ruleCondition ) ) ( (lv_ownedConditions_8_0= ruleCondition ) )* ( (lv_ownedOccurences_9_0= ruleOccurence ) ) ( (lv_ownedOccurences_10_0= ruleOccurence ) )* otherlv_11= '}' ) )
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedConditions_7_0= ruleCondition ) ) ( (lv_ownedConditions_8_0= ruleCondition ) )* ( (lv_ownedOccurences_9_0= ruleOccurence ) ) ( (lv_ownedOccurences_10_0= ruleOccurence ) )* otherlv_11= '}' )
            {
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedConditions_7_0= ruleCondition ) ) ( (lv_ownedConditions_8_0= ruleCondition ) )* ( (lv_ownedOccurences_9_0= ruleOccurence ) ) ( (lv_ownedOccurences_10_0= ruleOccurence ) )* otherlv_11= '}' )
            // InternalShome.g:79:3: () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) ) ( (lv_ownedActors_6_0= ruleActor ) )* ( (lv_ownedConditions_7_0= ruleCondition ) ) ( (lv_ownedConditions_8_0= ruleCondition ) )* ( (lv_ownedOccurences_9_0= ruleOccurence ) ) ( (lv_ownedOccurences_10_0= ruleOccurence ) )* otherlv_11= '}'
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

            // InternalShome.g:170:3: ( (lv_ownedConditions_7_0= ruleCondition ) )
            // InternalShome.g:171:4: (lv_ownedConditions_7_0= ruleCondition )
            {
            // InternalShome.g:171:4: (lv_ownedConditions_7_0= ruleCondition )
            // InternalShome.g:172:5: lv_ownedConditions_7_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_ownedConditions_7_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedConditions",
            						lv_ownedConditions_7_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:189:3: ( (lv_ownedConditions_8_0= ruleCondition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShome.g:190:4: (lv_ownedConditions_8_0= ruleCondition )
            	    {
            	    // InternalShome.g:190:4: (lv_ownedConditions_8_0= ruleCondition )
            	    // InternalShome.g:191:5: lv_ownedConditions_8_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedConditionsConditionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_ownedConditions_8_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedConditions",
            	    						lv_ownedConditions_8_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalShome.g:208:3: ( (lv_ownedOccurences_9_0= ruleOccurence ) )
            // InternalShome.g:209:4: (lv_ownedOccurences_9_0= ruleOccurence )
            {
            // InternalShome.g:209:4: (lv_ownedOccurences_9_0= ruleOccurence )
            // InternalShome.g:210:5: lv_ownedOccurences_9_0= ruleOccurence
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_ownedOccurences_9_0=ruleOccurence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedOccurences",
            						lv_ownedOccurences_9_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Occurence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:227:3: ( (lv_ownedOccurences_10_0= ruleOccurence ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalShome.g:228:4: (lv_ownedOccurences_10_0= ruleOccurence )
            	    {
            	    // InternalShome.g:228:4: (lv_ownedOccurences_10_0= ruleOccurence )
            	    // InternalShome.g:229:5: lv_ownedOccurences_10_0= ruleOccurence
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ownedOccurences_10_0=ruleOccurence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedOccurences",
            	    						lv_ownedOccurences_10_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Occurence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalShome.g:254:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalShome.g:254:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalShome.g:255:2: iv_ruleSubject= ruleSubject EOF
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
    // InternalShome.g:261:1: ruleSubject returns [EObject current=null] : (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* ) ;
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
            // InternalShome.g:267:2: ( (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* ) )
            // InternalShome.g:268:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* )
            {
            // InternalShome.g:268:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* )
            // InternalShome.g:269:3: otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectAccess().getSubjectKeyword_0());
            		
            // InternalShome.g:273:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:274:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:274:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:275:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getSubjectAccess().getColonKeyword_3());
            		
            // InternalShome.g:300:3: ( (lv_ownedActions_4_0= ruleAction ) )
            // InternalShome.g:301:4: (lv_ownedActions_4_0= ruleAction )
            {
            // InternalShome.g:301:4: (lv_ownedActions_4_0= ruleAction )
            // InternalShome.g:302:5: lv_ownedActions_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalShome.g:319:3: (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShome.g:320:4: otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalShome.g:324:4: ( (lv_ownedActions_6_0= ruleAction ) )
            	    // InternalShome.g:325:5: (lv_ownedActions_6_0= ruleAction )
            	    {
            	    // InternalShome.g:325:5: (lv_ownedActions_6_0= ruleAction )
            	    // InternalShome.g:326:6: lv_ownedActions_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop5;
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
    // InternalShome.g:348:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalShome.g:348:46: (iv_ruleActor= ruleActor EOF )
            // InternalShome.g:349:2: iv_ruleActor= ruleActor EOF
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
    // InternalShome.g:355:1: ruleActor returns [EObject current=null] : ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalShome.g:361:2: ( ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalShome.g:362:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalShome.g:362:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalShome.g:363:3: () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalShome.g:363:3: ()
            // InternalShome.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActorKeyword_1());
            		
            // InternalShome.g:374:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShome.g:375:4: (lv_name_2_0= ruleEString )
            {
            // InternalShome.g:375:4: (lv_name_2_0= ruleEString )
            // InternalShome.g:376:5: lv_name_2_0= ruleEString
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
    // InternalShome.g:397:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalShome.g:397:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalShome.g:398:2: iv_ruleOccurence= ruleOccurence EOF
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
    // InternalShome.g:404:1: ruleOccurence returns [EObject current=null] : ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedTime_0_0 = null;



        	enterRule();

        try {
            // InternalShome.g:410:2: ( ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) ) )
            // InternalShome.g:411:2: ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) )
            {
            // InternalShome.g:411:2: ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) )
            // InternalShome.g:412:3: ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) )
            {
            // InternalShome.g:412:3: ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) )
            // InternalShome.g:413:4: (lv_ownedTime_0_0= ruleHomeTimeStamp )
            {
            // InternalShome.g:413:4: (lv_ownedTime_0_0= ruleHomeTimeStamp )
            // InternalShome.g:414:5: lv_ownedTime_0_0= ruleHomeTimeStamp
            {

            					newCompositeNode(grammarAccess.getOccurenceAccess().getOwnedTimeHomeTimeStampParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOccurenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalShome.g:435:3: ( ( ( ruleEString ) ) otherlv_3= 'do' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==20) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalShome.g:436:4: ( ( ruleEString ) ) otherlv_3= 'do'
                    {
                    // InternalShome.g:436:4: ( ( ruleEString ) )
                    // InternalShome.g:437:5: ( ruleEString )
                    {
                    // InternalShome.g:437:5: ( ruleEString )
                    // InternalShome.g:438:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOccurenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOccurenceAccess().getActorActorCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getOccurenceAccess().getDoKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalShome.g:457:3: ( ( ruleEString ) )
            // InternalShome.g:458:4: ( ruleEString )
            {
            // InternalShome.g:458:4: ( ruleEString )
            // InternalShome.g:459:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOccurenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOccurenceAccess().getActionActionCrossReference_3_0());
            				
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
    // InternalShome.g:477:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalShome.g:477:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalShome.g:478:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalShome.g:484:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalShome.g:490:2: ( (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* ) )
            // InternalShome.g:491:2: (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* )
            {
            // InternalShome.g:491:2: (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* )
            // InternalShome.g:492:3: otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            // InternalShome.g:496:3: ( ( ( ruleEString ) ) otherlv_2= 'do' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    alt7=1;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==20) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalShome.g:497:4: ( ( ruleEString ) ) otherlv_2= 'do'
                    {
                    // InternalShome.g:497:4: ( ( ruleEString ) )
                    // InternalShome.g:498:5: ( ruleEString )
                    {
                    // InternalShome.g:498:5: ( ruleEString )
                    // InternalShome.g:499:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionAccess().getActorActorCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getDoKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalShome.g:518:3: ( ( ruleEString ) )
            // InternalShome.g:519:4: ( ruleEString )
            {
            // InternalShome.g:519:4: ( ruleEString )
            // InternalShome.g:520:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getActionActionCrossReference_2_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getThenKeyword_3());
            		
            // InternalShome.g:538:3: ( ( ruleEString ) )
            // InternalShome.g:539:4: ( ruleEString )
            {
            // InternalShome.g:539:4: ( ruleEString )
            // InternalShome.g:540:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getActionsActionCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:554:3: (otherlv_6= 'and' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalShome.g:555:4: otherlv_6= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getAndKeyword_5_0());
            	    			
            	    // InternalShome.g:559:4: ( ( ruleEString ) )
            	    // InternalShome.g:560:5: ( ruleEString )
            	    {
            	    // InternalShome.g:560:5: ( ruleEString )
            	    // InternalShome.g:561:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConditionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getConditionAccess().getActionsActionCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalShome.g:580:1: entryRuleHomeTimeStamp returns [EObject current=null] : iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF ;
    public final EObject entryRuleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomeTimeStamp = null;


        try {
            // InternalShome.g:580:54: (iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF )
            // InternalShome.g:581:2: iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF
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
    // InternalShome.g:587:1: ruleHomeTimeStamp returns [EObject current=null] : ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) ;
    public final EObject ruleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        Token lv_hour_0_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_sec_4_0=null;


        	enterRule();

        try {
            // InternalShome.g:593:2: ( ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) )
            // InternalShome.g:594:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            {
            // InternalShome.g:594:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            // InternalShome.g:595:3: ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) )
            {
            // InternalShome.g:595:3: ( (lv_hour_0_0= RULE_INT ) )
            // InternalShome.g:596:4: (lv_hour_0_0= RULE_INT )
            {
            // InternalShome.g:596:4: (lv_hour_0_0= RULE_INT )
            // InternalShome.g:597:5: lv_hour_0_0= RULE_INT
            {
            lv_hour_0_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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
            		
            // InternalShome.g:617:3: ( (lv_min_2_0= RULE_INT ) )
            // InternalShome.g:618:4: (lv_min_2_0= RULE_INT )
            {
            // InternalShome.g:618:4: (lv_min_2_0= RULE_INT )
            // InternalShome.g:619:5: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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
            		
            // InternalShome.g:639:3: ( (lv_sec_4_0= RULE_INT ) )
            // InternalShome.g:640:4: (lv_sec_4_0= RULE_INT )
            {
            // InternalShome.g:640:4: (lv_sec_4_0= RULE_INT )
            // InternalShome.g:641:5: lv_sec_4_0= RULE_INT
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


    // $ANTLR start "entryRuleEString"
    // InternalShome.g:661:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShome.g:661:47: (iv_ruleEString= ruleEString EOF )
            // InternalShome.g:662:2: iv_ruleEString= ruleEString EOF
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
    // InternalShome.g:668:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalShome.g:674:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalShome.g:675:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalShome.g:675:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalShome.g:676:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:684:3: this_ID_1= RULE_ID
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
    // InternalShome.g:695:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalShome.g:695:47: (iv_ruleAction= ruleAction EOF )
            // InternalShome.g:696:2: iv_ruleAction= ruleAction EOF
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
    // InternalShome.g:702:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalShome.g:708:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalShome.g:709:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalShome.g:709:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalShome.g:710:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalShome.g:710:3: ()
            // InternalShome.g:711:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalShome.g:717:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:718:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:718:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:719:5: lv_name_1_0= ruleEString
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000244010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000246010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});

}