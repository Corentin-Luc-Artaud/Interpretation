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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShomeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Home'", "'{'", "'}'", "'Subject'", "'ownedActions'", "':'", "'-'", "'Actor'", "'->'", "'do'", "'when'", "'then'", "'trigger'", "'and'", "'after'", "'during'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
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



    // $ANTLR start "entryRuleHome"
    // InternalShome.g:53:1: entryRuleHome : ruleHome EOF ;
    public final void entryRuleHome() throws RecognitionException {
        try {
            // InternalShome.g:54:1: ( ruleHome EOF )
            // InternalShome.g:55:1: ruleHome EOF
            {
             before(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            ruleHome();

            state._fsp--;

             after(grammarAccess.getHomeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalShome.g:62:1: ruleHome : ( ( rule__Home__Group__0 ) ) ;
    public final void ruleHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:66:2: ( ( ( rule__Home__Group__0 ) ) )
            // InternalShome.g:67:2: ( ( rule__Home__Group__0 ) )
            {
            // InternalShome.g:67:2: ( ( rule__Home__Group__0 ) )
            // InternalShome.g:68:3: ( rule__Home__Group__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup()); 
            // InternalShome.g:69:3: ( rule__Home__Group__0 )
            // InternalShome.g:69:4: rule__Home__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleSubject"
    // InternalShome.g:78:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // InternalShome.g:79:1: ( ruleSubject EOF )
            // InternalShome.g:80:1: ruleSubject EOF
            {
             before(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getSubjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalShome.g:87:1: ruleSubject : ( ( rule__Subject__Group__0 ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:91:2: ( ( ( rule__Subject__Group__0 ) ) )
            // InternalShome.g:92:2: ( ( rule__Subject__Group__0 ) )
            {
            // InternalShome.g:92:2: ( ( rule__Subject__Group__0 ) )
            // InternalShome.g:93:3: ( rule__Subject__Group__0 )
            {
             before(grammarAccess.getSubjectAccess().getGroup()); 
            // InternalShome.g:94:3: ( rule__Subject__Group__0 )
            // InternalShome.g:94:4: rule__Subject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleActor"
    // InternalShome.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalShome.g:104:1: ( ruleActor EOF )
            // InternalShome.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalShome.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalShome.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalShome.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalShome.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalShome.g:119:3: ( rule__Actor__Group__0 )
            // InternalShome.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleOccurence"
    // InternalShome.g:128:1: entryRuleOccurence : ruleOccurence EOF ;
    public final void entryRuleOccurence() throws RecognitionException {
        try {
            // InternalShome.g:129:1: ( ruleOccurence EOF )
            // InternalShome.g:130:1: ruleOccurence EOF
            {
             before(grammarAccess.getOccurenceRule()); 
            pushFollow(FOLLOW_1);
            ruleOccurence();

            state._fsp--;

             after(grammarAccess.getOccurenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOccurence"


    // $ANTLR start "ruleOccurence"
    // InternalShome.g:137:1: ruleOccurence : ( ( rule__Occurence__Group__0 ) ) ;
    public final void ruleOccurence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:141:2: ( ( ( rule__Occurence__Group__0 ) ) )
            // InternalShome.g:142:2: ( ( rule__Occurence__Group__0 ) )
            {
            // InternalShome.g:142:2: ( ( rule__Occurence__Group__0 ) )
            // InternalShome.g:143:3: ( rule__Occurence__Group__0 )
            {
             before(grammarAccess.getOccurenceAccess().getGroup()); 
            // InternalShome.g:144:3: ( rule__Occurence__Group__0 )
            // InternalShome.g:144:4: rule__Occurence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Occurence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurence"


    // $ANTLR start "entryRuleABarrier"
    // InternalShome.g:153:1: entryRuleABarrier : ruleABarrier EOF ;
    public final void entryRuleABarrier() throws RecognitionException {
        try {
            // InternalShome.g:154:1: ( ruleABarrier EOF )
            // InternalShome.g:155:1: ruleABarrier EOF
            {
             before(grammarAccess.getABarrierRule()); 
            pushFollow(FOLLOW_1);
            ruleABarrier();

            state._fsp--;

             after(grammarAccess.getABarrierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleABarrier"


    // $ANTLR start "ruleABarrier"
    // InternalShome.g:162:1: ruleABarrier : ( ( rule__ABarrier__Alternatives ) ) ;
    public final void ruleABarrier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:166:2: ( ( ( rule__ABarrier__Alternatives ) ) )
            // InternalShome.g:167:2: ( ( rule__ABarrier__Alternatives ) )
            {
            // InternalShome.g:167:2: ( ( rule__ABarrier__Alternatives ) )
            // InternalShome.g:168:3: ( rule__ABarrier__Alternatives )
            {
             before(grammarAccess.getABarrierAccess().getAlternatives()); 
            // InternalShome.g:169:3: ( rule__ABarrier__Alternatives )
            // InternalShome.g:169:4: rule__ABarrier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ABarrier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getABarrierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleABarrier"


    // $ANTLR start "entryRuleBarrier"
    // InternalShome.g:178:1: entryRuleBarrier : ruleBarrier EOF ;
    public final void entryRuleBarrier() throws RecognitionException {
        try {
            // InternalShome.g:179:1: ( ruleBarrier EOF )
            // InternalShome.g:180:1: ruleBarrier EOF
            {
             before(grammarAccess.getBarrierRule()); 
            pushFollow(FOLLOW_1);
            ruleBarrier();

            state._fsp--;

             after(grammarAccess.getBarrierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBarrier"


    // $ANTLR start "ruleBarrier"
    // InternalShome.g:187:1: ruleBarrier : ( ( rule__Barrier__Group__0 ) ) ;
    public final void ruleBarrier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:191:2: ( ( ( rule__Barrier__Group__0 ) ) )
            // InternalShome.g:192:2: ( ( rule__Barrier__Group__0 ) )
            {
            // InternalShome.g:192:2: ( ( rule__Barrier__Group__0 ) )
            // InternalShome.g:193:3: ( rule__Barrier__Group__0 )
            {
             before(grammarAccess.getBarrierAccess().getGroup()); 
            // InternalShome.g:194:3: ( rule__Barrier__Group__0 )
            // InternalShome.g:194:4: rule__Barrier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Barrier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarrierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarrier"


    // $ANTLR start "entryRuleDifferedBarrier"
    // InternalShome.g:203:1: entryRuleDifferedBarrier : ruleDifferedBarrier EOF ;
    public final void entryRuleDifferedBarrier() throws RecognitionException {
        try {
            // InternalShome.g:204:1: ( ruleDifferedBarrier EOF )
            // InternalShome.g:205:1: ruleDifferedBarrier EOF
            {
             before(grammarAccess.getDifferedBarrierRule()); 
            pushFollow(FOLLOW_1);
            ruleDifferedBarrier();

            state._fsp--;

             after(grammarAccess.getDifferedBarrierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDifferedBarrier"


    // $ANTLR start "ruleDifferedBarrier"
    // InternalShome.g:212:1: ruleDifferedBarrier : ( ( rule__DifferedBarrier__Group__0 ) ) ;
    public final void ruleDifferedBarrier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:216:2: ( ( ( rule__DifferedBarrier__Group__0 ) ) )
            // InternalShome.g:217:2: ( ( rule__DifferedBarrier__Group__0 ) )
            {
            // InternalShome.g:217:2: ( ( rule__DifferedBarrier__Group__0 ) )
            // InternalShome.g:218:3: ( rule__DifferedBarrier__Group__0 )
            {
             before(grammarAccess.getDifferedBarrierAccess().getGroup()); 
            // InternalShome.g:219:3: ( rule__DifferedBarrier__Group__0 )
            // InternalShome.g:219:4: rule__DifferedBarrier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDifferedBarrierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDifferedBarrier"


    // $ANTLR start "entryRuleACondition"
    // InternalShome.g:228:1: entryRuleACondition : ruleACondition EOF ;
    public final void entryRuleACondition() throws RecognitionException {
        try {
            // InternalShome.g:229:1: ( ruleACondition EOF )
            // InternalShome.g:230:1: ruleACondition EOF
            {
             before(grammarAccess.getAConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleACondition();

            state._fsp--;

             after(grammarAccess.getAConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACondition"


    // $ANTLR start "ruleACondition"
    // InternalShome.g:237:1: ruleACondition : ( ( rule__ACondition__Alternatives ) ) ;
    public final void ruleACondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:241:2: ( ( ( rule__ACondition__Alternatives ) ) )
            // InternalShome.g:242:2: ( ( rule__ACondition__Alternatives ) )
            {
            // InternalShome.g:242:2: ( ( rule__ACondition__Alternatives ) )
            // InternalShome.g:243:3: ( rule__ACondition__Alternatives )
            {
             before(grammarAccess.getAConditionAccess().getAlternatives()); 
            // InternalShome.g:244:3: ( rule__ACondition__Alternatives )
            // InternalShome.g:244:4: rule__ACondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ACondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACondition"


    // $ANTLR start "entryRuleTimeEleapsedCondition"
    // InternalShome.g:253:1: entryRuleTimeEleapsedCondition : ruleTimeEleapsedCondition EOF ;
    public final void entryRuleTimeEleapsedCondition() throws RecognitionException {
        try {
            // InternalShome.g:254:1: ( ruleTimeEleapsedCondition EOF )
            // InternalShome.g:255:1: ruleTimeEleapsedCondition EOF
            {
             before(grammarAccess.getTimeEleapsedConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeEleapsedCondition();

            state._fsp--;

             after(grammarAccess.getTimeEleapsedConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeEleapsedCondition"


    // $ANTLR start "ruleTimeEleapsedCondition"
    // InternalShome.g:262:1: ruleTimeEleapsedCondition : ( ( rule__TimeEleapsedCondition__Group__0 ) ) ;
    public final void ruleTimeEleapsedCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:266:2: ( ( ( rule__TimeEleapsedCondition__Group__0 ) ) )
            // InternalShome.g:267:2: ( ( rule__TimeEleapsedCondition__Group__0 ) )
            {
            // InternalShome.g:267:2: ( ( rule__TimeEleapsedCondition__Group__0 ) )
            // InternalShome.g:268:3: ( rule__TimeEleapsedCondition__Group__0 )
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getGroup()); 
            // InternalShome.g:269:3: ( rule__TimeEleapsedCondition__Group__0 )
            // InternalShome.g:269:4: rule__TimeEleapsedCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeEleapsedCondition"


    // $ANTLR start "entryRuleCondition"
    // InternalShome.g:278:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalShome.g:279:1: ( ruleCondition EOF )
            // InternalShome.g:280:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalShome.g:287:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:291:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalShome.g:292:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalShome.g:292:2: ( ( rule__Condition__Group__0 ) )
            // InternalShome.g:293:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalShome.g:294:3: ( rule__Condition__Group__0 )
            // InternalShome.g:294:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTerminalCondition"
    // InternalShome.g:303:1: entryRuleTerminalCondition : ruleTerminalCondition EOF ;
    public final void entryRuleTerminalCondition() throws RecognitionException {
        try {
            // InternalShome.g:304:1: ( ruleTerminalCondition EOF )
            // InternalShome.g:305:1: ruleTerminalCondition EOF
            {
             before(grammarAccess.getTerminalConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalCondition();

            state._fsp--;

             after(grammarAccess.getTerminalConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalCondition"


    // $ANTLR start "ruleTerminalCondition"
    // InternalShome.g:312:1: ruleTerminalCondition : ( ( rule__TerminalCondition__Alternatives ) ) ;
    public final void ruleTerminalCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:316:2: ( ( ( rule__TerminalCondition__Alternatives ) ) )
            // InternalShome.g:317:2: ( ( rule__TerminalCondition__Alternatives ) )
            {
            // InternalShome.g:317:2: ( ( rule__TerminalCondition__Alternatives ) )
            // InternalShome.g:318:3: ( rule__TerminalCondition__Alternatives )
            {
             before(grammarAccess.getTerminalConditionAccess().getAlternatives()); 
            // InternalShome.g:319:3: ( rule__TerminalCondition__Alternatives )
            // InternalShome.g:319:4: rule__TerminalCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalCondition"


    // $ANTLR start "entryRuleComposeCondition"
    // InternalShome.g:328:1: entryRuleComposeCondition : ruleComposeCondition EOF ;
    public final void entryRuleComposeCondition() throws RecognitionException {
        try {
            // InternalShome.g:329:1: ( ruleComposeCondition EOF )
            // InternalShome.g:330:1: ruleComposeCondition EOF
            {
             before(grammarAccess.getComposeConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposeCondition();

            state._fsp--;

             after(grammarAccess.getComposeConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposeCondition"


    // $ANTLR start "ruleComposeCondition"
    // InternalShome.g:337:1: ruleComposeCondition : ( ( rule__ComposeCondition__Group__0 ) ) ;
    public final void ruleComposeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:341:2: ( ( ( rule__ComposeCondition__Group__0 ) ) )
            // InternalShome.g:342:2: ( ( rule__ComposeCondition__Group__0 ) )
            {
            // InternalShome.g:342:2: ( ( rule__ComposeCondition__Group__0 ) )
            // InternalShome.g:343:3: ( rule__ComposeCondition__Group__0 )
            {
             before(grammarAccess.getComposeConditionAccess().getGroup()); 
            // InternalShome.g:344:3: ( rule__ComposeCondition__Group__0 )
            // InternalShome.g:344:4: rule__ComposeCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComposeConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposeCondition"


    // $ANTLR start "entryRuleHomeTimeStamp"
    // InternalShome.g:353:1: entryRuleHomeTimeStamp : ruleHomeTimeStamp EOF ;
    public final void entryRuleHomeTimeStamp() throws RecognitionException {
        try {
            // InternalShome.g:354:1: ( ruleHomeTimeStamp EOF )
            // InternalShome.g:355:1: ruleHomeTimeStamp EOF
            {
             before(grammarAccess.getHomeTimeStampRule()); 
            pushFollow(FOLLOW_1);
            ruleHomeTimeStamp();

            state._fsp--;

             after(grammarAccess.getHomeTimeStampRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHomeTimeStamp"


    // $ANTLR start "ruleHomeTimeStamp"
    // InternalShome.g:362:1: ruleHomeTimeStamp : ( ( rule__HomeTimeStamp__Group__0 ) ) ;
    public final void ruleHomeTimeStamp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:366:2: ( ( ( rule__HomeTimeStamp__Group__0 ) ) )
            // InternalShome.g:367:2: ( ( rule__HomeTimeStamp__Group__0 ) )
            {
            // InternalShome.g:367:2: ( ( rule__HomeTimeStamp__Group__0 ) )
            // InternalShome.g:368:3: ( rule__HomeTimeStamp__Group__0 )
            {
             before(grammarAccess.getHomeTimeStampAccess().getGroup()); 
            // InternalShome.g:369:3: ( rule__HomeTimeStamp__Group__0 )
            // InternalShome.g:369:4: rule__HomeTimeStamp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeTimeStampAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHomeTimeStamp"


    // $ANTLR start "entryRuleEString"
    // InternalShome.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalShome.g:379:1: ( ruleEString EOF )
            // InternalShome.g:380:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalShome.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalShome.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalShome.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalShome.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalShome.g:394:3: ( rule__EString__Alternatives )
            // InternalShome.g:394:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // InternalShome.g:403:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalShome.g:404:1: ( ruleAction EOF )
            // InternalShome.g:405:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalShome.g:412:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:416:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalShome.g:417:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalShome.g:417:2: ( ( rule__Action__Group__0 ) )
            // InternalShome.g:418:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalShome.g:419:3: ( rule__Action__Group__0 )
            // InternalShome.g:419:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__ABarrier__Alternatives"
    // InternalShome.g:427:1: rule__ABarrier__Alternatives : ( ( ruleBarrier ) | ( ruleDifferedBarrier ) );
    public final void rule__ABarrier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:431:1: ( ( ruleBarrier ) | ( ruleDifferedBarrier ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalShome.g:432:2: ( ruleBarrier )
                    {
                    // InternalShome.g:432:2: ( ruleBarrier )
                    // InternalShome.g:433:3: ruleBarrier
                    {
                     before(grammarAccess.getABarrierAccess().getBarrierParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBarrier();

                    state._fsp--;

                     after(grammarAccess.getABarrierAccess().getBarrierParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShome.g:438:2: ( ruleDifferedBarrier )
                    {
                    // InternalShome.g:438:2: ( ruleDifferedBarrier )
                    // InternalShome.g:439:3: ruleDifferedBarrier
                    {
                     before(grammarAccess.getABarrierAccess().getDifferedBarrierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDifferedBarrier();

                    state._fsp--;

                     after(grammarAccess.getABarrierAccess().getDifferedBarrierParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ABarrier__Alternatives"


    // $ANTLR start "rule__ACondition__Alternatives"
    // InternalShome.g:448:1: rule__ACondition__Alternatives : ( ( ruleCondition ) | ( ruleTimeEleapsedCondition ) | ( ruleComposeCondition ) );
    public final void rule__ACondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:452:1: ( ( ruleCondition ) | ( ruleTimeEleapsedCondition ) | ( ruleComposeCondition ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalShome.g:453:2: ( ruleCondition )
                    {
                    // InternalShome.g:453:2: ( ruleCondition )
                    // InternalShome.g:454:3: ruleCondition
                    {
                     before(grammarAccess.getAConditionAccess().getConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getAConditionAccess().getConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShome.g:459:2: ( ruleTimeEleapsedCondition )
                    {
                    // InternalShome.g:459:2: ( ruleTimeEleapsedCondition )
                    // InternalShome.g:460:3: ruleTimeEleapsedCondition
                    {
                     before(grammarAccess.getAConditionAccess().getTimeEleapsedConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeEleapsedCondition();

                    state._fsp--;

                     after(grammarAccess.getAConditionAccess().getTimeEleapsedConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShome.g:465:2: ( ruleComposeCondition )
                    {
                    // InternalShome.g:465:2: ( ruleComposeCondition )
                    // InternalShome.g:466:3: ruleComposeCondition
                    {
                     before(grammarAccess.getAConditionAccess().getComposeConditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComposeCondition();

                    state._fsp--;

                     after(grammarAccess.getAConditionAccess().getComposeConditionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACondition__Alternatives"


    // $ANTLR start "rule__TerminalCondition__Alternatives"
    // InternalShome.g:475:1: rule__TerminalCondition__Alternatives : ( ( ruleCondition ) | ( ruleTimeEleapsedCondition ) );
    public final void rule__TerminalCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:479:1: ( ( ruleCondition ) | ( ruleTimeEleapsedCondition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                case 20:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==RULE_STRING) ) {
                        int LA3_6 = input.LA(4);

                        if ( (LA3_6==26) ) {
                            alt3=2;
                        }
                        else if ( (LA3_6==EOF||LA3_6==22||LA3_6==24) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_4==RULE_ID) ) {
                        int LA3_7 = input.LA(4);

                        if ( (LA3_7==EOF||LA3_7==22||LA3_7==24) ) {
                            alt3=1;
                        }
                        else if ( (LA3_7==26) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 22:
                case 24:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 22:
                case 24:
                    {
                    alt3=1;
                    }
                    break;
                case 20:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==RULE_STRING) ) {
                        int LA3_6 = input.LA(4);

                        if ( (LA3_6==26) ) {
                            alt3=2;
                        }
                        else if ( (LA3_6==EOF||LA3_6==22||LA3_6==24) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 6, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_4==RULE_ID) ) {
                        int LA3_7 = input.LA(4);

                        if ( (LA3_7==EOF||LA3_7==22||LA3_7==24) ) {
                            alt3=1;
                        }
                        else if ( (LA3_7==26) ) {
                            alt3=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalShome.g:480:2: ( ruleCondition )
                    {
                    // InternalShome.g:480:2: ( ruleCondition )
                    // InternalShome.g:481:3: ruleCondition
                    {
                     before(grammarAccess.getTerminalConditionAccess().getConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getTerminalConditionAccess().getConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShome.g:486:2: ( ruleTimeEleapsedCondition )
                    {
                    // InternalShome.g:486:2: ( ruleTimeEleapsedCondition )
                    // InternalShome.g:487:3: ruleTimeEleapsedCondition
                    {
                     before(grammarAccess.getTerminalConditionAccess().getTimeEleapsedConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeEleapsedCondition();

                    state._fsp--;

                     after(grammarAccess.getTerminalConditionAccess().getTimeEleapsedConditionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalCondition__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalShome.g:496:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:500:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalShome.g:501:2: ( RULE_STRING )
                    {
                    // InternalShome.g:501:2: ( RULE_STRING )
                    // InternalShome.g:502:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShome.g:507:2: ( RULE_ID )
                    {
                    // InternalShome.g:507:2: ( RULE_ID )
                    // InternalShome.g:508:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Home__Group__0"
    // InternalShome.g:517:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:521:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalShome.g:522:2: rule__Home__Group__0__Impl rule__Home__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Home__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0"


    // $ANTLR start "rule__Home__Group__0__Impl"
    // InternalShome.g:529:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:533:1: ( ( () ) )
            // InternalShome.g:534:1: ( () )
            {
            // InternalShome.g:534:1: ( () )
            // InternalShome.g:535:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalShome.g:536:2: ()
            // InternalShome.g:536:3: 
            {
            }

             after(grammarAccess.getHomeAccess().getHomeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0__Impl"


    // $ANTLR start "rule__Home__Group__1"
    // InternalShome.g:544:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:548:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalShome.g:549:2: rule__Home__Group__1__Impl rule__Home__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Home__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1"


    // $ANTLR start "rule__Home__Group__1__Impl"
    // InternalShome.g:556:1: rule__Home__Group__1__Impl : ( 'Home' ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:560:1: ( ( 'Home' ) )
            // InternalShome.g:561:1: ( 'Home' )
            {
            // InternalShome.g:561:1: ( 'Home' )
            // InternalShome.g:562:2: 'Home'
            {
             before(grammarAccess.getHomeAccess().getHomeKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getHomeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1__Impl"


    // $ANTLR start "rule__Home__Group__2"
    // InternalShome.g:571:1: rule__Home__Group__2 : rule__Home__Group__2__Impl rule__Home__Group__3 ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:575:1: ( rule__Home__Group__2__Impl rule__Home__Group__3 )
            // InternalShome.g:576:2: rule__Home__Group__2__Impl rule__Home__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2"


    // $ANTLR start "rule__Home__Group__2__Impl"
    // InternalShome.g:583:1: rule__Home__Group__2__Impl : ( '{' ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:587:1: ( ( '{' ) )
            // InternalShome.g:588:1: ( '{' )
            {
            // InternalShome.g:588:1: ( '{' )
            // InternalShome.g:589:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2__Impl"


    // $ANTLR start "rule__Home__Group__3"
    // InternalShome.g:598:1: rule__Home__Group__3 : rule__Home__Group__3__Impl rule__Home__Group__4 ;
    public final void rule__Home__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:602:1: ( rule__Home__Group__3__Impl rule__Home__Group__4 )
            // InternalShome.g:603:2: rule__Home__Group__3__Impl rule__Home__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3"


    // $ANTLR start "rule__Home__Group__3__Impl"
    // InternalShome.g:610:1: rule__Home__Group__3__Impl : ( ( rule__Home__OwnedSubjectsAssignment_3 ) ) ;
    public final void rule__Home__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:614:1: ( ( ( rule__Home__OwnedSubjectsAssignment_3 ) ) )
            // InternalShome.g:615:1: ( ( rule__Home__OwnedSubjectsAssignment_3 ) )
            {
            // InternalShome.g:615:1: ( ( rule__Home__OwnedSubjectsAssignment_3 ) )
            // InternalShome.g:616:2: ( rule__Home__OwnedSubjectsAssignment_3 )
            {
             before(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_3()); 
            // InternalShome.g:617:2: ( rule__Home__OwnedSubjectsAssignment_3 )
            // InternalShome.g:617:3: rule__Home__OwnedSubjectsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Home__OwnedSubjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3__Impl"


    // $ANTLR start "rule__Home__Group__4"
    // InternalShome.g:625:1: rule__Home__Group__4 : rule__Home__Group__4__Impl rule__Home__Group__5 ;
    public final void rule__Home__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:629:1: ( rule__Home__Group__4__Impl rule__Home__Group__5 )
            // InternalShome.g:630:2: rule__Home__Group__4__Impl rule__Home__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4"


    // $ANTLR start "rule__Home__Group__4__Impl"
    // InternalShome.g:637:1: rule__Home__Group__4__Impl : ( ( rule__Home__OwnedSubjectsAssignment_4 )* ) ;
    public final void rule__Home__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:641:1: ( ( ( rule__Home__OwnedSubjectsAssignment_4 )* ) )
            // InternalShome.g:642:1: ( ( rule__Home__OwnedSubjectsAssignment_4 )* )
            {
            // InternalShome.g:642:1: ( ( rule__Home__OwnedSubjectsAssignment_4 )* )
            // InternalShome.g:643:2: ( rule__Home__OwnedSubjectsAssignment_4 )*
            {
             before(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_4()); 
            // InternalShome.g:644:2: ( rule__Home__OwnedSubjectsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShome.g:644:3: rule__Home__OwnedSubjectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Home__OwnedSubjectsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getOwnedSubjectsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4__Impl"


    // $ANTLR start "rule__Home__Group__5"
    // InternalShome.g:652:1: rule__Home__Group__5 : rule__Home__Group__5__Impl rule__Home__Group__6 ;
    public final void rule__Home__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:656:1: ( rule__Home__Group__5__Impl rule__Home__Group__6 )
            // InternalShome.g:657:2: rule__Home__Group__5__Impl rule__Home__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Home__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__5"


    // $ANTLR start "rule__Home__Group__5__Impl"
    // InternalShome.g:664:1: rule__Home__Group__5__Impl : ( ( rule__Home__OwnedActorsAssignment_5 )* ) ;
    public final void rule__Home__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:668:1: ( ( ( rule__Home__OwnedActorsAssignment_5 )* ) )
            // InternalShome.g:669:1: ( ( rule__Home__OwnedActorsAssignment_5 )* )
            {
            // InternalShome.g:669:1: ( ( rule__Home__OwnedActorsAssignment_5 )* )
            // InternalShome.g:670:2: ( rule__Home__OwnedActorsAssignment_5 )*
            {
             before(grammarAccess.getHomeAccess().getOwnedActorsAssignment_5()); 
            // InternalShome.g:671:2: ( rule__Home__OwnedActorsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalShome.g:671:3: rule__Home__OwnedActorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Home__OwnedActorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getOwnedActorsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__5__Impl"


    // $ANTLR start "rule__Home__Group__6"
    // InternalShome.g:679:1: rule__Home__Group__6 : rule__Home__Group__6__Impl rule__Home__Group__7 ;
    public final void rule__Home__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:683:1: ( rule__Home__Group__6__Impl rule__Home__Group__7 )
            // InternalShome.g:684:2: rule__Home__Group__6__Impl rule__Home__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Home__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__6"


    // $ANTLR start "rule__Home__Group__6__Impl"
    // InternalShome.g:691:1: rule__Home__Group__6__Impl : ( ( rule__Home__OwnedBarrierAssignment_6 ) ) ;
    public final void rule__Home__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:695:1: ( ( ( rule__Home__OwnedBarrierAssignment_6 ) ) )
            // InternalShome.g:696:1: ( ( rule__Home__OwnedBarrierAssignment_6 ) )
            {
            // InternalShome.g:696:1: ( ( rule__Home__OwnedBarrierAssignment_6 ) )
            // InternalShome.g:697:2: ( rule__Home__OwnedBarrierAssignment_6 )
            {
             before(grammarAccess.getHomeAccess().getOwnedBarrierAssignment_6()); 
            // InternalShome.g:698:2: ( rule__Home__OwnedBarrierAssignment_6 )
            // InternalShome.g:698:3: rule__Home__OwnedBarrierAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Home__OwnedBarrierAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getOwnedBarrierAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__6__Impl"


    // $ANTLR start "rule__Home__Group__7"
    // InternalShome.g:706:1: rule__Home__Group__7 : rule__Home__Group__7__Impl rule__Home__Group__8 ;
    public final void rule__Home__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:710:1: ( rule__Home__Group__7__Impl rule__Home__Group__8 )
            // InternalShome.g:711:2: rule__Home__Group__7__Impl rule__Home__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Home__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__7"


    // $ANTLR start "rule__Home__Group__7__Impl"
    // InternalShome.g:718:1: rule__Home__Group__7__Impl : ( ( rule__Home__OwnedBarrierAssignment_7 )* ) ;
    public final void rule__Home__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:722:1: ( ( ( rule__Home__OwnedBarrierAssignment_7 )* ) )
            // InternalShome.g:723:1: ( ( rule__Home__OwnedBarrierAssignment_7 )* )
            {
            // InternalShome.g:723:1: ( ( rule__Home__OwnedBarrierAssignment_7 )* )
            // InternalShome.g:724:2: ( rule__Home__OwnedBarrierAssignment_7 )*
            {
             before(grammarAccess.getHomeAccess().getOwnedBarrierAssignment_7()); 
            // InternalShome.g:725:2: ( rule__Home__OwnedBarrierAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalShome.g:725:3: rule__Home__OwnedBarrierAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Home__OwnedBarrierAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getOwnedBarrierAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__7__Impl"


    // $ANTLR start "rule__Home__Group__8"
    // InternalShome.g:733:1: rule__Home__Group__8 : rule__Home__Group__8__Impl rule__Home__Group__9 ;
    public final void rule__Home__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:737:1: ( rule__Home__Group__8__Impl rule__Home__Group__9 )
            // InternalShome.g:738:2: rule__Home__Group__8__Impl rule__Home__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Home__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__8"


    // $ANTLR start "rule__Home__Group__8__Impl"
    // InternalShome.g:745:1: rule__Home__Group__8__Impl : ( ( rule__Home__OwnedOccurencesAssignment_8 ) ) ;
    public final void rule__Home__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:749:1: ( ( ( rule__Home__OwnedOccurencesAssignment_8 ) ) )
            // InternalShome.g:750:1: ( ( rule__Home__OwnedOccurencesAssignment_8 ) )
            {
            // InternalShome.g:750:1: ( ( rule__Home__OwnedOccurencesAssignment_8 ) )
            // InternalShome.g:751:2: ( rule__Home__OwnedOccurencesAssignment_8 )
            {
             before(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_8()); 
            // InternalShome.g:752:2: ( rule__Home__OwnedOccurencesAssignment_8 )
            // InternalShome.g:752:3: rule__Home__OwnedOccurencesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Home__OwnedOccurencesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__8__Impl"


    // $ANTLR start "rule__Home__Group__9"
    // InternalShome.g:760:1: rule__Home__Group__9 : rule__Home__Group__9__Impl rule__Home__Group__10 ;
    public final void rule__Home__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:764:1: ( rule__Home__Group__9__Impl rule__Home__Group__10 )
            // InternalShome.g:765:2: rule__Home__Group__9__Impl rule__Home__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Home__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__9"


    // $ANTLR start "rule__Home__Group__9__Impl"
    // InternalShome.g:772:1: rule__Home__Group__9__Impl : ( ( rule__Home__OwnedOccurencesAssignment_9 )* ) ;
    public final void rule__Home__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:776:1: ( ( ( rule__Home__OwnedOccurencesAssignment_9 )* ) )
            // InternalShome.g:777:1: ( ( rule__Home__OwnedOccurencesAssignment_9 )* )
            {
            // InternalShome.g:777:1: ( ( rule__Home__OwnedOccurencesAssignment_9 )* )
            // InternalShome.g:778:2: ( rule__Home__OwnedOccurencesAssignment_9 )*
            {
             before(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_9()); 
            // InternalShome.g:779:2: ( rule__Home__OwnedOccurencesAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalShome.g:779:3: rule__Home__OwnedOccurencesAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Home__OwnedOccurencesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getOwnedOccurencesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__9__Impl"


    // $ANTLR start "rule__Home__Group__10"
    // InternalShome.g:787:1: rule__Home__Group__10 : rule__Home__Group__10__Impl ;
    public final void rule__Home__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:791:1: ( rule__Home__Group__10__Impl )
            // InternalShome.g:792:2: rule__Home__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__10"


    // $ANTLR start "rule__Home__Group__10__Impl"
    // InternalShome.g:798:1: rule__Home__Group__10__Impl : ( '}' ) ;
    public final void rule__Home__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:802:1: ( ( '}' ) )
            // InternalShome.g:803:1: ( '}' )
            {
            // InternalShome.g:803:1: ( '}' )
            // InternalShome.g:804:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__10__Impl"


    // $ANTLR start "rule__Subject__Group__0"
    // InternalShome.g:814:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:818:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalShome.g:819:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Subject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0"


    // $ANTLR start "rule__Subject__Group__0__Impl"
    // InternalShome.g:826:1: rule__Subject__Group__0__Impl : ( 'Subject' ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:830:1: ( ( 'Subject' ) )
            // InternalShome.g:831:1: ( 'Subject' )
            {
            // InternalShome.g:831:1: ( 'Subject' )
            // InternalShome.g:832:2: 'Subject'
            {
             before(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0__Impl"


    // $ANTLR start "rule__Subject__Group__1"
    // InternalShome.g:841:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl rule__Subject__Group__2 ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:845:1: ( rule__Subject__Group__1__Impl rule__Subject__Group__2 )
            // InternalShome.g:846:2: rule__Subject__Group__1__Impl rule__Subject__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Subject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__1"


    // $ANTLR start "rule__Subject__Group__1__Impl"
    // InternalShome.g:853:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:857:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalShome.g:858:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalShome.g:858:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalShome.g:859:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalShome.g:860:2: ( rule__Subject__NameAssignment_1 )
            // InternalShome.g:860:3: rule__Subject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__1__Impl"


    // $ANTLR start "rule__Subject__Group__2"
    // InternalShome.g:868:1: rule__Subject__Group__2 : rule__Subject__Group__2__Impl rule__Subject__Group__3 ;
    public final void rule__Subject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:872:1: ( rule__Subject__Group__2__Impl rule__Subject__Group__3 )
            // InternalShome.g:873:2: rule__Subject__Group__2__Impl rule__Subject__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Subject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__2"


    // $ANTLR start "rule__Subject__Group__2__Impl"
    // InternalShome.g:880:1: rule__Subject__Group__2__Impl : ( 'ownedActions' ) ;
    public final void rule__Subject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:884:1: ( ( 'ownedActions' ) )
            // InternalShome.g:885:1: ( 'ownedActions' )
            {
            // InternalShome.g:885:1: ( 'ownedActions' )
            // InternalShome.g:886:2: 'ownedActions'
            {
             before(grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getOwnedActionsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__2__Impl"


    // $ANTLR start "rule__Subject__Group__3"
    // InternalShome.g:895:1: rule__Subject__Group__3 : rule__Subject__Group__3__Impl rule__Subject__Group__4 ;
    public final void rule__Subject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:899:1: ( rule__Subject__Group__3__Impl rule__Subject__Group__4 )
            // InternalShome.g:900:2: rule__Subject__Group__3__Impl rule__Subject__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Subject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__3"


    // $ANTLR start "rule__Subject__Group__3__Impl"
    // InternalShome.g:907:1: rule__Subject__Group__3__Impl : ( ':' ) ;
    public final void rule__Subject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:911:1: ( ( ':' ) )
            // InternalShome.g:912:1: ( ':' )
            {
            // InternalShome.g:912:1: ( ':' )
            // InternalShome.g:913:2: ':'
            {
             before(grammarAccess.getSubjectAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__3__Impl"


    // $ANTLR start "rule__Subject__Group__4"
    // InternalShome.g:922:1: rule__Subject__Group__4 : rule__Subject__Group__4__Impl rule__Subject__Group__5 ;
    public final void rule__Subject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:926:1: ( rule__Subject__Group__4__Impl rule__Subject__Group__5 )
            // InternalShome.g:927:2: rule__Subject__Group__4__Impl rule__Subject__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Subject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__4"


    // $ANTLR start "rule__Subject__Group__4__Impl"
    // InternalShome.g:934:1: rule__Subject__Group__4__Impl : ( ( rule__Subject__OwnedActionsAssignment_4 ) ) ;
    public final void rule__Subject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:938:1: ( ( ( rule__Subject__OwnedActionsAssignment_4 ) ) )
            // InternalShome.g:939:1: ( ( rule__Subject__OwnedActionsAssignment_4 ) )
            {
            // InternalShome.g:939:1: ( ( rule__Subject__OwnedActionsAssignment_4 ) )
            // InternalShome.g:940:2: ( rule__Subject__OwnedActionsAssignment_4 )
            {
             before(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_4()); 
            // InternalShome.g:941:2: ( rule__Subject__OwnedActionsAssignment_4 )
            // InternalShome.g:941:3: rule__Subject__OwnedActionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Subject__OwnedActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__4__Impl"


    // $ANTLR start "rule__Subject__Group__5"
    // InternalShome.g:949:1: rule__Subject__Group__5 : rule__Subject__Group__5__Impl ;
    public final void rule__Subject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:953:1: ( rule__Subject__Group__5__Impl )
            // InternalShome.g:954:2: rule__Subject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__5"


    // $ANTLR start "rule__Subject__Group__5__Impl"
    // InternalShome.g:960:1: rule__Subject__Group__5__Impl : ( ( rule__Subject__Group_5__0 )* ) ;
    public final void rule__Subject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:964:1: ( ( ( rule__Subject__Group_5__0 )* ) )
            // InternalShome.g:965:1: ( ( rule__Subject__Group_5__0 )* )
            {
            // InternalShome.g:965:1: ( ( rule__Subject__Group_5__0 )* )
            // InternalShome.g:966:2: ( rule__Subject__Group_5__0 )*
            {
             before(grammarAccess.getSubjectAccess().getGroup_5()); 
            // InternalShome.g:967:2: ( rule__Subject__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalShome.g:967:3: rule__Subject__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Subject__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSubjectAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__5__Impl"


    // $ANTLR start "rule__Subject__Group_5__0"
    // InternalShome.g:976:1: rule__Subject__Group_5__0 : rule__Subject__Group_5__0__Impl rule__Subject__Group_5__1 ;
    public final void rule__Subject__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:980:1: ( rule__Subject__Group_5__0__Impl rule__Subject__Group_5__1 )
            // InternalShome.g:981:2: rule__Subject__Group_5__0__Impl rule__Subject__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Subject__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_5__0"


    // $ANTLR start "rule__Subject__Group_5__0__Impl"
    // InternalShome.g:988:1: rule__Subject__Group_5__0__Impl : ( '-' ) ;
    public final void rule__Subject__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:992:1: ( ( '-' ) )
            // InternalShome.g:993:1: ( '-' )
            {
            // InternalShome.g:993:1: ( '-' )
            // InternalShome.g:994:2: '-'
            {
             before(grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getHyphenMinusKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_5__0__Impl"


    // $ANTLR start "rule__Subject__Group_5__1"
    // InternalShome.g:1003:1: rule__Subject__Group_5__1 : rule__Subject__Group_5__1__Impl ;
    public final void rule__Subject__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1007:1: ( rule__Subject__Group_5__1__Impl )
            // InternalShome.g:1008:2: rule__Subject__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_5__1"


    // $ANTLR start "rule__Subject__Group_5__1__Impl"
    // InternalShome.g:1014:1: rule__Subject__Group_5__1__Impl : ( ( rule__Subject__OwnedActionsAssignment_5_1 ) ) ;
    public final void rule__Subject__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1018:1: ( ( ( rule__Subject__OwnedActionsAssignment_5_1 ) ) )
            // InternalShome.g:1019:1: ( ( rule__Subject__OwnedActionsAssignment_5_1 ) )
            {
            // InternalShome.g:1019:1: ( ( rule__Subject__OwnedActionsAssignment_5_1 ) )
            // InternalShome.g:1020:2: ( rule__Subject__OwnedActionsAssignment_5_1 )
            {
             before(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_5_1()); 
            // InternalShome.g:1021:2: ( rule__Subject__OwnedActionsAssignment_5_1 )
            // InternalShome.g:1021:3: rule__Subject__OwnedActionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__OwnedActionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getOwnedActionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_5__1__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalShome.g:1030:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1034:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalShome.g:1035:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalShome.g:1042:1: rule__Actor__Group__0__Impl : ( () ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1046:1: ( ( () ) )
            // InternalShome.g:1047:1: ( () )
            {
            // InternalShome.g:1047:1: ( () )
            // InternalShome.g:1048:2: ()
            {
             before(grammarAccess.getActorAccess().getActorAction_0()); 
            // InternalShome.g:1049:2: ()
            // InternalShome.g:1049:3: 
            {
            }

             after(grammarAccess.getActorAccess().getActorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalShome.g:1057:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1061:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalShome.g:1062:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalShome.g:1069:1: rule__Actor__Group__1__Impl : ( 'Actor' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1073:1: ( ( 'Actor' ) )
            // InternalShome.g:1074:1: ( 'Actor' )
            {
            // InternalShome.g:1074:1: ( 'Actor' )
            // InternalShome.g:1075:2: 'Actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalShome.g:1084:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1088:1: ( rule__Actor__Group__2__Impl )
            // InternalShome.g:1089:2: rule__Actor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalShome.g:1095:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__NameAssignment_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1099:1: ( ( ( rule__Actor__NameAssignment_2 ) ) )
            // InternalShome.g:1100:1: ( ( rule__Actor__NameAssignment_2 ) )
            {
            // InternalShome.g:1100:1: ( ( rule__Actor__NameAssignment_2 ) )
            // InternalShome.g:1101:2: ( rule__Actor__NameAssignment_2 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2()); 
            // InternalShome.g:1102:2: ( rule__Actor__NameAssignment_2 )
            // InternalShome.g:1102:3: rule__Actor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Occurence__Group__0"
    // InternalShome.g:1111:1: rule__Occurence__Group__0 : rule__Occurence__Group__0__Impl rule__Occurence__Group__1 ;
    public final void rule__Occurence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1115:1: ( rule__Occurence__Group__0__Impl rule__Occurence__Group__1 )
            // InternalShome.g:1116:2: rule__Occurence__Group__0__Impl rule__Occurence__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Occurence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Occurence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__0"


    // $ANTLR start "rule__Occurence__Group__0__Impl"
    // InternalShome.g:1123:1: rule__Occurence__Group__0__Impl : ( ( rule__Occurence__OwnedTimeAssignment_0 ) ) ;
    public final void rule__Occurence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1127:1: ( ( ( rule__Occurence__OwnedTimeAssignment_0 ) ) )
            // InternalShome.g:1128:1: ( ( rule__Occurence__OwnedTimeAssignment_0 ) )
            {
            // InternalShome.g:1128:1: ( ( rule__Occurence__OwnedTimeAssignment_0 ) )
            // InternalShome.g:1129:2: ( rule__Occurence__OwnedTimeAssignment_0 )
            {
             before(grammarAccess.getOccurenceAccess().getOwnedTimeAssignment_0()); 
            // InternalShome.g:1130:2: ( rule__Occurence__OwnedTimeAssignment_0 )
            // InternalShome.g:1130:3: rule__Occurence__OwnedTimeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Occurence__OwnedTimeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAccess().getOwnedTimeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__0__Impl"


    // $ANTLR start "rule__Occurence__Group__1"
    // InternalShome.g:1138:1: rule__Occurence__Group__1 : rule__Occurence__Group__1__Impl rule__Occurence__Group__2 ;
    public final void rule__Occurence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1142:1: ( rule__Occurence__Group__1__Impl rule__Occurence__Group__2 )
            // InternalShome.g:1143:2: rule__Occurence__Group__1__Impl rule__Occurence__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Occurence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Occurence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__1"


    // $ANTLR start "rule__Occurence__Group__1__Impl"
    // InternalShome.g:1150:1: rule__Occurence__Group__1__Impl : ( '->' ) ;
    public final void rule__Occurence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1154:1: ( ( '->' ) )
            // InternalShome.g:1155:1: ( '->' )
            {
            // InternalShome.g:1155:1: ( '->' )
            // InternalShome.g:1156:2: '->'
            {
             before(grammarAccess.getOccurenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOccurenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__1__Impl"


    // $ANTLR start "rule__Occurence__Group__2"
    // InternalShome.g:1165:1: rule__Occurence__Group__2 : rule__Occurence__Group__2__Impl rule__Occurence__Group__3 ;
    public final void rule__Occurence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1169:1: ( rule__Occurence__Group__2__Impl rule__Occurence__Group__3 )
            // InternalShome.g:1170:2: rule__Occurence__Group__2__Impl rule__Occurence__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Occurence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Occurence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__2"


    // $ANTLR start "rule__Occurence__Group__2__Impl"
    // InternalShome.g:1177:1: rule__Occurence__Group__2__Impl : ( ( rule__Occurence__Group_2__0 )? ) ;
    public final void rule__Occurence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1181:1: ( ( ( rule__Occurence__Group_2__0 )? ) )
            // InternalShome.g:1182:1: ( ( rule__Occurence__Group_2__0 )? )
            {
            // InternalShome.g:1182:1: ( ( rule__Occurence__Group_2__0 )? )
            // InternalShome.g:1183:2: ( rule__Occurence__Group_2__0 )?
            {
             before(grammarAccess.getOccurenceAccess().getGroup_2()); 
            // InternalShome.g:1184:2: ( rule__Occurence__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==20) ) {
                    alt10=1;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==20) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalShome.g:1184:3: rule__Occurence__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Occurence__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOccurenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__2__Impl"


    // $ANTLR start "rule__Occurence__Group__3"
    // InternalShome.g:1192:1: rule__Occurence__Group__3 : rule__Occurence__Group__3__Impl ;
    public final void rule__Occurence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1196:1: ( rule__Occurence__Group__3__Impl )
            // InternalShome.g:1197:2: rule__Occurence__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Occurence__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__3"


    // $ANTLR start "rule__Occurence__Group__3__Impl"
    // InternalShome.g:1203:1: rule__Occurence__Group__3__Impl : ( ( rule__Occurence__ActionAssignment_3 ) ) ;
    public final void rule__Occurence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1207:1: ( ( ( rule__Occurence__ActionAssignment_3 ) ) )
            // InternalShome.g:1208:1: ( ( rule__Occurence__ActionAssignment_3 ) )
            {
            // InternalShome.g:1208:1: ( ( rule__Occurence__ActionAssignment_3 ) )
            // InternalShome.g:1209:2: ( rule__Occurence__ActionAssignment_3 )
            {
             before(grammarAccess.getOccurenceAccess().getActionAssignment_3()); 
            // InternalShome.g:1210:2: ( rule__Occurence__ActionAssignment_3 )
            // InternalShome.g:1210:3: rule__Occurence__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Occurence__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAccess().getActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group__3__Impl"


    // $ANTLR start "rule__Occurence__Group_2__0"
    // InternalShome.g:1219:1: rule__Occurence__Group_2__0 : rule__Occurence__Group_2__0__Impl rule__Occurence__Group_2__1 ;
    public final void rule__Occurence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1223:1: ( rule__Occurence__Group_2__0__Impl rule__Occurence__Group_2__1 )
            // InternalShome.g:1224:2: rule__Occurence__Group_2__0__Impl rule__Occurence__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Occurence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Occurence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group_2__0"


    // $ANTLR start "rule__Occurence__Group_2__0__Impl"
    // InternalShome.g:1231:1: rule__Occurence__Group_2__0__Impl : ( ( rule__Occurence__ActorAssignment_2_0 ) ) ;
    public final void rule__Occurence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1235:1: ( ( ( rule__Occurence__ActorAssignment_2_0 ) ) )
            // InternalShome.g:1236:1: ( ( rule__Occurence__ActorAssignment_2_0 ) )
            {
            // InternalShome.g:1236:1: ( ( rule__Occurence__ActorAssignment_2_0 ) )
            // InternalShome.g:1237:2: ( rule__Occurence__ActorAssignment_2_0 )
            {
             before(grammarAccess.getOccurenceAccess().getActorAssignment_2_0()); 
            // InternalShome.g:1238:2: ( rule__Occurence__ActorAssignment_2_0 )
            // InternalShome.g:1238:3: rule__Occurence__ActorAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Occurence__ActorAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOccurenceAccess().getActorAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group_2__0__Impl"


    // $ANTLR start "rule__Occurence__Group_2__1"
    // InternalShome.g:1246:1: rule__Occurence__Group_2__1 : rule__Occurence__Group_2__1__Impl ;
    public final void rule__Occurence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1250:1: ( rule__Occurence__Group_2__1__Impl )
            // InternalShome.g:1251:2: rule__Occurence__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Occurence__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group_2__1"


    // $ANTLR start "rule__Occurence__Group_2__1__Impl"
    // InternalShome.g:1257:1: rule__Occurence__Group_2__1__Impl : ( 'do' ) ;
    public final void rule__Occurence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1261:1: ( ( 'do' ) )
            // InternalShome.g:1262:1: ( 'do' )
            {
            // InternalShome.g:1262:1: ( 'do' )
            // InternalShome.g:1263:2: 'do'
            {
             before(grammarAccess.getOccurenceAccess().getDoKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOccurenceAccess().getDoKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__Group_2__1__Impl"


    // $ANTLR start "rule__Barrier__Group__0"
    // InternalShome.g:1273:1: rule__Barrier__Group__0 : rule__Barrier__Group__0__Impl rule__Barrier__Group__1 ;
    public final void rule__Barrier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1277:1: ( rule__Barrier__Group__0__Impl rule__Barrier__Group__1 )
            // InternalShome.g:1278:2: rule__Barrier__Group__0__Impl rule__Barrier__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Barrier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Barrier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__0"


    // $ANTLR start "rule__Barrier__Group__0__Impl"
    // InternalShome.g:1285:1: rule__Barrier__Group__0__Impl : ( 'when' ) ;
    public final void rule__Barrier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1289:1: ( ( 'when' ) )
            // InternalShome.g:1290:1: ( 'when' )
            {
            // InternalShome.g:1290:1: ( 'when' )
            // InternalShome.g:1291:2: 'when'
            {
             before(grammarAccess.getBarrierAccess().getWhenKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBarrierAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__0__Impl"


    // $ANTLR start "rule__Barrier__Group__1"
    // InternalShome.g:1300:1: rule__Barrier__Group__1 : rule__Barrier__Group__1__Impl rule__Barrier__Group__2 ;
    public final void rule__Barrier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1304:1: ( rule__Barrier__Group__1__Impl rule__Barrier__Group__2 )
            // InternalShome.g:1305:2: rule__Barrier__Group__1__Impl rule__Barrier__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Barrier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Barrier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__1"


    // $ANTLR start "rule__Barrier__Group__1__Impl"
    // InternalShome.g:1312:1: rule__Barrier__Group__1__Impl : ( ( rule__Barrier__OwnedConditionAssignment_1 ) ) ;
    public final void rule__Barrier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1316:1: ( ( ( rule__Barrier__OwnedConditionAssignment_1 ) ) )
            // InternalShome.g:1317:1: ( ( rule__Barrier__OwnedConditionAssignment_1 ) )
            {
            // InternalShome.g:1317:1: ( ( rule__Barrier__OwnedConditionAssignment_1 ) )
            // InternalShome.g:1318:2: ( rule__Barrier__OwnedConditionAssignment_1 )
            {
             before(grammarAccess.getBarrierAccess().getOwnedConditionAssignment_1()); 
            // InternalShome.g:1319:2: ( rule__Barrier__OwnedConditionAssignment_1 )
            // InternalShome.g:1319:3: rule__Barrier__OwnedConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Barrier__OwnedConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBarrierAccess().getOwnedConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__1__Impl"


    // $ANTLR start "rule__Barrier__Group__2"
    // InternalShome.g:1327:1: rule__Barrier__Group__2 : rule__Barrier__Group__2__Impl rule__Barrier__Group__3 ;
    public final void rule__Barrier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1331:1: ( rule__Barrier__Group__2__Impl rule__Barrier__Group__3 )
            // InternalShome.g:1332:2: rule__Barrier__Group__2__Impl rule__Barrier__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Barrier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Barrier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__2"


    // $ANTLR start "rule__Barrier__Group__2__Impl"
    // InternalShome.g:1339:1: rule__Barrier__Group__2__Impl : ( 'then' ) ;
    public final void rule__Barrier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1343:1: ( ( 'then' ) )
            // InternalShome.g:1344:1: ( 'then' )
            {
            // InternalShome.g:1344:1: ( 'then' )
            // InternalShome.g:1345:2: 'then'
            {
             before(grammarAccess.getBarrierAccess().getThenKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBarrierAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__2__Impl"


    // $ANTLR start "rule__Barrier__Group__3"
    // InternalShome.g:1354:1: rule__Barrier__Group__3 : rule__Barrier__Group__3__Impl rule__Barrier__Group__4 ;
    public final void rule__Barrier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1358:1: ( rule__Barrier__Group__3__Impl rule__Barrier__Group__4 )
            // InternalShome.g:1359:2: rule__Barrier__Group__3__Impl rule__Barrier__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Barrier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Barrier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__3"


    // $ANTLR start "rule__Barrier__Group__3__Impl"
    // InternalShome.g:1366:1: rule__Barrier__Group__3__Impl : ( 'trigger' ) ;
    public final void rule__Barrier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1370:1: ( ( 'trigger' ) )
            // InternalShome.g:1371:1: ( 'trigger' )
            {
            // InternalShome.g:1371:1: ( 'trigger' )
            // InternalShome.g:1372:2: 'trigger'
            {
             before(grammarAccess.getBarrierAccess().getTriggerKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBarrierAccess().getTriggerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__3__Impl"


    // $ANTLR start "rule__Barrier__Group__4"
    // InternalShome.g:1381:1: rule__Barrier__Group__4 : rule__Barrier__Group__4__Impl rule__Barrier__Group__5 ;
    public final void rule__Barrier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1385:1: ( rule__Barrier__Group__4__Impl rule__Barrier__Group__5 )
            // InternalShome.g:1386:2: rule__Barrier__Group__4__Impl rule__Barrier__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Barrier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Barrier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__4"


    // $ANTLR start "rule__Barrier__Group__4__Impl"
    // InternalShome.g:1393:1: rule__Barrier__Group__4__Impl : ( ( rule__Barrier__ActionsAssignment_4 ) ) ;
    public final void rule__Barrier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1397:1: ( ( ( rule__Barrier__ActionsAssignment_4 ) ) )
            // InternalShome.g:1398:1: ( ( rule__Barrier__ActionsAssignment_4 ) )
            {
            // InternalShome.g:1398:1: ( ( rule__Barrier__ActionsAssignment_4 ) )
            // InternalShome.g:1399:2: ( rule__Barrier__ActionsAssignment_4 )
            {
             before(grammarAccess.getBarrierAccess().getActionsAssignment_4()); 
            // InternalShome.g:1400:2: ( rule__Barrier__ActionsAssignment_4 )
            // InternalShome.g:1400:3: rule__Barrier__ActionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Barrier__ActionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBarrierAccess().getActionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__4__Impl"


    // $ANTLR start "rule__Barrier__Group__5"
    // InternalShome.g:1408:1: rule__Barrier__Group__5 : rule__Barrier__Group__5__Impl ;
    public final void rule__Barrier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1412:1: ( rule__Barrier__Group__5__Impl )
            // InternalShome.g:1413:2: rule__Barrier__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Barrier__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__5"


    // $ANTLR start "rule__Barrier__Group__5__Impl"
    // InternalShome.g:1419:1: rule__Barrier__Group__5__Impl : ( ( rule__Barrier__Group_5__0 )* ) ;
    public final void rule__Barrier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1423:1: ( ( ( rule__Barrier__Group_5__0 )* ) )
            // InternalShome.g:1424:1: ( ( rule__Barrier__Group_5__0 )* )
            {
            // InternalShome.g:1424:1: ( ( rule__Barrier__Group_5__0 )* )
            // InternalShome.g:1425:2: ( rule__Barrier__Group_5__0 )*
            {
             before(grammarAccess.getBarrierAccess().getGroup_5()); 
            // InternalShome.g:1426:2: ( rule__Barrier__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalShome.g:1426:3: rule__Barrier__Group_5__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Barrier__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBarrierAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__5__Impl"


    // $ANTLR start "rule__Barrier__Group_5__0"
    // InternalShome.g:1435:1: rule__Barrier__Group_5__0 : rule__Barrier__Group_5__0__Impl rule__Barrier__Group_5__1 ;
    public final void rule__Barrier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1439:1: ( rule__Barrier__Group_5__0__Impl rule__Barrier__Group_5__1 )
            // InternalShome.g:1440:2: rule__Barrier__Group_5__0__Impl rule__Barrier__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Barrier__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Barrier__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group_5__0"


    // $ANTLR start "rule__Barrier__Group_5__0__Impl"
    // InternalShome.g:1447:1: rule__Barrier__Group_5__0__Impl : ( 'and' ) ;
    public final void rule__Barrier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1451:1: ( ( 'and' ) )
            // InternalShome.g:1452:1: ( 'and' )
            {
            // InternalShome.g:1452:1: ( 'and' )
            // InternalShome.g:1453:2: 'and'
            {
             before(grammarAccess.getBarrierAccess().getAndKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBarrierAccess().getAndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group_5__0__Impl"


    // $ANTLR start "rule__Barrier__Group_5__1"
    // InternalShome.g:1462:1: rule__Barrier__Group_5__1 : rule__Barrier__Group_5__1__Impl ;
    public final void rule__Barrier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1466:1: ( rule__Barrier__Group_5__1__Impl )
            // InternalShome.g:1467:2: rule__Barrier__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Barrier__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group_5__1"


    // $ANTLR start "rule__Barrier__Group_5__1__Impl"
    // InternalShome.g:1473:1: rule__Barrier__Group_5__1__Impl : ( ( rule__Barrier__ActionsAssignment_5_1 ) ) ;
    public final void rule__Barrier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1477:1: ( ( ( rule__Barrier__ActionsAssignment_5_1 ) ) )
            // InternalShome.g:1478:1: ( ( rule__Barrier__ActionsAssignment_5_1 ) )
            {
            // InternalShome.g:1478:1: ( ( rule__Barrier__ActionsAssignment_5_1 ) )
            // InternalShome.g:1479:2: ( rule__Barrier__ActionsAssignment_5_1 )
            {
             before(grammarAccess.getBarrierAccess().getActionsAssignment_5_1()); 
            // InternalShome.g:1480:2: ( rule__Barrier__ActionsAssignment_5_1 )
            // InternalShome.g:1480:3: rule__Barrier__ActionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Barrier__ActionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBarrierAccess().getActionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group_5__1__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__0"
    // InternalShome.g:1489:1: rule__DifferedBarrier__Group__0 : rule__DifferedBarrier__Group__0__Impl rule__DifferedBarrier__Group__1 ;
    public final void rule__DifferedBarrier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1493:1: ( rule__DifferedBarrier__Group__0__Impl rule__DifferedBarrier__Group__1 )
            // InternalShome.g:1494:2: rule__DifferedBarrier__Group__0__Impl rule__DifferedBarrier__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DifferedBarrier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__0"


    // $ANTLR start "rule__DifferedBarrier__Group__0__Impl"
    // InternalShome.g:1501:1: rule__DifferedBarrier__Group__0__Impl : ( 'when' ) ;
    public final void rule__DifferedBarrier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1505:1: ( ( 'when' ) )
            // InternalShome.g:1506:1: ( 'when' )
            {
            // InternalShome.g:1506:1: ( 'when' )
            // InternalShome.g:1507:2: 'when'
            {
             before(grammarAccess.getDifferedBarrierAccess().getWhenKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDifferedBarrierAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__0__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__1"
    // InternalShome.g:1516:1: rule__DifferedBarrier__Group__1 : rule__DifferedBarrier__Group__1__Impl rule__DifferedBarrier__Group__2 ;
    public final void rule__DifferedBarrier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1520:1: ( rule__DifferedBarrier__Group__1__Impl rule__DifferedBarrier__Group__2 )
            // InternalShome.g:1521:2: rule__DifferedBarrier__Group__1__Impl rule__DifferedBarrier__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__DifferedBarrier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__1"


    // $ANTLR start "rule__DifferedBarrier__Group__1__Impl"
    // InternalShome.g:1528:1: rule__DifferedBarrier__Group__1__Impl : ( ( rule__DifferedBarrier__OwnedConditionAssignment_1 ) ) ;
    public final void rule__DifferedBarrier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1532:1: ( ( ( rule__DifferedBarrier__OwnedConditionAssignment_1 ) ) )
            // InternalShome.g:1533:1: ( ( rule__DifferedBarrier__OwnedConditionAssignment_1 ) )
            {
            // InternalShome.g:1533:1: ( ( rule__DifferedBarrier__OwnedConditionAssignment_1 ) )
            // InternalShome.g:1534:2: ( rule__DifferedBarrier__OwnedConditionAssignment_1 )
            {
             before(grammarAccess.getDifferedBarrierAccess().getOwnedConditionAssignment_1()); 
            // InternalShome.g:1535:2: ( rule__DifferedBarrier__OwnedConditionAssignment_1 )
            // InternalShome.g:1535:3: rule__DifferedBarrier__OwnedConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__OwnedConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDifferedBarrierAccess().getOwnedConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__1__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__2"
    // InternalShome.g:1543:1: rule__DifferedBarrier__Group__2 : rule__DifferedBarrier__Group__2__Impl rule__DifferedBarrier__Group__3 ;
    public final void rule__DifferedBarrier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1547:1: ( rule__DifferedBarrier__Group__2__Impl rule__DifferedBarrier__Group__3 )
            // InternalShome.g:1548:2: rule__DifferedBarrier__Group__2__Impl rule__DifferedBarrier__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__DifferedBarrier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__2"


    // $ANTLR start "rule__DifferedBarrier__Group__2__Impl"
    // InternalShome.g:1555:1: rule__DifferedBarrier__Group__2__Impl : ( 'then' ) ;
    public final void rule__DifferedBarrier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1559:1: ( ( 'then' ) )
            // InternalShome.g:1560:1: ( 'then' )
            {
            // InternalShome.g:1560:1: ( 'then' )
            // InternalShome.g:1561:2: 'then'
            {
             before(grammarAccess.getDifferedBarrierAccess().getThenKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDifferedBarrierAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__2__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__3"
    // InternalShome.g:1570:1: rule__DifferedBarrier__Group__3 : rule__DifferedBarrier__Group__3__Impl rule__DifferedBarrier__Group__4 ;
    public final void rule__DifferedBarrier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1574:1: ( rule__DifferedBarrier__Group__3__Impl rule__DifferedBarrier__Group__4 )
            // InternalShome.g:1575:2: rule__DifferedBarrier__Group__3__Impl rule__DifferedBarrier__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DifferedBarrier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__3"


    // $ANTLR start "rule__DifferedBarrier__Group__3__Impl"
    // InternalShome.g:1582:1: rule__DifferedBarrier__Group__3__Impl : ( 'after' ) ;
    public final void rule__DifferedBarrier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1586:1: ( ( 'after' ) )
            // InternalShome.g:1587:1: ( 'after' )
            {
            // InternalShome.g:1587:1: ( 'after' )
            // InternalShome.g:1588:2: 'after'
            {
             before(grammarAccess.getDifferedBarrierAccess().getAfterKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDifferedBarrierAccess().getAfterKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__3__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__4"
    // InternalShome.g:1597:1: rule__DifferedBarrier__Group__4 : rule__DifferedBarrier__Group__4__Impl rule__DifferedBarrier__Group__5 ;
    public final void rule__DifferedBarrier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1601:1: ( rule__DifferedBarrier__Group__4__Impl rule__DifferedBarrier__Group__5 )
            // InternalShome.g:1602:2: rule__DifferedBarrier__Group__4__Impl rule__DifferedBarrier__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__DifferedBarrier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__4"


    // $ANTLR start "rule__DifferedBarrier__Group__4__Impl"
    // InternalShome.g:1609:1: rule__DifferedBarrier__Group__4__Impl : ( ( rule__DifferedBarrier__TriggerAfterAssignment_4 ) ) ;
    public final void rule__DifferedBarrier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1613:1: ( ( ( rule__DifferedBarrier__TriggerAfterAssignment_4 ) ) )
            // InternalShome.g:1614:1: ( ( rule__DifferedBarrier__TriggerAfterAssignment_4 ) )
            {
            // InternalShome.g:1614:1: ( ( rule__DifferedBarrier__TriggerAfterAssignment_4 ) )
            // InternalShome.g:1615:2: ( rule__DifferedBarrier__TriggerAfterAssignment_4 )
            {
             before(grammarAccess.getDifferedBarrierAccess().getTriggerAfterAssignment_4()); 
            // InternalShome.g:1616:2: ( rule__DifferedBarrier__TriggerAfterAssignment_4 )
            // InternalShome.g:1616:3: rule__DifferedBarrier__TriggerAfterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__TriggerAfterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDifferedBarrierAccess().getTriggerAfterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__4__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__5"
    // InternalShome.g:1624:1: rule__DifferedBarrier__Group__5 : rule__DifferedBarrier__Group__5__Impl rule__DifferedBarrier__Group__6 ;
    public final void rule__DifferedBarrier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1628:1: ( rule__DifferedBarrier__Group__5__Impl rule__DifferedBarrier__Group__6 )
            // InternalShome.g:1629:2: rule__DifferedBarrier__Group__5__Impl rule__DifferedBarrier__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DifferedBarrier__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__5"


    // $ANTLR start "rule__DifferedBarrier__Group__5__Impl"
    // InternalShome.g:1636:1: rule__DifferedBarrier__Group__5__Impl : ( 'trigger' ) ;
    public final void rule__DifferedBarrier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1640:1: ( ( 'trigger' ) )
            // InternalShome.g:1641:1: ( 'trigger' )
            {
            // InternalShome.g:1641:1: ( 'trigger' )
            // InternalShome.g:1642:2: 'trigger'
            {
             before(grammarAccess.getDifferedBarrierAccess().getTriggerKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDifferedBarrierAccess().getTriggerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__5__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__6"
    // InternalShome.g:1651:1: rule__DifferedBarrier__Group__6 : rule__DifferedBarrier__Group__6__Impl rule__DifferedBarrier__Group__7 ;
    public final void rule__DifferedBarrier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1655:1: ( rule__DifferedBarrier__Group__6__Impl rule__DifferedBarrier__Group__7 )
            // InternalShome.g:1656:2: rule__DifferedBarrier__Group__6__Impl rule__DifferedBarrier__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__DifferedBarrier__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__6"


    // $ANTLR start "rule__DifferedBarrier__Group__6__Impl"
    // InternalShome.g:1663:1: rule__DifferedBarrier__Group__6__Impl : ( ( rule__DifferedBarrier__ActionsAssignment_6 ) ) ;
    public final void rule__DifferedBarrier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1667:1: ( ( ( rule__DifferedBarrier__ActionsAssignment_6 ) ) )
            // InternalShome.g:1668:1: ( ( rule__DifferedBarrier__ActionsAssignment_6 ) )
            {
            // InternalShome.g:1668:1: ( ( rule__DifferedBarrier__ActionsAssignment_6 ) )
            // InternalShome.g:1669:2: ( rule__DifferedBarrier__ActionsAssignment_6 )
            {
             before(grammarAccess.getDifferedBarrierAccess().getActionsAssignment_6()); 
            // InternalShome.g:1670:2: ( rule__DifferedBarrier__ActionsAssignment_6 )
            // InternalShome.g:1670:3: rule__DifferedBarrier__ActionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__ActionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDifferedBarrierAccess().getActionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__6__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group__7"
    // InternalShome.g:1678:1: rule__DifferedBarrier__Group__7 : rule__DifferedBarrier__Group__7__Impl ;
    public final void rule__DifferedBarrier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1682:1: ( rule__DifferedBarrier__Group__7__Impl )
            // InternalShome.g:1683:2: rule__DifferedBarrier__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__7"


    // $ANTLR start "rule__DifferedBarrier__Group__7__Impl"
    // InternalShome.g:1689:1: rule__DifferedBarrier__Group__7__Impl : ( ( rule__DifferedBarrier__Group_7__0 )* ) ;
    public final void rule__DifferedBarrier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1693:1: ( ( ( rule__DifferedBarrier__Group_7__0 )* ) )
            // InternalShome.g:1694:1: ( ( rule__DifferedBarrier__Group_7__0 )* )
            {
            // InternalShome.g:1694:1: ( ( rule__DifferedBarrier__Group_7__0 )* )
            // InternalShome.g:1695:2: ( rule__DifferedBarrier__Group_7__0 )*
            {
             before(grammarAccess.getDifferedBarrierAccess().getGroup_7()); 
            // InternalShome.g:1696:2: ( rule__DifferedBarrier__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalShome.g:1696:3: rule__DifferedBarrier__Group_7__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DifferedBarrier__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDifferedBarrierAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group__7__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group_7__0"
    // InternalShome.g:1705:1: rule__DifferedBarrier__Group_7__0 : rule__DifferedBarrier__Group_7__0__Impl rule__DifferedBarrier__Group_7__1 ;
    public final void rule__DifferedBarrier__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1709:1: ( rule__DifferedBarrier__Group_7__0__Impl rule__DifferedBarrier__Group_7__1 )
            // InternalShome.g:1710:2: rule__DifferedBarrier__Group_7__0__Impl rule__DifferedBarrier__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__DifferedBarrier__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group_7__0"


    // $ANTLR start "rule__DifferedBarrier__Group_7__0__Impl"
    // InternalShome.g:1717:1: rule__DifferedBarrier__Group_7__0__Impl : ( 'and' ) ;
    public final void rule__DifferedBarrier__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1721:1: ( ( 'and' ) )
            // InternalShome.g:1722:1: ( 'and' )
            {
            // InternalShome.g:1722:1: ( 'and' )
            // InternalShome.g:1723:2: 'and'
            {
             before(grammarAccess.getDifferedBarrierAccess().getAndKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDifferedBarrierAccess().getAndKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group_7__0__Impl"


    // $ANTLR start "rule__DifferedBarrier__Group_7__1"
    // InternalShome.g:1732:1: rule__DifferedBarrier__Group_7__1 : rule__DifferedBarrier__Group_7__1__Impl ;
    public final void rule__DifferedBarrier__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1736:1: ( rule__DifferedBarrier__Group_7__1__Impl )
            // InternalShome.g:1737:2: rule__DifferedBarrier__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group_7__1"


    // $ANTLR start "rule__DifferedBarrier__Group_7__1__Impl"
    // InternalShome.g:1743:1: rule__DifferedBarrier__Group_7__1__Impl : ( ( rule__DifferedBarrier__ActionsAssignment_7_1 ) ) ;
    public final void rule__DifferedBarrier__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1747:1: ( ( ( rule__DifferedBarrier__ActionsAssignment_7_1 ) ) )
            // InternalShome.g:1748:1: ( ( rule__DifferedBarrier__ActionsAssignment_7_1 ) )
            {
            // InternalShome.g:1748:1: ( ( rule__DifferedBarrier__ActionsAssignment_7_1 ) )
            // InternalShome.g:1749:2: ( rule__DifferedBarrier__ActionsAssignment_7_1 )
            {
             before(grammarAccess.getDifferedBarrierAccess().getActionsAssignment_7_1()); 
            // InternalShome.g:1750:2: ( rule__DifferedBarrier__ActionsAssignment_7_1 )
            // InternalShome.g:1750:3: rule__DifferedBarrier__ActionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DifferedBarrier__ActionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDifferedBarrierAccess().getActionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__Group_7__1__Impl"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__0"
    // InternalShome.g:1759:1: rule__TimeEleapsedCondition__Group__0 : rule__TimeEleapsedCondition__Group__0__Impl rule__TimeEleapsedCondition__Group__1 ;
    public final void rule__TimeEleapsedCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1763:1: ( rule__TimeEleapsedCondition__Group__0__Impl rule__TimeEleapsedCondition__Group__1 )
            // InternalShome.g:1764:2: rule__TimeEleapsedCondition__Group__0__Impl rule__TimeEleapsedCondition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__TimeEleapsedCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__0"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__0__Impl"
    // InternalShome.g:1771:1: rule__TimeEleapsedCondition__Group__0__Impl : ( ( rule__TimeEleapsedCondition__Group_0__0 )? ) ;
    public final void rule__TimeEleapsedCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1775:1: ( ( ( rule__TimeEleapsedCondition__Group_0__0 )? ) )
            // InternalShome.g:1776:1: ( ( rule__TimeEleapsedCondition__Group_0__0 )? )
            {
            // InternalShome.g:1776:1: ( ( rule__TimeEleapsedCondition__Group_0__0 )? )
            // InternalShome.g:1777:2: ( rule__TimeEleapsedCondition__Group_0__0 )?
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getGroup_0()); 
            // InternalShome.g:1778:2: ( rule__TimeEleapsedCondition__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==20) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==20) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalShome.g:1778:3: rule__TimeEleapsedCondition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TimeEleapsedCondition__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__0__Impl"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__1"
    // InternalShome.g:1786:1: rule__TimeEleapsedCondition__Group__1 : rule__TimeEleapsedCondition__Group__1__Impl rule__TimeEleapsedCondition__Group__2 ;
    public final void rule__TimeEleapsedCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1790:1: ( rule__TimeEleapsedCondition__Group__1__Impl rule__TimeEleapsedCondition__Group__2 )
            // InternalShome.g:1791:2: rule__TimeEleapsedCondition__Group__1__Impl rule__TimeEleapsedCondition__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__TimeEleapsedCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__1"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__1__Impl"
    // InternalShome.g:1798:1: rule__TimeEleapsedCondition__Group__1__Impl : ( ( rule__TimeEleapsedCondition__ActionAssignment_1 ) ) ;
    public final void rule__TimeEleapsedCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1802:1: ( ( ( rule__TimeEleapsedCondition__ActionAssignment_1 ) ) )
            // InternalShome.g:1803:1: ( ( rule__TimeEleapsedCondition__ActionAssignment_1 ) )
            {
            // InternalShome.g:1803:1: ( ( rule__TimeEleapsedCondition__ActionAssignment_1 ) )
            // InternalShome.g:1804:2: ( rule__TimeEleapsedCondition__ActionAssignment_1 )
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getActionAssignment_1()); 
            // InternalShome.g:1805:2: ( rule__TimeEleapsedCondition__ActionAssignment_1 )
            // InternalShome.g:1805:3: rule__TimeEleapsedCondition__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__1__Impl"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__2"
    // InternalShome.g:1813:1: rule__TimeEleapsedCondition__Group__2 : rule__TimeEleapsedCondition__Group__2__Impl rule__TimeEleapsedCondition__Group__3 ;
    public final void rule__TimeEleapsedCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1817:1: ( rule__TimeEleapsedCondition__Group__2__Impl rule__TimeEleapsedCondition__Group__3 )
            // InternalShome.g:1818:2: rule__TimeEleapsedCondition__Group__2__Impl rule__TimeEleapsedCondition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__TimeEleapsedCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__2"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__2__Impl"
    // InternalShome.g:1825:1: rule__TimeEleapsedCondition__Group__2__Impl : ( 'during' ) ;
    public final void rule__TimeEleapsedCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1829:1: ( ( 'during' ) )
            // InternalShome.g:1830:1: ( 'during' )
            {
            // InternalShome.g:1830:1: ( 'during' )
            // InternalShome.g:1831:2: 'during'
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getDuringKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTimeEleapsedConditionAccess().getDuringKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__2__Impl"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__3"
    // InternalShome.g:1840:1: rule__TimeEleapsedCondition__Group__3 : rule__TimeEleapsedCondition__Group__3__Impl ;
    public final void rule__TimeEleapsedCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1844:1: ( rule__TimeEleapsedCondition__Group__3__Impl )
            // InternalShome.g:1845:2: rule__TimeEleapsedCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__3"


    // $ANTLR start "rule__TimeEleapsedCondition__Group__3__Impl"
    // InternalShome.g:1851:1: rule__TimeEleapsedCondition__Group__3__Impl : ( ( rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 ) ) ;
    public final void rule__TimeEleapsedCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1855:1: ( ( ( rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 ) ) )
            // InternalShome.g:1856:1: ( ( rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 ) )
            {
            // InternalShome.g:1856:1: ( ( rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 ) )
            // InternalShome.g:1857:2: ( rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 )
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getOwnedTimestampEleapsedAssignment_3()); 
            // InternalShome.g:1858:2: ( rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 )
            // InternalShome.g:1858:3: rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getOwnedTimestampEleapsedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group__3__Impl"


    // $ANTLR start "rule__TimeEleapsedCondition__Group_0__0"
    // InternalShome.g:1867:1: rule__TimeEleapsedCondition__Group_0__0 : rule__TimeEleapsedCondition__Group_0__0__Impl rule__TimeEleapsedCondition__Group_0__1 ;
    public final void rule__TimeEleapsedCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1871:1: ( rule__TimeEleapsedCondition__Group_0__0__Impl rule__TimeEleapsedCondition__Group_0__1 )
            // InternalShome.g:1872:2: rule__TimeEleapsedCondition__Group_0__0__Impl rule__TimeEleapsedCondition__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__TimeEleapsedCondition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group_0__0"


    // $ANTLR start "rule__TimeEleapsedCondition__Group_0__0__Impl"
    // InternalShome.g:1879:1: rule__TimeEleapsedCondition__Group_0__0__Impl : ( ( rule__TimeEleapsedCondition__ActorAssignment_0_0 ) ) ;
    public final void rule__TimeEleapsedCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1883:1: ( ( ( rule__TimeEleapsedCondition__ActorAssignment_0_0 ) ) )
            // InternalShome.g:1884:1: ( ( rule__TimeEleapsedCondition__ActorAssignment_0_0 ) )
            {
            // InternalShome.g:1884:1: ( ( rule__TimeEleapsedCondition__ActorAssignment_0_0 ) )
            // InternalShome.g:1885:2: ( rule__TimeEleapsedCondition__ActorAssignment_0_0 )
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getActorAssignment_0_0()); 
            // InternalShome.g:1886:2: ( rule__TimeEleapsedCondition__ActorAssignment_0_0 )
            // InternalShome.g:1886:3: rule__TimeEleapsedCondition__ActorAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__ActorAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getActorAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group_0__0__Impl"


    // $ANTLR start "rule__TimeEleapsedCondition__Group_0__1"
    // InternalShome.g:1894:1: rule__TimeEleapsedCondition__Group_0__1 : rule__TimeEleapsedCondition__Group_0__1__Impl ;
    public final void rule__TimeEleapsedCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1898:1: ( rule__TimeEleapsedCondition__Group_0__1__Impl )
            // InternalShome.g:1899:2: rule__TimeEleapsedCondition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeEleapsedCondition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group_0__1"


    // $ANTLR start "rule__TimeEleapsedCondition__Group_0__1__Impl"
    // InternalShome.g:1905:1: rule__TimeEleapsedCondition__Group_0__1__Impl : ( 'do' ) ;
    public final void rule__TimeEleapsedCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1909:1: ( ( 'do' ) )
            // InternalShome.g:1910:1: ( 'do' )
            {
            // InternalShome.g:1910:1: ( 'do' )
            // InternalShome.g:1911:2: 'do'
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getDoKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTimeEleapsedConditionAccess().getDoKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalShome.g:1921:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1925:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalShome.g:1926:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalShome.g:1933:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__Group_0__0 )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1937:1: ( ( ( rule__Condition__Group_0__0 )? ) )
            // InternalShome.g:1938:1: ( ( rule__Condition__Group_0__0 )? )
            {
            // InternalShome.g:1938:1: ( ( rule__Condition__Group_0__0 )? )
            // InternalShome.g:1939:2: ( rule__Condition__Group_0__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_0()); 
            // InternalShome.g:1940:2: ( rule__Condition__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==20) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==RULE_ID) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==20) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalShome.g:1940:3: rule__Condition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalShome.g:1948:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1952:1: ( rule__Condition__Group__1__Impl )
            // InternalShome.g:1953:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalShome.g:1959:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ActionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1963:1: ( ( ( rule__Condition__ActionAssignment_1 ) ) )
            // InternalShome.g:1964:1: ( ( rule__Condition__ActionAssignment_1 ) )
            {
            // InternalShome.g:1964:1: ( ( rule__Condition__ActionAssignment_1 ) )
            // InternalShome.g:1965:2: ( rule__Condition__ActionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getActionAssignment_1()); 
            // InternalShome.g:1966:2: ( rule__Condition__ActionAssignment_1 )
            // InternalShome.g:1966:3: rule__Condition__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalShome.g:1975:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1979:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalShome.g:1980:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // InternalShome.g:1987:1: rule__Condition__Group_0__0__Impl : ( ( rule__Condition__ActorAssignment_0_0 ) ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:1991:1: ( ( ( rule__Condition__ActorAssignment_0_0 ) ) )
            // InternalShome.g:1992:1: ( ( rule__Condition__ActorAssignment_0_0 ) )
            {
            // InternalShome.g:1992:1: ( ( rule__Condition__ActorAssignment_0_0 ) )
            // InternalShome.g:1993:2: ( rule__Condition__ActorAssignment_0_0 )
            {
             before(grammarAccess.getConditionAccess().getActorAssignment_0_0()); 
            // InternalShome.g:1994:2: ( rule__Condition__ActorAssignment_0_0 )
            // InternalShome.g:1994:3: rule__Condition__ActorAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ActorAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getActorAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // InternalShome.g:2002:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2006:1: ( rule__Condition__Group_0__1__Impl )
            // InternalShome.g:2007:2: rule__Condition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // InternalShome.g:2013:1: rule__Condition__Group_0__1__Impl : ( 'do' ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2017:1: ( ( 'do' ) )
            // InternalShome.g:2018:1: ( 'do' )
            {
            // InternalShome.g:2018:1: ( 'do' )
            // InternalShome.g:2019:2: 'do'
            {
             before(grammarAccess.getConditionAccess().getDoKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getDoKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__ComposeCondition__Group__0"
    // InternalShome.g:2029:1: rule__ComposeCondition__Group__0 : rule__ComposeCondition__Group__0__Impl rule__ComposeCondition__Group__1 ;
    public final void rule__ComposeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2033:1: ( rule__ComposeCondition__Group__0__Impl rule__ComposeCondition__Group__1 )
            // InternalShome.g:2034:2: rule__ComposeCondition__Group__0__Impl rule__ComposeCondition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ComposeCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__0"


    // $ANTLR start "rule__ComposeCondition__Group__0__Impl"
    // InternalShome.g:2041:1: rule__ComposeCondition__Group__0__Impl : ( ( rule__ComposeCondition__OwnedConditionsAssignment_0 ) ) ;
    public final void rule__ComposeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2045:1: ( ( ( rule__ComposeCondition__OwnedConditionsAssignment_0 ) ) )
            // InternalShome.g:2046:1: ( ( rule__ComposeCondition__OwnedConditionsAssignment_0 ) )
            {
            // InternalShome.g:2046:1: ( ( rule__ComposeCondition__OwnedConditionsAssignment_0 ) )
            // InternalShome.g:2047:2: ( rule__ComposeCondition__OwnedConditionsAssignment_0 )
            {
             before(grammarAccess.getComposeConditionAccess().getOwnedConditionsAssignment_0()); 
            // InternalShome.g:2048:2: ( rule__ComposeCondition__OwnedConditionsAssignment_0 )
            // InternalShome.g:2048:3: rule__ComposeCondition__OwnedConditionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComposeCondition__OwnedConditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComposeConditionAccess().getOwnedConditionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__0__Impl"


    // $ANTLR start "rule__ComposeCondition__Group__1"
    // InternalShome.g:2056:1: rule__ComposeCondition__Group__1 : rule__ComposeCondition__Group__1__Impl rule__ComposeCondition__Group__2 ;
    public final void rule__ComposeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2060:1: ( rule__ComposeCondition__Group__1__Impl rule__ComposeCondition__Group__2 )
            // InternalShome.g:2061:2: rule__ComposeCondition__Group__1__Impl rule__ComposeCondition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ComposeCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__1"


    // $ANTLR start "rule__ComposeCondition__Group__1__Impl"
    // InternalShome.g:2068:1: rule__ComposeCondition__Group__1__Impl : ( 'and' ) ;
    public final void rule__ComposeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2072:1: ( ( 'and' ) )
            // InternalShome.g:2073:1: ( 'and' )
            {
            // InternalShome.g:2073:1: ( 'and' )
            // InternalShome.g:2074:2: 'and'
            {
             before(grammarAccess.getComposeConditionAccess().getAndKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComposeConditionAccess().getAndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__1__Impl"


    // $ANTLR start "rule__ComposeCondition__Group__2"
    // InternalShome.g:2083:1: rule__ComposeCondition__Group__2 : rule__ComposeCondition__Group__2__Impl rule__ComposeCondition__Group__3 ;
    public final void rule__ComposeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2087:1: ( rule__ComposeCondition__Group__2__Impl rule__ComposeCondition__Group__3 )
            // InternalShome.g:2088:2: rule__ComposeCondition__Group__2__Impl rule__ComposeCondition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ComposeCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__2"


    // $ANTLR start "rule__ComposeCondition__Group__2__Impl"
    // InternalShome.g:2095:1: rule__ComposeCondition__Group__2__Impl : ( ( rule__ComposeCondition__OwnedConditionsAssignment_2 ) ) ;
    public final void rule__ComposeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2099:1: ( ( ( rule__ComposeCondition__OwnedConditionsAssignment_2 ) ) )
            // InternalShome.g:2100:1: ( ( rule__ComposeCondition__OwnedConditionsAssignment_2 ) )
            {
            // InternalShome.g:2100:1: ( ( rule__ComposeCondition__OwnedConditionsAssignment_2 ) )
            // InternalShome.g:2101:2: ( rule__ComposeCondition__OwnedConditionsAssignment_2 )
            {
             before(grammarAccess.getComposeConditionAccess().getOwnedConditionsAssignment_2()); 
            // InternalShome.g:2102:2: ( rule__ComposeCondition__OwnedConditionsAssignment_2 )
            // InternalShome.g:2102:3: rule__ComposeCondition__OwnedConditionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComposeCondition__OwnedConditionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComposeConditionAccess().getOwnedConditionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__2__Impl"


    // $ANTLR start "rule__ComposeCondition__Group__3"
    // InternalShome.g:2110:1: rule__ComposeCondition__Group__3 : rule__ComposeCondition__Group__3__Impl ;
    public final void rule__ComposeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2114:1: ( rule__ComposeCondition__Group__3__Impl )
            // InternalShome.g:2115:2: rule__ComposeCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__3"


    // $ANTLR start "rule__ComposeCondition__Group__3__Impl"
    // InternalShome.g:2121:1: rule__ComposeCondition__Group__3__Impl : ( ( rule__ComposeCondition__Group_3__0 )* ) ;
    public final void rule__ComposeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2125:1: ( ( ( rule__ComposeCondition__Group_3__0 )* ) )
            // InternalShome.g:2126:1: ( ( rule__ComposeCondition__Group_3__0 )* )
            {
            // InternalShome.g:2126:1: ( ( rule__ComposeCondition__Group_3__0 )* )
            // InternalShome.g:2127:2: ( rule__ComposeCondition__Group_3__0 )*
            {
             before(grammarAccess.getComposeConditionAccess().getGroup_3()); 
            // InternalShome.g:2128:2: ( rule__ComposeCondition__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalShome.g:2128:3: rule__ComposeCondition__Group_3__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ComposeCondition__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComposeConditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group__3__Impl"


    // $ANTLR start "rule__ComposeCondition__Group_3__0"
    // InternalShome.g:2137:1: rule__ComposeCondition__Group_3__0 : rule__ComposeCondition__Group_3__0__Impl rule__ComposeCondition__Group_3__1 ;
    public final void rule__ComposeCondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2141:1: ( rule__ComposeCondition__Group_3__0__Impl rule__ComposeCondition__Group_3__1 )
            // InternalShome.g:2142:2: rule__ComposeCondition__Group_3__0__Impl rule__ComposeCondition__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComposeCondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group_3__0"


    // $ANTLR start "rule__ComposeCondition__Group_3__0__Impl"
    // InternalShome.g:2149:1: rule__ComposeCondition__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__ComposeCondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2153:1: ( ( 'and' ) )
            // InternalShome.g:2154:1: ( 'and' )
            {
            // InternalShome.g:2154:1: ( 'and' )
            // InternalShome.g:2155:2: 'and'
            {
             before(grammarAccess.getComposeConditionAccess().getAndKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComposeConditionAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group_3__0__Impl"


    // $ANTLR start "rule__ComposeCondition__Group_3__1"
    // InternalShome.g:2164:1: rule__ComposeCondition__Group_3__1 : rule__ComposeCondition__Group_3__1__Impl ;
    public final void rule__ComposeCondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2168:1: ( rule__ComposeCondition__Group_3__1__Impl )
            // InternalShome.g:2169:2: rule__ComposeCondition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComposeCondition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group_3__1"


    // $ANTLR start "rule__ComposeCondition__Group_3__1__Impl"
    // InternalShome.g:2175:1: rule__ComposeCondition__Group_3__1__Impl : ( ( rule__ComposeCondition__OwnedConditionsAssignment_3_1 ) ) ;
    public final void rule__ComposeCondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2179:1: ( ( ( rule__ComposeCondition__OwnedConditionsAssignment_3_1 ) ) )
            // InternalShome.g:2180:1: ( ( rule__ComposeCondition__OwnedConditionsAssignment_3_1 ) )
            {
            // InternalShome.g:2180:1: ( ( rule__ComposeCondition__OwnedConditionsAssignment_3_1 ) )
            // InternalShome.g:2181:2: ( rule__ComposeCondition__OwnedConditionsAssignment_3_1 )
            {
             before(grammarAccess.getComposeConditionAccess().getOwnedConditionsAssignment_3_1()); 
            // InternalShome.g:2182:2: ( rule__ComposeCondition__OwnedConditionsAssignment_3_1 )
            // InternalShome.g:2182:3: rule__ComposeCondition__OwnedConditionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComposeCondition__OwnedConditionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComposeConditionAccess().getOwnedConditionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__Group_3__1__Impl"


    // $ANTLR start "rule__HomeTimeStamp__Group__0"
    // InternalShome.g:2191:1: rule__HomeTimeStamp__Group__0 : rule__HomeTimeStamp__Group__0__Impl rule__HomeTimeStamp__Group__1 ;
    public final void rule__HomeTimeStamp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2195:1: ( rule__HomeTimeStamp__Group__0__Impl rule__HomeTimeStamp__Group__1 )
            // InternalShome.g:2196:2: rule__HomeTimeStamp__Group__0__Impl rule__HomeTimeStamp__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__HomeTimeStamp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__0"


    // $ANTLR start "rule__HomeTimeStamp__Group__0__Impl"
    // InternalShome.g:2203:1: rule__HomeTimeStamp__Group__0__Impl : ( ( rule__HomeTimeStamp__HourAssignment_0 ) ) ;
    public final void rule__HomeTimeStamp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2207:1: ( ( ( rule__HomeTimeStamp__HourAssignment_0 ) ) )
            // InternalShome.g:2208:1: ( ( rule__HomeTimeStamp__HourAssignment_0 ) )
            {
            // InternalShome.g:2208:1: ( ( rule__HomeTimeStamp__HourAssignment_0 ) )
            // InternalShome.g:2209:2: ( rule__HomeTimeStamp__HourAssignment_0 )
            {
             before(grammarAccess.getHomeTimeStampAccess().getHourAssignment_0()); 
            // InternalShome.g:2210:2: ( rule__HomeTimeStamp__HourAssignment_0 )
            // InternalShome.g:2210:3: rule__HomeTimeStamp__HourAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__HourAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHomeTimeStampAccess().getHourAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__0__Impl"


    // $ANTLR start "rule__HomeTimeStamp__Group__1"
    // InternalShome.g:2218:1: rule__HomeTimeStamp__Group__1 : rule__HomeTimeStamp__Group__1__Impl rule__HomeTimeStamp__Group__2 ;
    public final void rule__HomeTimeStamp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2222:1: ( rule__HomeTimeStamp__Group__1__Impl rule__HomeTimeStamp__Group__2 )
            // InternalShome.g:2223:2: rule__HomeTimeStamp__Group__1__Impl rule__HomeTimeStamp__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__HomeTimeStamp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__1"


    // $ANTLR start "rule__HomeTimeStamp__Group__1__Impl"
    // InternalShome.g:2230:1: rule__HomeTimeStamp__Group__1__Impl : ( ':' ) ;
    public final void rule__HomeTimeStamp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2234:1: ( ( ':' ) )
            // InternalShome.g:2235:1: ( ':' )
            {
            // InternalShome.g:2235:1: ( ':' )
            // InternalShome.g:2236:2: ':'
            {
             before(grammarAccess.getHomeTimeStampAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHomeTimeStampAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__1__Impl"


    // $ANTLR start "rule__HomeTimeStamp__Group__2"
    // InternalShome.g:2245:1: rule__HomeTimeStamp__Group__2 : rule__HomeTimeStamp__Group__2__Impl rule__HomeTimeStamp__Group__3 ;
    public final void rule__HomeTimeStamp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2249:1: ( rule__HomeTimeStamp__Group__2__Impl rule__HomeTimeStamp__Group__3 )
            // InternalShome.g:2250:2: rule__HomeTimeStamp__Group__2__Impl rule__HomeTimeStamp__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__HomeTimeStamp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__2"


    // $ANTLR start "rule__HomeTimeStamp__Group__2__Impl"
    // InternalShome.g:2257:1: rule__HomeTimeStamp__Group__2__Impl : ( ( rule__HomeTimeStamp__MinAssignment_2 ) ) ;
    public final void rule__HomeTimeStamp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2261:1: ( ( ( rule__HomeTimeStamp__MinAssignment_2 ) ) )
            // InternalShome.g:2262:1: ( ( rule__HomeTimeStamp__MinAssignment_2 ) )
            {
            // InternalShome.g:2262:1: ( ( rule__HomeTimeStamp__MinAssignment_2 ) )
            // InternalShome.g:2263:2: ( rule__HomeTimeStamp__MinAssignment_2 )
            {
             before(grammarAccess.getHomeTimeStampAccess().getMinAssignment_2()); 
            // InternalShome.g:2264:2: ( rule__HomeTimeStamp__MinAssignment_2 )
            // InternalShome.g:2264:3: rule__HomeTimeStamp__MinAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__MinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeTimeStampAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__2__Impl"


    // $ANTLR start "rule__HomeTimeStamp__Group__3"
    // InternalShome.g:2272:1: rule__HomeTimeStamp__Group__3 : rule__HomeTimeStamp__Group__3__Impl rule__HomeTimeStamp__Group__4 ;
    public final void rule__HomeTimeStamp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2276:1: ( rule__HomeTimeStamp__Group__3__Impl rule__HomeTimeStamp__Group__4 )
            // InternalShome.g:2277:2: rule__HomeTimeStamp__Group__3__Impl rule__HomeTimeStamp__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__HomeTimeStamp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__3"


    // $ANTLR start "rule__HomeTimeStamp__Group__3__Impl"
    // InternalShome.g:2284:1: rule__HomeTimeStamp__Group__3__Impl : ( ':' ) ;
    public final void rule__HomeTimeStamp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2288:1: ( ( ':' ) )
            // InternalShome.g:2289:1: ( ':' )
            {
            // InternalShome.g:2289:1: ( ':' )
            // InternalShome.g:2290:2: ':'
            {
             before(grammarAccess.getHomeTimeStampAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHomeTimeStampAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__3__Impl"


    // $ANTLR start "rule__HomeTimeStamp__Group__4"
    // InternalShome.g:2299:1: rule__HomeTimeStamp__Group__4 : rule__HomeTimeStamp__Group__4__Impl ;
    public final void rule__HomeTimeStamp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2303:1: ( rule__HomeTimeStamp__Group__4__Impl )
            // InternalShome.g:2304:2: rule__HomeTimeStamp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__4"


    // $ANTLR start "rule__HomeTimeStamp__Group__4__Impl"
    // InternalShome.g:2310:1: rule__HomeTimeStamp__Group__4__Impl : ( ( rule__HomeTimeStamp__SecAssignment_4 ) ) ;
    public final void rule__HomeTimeStamp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2314:1: ( ( ( rule__HomeTimeStamp__SecAssignment_4 ) ) )
            // InternalShome.g:2315:1: ( ( rule__HomeTimeStamp__SecAssignment_4 ) )
            {
            // InternalShome.g:2315:1: ( ( rule__HomeTimeStamp__SecAssignment_4 ) )
            // InternalShome.g:2316:2: ( rule__HomeTimeStamp__SecAssignment_4 )
            {
             before(grammarAccess.getHomeTimeStampAccess().getSecAssignment_4()); 
            // InternalShome.g:2317:2: ( rule__HomeTimeStamp__SecAssignment_4 )
            // InternalShome.g:2317:3: rule__HomeTimeStamp__SecAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HomeTimeStamp__SecAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHomeTimeStampAccess().getSecAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalShome.g:2326:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2330:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalShome.g:2331:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalShome.g:2338:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2342:1: ( ( () ) )
            // InternalShome.g:2343:1: ( () )
            {
            // InternalShome.g:2343:1: ( () )
            // InternalShome.g:2344:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalShome.g:2345:2: ()
            // InternalShome.g:2345:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalShome.g:2353:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2357:1: ( rule__Action__Group__1__Impl )
            // InternalShome.g:2358:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalShome.g:2364:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2368:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalShome.g:2369:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalShome.g:2369:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalShome.g:2370:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalShome.g:2371:2: ( rule__Action__NameAssignment_1 )
            // InternalShome.g:2371:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Home__OwnedSubjectsAssignment_3"
    // InternalShome.g:2380:1: rule__Home__OwnedSubjectsAssignment_3 : ( ruleSubject ) ;
    public final void rule__Home__OwnedSubjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2384:1: ( ( ruleSubject ) )
            // InternalShome.g:2385:2: ( ruleSubject )
            {
            // InternalShome.g:2385:2: ( ruleSubject )
            // InternalShome.g:2386:3: ruleSubject
            {
             before(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedSubjectsAssignment_3"


    // $ANTLR start "rule__Home__OwnedSubjectsAssignment_4"
    // InternalShome.g:2395:1: rule__Home__OwnedSubjectsAssignment_4 : ( ruleSubject ) ;
    public final void rule__Home__OwnedSubjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2399:1: ( ( ruleSubject ) )
            // InternalShome.g:2400:2: ( ruleSubject )
            {
            // InternalShome.g:2400:2: ( ruleSubject )
            // InternalShome.g:2401:3: ruleSubject
            {
             before(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedSubjectsSubjectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedSubjectsAssignment_4"


    // $ANTLR start "rule__Home__OwnedActorsAssignment_5"
    // InternalShome.g:2410:1: rule__Home__OwnedActorsAssignment_5 : ( ruleActor ) ;
    public final void rule__Home__OwnedActorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2414:1: ( ( ruleActor ) )
            // InternalShome.g:2415:2: ( ruleActor )
            {
            // InternalShome.g:2415:2: ( ruleActor )
            // InternalShome.g:2416:3: ruleActor
            {
             before(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedActorsActorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedActorsAssignment_5"


    // $ANTLR start "rule__Home__OwnedBarrierAssignment_6"
    // InternalShome.g:2425:1: rule__Home__OwnedBarrierAssignment_6 : ( ruleABarrier ) ;
    public final void rule__Home__OwnedBarrierAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2429:1: ( ( ruleABarrier ) )
            // InternalShome.g:2430:2: ( ruleABarrier )
            {
            // InternalShome.g:2430:2: ( ruleABarrier )
            // InternalShome.g:2431:3: ruleABarrier
            {
             before(grammarAccess.getHomeAccess().getOwnedBarrierABarrierParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleABarrier();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedBarrierABarrierParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedBarrierAssignment_6"


    // $ANTLR start "rule__Home__OwnedBarrierAssignment_7"
    // InternalShome.g:2440:1: rule__Home__OwnedBarrierAssignment_7 : ( ruleABarrier ) ;
    public final void rule__Home__OwnedBarrierAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2444:1: ( ( ruleABarrier ) )
            // InternalShome.g:2445:2: ( ruleABarrier )
            {
            // InternalShome.g:2445:2: ( ruleABarrier )
            // InternalShome.g:2446:3: ruleABarrier
            {
             before(grammarAccess.getHomeAccess().getOwnedBarrierABarrierParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleABarrier();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedBarrierABarrierParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedBarrierAssignment_7"


    // $ANTLR start "rule__Home__OwnedOccurencesAssignment_8"
    // InternalShome.g:2455:1: rule__Home__OwnedOccurencesAssignment_8 : ( ruleOccurence ) ;
    public final void rule__Home__OwnedOccurencesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2459:1: ( ( ruleOccurence ) )
            // InternalShome.g:2460:2: ( ruleOccurence )
            {
            // InternalShome.g:2460:2: ( ruleOccurence )
            // InternalShome.g:2461:3: ruleOccurence
            {
             before(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleOccurence();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedOccurencesAssignment_8"


    // $ANTLR start "rule__Home__OwnedOccurencesAssignment_9"
    // InternalShome.g:2470:1: rule__Home__OwnedOccurencesAssignment_9 : ( ruleOccurence ) ;
    public final void rule__Home__OwnedOccurencesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2474:1: ( ( ruleOccurence ) )
            // InternalShome.g:2475:2: ( ruleOccurence )
            {
            // InternalShome.g:2475:2: ( ruleOccurence )
            // InternalShome.g:2476:3: ruleOccurence
            {
             before(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleOccurence();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getOwnedOccurencesOccurenceParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__OwnedOccurencesAssignment_9"


    // $ANTLR start "rule__Subject__NameAssignment_1"
    // InternalShome.g:2485:1: rule__Subject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2489:1: ( ( ruleEString ) )
            // InternalShome.g:2490:2: ( ruleEString )
            {
            // InternalShome.g:2490:2: ( ruleEString )
            // InternalShome.g:2491:3: ruleEString
            {
             before(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__NameAssignment_1"


    // $ANTLR start "rule__Subject__OwnedActionsAssignment_4"
    // InternalShome.g:2500:1: rule__Subject__OwnedActionsAssignment_4 : ( ruleAction ) ;
    public final void rule__Subject__OwnedActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2504:1: ( ( ruleAction ) )
            // InternalShome.g:2505:2: ( ruleAction )
            {
            // InternalShome.g:2505:2: ( ruleAction )
            // InternalShome.g:2506:3: ruleAction
            {
             before(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__OwnedActionsAssignment_4"


    // $ANTLR start "rule__Subject__OwnedActionsAssignment_5_1"
    // InternalShome.g:2515:1: rule__Subject__OwnedActionsAssignment_5_1 : ( ruleAction ) ;
    public final void rule__Subject__OwnedActionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2519:1: ( ( ruleAction ) )
            // InternalShome.g:2520:2: ( ruleAction )
            {
            // InternalShome.g:2520:2: ( ruleAction )
            // InternalShome.g:2521:3: ruleAction
            {
             before(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getOwnedActionsActionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__OwnedActionsAssignment_5_1"


    // $ANTLR start "rule__Actor__NameAssignment_2"
    // InternalShome.g:2530:1: rule__Actor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Actor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2534:1: ( ( ruleEString ) )
            // InternalShome.g:2535:2: ( ruleEString )
            {
            // InternalShome.g:2535:2: ( ruleEString )
            // InternalShome.g:2536:3: ruleEString
            {
             before(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_2"


    // $ANTLR start "rule__Occurence__OwnedTimeAssignment_0"
    // InternalShome.g:2545:1: rule__Occurence__OwnedTimeAssignment_0 : ( ruleHomeTimeStamp ) ;
    public final void rule__Occurence__OwnedTimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2549:1: ( ( ruleHomeTimeStamp ) )
            // InternalShome.g:2550:2: ( ruleHomeTimeStamp )
            {
            // InternalShome.g:2550:2: ( ruleHomeTimeStamp )
            // InternalShome.g:2551:3: ruleHomeTimeStamp
            {
             before(grammarAccess.getOccurenceAccess().getOwnedTimeHomeTimeStampParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHomeTimeStamp();

            state._fsp--;

             after(grammarAccess.getOccurenceAccess().getOwnedTimeHomeTimeStampParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__OwnedTimeAssignment_0"


    // $ANTLR start "rule__Occurence__ActorAssignment_2_0"
    // InternalShome.g:2560:1: rule__Occurence__ActorAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__Occurence__ActorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2564:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2565:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2565:2: ( ( ruleEString ) )
            // InternalShome.g:2566:3: ( ruleEString )
            {
             before(grammarAccess.getOccurenceAccess().getActorActorCrossReference_2_0_0()); 
            // InternalShome.g:2567:3: ( ruleEString )
            // InternalShome.g:2568:4: ruleEString
            {
             before(grammarAccess.getOccurenceAccess().getActorActorEStringParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOccurenceAccess().getActorActorEStringParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getOccurenceAccess().getActorActorCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__ActorAssignment_2_0"


    // $ANTLR start "rule__Occurence__ActionAssignment_3"
    // InternalShome.g:2579:1: rule__Occurence__ActionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Occurence__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2583:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2584:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2584:2: ( ( ruleEString ) )
            // InternalShome.g:2585:3: ( ruleEString )
            {
             before(grammarAccess.getOccurenceAccess().getActionActionCrossReference_3_0()); 
            // InternalShome.g:2586:3: ( ruleEString )
            // InternalShome.g:2587:4: ruleEString
            {
             before(grammarAccess.getOccurenceAccess().getActionActionEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOccurenceAccess().getActionActionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOccurenceAccess().getActionActionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurence__ActionAssignment_3"


    // $ANTLR start "rule__Barrier__OwnedConditionAssignment_1"
    // InternalShome.g:2598:1: rule__Barrier__OwnedConditionAssignment_1 : ( ruleACondition ) ;
    public final void rule__Barrier__OwnedConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2602:1: ( ( ruleACondition ) )
            // InternalShome.g:2603:2: ( ruleACondition )
            {
            // InternalShome.g:2603:2: ( ruleACondition )
            // InternalShome.g:2604:3: ruleACondition
            {
             before(grammarAccess.getBarrierAccess().getOwnedConditionAConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleACondition();

            state._fsp--;

             after(grammarAccess.getBarrierAccess().getOwnedConditionAConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__OwnedConditionAssignment_1"


    // $ANTLR start "rule__Barrier__ActionsAssignment_4"
    // InternalShome.g:2613:1: rule__Barrier__ActionsAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Barrier__ActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2617:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2618:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2618:2: ( ( ruleEString ) )
            // InternalShome.g:2619:3: ( ruleEString )
            {
             before(grammarAccess.getBarrierAccess().getActionsActionCrossReference_4_0()); 
            // InternalShome.g:2620:3: ( ruleEString )
            // InternalShome.g:2621:4: ruleEString
            {
             before(grammarAccess.getBarrierAccess().getActionsActionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarrierAccess().getActionsActionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBarrierAccess().getActionsActionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__ActionsAssignment_4"


    // $ANTLR start "rule__Barrier__ActionsAssignment_5_1"
    // InternalShome.g:2632:1: rule__Barrier__ActionsAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Barrier__ActionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2636:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2637:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2637:2: ( ( ruleEString ) )
            // InternalShome.g:2638:3: ( ruleEString )
            {
             before(grammarAccess.getBarrierAccess().getActionsActionCrossReference_5_1_0()); 
            // InternalShome.g:2639:3: ( ruleEString )
            // InternalShome.g:2640:4: ruleEString
            {
             before(grammarAccess.getBarrierAccess().getActionsActionEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarrierAccess().getActionsActionEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getBarrierAccess().getActionsActionCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__ActionsAssignment_5_1"


    // $ANTLR start "rule__DifferedBarrier__OwnedConditionAssignment_1"
    // InternalShome.g:2651:1: rule__DifferedBarrier__OwnedConditionAssignment_1 : ( ruleACondition ) ;
    public final void rule__DifferedBarrier__OwnedConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2655:1: ( ( ruleACondition ) )
            // InternalShome.g:2656:2: ( ruleACondition )
            {
            // InternalShome.g:2656:2: ( ruleACondition )
            // InternalShome.g:2657:3: ruleACondition
            {
             before(grammarAccess.getDifferedBarrierAccess().getOwnedConditionAConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleACondition();

            state._fsp--;

             after(grammarAccess.getDifferedBarrierAccess().getOwnedConditionAConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__OwnedConditionAssignment_1"


    // $ANTLR start "rule__DifferedBarrier__TriggerAfterAssignment_4"
    // InternalShome.g:2666:1: rule__DifferedBarrier__TriggerAfterAssignment_4 : ( ruleHomeTimeStamp ) ;
    public final void rule__DifferedBarrier__TriggerAfterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2670:1: ( ( ruleHomeTimeStamp ) )
            // InternalShome.g:2671:2: ( ruleHomeTimeStamp )
            {
            // InternalShome.g:2671:2: ( ruleHomeTimeStamp )
            // InternalShome.g:2672:3: ruleHomeTimeStamp
            {
             before(grammarAccess.getDifferedBarrierAccess().getTriggerAfterHomeTimeStampParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHomeTimeStamp();

            state._fsp--;

             after(grammarAccess.getDifferedBarrierAccess().getTriggerAfterHomeTimeStampParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__TriggerAfterAssignment_4"


    // $ANTLR start "rule__DifferedBarrier__ActionsAssignment_6"
    // InternalShome.g:2681:1: rule__DifferedBarrier__ActionsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__DifferedBarrier__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2685:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2686:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2686:2: ( ( ruleEString ) )
            // InternalShome.g:2687:3: ( ruleEString )
            {
             before(grammarAccess.getDifferedBarrierAccess().getActionsActionCrossReference_6_0()); 
            // InternalShome.g:2688:3: ( ruleEString )
            // InternalShome.g:2689:4: ruleEString
            {
             before(grammarAccess.getDifferedBarrierAccess().getActionsActionEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDifferedBarrierAccess().getActionsActionEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDifferedBarrierAccess().getActionsActionCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__ActionsAssignment_6"


    // $ANTLR start "rule__DifferedBarrier__ActionsAssignment_7_1"
    // InternalShome.g:2700:1: rule__DifferedBarrier__ActionsAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__DifferedBarrier__ActionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2704:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2705:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2705:2: ( ( ruleEString ) )
            // InternalShome.g:2706:3: ( ruleEString )
            {
             before(grammarAccess.getDifferedBarrierAccess().getActionsActionCrossReference_7_1_0()); 
            // InternalShome.g:2707:3: ( ruleEString )
            // InternalShome.g:2708:4: ruleEString
            {
             before(grammarAccess.getDifferedBarrierAccess().getActionsActionEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDifferedBarrierAccess().getActionsActionEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getDifferedBarrierAccess().getActionsActionCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DifferedBarrier__ActionsAssignment_7_1"


    // $ANTLR start "rule__TimeEleapsedCondition__ActorAssignment_0_0"
    // InternalShome.g:2719:1: rule__TimeEleapsedCondition__ActorAssignment_0_0 : ( ( ruleEString ) ) ;
    public final void rule__TimeEleapsedCondition__ActorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2723:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2724:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2724:2: ( ( ruleEString ) )
            // InternalShome.g:2725:3: ( ruleEString )
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getActorActorCrossReference_0_0_0()); 
            // InternalShome.g:2726:3: ( ruleEString )
            // InternalShome.g:2727:4: ruleEString
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getActorActorEStringParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeEleapsedConditionAccess().getActorActorEStringParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getActorActorCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__ActorAssignment_0_0"


    // $ANTLR start "rule__TimeEleapsedCondition__ActionAssignment_1"
    // InternalShome.g:2738:1: rule__TimeEleapsedCondition__ActionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__TimeEleapsedCondition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2742:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2743:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2743:2: ( ( ruleEString ) )
            // InternalShome.g:2744:3: ( ruleEString )
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getActionActionCrossReference_1_0()); 
            // InternalShome.g:2745:3: ( ruleEString )
            // InternalShome.g:2746:4: ruleEString
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getActionActionEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeEleapsedConditionAccess().getActionActionEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTimeEleapsedConditionAccess().getActionActionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__ActionAssignment_1"


    // $ANTLR start "rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3"
    // InternalShome.g:2757:1: rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3 : ( ruleHomeTimeStamp ) ;
    public final void rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2761:1: ( ( ruleHomeTimeStamp ) )
            // InternalShome.g:2762:2: ( ruleHomeTimeStamp )
            {
            // InternalShome.g:2762:2: ( ruleHomeTimeStamp )
            // InternalShome.g:2763:3: ruleHomeTimeStamp
            {
             before(grammarAccess.getTimeEleapsedConditionAccess().getOwnedTimestampEleapsedHomeTimeStampParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHomeTimeStamp();

            state._fsp--;

             after(grammarAccess.getTimeEleapsedConditionAccess().getOwnedTimestampEleapsedHomeTimeStampParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeEleapsedCondition__OwnedTimestampEleapsedAssignment_3"


    // $ANTLR start "rule__Condition__ActorAssignment_0_0"
    // InternalShome.g:2772:1: rule__Condition__ActorAssignment_0_0 : ( ( ruleEString ) ) ;
    public final void rule__Condition__ActorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2776:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2777:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2777:2: ( ( ruleEString ) )
            // InternalShome.g:2778:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getActorActorCrossReference_0_0_0()); 
            // InternalShome.g:2779:3: ( ruleEString )
            // InternalShome.g:2780:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getActorActorEStringParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getActorActorEStringParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getActorActorCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ActorAssignment_0_0"


    // $ANTLR start "rule__Condition__ActionAssignment_1"
    // InternalShome.g:2791:1: rule__Condition__ActionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Condition__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2795:1: ( ( ( ruleEString ) ) )
            // InternalShome.g:2796:2: ( ( ruleEString ) )
            {
            // InternalShome.g:2796:2: ( ( ruleEString ) )
            // InternalShome.g:2797:3: ( ruleEString )
            {
             before(grammarAccess.getConditionAccess().getActionActionCrossReference_1_0()); 
            // InternalShome.g:2798:3: ( ruleEString )
            // InternalShome.g:2799:4: ruleEString
            {
             before(grammarAccess.getConditionAccess().getActionActionEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getActionActionEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getActionActionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ActionAssignment_1"


    // $ANTLR start "rule__ComposeCondition__OwnedConditionsAssignment_0"
    // InternalShome.g:2810:1: rule__ComposeCondition__OwnedConditionsAssignment_0 : ( ruleTerminalCondition ) ;
    public final void rule__ComposeCondition__OwnedConditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2814:1: ( ( ruleTerminalCondition ) )
            // InternalShome.g:2815:2: ( ruleTerminalCondition )
            {
            // InternalShome.g:2815:2: ( ruleTerminalCondition )
            // InternalShome.g:2816:3: ruleTerminalCondition
            {
             before(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalCondition();

            state._fsp--;

             after(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__OwnedConditionsAssignment_0"


    // $ANTLR start "rule__ComposeCondition__OwnedConditionsAssignment_2"
    // InternalShome.g:2825:1: rule__ComposeCondition__OwnedConditionsAssignment_2 : ( ruleTerminalCondition ) ;
    public final void rule__ComposeCondition__OwnedConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2829:1: ( ( ruleTerminalCondition ) )
            // InternalShome.g:2830:2: ( ruleTerminalCondition )
            {
            // InternalShome.g:2830:2: ( ruleTerminalCondition )
            // InternalShome.g:2831:3: ruleTerminalCondition
            {
             before(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalCondition();

            state._fsp--;

             after(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__OwnedConditionsAssignment_2"


    // $ANTLR start "rule__ComposeCondition__OwnedConditionsAssignment_3_1"
    // InternalShome.g:2840:1: rule__ComposeCondition__OwnedConditionsAssignment_3_1 : ( ruleTerminalCondition ) ;
    public final void rule__ComposeCondition__OwnedConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2844:1: ( ( ruleTerminalCondition ) )
            // InternalShome.g:2845:2: ( ruleTerminalCondition )
            {
            // InternalShome.g:2845:2: ( ruleTerminalCondition )
            // InternalShome.g:2846:3: ruleTerminalCondition
            {
             before(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalCondition();

            state._fsp--;

             after(grammarAccess.getComposeConditionAccess().getOwnedConditionsTerminalConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComposeCondition__OwnedConditionsAssignment_3_1"


    // $ANTLR start "rule__HomeTimeStamp__HourAssignment_0"
    // InternalShome.g:2855:1: rule__HomeTimeStamp__HourAssignment_0 : ( RULE_INT ) ;
    public final void rule__HomeTimeStamp__HourAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2859:1: ( ( RULE_INT ) )
            // InternalShome.g:2860:2: ( RULE_INT )
            {
            // InternalShome.g:2860:2: ( RULE_INT )
            // InternalShome.g:2861:3: RULE_INT
            {
             before(grammarAccess.getHomeTimeStampAccess().getHourINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHomeTimeStampAccess().getHourINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__HourAssignment_0"


    // $ANTLR start "rule__HomeTimeStamp__MinAssignment_2"
    // InternalShome.g:2870:1: rule__HomeTimeStamp__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__HomeTimeStamp__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2874:1: ( ( RULE_INT ) )
            // InternalShome.g:2875:2: ( RULE_INT )
            {
            // InternalShome.g:2875:2: ( RULE_INT )
            // InternalShome.g:2876:3: RULE_INT
            {
             before(grammarAccess.getHomeTimeStampAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHomeTimeStampAccess().getMinINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__MinAssignment_2"


    // $ANTLR start "rule__HomeTimeStamp__SecAssignment_4"
    // InternalShome.g:2885:1: rule__HomeTimeStamp__SecAssignment_4 : ( RULE_INT ) ;
    public final void rule__HomeTimeStamp__SecAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2889:1: ( ( RULE_INT ) )
            // InternalShome.g:2890:2: ( RULE_INT )
            {
            // InternalShome.g:2890:2: ( RULE_INT )
            // InternalShome.g:2891:3: RULE_INT
            {
             before(grammarAccess.getHomeTimeStampAccess().getSecINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHomeTimeStampAccess().getSecINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HomeTimeStamp__SecAssignment_4"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalShome.g:2900:1: rule__Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShome.g:2904:1: ( ( ruleEString ) )
            // InternalShome.g:2905:2: ( ruleEString )
            {
            // InternalShome.g:2905:2: ( ruleEString )
            // InternalShome.g:2906:3: ruleEString
            {
             before(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\1\25\1\4\2\24\1\27\1\6\2\4\2\uffff\1\20\2\26\2\24\2\6\2\4\2\20\2\26\2\24\2\6\1\4\1\6\1\26\1\20\2\26\1\20\2\6\1\26\1\20\1\6\1\26";
    static final String dfa_3s = "\1\25\1\5\2\32\1\31\1\6\2\5\2\uffff\1\20\4\32\2\6\2\5\2\20\4\32\2\6\1\5\1\6\1\30\1\20\2\32\1\20\2\6\1\30\1\20\1\6\1\30";
    static final String dfa_4s = "\10\uffff\1\2\1\1\36\uffff";
    static final String dfa_5s = "\50\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3",
            "\1\6\1\uffff\1\4\1\uffff\1\7\1\uffff\1\5",
            "\1\6\1\uffff\1\4\1\uffff\1\7\1\uffff\1\5",
            "\1\11\1\uffff\1\10",
            "\1\12",
            "\1\13\1\14",
            "\1\15\1\16",
            "",
            "",
            "\1\17",
            "\1\4\1\uffff\1\7\1\uffff\1\5",
            "\1\4\1\uffff\1\7\1\uffff\1\5",
            "\1\21\1\uffff\1\4\1\uffff\1\22\1\uffff\1\20",
            "\1\21\1\uffff\1\4\1\uffff\1\22\1\uffff\1\20",
            "\1\23",
            "\1\24",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\31",
            "\1\32",
            "\1\4\1\uffff\1\22\1\uffff\1\20",
            "\1\4\1\uffff\1\22\1\uffff\1\20",
            "\1\33\1\uffff\1\4\1\uffff\1\22\1\uffff\1\34",
            "\1\33\1\uffff\1\4\1\uffff\1\22\1\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37\1\40",
            "\1\41",
            "\1\4\1\uffff\1\7",
            "\1\42",
            "\1\4\1\uffff\1\22\1\uffff\1\34",
            "\1\4\1\uffff\1\22\1\uffff\1\34",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\4\1\uffff\1\22",
            "\1\46",
            "\1\47",
            "\1\4\1\uffff\1\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "427:1: rule__ABarrier__Alternatives : ( ( ruleBarrier ) | ( ruleDifferedBarrier ) );";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\uffff\2\3\4\uffff\2\3\4\uffff\1\16\1\uffff";
    static final String dfa_9s = "\1\4\2\24\1\uffff\1\4\1\6\1\uffff\2\26\1\20\1\6\1\20\1\6\1\26\1\uffff";
    static final String dfa_10s = "\1\5\2\32\1\uffff\1\5\1\6\1\uffff\2\32\1\20\1\6\1\20\1\6\1\30\1\uffff";
    static final String dfa_11s = "\3\uffff\1\1\2\uffff\1\3\7\uffff\1\2";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2",
            "\1\4\1\uffff\1\3\1\uffff\1\6\1\uffff\1\5",
            "\1\4\1\uffff\1\3\1\uffff\1\6\1\uffff\1\5",
            "",
            "\1\7\1\10",
            "\1\11",
            "",
            "\1\3\1\uffff\1\6\1\uffff\1\5",
            "\1\3\1\uffff\1\6\1\uffff\1\5",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "448:1: rule__ACondition__Alternatives : ( ( ruleCondition ) | ( ruleTimeEleapsedCondition ) | ( ruleComposeCondition ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000244040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000244002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000246040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000244042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}