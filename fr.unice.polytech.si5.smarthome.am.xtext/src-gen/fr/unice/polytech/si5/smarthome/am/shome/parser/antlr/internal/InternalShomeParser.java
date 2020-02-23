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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'Subject'", "'ownedActions'", "':'", "'-'", "'Actor'", "'->'", "'do'", "'when'", "'then'", "'trigger'", "'and'", "'after'", "'during'"
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
    public static final int T__26=26;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalShome.g:71:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedBarrier_6_0= ruleABarrier ) ) ( (lv_ownedBarrier_7_0= ruleABarrier ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_ownedSubjects_3_0 = null;

        EObject lv_ownedSubjects_4_0 = null;

        EObject lv_ownedActors_5_0 = null;

        EObject lv_ownedBarrier_6_0 = null;

        EObject lv_ownedBarrier_7_0 = null;

        EObject lv_ownedOccurences_8_0 = null;

        EObject lv_ownedOccurences_9_0 = null;



        	enterRule();

        try {
            // InternalShome.g:77:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedBarrier_6_0= ruleABarrier ) ) ( (lv_ownedBarrier_7_0= ruleABarrier ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' ) )
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedBarrier_6_0= ruleABarrier ) ) ( (lv_ownedBarrier_7_0= ruleABarrier ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' )
            {
            // InternalShome.g:78:2: ( () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedBarrier_6_0= ruleABarrier ) ) ( (lv_ownedBarrier_7_0= ruleABarrier ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}' )
            // InternalShome.g:79:3: () otherlv_1= 'Home' otherlv_2= '{' ( (lv_ownedSubjects_3_0= ruleSubject ) ) ( (lv_ownedSubjects_4_0= ruleSubject ) )* ( (lv_ownedActors_5_0= ruleActor ) )* ( (lv_ownedBarrier_6_0= ruleABarrier ) ) ( (lv_ownedBarrier_7_0= ruleABarrier ) )* ( (lv_ownedOccurences_8_0= ruleOccurence ) ) ( (lv_ownedOccurences_9_0= ruleOccurence ) )* otherlv_10= '}'
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

            // InternalShome.g:151:3: ( (lv_ownedBarrier_6_0= ruleABarrier ) )
            // InternalShome.g:152:4: (lv_ownedBarrier_6_0= ruleABarrier )
            {
            // InternalShome.g:152:4: (lv_ownedBarrier_6_0= ruleABarrier )
            // InternalShome.g:153:5: lv_ownedBarrier_6_0= ruleABarrier
            {

            					newCompositeNode(grammarAccess.getHomeAccess().getOwnedBarrierABarrierParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_ownedBarrier_6_0=ruleABarrier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHomeRule());
            					}
            					add(
            						current,
            						"ownedBarrier",
            						lv_ownedBarrier_6_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.ABarrier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:170:3: ( (lv_ownedBarrier_7_0= ruleABarrier ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShome.g:171:4: (lv_ownedBarrier_7_0= ruleABarrier )
            	    {
            	    // InternalShome.g:171:4: (lv_ownedBarrier_7_0= ruleABarrier )
            	    // InternalShome.g:172:5: lv_ownedBarrier_7_0= ruleABarrier
            	    {

            	    					newCompositeNode(grammarAccess.getHomeAccess().getOwnedBarrierABarrierParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_ownedBarrier_7_0=ruleABarrier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHomeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedBarrier",
            	    						lv_ownedBarrier_7_0,
            	    						"fr.unice.polytech.si5.smarthome.am.shome.Shome.ABarrier");
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


    // $ANTLR start "entryRuleABarrier"
    // InternalShome.g:458:1: entryRuleABarrier returns [EObject current=null] : iv_ruleABarrier= ruleABarrier EOF ;
    public final EObject entryRuleABarrier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleABarrier = null;


        try {
            // InternalShome.g:458:49: (iv_ruleABarrier= ruleABarrier EOF )
            // InternalShome.g:459:2: iv_ruleABarrier= ruleABarrier EOF
            {
             newCompositeNode(grammarAccess.getABarrierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleABarrier=ruleABarrier();

            state._fsp--;

             current =iv_ruleABarrier; 
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
    // $ANTLR end "entryRuleABarrier"


    // $ANTLR start "ruleABarrier"
    // InternalShome.g:465:1: ruleABarrier returns [EObject current=null] : (this_Barrier_0= ruleBarrier | this_DifferedBarrier_1= ruleDifferedBarrier ) ;
    public final EObject ruleABarrier() throws RecognitionException {
        EObject current = null;

        EObject this_Barrier_0 = null;

        EObject this_DifferedBarrier_1 = null;



        	enterRule();

        try {
            // InternalShome.g:471:2: ( (this_Barrier_0= ruleBarrier | this_DifferedBarrier_1= ruleDifferedBarrier ) )
            // InternalShome.g:472:2: (this_Barrier_0= ruleBarrier | this_DifferedBarrier_1= ruleDifferedBarrier )
            {
            // InternalShome.g:472:2: (this_Barrier_0= ruleBarrier | this_DifferedBarrier_1= ruleDifferedBarrier )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalShome.g:473:3: this_Barrier_0= ruleBarrier
                    {

                    			newCompositeNode(grammarAccess.getABarrierAccess().getBarrierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Barrier_0=ruleBarrier();

                    state._fsp--;


                    			current = this_Barrier_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:482:3: this_DifferedBarrier_1= ruleDifferedBarrier
                    {

                    			newCompositeNode(grammarAccess.getABarrierAccess().getDifferedBarrierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DifferedBarrier_1=ruleDifferedBarrier();

                    state._fsp--;


                    			current = this_DifferedBarrier_1;
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
    // $ANTLR end "ruleABarrier"


    // $ANTLR start "entryRuleBarrier"
    // InternalShome.g:494:1: entryRuleBarrier returns [EObject current=null] : iv_ruleBarrier= ruleBarrier EOF ;
    public final EObject entryRuleBarrier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarrier = null;


        try {
            // InternalShome.g:494:48: (iv_ruleBarrier= ruleBarrier EOF )
            // InternalShome.g:495:2: iv_ruleBarrier= ruleBarrier EOF
            {
             newCompositeNode(grammarAccess.getBarrierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarrier=ruleBarrier();

            state._fsp--;

             current =iv_ruleBarrier; 
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
    // $ANTLR end "entryRuleBarrier"


    // $ANTLR start "ruleBarrier"
    // InternalShome.g:501:1: ruleBarrier returns [EObject current=null] : (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'trigger' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleBarrier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedCondition_1_0 = null;



        	enterRule();

        try {
            // InternalShome.g:507:2: ( (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'trigger' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* ) )
            // InternalShome.g:508:2: (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'trigger' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )
            {
            // InternalShome.g:508:2: (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'trigger' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )
            // InternalShome.g:509:3: otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'trigger' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBarrierAccess().getWhenKeyword_0());
            		
            // InternalShome.g:513:3: ( (lv_ownedCondition_1_0= ruleACondition ) )
            // InternalShome.g:514:4: (lv_ownedCondition_1_0= ruleACondition )
            {
            // InternalShome.g:514:4: (lv_ownedCondition_1_0= ruleACondition )
            // InternalShome.g:515:5: lv_ownedCondition_1_0= ruleACondition
            {

            					newCompositeNode(grammarAccess.getBarrierAccess().getOwnedConditionAConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_ownedCondition_1_0=ruleACondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarrierRule());
            					}
            					set(
            						current,
            						"ownedCondition",
            						lv_ownedCondition_1_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.ACondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBarrierAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBarrierAccess().getTriggerKeyword_3());
            		
            // InternalShome.g:540:3: ( ( ruleEString ) )
            // InternalShome.g:541:4: ( ruleEString )
            {
            // InternalShome.g:541:4: ( ruleEString )
            // InternalShome.g:542:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarrierRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBarrierAccess().getActionsActionCrossReference_4_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:556:3: (otherlv_5= 'and' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalShome.g:557:4: otherlv_5= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBarrierAccess().getAndKeyword_5_0());
            	    			
            	    // InternalShome.g:561:4: ( ( ruleEString ) )
            	    // InternalShome.g:562:5: ( ruleEString )
            	    {
            	    // InternalShome.g:562:5: ( ruleEString )
            	    // InternalShome.g:563:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBarrierRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getBarrierAccess().getActionsActionCrossReference_5_1_0());
            	    					
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
    // $ANTLR end "ruleBarrier"


    // $ANTLR start "entryRuleDifferedBarrier"
    // InternalShome.g:582:1: entryRuleDifferedBarrier returns [EObject current=null] : iv_ruleDifferedBarrier= ruleDifferedBarrier EOF ;
    public final EObject entryRuleDifferedBarrier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferedBarrier = null;


        try {
            // InternalShome.g:582:56: (iv_ruleDifferedBarrier= ruleDifferedBarrier EOF )
            // InternalShome.g:583:2: iv_ruleDifferedBarrier= ruleDifferedBarrier EOF
            {
             newCompositeNode(grammarAccess.getDifferedBarrierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDifferedBarrier=ruleDifferedBarrier();

            state._fsp--;

             current =iv_ruleDifferedBarrier; 
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
    // $ANTLR end "entryRuleDifferedBarrier"


    // $ANTLR start "ruleDifferedBarrier"
    // InternalShome.g:589:1: ruleDifferedBarrier returns [EObject current=null] : (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'after' ( (lv_TriggerAfter_4_0= ruleHomeTimeStamp ) ) otherlv_5= 'trigger' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleDifferedBarrier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_TriggerAfter_4_0 = null;



        	enterRule();

        try {
            // InternalShome.g:595:2: ( (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'after' ( (lv_TriggerAfter_4_0= ruleHomeTimeStamp ) ) otherlv_5= 'trigger' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* ) )
            // InternalShome.g:596:2: (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'after' ( (lv_TriggerAfter_4_0= ruleHomeTimeStamp ) ) otherlv_5= 'trigger' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )
            {
            // InternalShome.g:596:2: (otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'after' ( (lv_TriggerAfter_4_0= ruleHomeTimeStamp ) ) otherlv_5= 'trigger' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )* )
            // InternalShome.g:597:3: otherlv_0= 'when' ( (lv_ownedCondition_1_0= ruleACondition ) ) otherlv_2= 'then' otherlv_3= 'after' ( (lv_TriggerAfter_4_0= ruleHomeTimeStamp ) ) otherlv_5= 'trigger' ( ( ruleEString ) ) (otherlv_7= 'and' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDifferedBarrierAccess().getWhenKeyword_0());
            		
            // InternalShome.g:601:3: ( (lv_ownedCondition_1_0= ruleACondition ) )
            // InternalShome.g:602:4: (lv_ownedCondition_1_0= ruleACondition )
            {
            // InternalShome.g:602:4: (lv_ownedCondition_1_0= ruleACondition )
            // InternalShome.g:603:5: lv_ownedCondition_1_0= ruleACondition
            {

            					newCompositeNode(grammarAccess.getDifferedBarrierAccess().getOwnedConditionAConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_ownedCondition_1_0=ruleACondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDifferedBarrierRule());
            					}
            					set(
            						current,
            						"ownedCondition",
            						lv_ownedCondition_1_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.ACondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDifferedBarrierAccess().getThenKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDifferedBarrierAccess().getAfterKeyword_3());
            		
            // InternalShome.g:628:3: ( (lv_TriggerAfter_4_0= ruleHomeTimeStamp ) )
            // InternalShome.g:629:4: (lv_TriggerAfter_4_0= ruleHomeTimeStamp )
            {
            // InternalShome.g:629:4: (lv_TriggerAfter_4_0= ruleHomeTimeStamp )
            // InternalShome.g:630:5: lv_TriggerAfter_4_0= ruleHomeTimeStamp
            {

            					newCompositeNode(grammarAccess.getDifferedBarrierAccess().getTriggerAfterHomeTimeStampParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_TriggerAfter_4_0=ruleHomeTimeStamp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDifferedBarrierRule());
            					}
            					set(
            						current,
            						"TriggerAfter",
            						lv_TriggerAfter_4_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.HomeTimeStamp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getDifferedBarrierAccess().getTriggerKeyword_5());
            		
            // InternalShome.g:651:3: ( ( ruleEString ) )
            // InternalShome.g:652:4: ( ruleEString )
            {
            // InternalShome.g:652:4: ( ruleEString )
            // InternalShome.g:653:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDifferedBarrierRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDifferedBarrierAccess().getActionsActionCrossReference_6_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:667:3: (otherlv_7= 'and' ( ( ruleEString ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalShome.g:668:4: otherlv_7= 'and' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDifferedBarrierAccess().getAndKeyword_7_0());
            	    			
            	    // InternalShome.g:672:4: ( ( ruleEString ) )
            	    // InternalShome.g:673:5: ( ruleEString )
            	    {
            	    // InternalShome.g:673:5: ( ruleEString )
            	    // InternalShome.g:674:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDifferedBarrierRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDifferedBarrierAccess().getActionsActionCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleDifferedBarrier"


    // $ANTLR start "entryRuleACondition"
    // InternalShome.g:693:1: entryRuleACondition returns [EObject current=null] : iv_ruleACondition= ruleACondition EOF ;
    public final EObject entryRuleACondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACondition = null;


        try {
            // InternalShome.g:693:51: (iv_ruleACondition= ruleACondition EOF )
            // InternalShome.g:694:2: iv_ruleACondition= ruleACondition EOF
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
    // InternalShome.g:700:1: ruleACondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition | this_ComposeCondition_2= ruleComposeCondition ) ;
    public final EObject ruleACondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_TimeEleapsedCondition_1 = null;

        EObject this_ComposeCondition_2 = null;



        	enterRule();

        try {
            // InternalShome.g:706:2: ( (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition | this_ComposeCondition_2= ruleComposeCondition ) )
            // InternalShome.g:707:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition | this_ComposeCondition_2= ruleComposeCondition )
            {
            // InternalShome.g:707:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition | this_ComposeCondition_2= ruleComposeCondition )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalShome.g:708:3: this_Condition_0= ruleCondition
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
                    // InternalShome.g:717:3: this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition
                    {

                    			newCompositeNode(grammarAccess.getAConditionAccess().getTimeEleapsedConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeEleapsedCondition_1=ruleTimeEleapsedCondition();

                    state._fsp--;


                    			current = this_TimeEleapsedCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalShome.g:726:3: this_ComposeCondition_2= ruleComposeCondition
                    {

                    			newCompositeNode(grammarAccess.getAConditionAccess().getComposeConditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComposeCondition_2=ruleComposeCondition();

                    state._fsp--;


                    			current = this_ComposeCondition_2;
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
    // InternalShome.g:738:1: entryRuleTimeEleapsedCondition returns [EObject current=null] : iv_ruleTimeEleapsedCondition= ruleTimeEleapsedCondition EOF ;
    public final EObject entryRuleTimeEleapsedCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeEleapsedCondition = null;


        try {
            // InternalShome.g:738:62: (iv_ruleTimeEleapsedCondition= ruleTimeEleapsedCondition EOF )
            // InternalShome.g:739:2: iv_ruleTimeEleapsedCondition= ruleTimeEleapsedCondition EOF
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
    // InternalShome.g:745:1: ruleTimeEleapsedCondition returns [EObject current=null] : ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) otherlv_3= 'during' ( (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp ) ) ) ;
    public final EObject ruleTimeEleapsedCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedTimestampEleapsed_4_0 = null;



        	enterRule();

        try {
            // InternalShome.g:751:2: ( ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) otherlv_3= 'during' ( (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp ) ) ) )
            // InternalShome.g:752:2: ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) otherlv_3= 'during' ( (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp ) ) )
            {
            // InternalShome.g:752:2: ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) otherlv_3= 'during' ( (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp ) ) )
            // InternalShome.g:753:3: ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) otherlv_3= 'during' ( (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp ) )
            {
            // InternalShome.g:753:3: ( ( ( ruleEString ) ) otherlv_1= 'do' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==20) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==20) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalShome.g:754:4: ( ( ruleEString ) ) otherlv_1= 'do'
                    {
                    // InternalShome.g:754:4: ( ( ruleEString ) )
                    // InternalShome.g:755:5: ( ruleEString )
                    {
                    // InternalShome.g:755:5: ( ruleEString )
                    // InternalShome.g:756:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeEleapsedConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getActorActorCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getTimeEleapsedConditionAccess().getDoKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalShome.g:775:3: ( ( ruleEString ) )
            // InternalShome.g:776:4: ( ruleEString )
            {
            // InternalShome.g:776:4: ( ruleEString )
            // InternalShome.g:777:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeEleapsedConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getActionActionCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeEleapsedConditionAccess().getDuringKeyword_2());
            		
            // InternalShome.g:795:3: ( (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp ) )
            // InternalShome.g:796:4: (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp )
            {
            // InternalShome.g:796:4: (lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp )
            // InternalShome.g:797:5: lv_ownedTimestampEleapsed_4_0= ruleHomeTimeStamp
            {

            					newCompositeNode(grammarAccess.getTimeEleapsedConditionAccess().getOwnedTimestampEleapsedHomeTimeStampParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedTimestampEleapsed_4_0=ruleHomeTimeStamp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeEleapsedConditionRule());
            					}
            					set(
            						current,
            						"ownedTimestampEleapsed",
            						lv_ownedTimestampEleapsed_4_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.HomeTimeStamp");
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
    // $ANTLR end "ruleTimeEleapsedCondition"


    // $ANTLR start "entryRuleCondition"
    // InternalShome.g:818:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalShome.g:818:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalShome.g:819:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalShome.g:825:1: ruleCondition returns [EObject current=null] : ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalShome.g:831:2: ( ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) ) )
            // InternalShome.g:832:2: ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) )
            {
            // InternalShome.g:832:2: ( ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) ) )
            // InternalShome.g:833:3: ( ( ( ruleEString ) ) otherlv_1= 'do' )? ( ( ruleEString ) )
            {
            // InternalShome.g:833:3: ( ( ( ruleEString ) ) otherlv_1= 'do' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==20) ) {
                    alt12=1;
                }
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==20) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalShome.g:834:4: ( ( ruleEString ) ) otherlv_1= 'do'
                    {
                    // InternalShome.g:834:4: ( ( ruleEString ) )
                    // InternalShome.g:835:5: ( ruleEString )
                    {
                    // InternalShome.g:835:5: ( ruleEString )
                    // InternalShome.g:836:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConditionAccess().getActorActorCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getDoKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalShome.g:855:3: ( ( ruleEString ) )
            // InternalShome.g:856:4: ( ruleEString )
            {
            // InternalShome.g:856:4: ( ruleEString )
            // InternalShome.g:857:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getActionActionCrossReference_1_0());
            				
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTerminalCondition"
    // InternalShome.g:875:1: entryRuleTerminalCondition returns [EObject current=null] : iv_ruleTerminalCondition= ruleTerminalCondition EOF ;
    public final EObject entryRuleTerminalCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalCondition = null;


        try {
            // InternalShome.g:875:58: (iv_ruleTerminalCondition= ruleTerminalCondition EOF )
            // InternalShome.g:876:2: iv_ruleTerminalCondition= ruleTerminalCondition EOF
            {
             newCompositeNode(grammarAccess.getTerminalConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalCondition=ruleTerminalCondition();

            state._fsp--;

             current =iv_ruleTerminalCondition; 
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
    // $ANTLR end "entryRuleTerminalCondition"


    // $ANTLR start "ruleTerminalCondition"
    // InternalShome.g:882:1: ruleTerminalCondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition ) ;
    public final EObject ruleTerminalCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_TimeEleapsedCondition_1 = null;



        	enterRule();

        try {
            // InternalShome.g:888:2: ( (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition ) )
            // InternalShome.g:889:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition )
            {
            // InternalShome.g:889:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_STRING) ) {
                        int LA13_6 = input.LA(4);

                        if ( (LA13_6==EOF||LA13_6==22||LA13_6==24) ) {
                            alt13=1;
                        }
                        else if ( (LA13_6==26) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_3==RULE_ID) ) {
                        int LA13_7 = input.LA(4);

                        if ( (LA13_7==EOF||LA13_7==22||LA13_7==24) ) {
                            alt13=1;
                        }
                        else if ( (LA13_7==26) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 22:
                case 24:
                    {
                    alt13=1;
                    }
                    break;
                case 26:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA13_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_STRING) ) {
                        int LA13_6 = input.LA(4);

                        if ( (LA13_6==EOF||LA13_6==22||LA13_6==24) ) {
                            alt13=1;
                        }
                        else if ( (LA13_6==26) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_3==RULE_ID) ) {
                        int LA13_7 = input.LA(4);

                        if ( (LA13_7==EOF||LA13_7==22||LA13_7==24) ) {
                            alt13=1;
                        }
                        else if ( (LA13_7==26) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 22:
                case 24:
                    {
                    alt13=1;
                    }
                    break;
                case 26:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalShome.g:890:3: this_Condition_0= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getTerminalConditionAccess().getConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_0=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:899:3: this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition
                    {

                    			newCompositeNode(grammarAccess.getTerminalConditionAccess().getTimeEleapsedConditionParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleTerminalCondition"


    // $ANTLR start "entryRuleComposeCondition"
    // InternalShome.g:911:1: entryRuleComposeCondition returns [EObject current=null] : iv_ruleComposeCondition= ruleComposeCondition EOF ;
    public final EObject entryRuleComposeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposeCondition = null;


        try {
            // InternalShome.g:911:57: (iv_ruleComposeCondition= ruleComposeCondition EOF )
            // InternalShome.g:912:2: iv_ruleComposeCondition= ruleComposeCondition EOF
            {
             newCompositeNode(grammarAccess.getComposeConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposeCondition=ruleComposeCondition();

            state._fsp--;

             current =iv_ruleComposeCondition; 
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
    // $ANTLR end "entryRuleComposeCondition"


    // $ANTLR start "ruleComposeCondition"
    // InternalShome.g:918:1: ruleComposeCondition returns [EObject current=null] : ( ( (lv_ownedConditions_0_0= ruleTerminalCondition ) ) otherlv_1= 'and' ( (lv_ownedConditions_2_0= ruleTerminalCondition ) ) (otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) ) )* ) ;
    public final EObject ruleComposeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedConditions_0_0 = null;

        EObject lv_ownedConditions_2_0 = null;

        EObject lv_ownedConditions_4_0 = null;



        	enterRule();

        try {
            // InternalShome.g:924:2: ( ( ( (lv_ownedConditions_0_0= ruleTerminalCondition ) ) otherlv_1= 'and' ( (lv_ownedConditions_2_0= ruleTerminalCondition ) ) (otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) ) )* ) )
            // InternalShome.g:925:2: ( ( (lv_ownedConditions_0_0= ruleTerminalCondition ) ) otherlv_1= 'and' ( (lv_ownedConditions_2_0= ruleTerminalCondition ) ) (otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) ) )* )
            {
            // InternalShome.g:925:2: ( ( (lv_ownedConditions_0_0= ruleTerminalCondition ) ) otherlv_1= 'and' ( (lv_ownedConditions_2_0= ruleTerminalCondition ) ) (otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) ) )* )
            // InternalShome.g:926:3: ( (lv_ownedConditions_0_0= ruleTerminalCondition ) ) otherlv_1= 'and' ( (lv_ownedConditions_2_0= ruleTerminalCondition ) ) (otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) ) )*
            {
            // InternalShome.g:926:3: ( (lv_ownedConditions_0_0= ruleTerminalCondition ) )
            // InternalShome.g:927:4: (lv_ownedConditions_0_0= ruleTerminalCondition )
            {
            // InternalShome.g:927:4: (lv_ownedConditions_0_0= ruleTerminalCondition )
            // InternalShome.g:928:5: lv_ownedConditions_0_0= ruleTerminalCondition
            {

            					newCompositeNode(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_ownedConditions_0_0=ruleTerminalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComposeConditionRule());
            					}
            					add(
            						current,
            						"ownedConditions",
            						lv_ownedConditions_0_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.TerminalCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getComposeConditionAccess().getAndKeyword_1());
            		
            // InternalShome.g:949:3: ( (lv_ownedConditions_2_0= ruleTerminalCondition ) )
            // InternalShome.g:950:4: (lv_ownedConditions_2_0= ruleTerminalCondition )
            {
            // InternalShome.g:950:4: (lv_ownedConditions_2_0= ruleTerminalCondition )
            // InternalShome.g:951:5: lv_ownedConditions_2_0= ruleTerminalCondition
            {

            					newCompositeNode(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_ownedConditions_2_0=ruleTerminalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComposeConditionRule());
            					}
            					add(
            						current,
            						"ownedConditions",
            						lv_ownedConditions_2_0,
            						"fr.unice.polytech.si5.smarthome.am.shome.Shome.TerminalCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalShome.g:968:3: (otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalShome.g:969:4: otherlv_3= 'and' ( (lv_ownedConditions_4_0= ruleTerminalCondition ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getComposeConditionAccess().getAndKeyword_3_0());
            	    			
            	    // InternalShome.g:973:4: ( (lv_ownedConditions_4_0= ruleTerminalCondition ) )
            	    // InternalShome.g:974:5: (lv_ownedConditions_4_0= ruleTerminalCondition )
            	    {
            	    // InternalShome.g:974:5: (lv_ownedConditions_4_0= ruleTerminalCondition )
            	    // InternalShome.g:975:6: lv_ownedConditions_4_0= ruleTerminalCondition
            	    {

            	    						newCompositeNode(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_ownedConditions_4_0=ruleTerminalCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComposeConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedConditions",
            	    							lv_ownedConditions_4_0,
            	    							"fr.unice.polytech.si5.smarthome.am.shome.Shome.TerminalCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleComposeCondition"


    // $ANTLR start "entryRuleHomeTimeStamp"
    // InternalShome.g:997:1: entryRuleHomeTimeStamp returns [EObject current=null] : iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF ;
    public final EObject entryRuleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomeTimeStamp = null;


        try {
            // InternalShome.g:997:54: (iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF )
            // InternalShome.g:998:2: iv_ruleHomeTimeStamp= ruleHomeTimeStamp EOF
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
    // InternalShome.g:1004:1: ruleHomeTimeStamp returns [EObject current=null] : ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) ;
    public final EObject ruleHomeTimeStamp() throws RecognitionException {
        EObject current = null;

        Token lv_hour_0_0=null;
        Token otherlv_1=null;
        Token lv_min_2_0=null;
        Token otherlv_3=null;
        Token lv_sec_4_0=null;


        	enterRule();

        try {
            // InternalShome.g:1010:2: ( ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) ) )
            // InternalShome.g:1011:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            {
            // InternalShome.g:1011:2: ( ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) ) )
            // InternalShome.g:1012:3: ( (lv_hour_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_min_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_sec_4_0= RULE_INT ) )
            {
            // InternalShome.g:1012:3: ( (lv_hour_0_0= RULE_INT ) )
            // InternalShome.g:1013:4: (lv_hour_0_0= RULE_INT )
            {
            // InternalShome.g:1013:4: (lv_hour_0_0= RULE_INT )
            // InternalShome.g:1014:5: lv_hour_0_0= RULE_INT
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

            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeTimeStampAccess().getColonKeyword_1());
            		
            // InternalShome.g:1034:3: ( (lv_min_2_0= RULE_INT ) )
            // InternalShome.g:1035:4: (lv_min_2_0= RULE_INT )
            {
            // InternalShome.g:1035:4: (lv_min_2_0= RULE_INT )
            // InternalShome.g:1036:5: lv_min_2_0= RULE_INT
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

            otherlv_3=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getHomeTimeStampAccess().getColonKeyword_3());
            		
            // InternalShome.g:1056:3: ( (lv_sec_4_0= RULE_INT ) )
            // InternalShome.g:1057:4: (lv_sec_4_0= RULE_INT )
            {
            // InternalShome.g:1057:4: (lv_sec_4_0= RULE_INT )
            // InternalShome.g:1058:5: lv_sec_4_0= RULE_INT
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
    // InternalShome.g:1078:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShome.g:1078:47: (iv_ruleEString= ruleEString EOF )
            // InternalShome.g:1079:2: iv_ruleEString= ruleEString EOF
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
    // InternalShome.g:1085:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalShome.g:1091:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalShome.g:1092:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalShome.g:1092:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalShome.g:1093:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalShome.g:1101:3: this_ID_1= RULE_ID
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
    // InternalShome.g:1112:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalShome.g:1112:47: (iv_ruleAction= ruleAction EOF )
            // InternalShome.g:1113:2: iv_ruleAction= ruleAction EOF
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
    // InternalShome.g:1119:1: ruleAction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalShome.g:1125:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalShome.g:1126:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalShome.g:1126:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalShome.g:1127:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalShome.g:1127:3: ()
            // InternalShome.g:1128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalShome.g:1134:3: ( (lv_name_1_0= ruleEString ) )
            // InternalShome.g:1135:4: (lv_name_1_0= ruleEString )
            {
            // InternalShome.g:1135:4: (lv_name_1_0= ruleEString )
            // InternalShome.g:1136:5: lv_name_1_0= ruleEString
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\1\25\1\5\2\24\2\5\1\27\1\4\2\26\2\24\2\uffff\1\20\2\5\2\4\2\26\2\24\2\20\1\5\3\4\2\26\2\20\1\26\2\4\1\20\1\26\1\4\1\26";
    static final String dfa_3s = "\1\25\1\6\2\32\2\6\1\31\1\4\4\32\2\uffff\1\20\2\6\2\4\4\32\2\20\1\6\3\4\2\32\2\20\1\30\2\4\1\20\1\30\1\4\1\30";
    static final String dfa_4s = "\14\uffff\1\2\1\1\32\uffff";
    static final String dfa_5s = "\50\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3",
            "\1\4\1\uffff\1\6\1\uffff\1\5\1\uffff\1\7",
            "\1\4\1\uffff\1\6\1\uffff\1\5\1\uffff\1\7",
            "\1\10\1\11",
            "\1\12\1\13",
            "\1\15\1\uffff\1\14",
            "\1\16",
            "\1\6\1\uffff\1\5\1\uffff\1\7",
            "\1\6\1\uffff\1\5\1\uffff\1\7",
            "\1\17\1\uffff\1\6\1\uffff\1\20\1\uffff\1\21",
            "\1\17\1\uffff\1\6\1\uffff\1\20\1\uffff\1\21",
            "",
            "",
            "\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27",
            "\1\30",
            "\1\6\1\uffff\1\20\1\uffff\1\21",
            "\1\6\1\uffff\1\20\1\uffff\1\21",
            "\1\31\1\uffff\1\6\1\uffff\1\20\1\uffff\1\32",
            "\1\31\1\uffff\1\6\1\uffff\1\20\1\uffff\1\32",
            "\1\33",
            "\1\34",
            "\1\35\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\6\1\uffff\1\20\1\uffff\1\32",
            "\1\6\1\uffff\1\20\1\uffff\1\32",
            "\1\42",
            "\1\43",
            "\1\6\1\uffff\1\5",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\6\1\uffff\1\20",
            "\1\47",
            "\1\6\1\uffff\1\20"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "472:2: (this_Barrier_0= ruleBarrier | this_DifferedBarrier_1= ruleDifferedBarrier )";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\uffff\2\4\4\uffff\2\4\4\uffff\1\16\1\uffff";
    static final String dfa_9s = "\1\5\2\24\1\5\1\uffff\1\4\1\uffff\2\26\1\20\1\4\1\20\1\4\1\26\1\uffff";
    static final String dfa_10s = "\1\6\2\32\1\6\1\uffff\1\4\1\uffff\2\32\1\20\1\4\1\20\1\4\1\30\1\uffff";
    static final String dfa_11s = "\4\uffff\1\1\1\uffff\1\3\7\uffff\1\2";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2",
            "\1\3\1\uffff\1\4\1\uffff\1\6\1\uffff\1\5",
            "\1\3\1\uffff\1\4\1\uffff\1\6\1\uffff\1\5",
            "\1\7\1\10",
            "",
            "\1\11",
            "",
            "\1\4\1\uffff\1\6\1\uffff\1\5",
            "\1\4\1\uffff\1\6\1\uffff\1\5",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16\1\uffff\1\6",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "707:2: (this_Condition_0= ruleCondition | this_TimeEleapsedCondition_1= ruleTimeEleapsedCondition | this_ComposeCondition_2= ruleComposeCondition )";
        }
    }
 

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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});

}