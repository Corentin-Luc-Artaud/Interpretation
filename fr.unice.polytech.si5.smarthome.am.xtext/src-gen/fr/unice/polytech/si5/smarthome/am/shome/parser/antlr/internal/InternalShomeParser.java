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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'Subject'", "'ownedActions'", "':'", "'-'", "'Actor'", "'->'", "'do'", "'if'", "'during'", "'then'", "'and'"
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
    // InternalShome.g:71:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedConditions_6_0= ruleACondition ) ) ( (lv_ownedConditions_7_0= ruleACondition ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_ownedSubjects_3_0 = null;

        EObject lv_ownedSubjects_4_0 = null;

        EObject lv_ownedActors_5_0 = null;

        EObject lv_ownedConditions_6_0 = null;

        EObject lv_ownedConditions_7_0 = null;

        EObject lv_ownedOccurences_8_0 = null;

        EObject lv_ownedOccurences_9_0 = null;



        	enterRule();

        try {
            // InternalShome.g:77:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedConditions_6_0= ruleACondition ) ) ( (lv_ownedConditions_7_0= ruleACondition ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' ) )
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedConditions_6_0= ruleACondition ) ) ( (lv_ownedConditions_7_0= ruleACondition ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' )
            {
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedConditions_6_0= ruleACondition ) ) ( (lv_ownedConditions_7_0= ruleACondition ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' )
            // InternalShome.g:79:3: () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedConditions_6_0= ruleACondition ) ) ( (lv_ownedConditions_7_0= ruleACondition ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}'
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

            // InternalShome.g:132:3: ( (lv_ownedActors_5_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShome.g:133:4: (lv_ownedActors_5_0= ruleActor )
            	    {
            	    // InternalShome.g:133:4: (lv_ownedActors_5_0= ruleActor )
            	    // InternalShome.g:134:5: lv_ownedActors_5_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalShome.g:151:3: ( (lv_ownedConditions_6_0= ruleACondition ) )
            // InternalShome.g:152:4: (lv_ownedConditions_6_0= ruleACondition )
            {
            // InternalShome.g:152:4: (lv_ownedConditions_6_0= ruleACondition )
            // InternalShome.g:153:5: lv_ownedConditions_6_0= ruleACondition
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedConditionsAConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_ownedConditions_6_0=ruleACondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedConditions",
            						lv_ownedConditions_6_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.ACondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:170:3: ( (lv_ownedConditions_7_0= ruleACondition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShome.g:171:4: (lv_ownedConditions_7_0= ruleACondition )
            	    {
            	    // InternalShome.g:171:4: (lv_ownedConditions_7_0= ruleACondition )
            	    // InternalShome.g:172:5: lv_ownedConditions_7_0= ruleACondition
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedConditionsAConditionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_ownedConditions_7_0=ruleACondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedConditions",
            	    						lv_ownedConditions_7_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.ACondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalShome.g:189:3: ( (lv_ownedOccurences_8_0= ruleOccurence ) )
            // InternalShome.g:190:4: (lv_ownedOccurences_8_0= ruleOccurence )
            {
            // InternalShome.g:190:4: (lv_ownedOccurences_8_0= ruleOccurence )
            // InternalShome.g:191:5: lv_ownedOccurences_8_0= ruleOccurence
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_ownedOccurences_8_0=ruleOccurence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedOccurences",
            						lv_ownedOccurences_8_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.Occurence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:208:3: ( (lv_ownedOccurences_9_0= ruleOccurence ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalShome.g:209:4: (lv_ownedOccurences_9_0= ruleOccurence )
            	    {
            	    // InternalShome.g:209:4: (lv_ownedOccurences_9_0= ruleOccurence )
            	    // InternalShome.g:210:5: lv_ownedOccurences_9_0= ruleOccurence
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalShome.g:235:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalShome.g:235:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalShome.g:236:2: iv_ruleSubject= ruleSubject EOF
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
    // InternalShome.g:242:1: ruleSubject returns [EObject current=null] : (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* ) ;
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
            // InternalShome.g:248:2: ( (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* ) )
            // InternalShome.g:249:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* )
            {
            // InternalShome.g:249:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )* )
            // InternalShome.g:250:3: otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ownedActions' otherlv_3= ':' ( (lv_ownedActions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectAccess().getSubjectKeyword_0());
            		
            // InternalShome.g:254:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:255:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:255:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:256:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSubjectAccess().getColonKeyword_3());
            		
            // InternalShome.g:281:3: ( (lv_ownedActions_4_0= ruleAction ) )
            // InternalShome.g:282:4: (lv_ownedActions_4_0= ruleAction )
            {
            // InternalShome.g:282:4: (lv_ownedActions_4_0= ruleAction )
            // InternalShome.g:283:5: lv_ownedActions_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalShome.g:300:3: (otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShome.g:301:4: otherlv_5= '-' ( (lv_ownedActions_6_0= ruleAction ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalShome.g:305:4: ( (lv_ownedActions_6_0= ruleAction ) )
            	    // InternalShome.g:306:5: (lv_ownedActions_6_0= ruleAction )
            	    {
            	    // InternalShome.g:306:5: (lv_ownedActions_6_0= ruleAction )
            	    // InternalShome.g:307:6: lv_ownedActions_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalShome.g:329:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalShome.g:329:46: (iv_ruleActor= ruleActor EOF )
            // InternalShome.g:330:2: iv_ruleActor= ruleActor EOF
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
    // InternalShome.g:336:1: ruleActor returns [EObject current=null] : ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalShome.g:342:2: ( ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalShome.g:343:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalShome.g:343:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalShome.g:344:3: () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalShome.g:344:3: ()
            // InternalShome.g:345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActorKeyword_1());
            		
            // InternalShome.g:355:3: ( (lv_name_2_0= ruleEString ) )
            // InternalShome.g:356:4: (lv_name_2_0= ruleEString )
            {
            // InternalShome.g:356:4: (lv_name_2_0= ruleEString )
            // InternalShome.g:357:5: lv_name_2_0= ruleEString
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
    // InternalShome.g:378:1: entryRuleOccurence returns [EObject current=null] : iv_ruleOccurence= ruleOccurence EOF ;
    public final EObject entryRuleOccurence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurence = null;


        try {
            // InternalShome.g:378:50: (iv_ruleOccurence= ruleOccurence EOF )
            // InternalShome.g:379:2: iv_ruleOccurence= ruleOccurence EOF
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
    // InternalShome.g:385:1: ruleOccurence returns [EObject current=null] : ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) ) ;
    public final EObject ruleOccurence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedTime_0_0 = null;



        	enterRule();

        try {
            // InternalShome.g:391:2: ( ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) ) )
            // InternalShome.g:392:2: ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) )
            {
            // InternalShome.g:392:2: ( ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) ) )
            // InternalShome.g:393:3: ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) ) otherlv_1= '->' ( ( ( ruleEString ) ) otherlv_3= 'do' )? ( ( ruleEString ) )
            {
            // InternalShome.g:393:3: ( (lv_ownedTime_0_0= ruleHomeTimeStamp ) )
            // InternalShome.g:394:4: (lv_ownedTime_0_0= ruleHomeTimeStamp )
            {
            // InternalShome.g:394:4: (lv_ownedTime_0_0= ruleHomeTimeStamp )
            // InternalShome.g:395:5: lv_ownedTime_0_0= ruleHomeTimeStamp
            {

            					newCompositeNode(grammarAccess.getOccurenceAccess().getOwnedTimeHomeTimeStampParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOccurenceAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalShome.g:416:3: ( ( ( ruleEString ) ) otherlv_3= 'do' )?
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
                    // InternalShome.g:417:4: ( ( ruleEString ) ) otherlv_3= 'do'
                    {
                    // InternalShome.g:417:4: ( ( ruleEString ) )
                    // InternalShome.g:418:5: ( ruleEString )
                    {
                    // InternalShome.g:418:5: ( ruleEString )
                    // InternalShome.g:419:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOccurenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOccurenceAccess().getActorActorCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getOccurenceAccess().getDoKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalShome.g:438:3: ( ( ruleEString ) )
            // InternalShome.g:439:4: ( ruleEString )
            {
            // InternalShome.g:439:4: ( ruleEString )
            // InternalShome.g:440:5: ruleEString
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


    // $ANTLR start "entryRuleACondition"
    // InternalShome.g:458:1: entryRuleACondition returns [EObject current=null] : iv_ruleACondition= ruleACondition EOF ;
    public final EObject entryRuleACondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACondition = null;


        try {
            // InternalShome.g:458:51: (iv_ruleACondition= ruleACondition EOF )
            // InternalShome.g:459:2: iv_ruleACondition= ruleACondition EOF
            {
             newCompositeNode(grammarAccess.getAConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACondition=ruleACondition();

            state._fsp--;

             current =iv_ruleACondition; 
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
    // $ANTLR end "entryRuleACondition"


    // $ANTLR start "ruleACondition"
    // InternalShome.g:465:1: ruleACondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition ) ;
    public final EObject ruleACondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_TimeEleapsedCondition_1 = null;



        	enterRule();

        try {
            // InternalShome.g:471:2: ( (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition ) )
            // InternalShome.g:472:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition )
            {
            // InternalShome.g:472:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==22) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==20||LA7_2==23) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==22) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==20||LA7_3==23) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalShome.g:473:3: this_Condition_0= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getAConditionAccess().getConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_0=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:482:3: this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition
                    {

                    			newCompositeNode(grammarAccess.getAConditionAccess().getTimeEleapsedConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeEleapsedCondition_1=ruleTimeEleapsedCondition();

                    state._fsp--;


                    			current = this_TimeEleapsedCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleACondition"


    // $ANTLR start "entryRuleTimeEleapsedCondition"
    // InternalShome.g:494:1: entryRuleTimeEleapsedCondition returns [EObject current=null] : iv_ruleTimeEleapsedCondition= ruleTimeEleapsedCondition EOF ;
    public final EObject entryRuleTimeEleapsedCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEleapsedCondition = null;


        try {
            // InternalShome.g:494:62: (iv_ruleTimeEleapsedCondition= ruleTimeEleapsedCondition EOF )
            // InternalShome.g:495:2: iv_ruleTimeEleapsedCondition= ruleTimeEleapsedCondition EOF
            {
             newCompositeNode(grammarAccess.getTimeEleapsedConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeEleapsedCondition=ruleTimeEleapsedCondition();

            state._fsp--;

             current =iv_ruleTimeEleapsedCondition; 
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
    // $ANTLR end "entryRuleTimeEleapsedCondition"


    // $ANTLR start "ruleTimeEleapsedCondition"
    // InternalShome.g:501:1: ruleTimeEleapsedCondition returns [EObject current=null] : (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'during' ( (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleTimeEleapsedCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedTimestampEleapsed_3_0 = null;



        	enterRule();

        try {
            // InternalShome.g:507:2: ( (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'during' ( (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* ) )
            // InternalShome.g:508:2: (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'during' ( (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* )
            {
            // InternalShome.g:508:2: (otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'during' ( (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* )
            // InternalShome.g:509:3: otherlv_0= 'if' ( ( ruleEString ) ) otherlv_2= 'during' ( (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeEleapsedConditionAccess().getIfKeyword_0());
            		
            // InternalShome.g:513:3: ( ( ruleEString ) )
            // InternalShome.g:514:4: ( ruleEString )
            {
            // InternalShome.g:514:4: ( ruleEString )
            // InternalShome.g:515:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeEleapsedConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getActionActionCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeEleapsedConditionAccess().getDuringKeyword_2());
            		
            // InternalShome.g:533:3: ( (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp ) )
            // InternalShome.g:534:4: (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp )
            {
            // InternalShome.g:534:4: (lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp )
            // InternalShome.g:535:5: lv_ownedTimestampEleapsed_3_0= ruleHomeTimeStamp
            {

            					newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getOwnedTimestampEleapsedHomeTimeStampParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_ownedTimestampEleapsed_3_0=ruleHomeTimeStamp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeEleapsedConditionRule());
            					}
            					set(
            						current,
            						"ownedTimestampEleapsed",
            						lv_ownedTimestampEleapsed_3_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.HomeTimeStamp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeEleapsedConditionAccess().getThenKeyword_4());
            		
            // InternalShome.g:556:3: ( ( ruleEString ) )
            // InternalShome.g:557:4: ( ruleEString )
            {
            // InternalShome.g:557:4: ( ruleEString )
            // InternalShome.g:558:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeEleapsedConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getActionsActionCrossReference_5_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:572:3: (otherlv_6= 'and' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalShome.g:573:4: otherlv_6= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTimeEleapsedConditionAccess().getAndKeyword_6_0());
            	    			
            	    // InternalShome.g:577:4: ( ( ruleEString ) )
            	    // InternalShome.g:578:5: ( ruleEString )
            	    {
            	    // InternalShome.g:578:5: ( ruleEString )
            	    // InternalShome.g:579:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTimeEleapsedConditionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getActionsActionCrossReference_6_1_0());
            	    					
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
    // $ANTLR end "ruleTimeEleapsedCondition"


    // $ANTLR start "entryRuleCondition"
    // InternalShome.g:598:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalShome.g:598:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalShome.g:599:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalShome.g:605:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalShome.g:611:2: ( (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* ) )
            // InternalShome.g:612:2: (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* )
            {
            // InternalShome.g:612:2: (otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )* )
            // InternalShome.g:613:3: otherlv_0= 'if' ( ( ( ruleEString ) ) otherlv_2= 'do' )? ( ( ruleEString ) ) otherlv_4= 'then' ( ( ruleEString ) ) (otherlv_6= 'and' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
            		
            // InternalShome.g:617:3: ( ( ( ruleEString ) ) otherlv_2= 'do' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==20) ) {
                    alt9=1;
                }
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==20) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalShome.g:618:4: ( ( ruleEString ) ) otherlv_2= 'do'
                    {
                    // InternalShome.g:618:4: ( ( ruleEString ) )
                    // InternalShome.g:619:5: ( ruleEString )
                    {
                    // InternalShome.g:619:5: ( ruleEString )
                    // InternalShome.g:620:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionAccess().getActorActorCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getDoKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalShome.g:639:3: ( ( ruleEString ) )
            // InternalShome.g:640:4: ( ruleEString )
            {
            // InternalShome.g:640:4: ( ruleEString )
            // InternalShome.g:641:5: ruleEString
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

            otherlv_4=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getThenKeyword_3());
            		
            // InternalShome.g:659:3: ( ( ruleEString ) )
            // InternalShome.g:660:4: ( ruleEString )
            {
            // InternalShome.g:660:4: ( ruleEString )
            // InternalShome.g:661:5: ruleEString
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

            // InternalShome.g:675:3: (otherlv_6= 'and' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalShome.g:676:4: otherlv_6= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getAndKeyword_5_0());
            	    			
            	    // InternalShome.g:680:4: ( ( ruleEString ) )
            	    // InternalShome.g:681:5: ( ruleEString )
            	    {
            	    // InternalShome.g:681:5: ( ruleEString )
            	    // InternalShome.g:682:6: ruleEString
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
            	    break loop10;
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
    // InternalShome.g:701:1: entryRuleHomeTimeStamp returns [EObject current=null] : iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF ;
    public final EObject entryRuleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomeTimeStamp = null;


        try {
            // InternalShome.g:701:54: (iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF )
            // InternalShome.g:702:2: iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF
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
    // InternalShome.g:708:1: ruleHomeTimeStamp returns [EObject current=null] : ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) ;
    public final EObject ruleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        Token lv_hour_0_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_sec_4_0=null;


        	enterRule();

        try {
            // InternalShome.g:714:2: ( ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) )
            // InternalShome.g:715:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            {
            // InternalShome.g:715:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            // InternalShome.g:716:3: ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) )
            {
            // InternalShome.g:716:3: ( (lv_hour_0_0= RULE_INT ) )
            // InternalShome.g:717:4: (lv_hour_0_0= RULE_INT )
            {
            // InternalShome.g:717:4: (lv_hour_0_0= RULE_INT )
            // InternalShome.g:718:5: lv_hour_0_0= RULE_INT
            {
            lv_hour_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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
            		
            // InternalShome.g:738:3: ( (lv_min_2_0= RULE_INT ) )
            // InternalShome.g:739:4: (lv_min_2_0= RULE_INT )
            {
            // InternalShome.g:739:4: (lv_min_2_0= RULE_INT )
            // InternalShome.g:740:5: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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
            		
            // InternalShome.g:760:3: ( (lv_sec_4_0= RULE_INT ) )
            // InternalShome.g:761:4: (lv_sec_4_0= RULE_INT )
            {
            // InternalShome.g:761:4: (lv_sec_4_0= RULE_INT )
            // InternalShome.g:762:5: lv_sec_4_0= RULE_INT
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
    // InternalShome.g:782:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShome.g:782:47: (iv_ruleEString= ruleEString EOF )
            // InternalShome.g:783:2: iv_ruleEString= ruleEString EOF
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
    // InternalShome.g:789:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalShome.g:795:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalShome.g:796:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalShome.g:796:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalShome.g:797:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:805:3: this_ID_1= RULE_ID
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
    // InternalShome.g:816:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalShome.g:816:47: (iv_ruleAction= ruleAction EOF )
            // InternalShome.g:817:2: iv_ruleAction= ruleAction EOF
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
    // InternalShome.g:823:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalShome.g:829:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalShome.g:830:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalShome.g:830:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalShome.g:831:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalShome.g:831:3: ()
            // InternalShome.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalShome.g:838:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:839:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:839:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:840:5: lv_name_1_0= ruleEString
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000244010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000246010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});

}