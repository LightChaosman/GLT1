package tue.glt.platoon.dsl.ide.contentassist.antlr.internal;

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
import tue.glt.platoon.dsl.services.PDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'platoon:'", "'route'", "':'", "'constraints:'", "'LV'", "'FV'", "'front'", "'runner'", "'forward('", "')'", "'turn'", "'Left'", "'Right'", "'-'", "'<='", "'headway'"
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


        public InternalPDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDSL.g"; }


    	private PDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleWorld"
    // InternalPDSL.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalPDSL.g:54:1: ( ruleWorld EOF )
            // InternalPDSL.g:55:1: ruleWorld EOF
            {
             before(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            ruleWorld();

            state._fsp--;

             after(grammarAccess.getWorldRule()); 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalPDSL.g:62:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:66:2: ( ( ( rule__World__Group__0 ) ) )
            // InternalPDSL.g:67:2: ( ( rule__World__Group__0 ) )
            {
            // InternalPDSL.g:67:2: ( ( rule__World__Group__0 ) )
            // InternalPDSL.g:68:3: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // InternalPDSL.g:69:3: ( rule__World__Group__0 )
            // InternalPDSL.g:69:4: rule__World__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getGroup()); 

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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleStep"
    // InternalPDSL.g:78:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalPDSL.g:79:1: ( ruleStep EOF )
            // InternalPDSL.g:80:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalPDSL.g:87:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:91:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalPDSL.g:92:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalPDSL.g:92:2: ( ( rule__Step__Alternatives ) )
            // InternalPDSL.g:93:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalPDSL.g:94:3: ( rule__Step__Alternatives )
            // InternalPDSL.g:94:4: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleConstraint"
    // InternalPDSL.g:103:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalPDSL.g:104:1: ( ruleConstraint EOF )
            // InternalPDSL.g:105:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalPDSL.g:112:1: ruleConstraint : ( ruleheadway ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:116:2: ( ( ruleheadway ) )
            // InternalPDSL.g:117:2: ( ruleheadway )
            {
            // InternalPDSL.g:117:2: ( ruleheadway )
            // InternalPDSL.g:118:3: ruleheadway
            {
             before(grammarAccess.getConstraintAccess().getHeadwayParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleheadway();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getHeadwayParserRuleCall()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePlatoon"
    // InternalPDSL.g:128:1: entryRulePlatoon : rulePlatoon EOF ;
    public final void entryRulePlatoon() throws RecognitionException {
        try {
            // InternalPDSL.g:129:1: ( rulePlatoon EOF )
            // InternalPDSL.g:130:1: rulePlatoon EOF
            {
             before(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            rulePlatoon();

            state._fsp--;

             after(grammarAccess.getPlatoonRule()); 
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
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPDSL.g:137:1: rulePlatoon : ( ( rule__Platoon__Group__0 ) ) ;
    public final void rulePlatoon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:141:2: ( ( ( rule__Platoon__Group__0 ) ) )
            // InternalPDSL.g:142:2: ( ( rule__Platoon__Group__0 ) )
            {
            // InternalPDSL.g:142:2: ( ( rule__Platoon__Group__0 ) )
            // InternalPDSL.g:143:3: ( rule__Platoon__Group__0 )
            {
             before(grammarAccess.getPlatoonAccess().getGroup()); 
            // InternalPDSL.g:144:3: ( rule__Platoon__Group__0 )
            // InternalPDSL.g:144:4: rule__Platoon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getGroup()); 

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
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleRoute"
    // InternalPDSL.g:153:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalPDSL.g:154:1: ( ruleRoute EOF )
            // InternalPDSL.g:155:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPDSL.g:162:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:166:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalPDSL.g:167:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalPDSL.g:167:2: ( ( rule__Route__Group__0 ) )
            // InternalPDSL.g:168:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalPDSL.g:169:3: ( rule__Route__Group__0 )
            // InternalPDSL.g:169:4: rule__Route__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleConstraints"
    // InternalPDSL.g:178:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // InternalPDSL.g:179:1: ( ruleConstraints EOF )
            // InternalPDSL.g:180:1: ruleConstraints EOF
            {
             before(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstraintsRule()); 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPDSL.g:187:1: ruleConstraints : ( ( rule__Constraints__Group__0 ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:191:2: ( ( ( rule__Constraints__Group__0 ) ) )
            // InternalPDSL.g:192:2: ( ( rule__Constraints__Group__0 ) )
            {
            // InternalPDSL.g:192:2: ( ( rule__Constraints__Group__0 ) )
            // InternalPDSL.g:193:3: ( rule__Constraints__Group__0 )
            {
             before(grammarAccess.getConstraintsAccess().getGroup()); 
            // InternalPDSL.g:194:3: ( rule__Constraints__Group__0 )
            // InternalPDSL.g:194:4: rule__Constraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleLeadVehicle"
    // InternalPDSL.g:203:1: entryRuleLeadVehicle : ruleLeadVehicle EOF ;
    public final void entryRuleLeadVehicle() throws RecognitionException {
        try {
            // InternalPDSL.g:204:1: ( ruleLeadVehicle EOF )
            // InternalPDSL.g:205:1: ruleLeadVehicle EOF
            {
             before(grammarAccess.getLeadVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleLeadVehicle();

            state._fsp--;

             after(grammarAccess.getLeadVehicleRule()); 
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
    // $ANTLR end "entryRuleLeadVehicle"


    // $ANTLR start "ruleLeadVehicle"
    // InternalPDSL.g:212:1: ruleLeadVehicle : ( ( rule__LeadVehicle__Group__0 ) ) ;
    public final void ruleLeadVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:216:2: ( ( ( rule__LeadVehicle__Group__0 ) ) )
            // InternalPDSL.g:217:2: ( ( rule__LeadVehicle__Group__0 ) )
            {
            // InternalPDSL.g:217:2: ( ( rule__LeadVehicle__Group__0 ) )
            // InternalPDSL.g:218:3: ( rule__LeadVehicle__Group__0 )
            {
             before(grammarAccess.getLeadVehicleAccess().getGroup()); 
            // InternalPDSL.g:219:3: ( rule__LeadVehicle__Group__0 )
            // InternalPDSL.g:219:4: rule__LeadVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeadVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeadVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleLeadVehicle"


    // $ANTLR start "entryRuleFollowVehicle"
    // InternalPDSL.g:228:1: entryRuleFollowVehicle : ruleFollowVehicle EOF ;
    public final void entryRuleFollowVehicle() throws RecognitionException {
        try {
            // InternalPDSL.g:229:1: ( ruleFollowVehicle EOF )
            // InternalPDSL.g:230:1: ruleFollowVehicle EOF
            {
             before(grammarAccess.getFollowVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleFollowVehicle();

            state._fsp--;

             after(grammarAccess.getFollowVehicleRule()); 
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
    // $ANTLR end "entryRuleFollowVehicle"


    // $ANTLR start "ruleFollowVehicle"
    // InternalPDSL.g:237:1: ruleFollowVehicle : ( ( rule__FollowVehicle__Group__0 ) ) ;
    public final void ruleFollowVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:241:2: ( ( ( rule__FollowVehicle__Group__0 ) ) )
            // InternalPDSL.g:242:2: ( ( rule__FollowVehicle__Group__0 ) )
            {
            // InternalPDSL.g:242:2: ( ( rule__FollowVehicle__Group__0 ) )
            // InternalPDSL.g:243:3: ( rule__FollowVehicle__Group__0 )
            {
             before(grammarAccess.getFollowVehicleAccess().getGroup()); 
            // InternalPDSL.g:244:3: ( rule__FollowVehicle__Group__0 )
            // InternalPDSL.g:244:4: rule__FollowVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleFollowVehicle"


    // $ANTLR start "entryRuleEString"
    // InternalPDSL.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPDSL.g:254:1: ( ruleEString EOF )
            // InternalPDSL.g:255:1: ruleEString EOF
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
    // InternalPDSL.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPDSL.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPDSL.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalPDSL.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPDSL.g:269:3: ( rule__EString__Alternatives )
            // InternalPDSL.g:269:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleForward"
    // InternalPDSL.g:278:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalPDSL.g:279:1: ( ruleForward EOF )
            // InternalPDSL.g:280:1: ruleForward EOF
            {
             before(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleForward();

            state._fsp--;

             after(grammarAccess.getForwardRule()); 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalPDSL.g:287:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:291:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalPDSL.g:292:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalPDSL.g:292:2: ( ( rule__Forward__Group__0 ) )
            // InternalPDSL.g:293:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalPDSL.g:294:3: ( rule__Forward__Group__0 )
            // InternalPDSL.g:294:4: rule__Forward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getGroup()); 

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalPDSL.g:303:1: entryRuleTurnLeft : ruleTurnLeft EOF ;
    public final void entryRuleTurnLeft() throws RecognitionException {
        try {
            // InternalPDSL.g:304:1: ( ruleTurnLeft EOF )
            // InternalPDSL.g:305:1: ruleTurnLeft EOF
            {
             before(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnLeft();

            state._fsp--;

             after(grammarAccess.getTurnLeftRule()); 
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
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalPDSL.g:312:1: ruleTurnLeft : ( ( rule__TurnLeft__Group__0 ) ) ;
    public final void ruleTurnLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:316:2: ( ( ( rule__TurnLeft__Group__0 ) ) )
            // InternalPDSL.g:317:2: ( ( rule__TurnLeft__Group__0 ) )
            {
            // InternalPDSL.g:317:2: ( ( rule__TurnLeft__Group__0 ) )
            // InternalPDSL.g:318:3: ( rule__TurnLeft__Group__0 )
            {
             before(grammarAccess.getTurnLeftAccess().getGroup()); 
            // InternalPDSL.g:319:3: ( rule__TurnLeft__Group__0 )
            // InternalPDSL.g:319:4: rule__TurnLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalPDSL.g:328:1: entryRuleTurnRight : ruleTurnRight EOF ;
    public final void entryRuleTurnRight() throws RecognitionException {
        try {
            // InternalPDSL.g:329:1: ( ruleTurnRight EOF )
            // InternalPDSL.g:330:1: ruleTurnRight EOF
            {
             before(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnRight();

            state._fsp--;

             after(grammarAccess.getTurnRightRule()); 
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
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalPDSL.g:337:1: ruleTurnRight : ( ( rule__TurnRight__Group__0 ) ) ;
    public final void ruleTurnRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:341:2: ( ( ( rule__TurnRight__Group__0 ) ) )
            // InternalPDSL.g:342:2: ( ( rule__TurnRight__Group__0 ) )
            {
            // InternalPDSL.g:342:2: ( ( rule__TurnRight__Group__0 ) )
            // InternalPDSL.g:343:3: ( rule__TurnRight__Group__0 )
            {
             before(grammarAccess.getTurnRightAccess().getGroup()); 
            // InternalPDSL.g:344:3: ( rule__TurnRight__Group__0 )
            // InternalPDSL.g:344:4: rule__TurnRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnRightAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleEInt"
    // InternalPDSL.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDSL.g:354:1: ( ruleEInt EOF )
            // InternalPDSL.g:355:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDSL.g:362:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:366:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDSL.g:367:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDSL.g:367:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDSL.g:368:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDSL.g:369:3: ( rule__EInt__Group__0 )
            // InternalPDSL.g:369:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleheadway"
    // InternalPDSL.g:378:1: entryRuleheadway : ruleheadway EOF ;
    public final void entryRuleheadway() throws RecognitionException {
        try {
            // InternalPDSL.g:379:1: ( ruleheadway EOF )
            // InternalPDSL.g:380:1: ruleheadway EOF
            {
             before(grammarAccess.getHeadwayRule()); 
            pushFollow(FOLLOW_1);
            ruleheadway();

            state._fsp--;

             after(grammarAccess.getHeadwayRule()); 
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
    // $ANTLR end "entryRuleheadway"


    // $ANTLR start "ruleheadway"
    // InternalPDSL.g:387:1: ruleheadway : ( ( rule__Headway__Group__0 ) ) ;
    public final void ruleheadway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:391:2: ( ( ( rule__Headway__Group__0 ) ) )
            // InternalPDSL.g:392:2: ( ( rule__Headway__Group__0 ) )
            {
            // InternalPDSL.g:392:2: ( ( rule__Headway__Group__0 ) )
            // InternalPDSL.g:393:3: ( rule__Headway__Group__0 )
            {
             before(grammarAccess.getHeadwayAccess().getGroup()); 
            // InternalPDSL.g:394:3: ( rule__Headway__Group__0 )
            // InternalPDSL.g:394:4: rule__Headway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Headway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayAccess().getGroup()); 

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
    // $ANTLR end "ruleheadway"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalPDSL.g:402:1: rule__Step__Alternatives : ( ( ruleForward ) | ( ruleTurnLeft ) | ( ruleTurnRight ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:406:1: ( ( ruleForward ) | ( ruleTurnLeft ) | ( ruleTurnRight ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==23) ) {
                    alt1=3;
                }
                else if ( (LA1_2==22) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPDSL.g:407:2: ( ruleForward )
                    {
                    // InternalPDSL.g:407:2: ( ruleForward )
                    // InternalPDSL.g:408:3: ruleForward
                    {
                     before(grammarAccess.getStepAccess().getForwardParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getForwardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDSL.g:413:2: ( ruleTurnLeft )
                    {
                    // InternalPDSL.g:413:2: ( ruleTurnLeft )
                    // InternalPDSL.g:414:3: ruleTurnLeft
                    {
                     before(grammarAccess.getStepAccess().getTurnLeftParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnLeft();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getTurnLeftParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDSL.g:419:2: ( ruleTurnRight )
                    {
                    // InternalPDSL.g:419:2: ( ruleTurnRight )
                    // InternalPDSL.g:420:3: ruleTurnRight
                    {
                     before(grammarAccess.getStepAccess().getTurnRightParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnRight();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getTurnRightParserRuleCall_2()); 

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
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPDSL.g:429:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:433:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDSL.g:434:2: ( RULE_STRING )
                    {
                    // InternalPDSL.g:434:2: ( RULE_STRING )
                    // InternalPDSL.g:435:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDSL.g:440:2: ( RULE_ID )
                    {
                    // InternalPDSL.g:440:2: ( RULE_ID )
                    // InternalPDSL.g:441:3: RULE_ID
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


    // $ANTLR start "rule__World__Group__0"
    // InternalPDSL.g:450:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:454:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalPDSL.g:455:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__World__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__1();

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
    // $ANTLR end "rule__World__Group__0"


    // $ANTLR start "rule__World__Group__0__Impl"
    // InternalPDSL.g:462:1: rule__World__Group__0__Impl : ( ( rule__World__PlatoonAssignment_0 ) ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:466:1: ( ( ( rule__World__PlatoonAssignment_0 ) ) )
            // InternalPDSL.g:467:1: ( ( rule__World__PlatoonAssignment_0 ) )
            {
            // InternalPDSL.g:467:1: ( ( rule__World__PlatoonAssignment_0 ) )
            // InternalPDSL.g:468:2: ( rule__World__PlatoonAssignment_0 )
            {
             before(grammarAccess.getWorldAccess().getPlatoonAssignment_0()); 
            // InternalPDSL.g:469:2: ( rule__World__PlatoonAssignment_0 )
            // InternalPDSL.g:469:3: rule__World__PlatoonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__World__PlatoonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getPlatoonAssignment_0()); 

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
    // $ANTLR end "rule__World__Group__0__Impl"


    // $ANTLR start "rule__World__Group__1"
    // InternalPDSL.g:477:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:481:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // InternalPDSL.g:482:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__World__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__2();

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
    // $ANTLR end "rule__World__Group__1"


    // $ANTLR start "rule__World__Group__1__Impl"
    // InternalPDSL.g:489:1: rule__World__Group__1__Impl : ( ( rule__World__RoutesAssignment_1 ) ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:493:1: ( ( ( rule__World__RoutesAssignment_1 ) ) )
            // InternalPDSL.g:494:1: ( ( rule__World__RoutesAssignment_1 ) )
            {
            // InternalPDSL.g:494:1: ( ( rule__World__RoutesAssignment_1 ) )
            // InternalPDSL.g:495:2: ( rule__World__RoutesAssignment_1 )
            {
             before(grammarAccess.getWorldAccess().getRoutesAssignment_1()); 
            // InternalPDSL.g:496:2: ( rule__World__RoutesAssignment_1 )
            // InternalPDSL.g:496:3: rule__World__RoutesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__World__RoutesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getRoutesAssignment_1()); 

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
    // $ANTLR end "rule__World__Group__1__Impl"


    // $ANTLR start "rule__World__Group__2"
    // InternalPDSL.g:504:1: rule__World__Group__2 : rule__World__Group__2__Impl ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:508:1: ( rule__World__Group__2__Impl )
            // InternalPDSL.g:509:2: rule__World__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__2__Impl();

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
    // $ANTLR end "rule__World__Group__2"


    // $ANTLR start "rule__World__Group__2__Impl"
    // InternalPDSL.g:515:1: rule__World__Group__2__Impl : ( ( rule__World__ConstraintsAssignment_2 ) ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:519:1: ( ( ( rule__World__ConstraintsAssignment_2 ) ) )
            // InternalPDSL.g:520:1: ( ( rule__World__ConstraintsAssignment_2 ) )
            {
            // InternalPDSL.g:520:1: ( ( rule__World__ConstraintsAssignment_2 ) )
            // InternalPDSL.g:521:2: ( rule__World__ConstraintsAssignment_2 )
            {
             before(grammarAccess.getWorldAccess().getConstraintsAssignment_2()); 
            // InternalPDSL.g:522:2: ( rule__World__ConstraintsAssignment_2 )
            // InternalPDSL.g:522:3: rule__World__ConstraintsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__World__ConstraintsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getConstraintsAssignment_2()); 

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
    // $ANTLR end "rule__World__Group__2__Impl"


    // $ANTLR start "rule__Platoon__Group__0"
    // InternalPDSL.g:531:1: rule__Platoon__Group__0 : rule__Platoon__Group__0__Impl rule__Platoon__Group__1 ;
    public final void rule__Platoon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:535:1: ( rule__Platoon__Group__0__Impl rule__Platoon__Group__1 )
            // InternalPDSL.g:536:2: rule__Platoon__Group__0__Impl rule__Platoon__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Platoon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__1();

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
    // $ANTLR end "rule__Platoon__Group__0"


    // $ANTLR start "rule__Platoon__Group__0__Impl"
    // InternalPDSL.g:543:1: rule__Platoon__Group__0__Impl : ( 'platoon:' ) ;
    public final void rule__Platoon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:547:1: ( ( 'platoon:' ) )
            // InternalPDSL.g:548:1: ( 'platoon:' )
            {
            // InternalPDSL.g:548:1: ( 'platoon:' )
            // InternalPDSL.g:549:2: 'platoon:'
            {
             before(grammarAccess.getPlatoonAccess().getPlatoonKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPlatoonAccess().getPlatoonKeyword_0()); 

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
    // $ANTLR end "rule__Platoon__Group__0__Impl"


    // $ANTLR start "rule__Platoon__Group__1"
    // InternalPDSL.g:558:1: rule__Platoon__Group__1 : rule__Platoon__Group__1__Impl rule__Platoon__Group__2 ;
    public final void rule__Platoon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:562:1: ( rule__Platoon__Group__1__Impl rule__Platoon__Group__2 )
            // InternalPDSL.g:563:2: rule__Platoon__Group__1__Impl rule__Platoon__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Platoon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__2();

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
    // $ANTLR end "rule__Platoon__Group__1"


    // $ANTLR start "rule__Platoon__Group__1__Impl"
    // InternalPDSL.g:570:1: rule__Platoon__Group__1__Impl : ( ( rule__Platoon__LeaderAssignment_1 ) ) ;
    public final void rule__Platoon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:574:1: ( ( ( rule__Platoon__LeaderAssignment_1 ) ) )
            // InternalPDSL.g:575:1: ( ( rule__Platoon__LeaderAssignment_1 ) )
            {
            // InternalPDSL.g:575:1: ( ( rule__Platoon__LeaderAssignment_1 ) )
            // InternalPDSL.g:576:2: ( rule__Platoon__LeaderAssignment_1 )
            {
             before(grammarAccess.getPlatoonAccess().getLeaderAssignment_1()); 
            // InternalPDSL.g:577:2: ( rule__Platoon__LeaderAssignment_1 )
            // InternalPDSL.g:577:3: rule__Platoon__LeaderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__LeaderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getLeaderAssignment_1()); 

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
    // $ANTLR end "rule__Platoon__Group__1__Impl"


    // $ANTLR start "rule__Platoon__Group__2"
    // InternalPDSL.g:585:1: rule__Platoon__Group__2 : rule__Platoon__Group__2__Impl ;
    public final void rule__Platoon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:589:1: ( rule__Platoon__Group__2__Impl )
            // InternalPDSL.g:590:2: rule__Platoon__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group__2__Impl();

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
    // $ANTLR end "rule__Platoon__Group__2"


    // $ANTLR start "rule__Platoon__Group__2__Impl"
    // InternalPDSL.g:596:1: rule__Platoon__Group__2__Impl : ( ( rule__Platoon__FollowersAssignment_2 )* ) ;
    public final void rule__Platoon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:600:1: ( ( ( rule__Platoon__FollowersAssignment_2 )* ) )
            // InternalPDSL.g:601:1: ( ( rule__Platoon__FollowersAssignment_2 )* )
            {
            // InternalPDSL.g:601:1: ( ( rule__Platoon__FollowersAssignment_2 )* )
            // InternalPDSL.g:602:2: ( rule__Platoon__FollowersAssignment_2 )*
            {
             before(grammarAccess.getPlatoonAccess().getFollowersAssignment_2()); 
            // InternalPDSL.g:603:2: ( rule__Platoon__FollowersAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDSL.g:603:3: rule__Platoon__FollowersAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Platoon__FollowersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPlatoonAccess().getFollowersAssignment_2()); 

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
    // $ANTLR end "rule__Platoon__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalPDSL.g:612:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:616:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalPDSL.g:617:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__1();

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
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // InternalPDSL.g:624:1: rule__Route__Group__0__Impl : ( 'route' ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:628:1: ( ( 'route' ) )
            // InternalPDSL.g:629:1: ( 'route' )
            {
            // InternalPDSL.g:629:1: ( 'route' )
            // InternalPDSL.g:630:2: 'route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getRouteKeyword_0()); 

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
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // InternalPDSL.g:639:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:643:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalPDSL.g:644:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Route__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__2();

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
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // InternalPDSL.g:651:1: rule__Route__Group__1__Impl : ( ( rule__Route__NameAssignment_1 ) ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:655:1: ( ( ( rule__Route__NameAssignment_1 ) ) )
            // InternalPDSL.g:656:1: ( ( rule__Route__NameAssignment_1 ) )
            {
            // InternalPDSL.g:656:1: ( ( rule__Route__NameAssignment_1 ) )
            // InternalPDSL.g:657:2: ( rule__Route__NameAssignment_1 )
            {
             before(grammarAccess.getRouteAccess().getNameAssignment_1()); 
            // InternalPDSL.g:658:2: ( rule__Route__NameAssignment_1 )
            // InternalPDSL.g:658:3: rule__Route__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Route__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__2"
    // InternalPDSL.g:666:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:670:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalPDSL.g:671:2: rule__Route__Group__2__Impl rule__Route__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Route__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__3();

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
    // $ANTLR end "rule__Route__Group__2"


    // $ANTLR start "rule__Route__Group__2__Impl"
    // InternalPDSL.g:678:1: rule__Route__Group__2__Impl : ( ':' ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:682:1: ( ( ':' ) )
            // InternalPDSL.g:683:1: ( ':' )
            {
            // InternalPDSL.g:683:1: ( ':' )
            // InternalPDSL.g:684:2: ':'
            {
             before(grammarAccess.getRouteAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Route__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__3"
    // InternalPDSL.g:693:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:697:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalPDSL.g:698:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Route__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__4();

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
    // $ANTLR end "rule__Route__Group__3"


    // $ANTLR start "rule__Route__Group__3__Impl"
    // InternalPDSL.g:705:1: rule__Route__Group__3__Impl : ( ( rule__Route__StepsAssignment_3 ) ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:709:1: ( ( ( rule__Route__StepsAssignment_3 ) ) )
            // InternalPDSL.g:710:1: ( ( rule__Route__StepsAssignment_3 ) )
            {
            // InternalPDSL.g:710:1: ( ( rule__Route__StepsAssignment_3 ) )
            // InternalPDSL.g:711:2: ( rule__Route__StepsAssignment_3 )
            {
             before(grammarAccess.getRouteAccess().getStepsAssignment_3()); 
            // InternalPDSL.g:712:2: ( rule__Route__StepsAssignment_3 )
            // InternalPDSL.g:712:3: rule__Route__StepsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Route__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getStepsAssignment_3()); 

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
    // $ANTLR end "rule__Route__Group__3__Impl"


    // $ANTLR start "rule__Route__Group__4"
    // InternalPDSL.g:720:1: rule__Route__Group__4 : rule__Route__Group__4__Impl ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:724:1: ( rule__Route__Group__4__Impl )
            // InternalPDSL.g:725:2: rule__Route__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__4__Impl();

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
    // $ANTLR end "rule__Route__Group__4"


    // $ANTLR start "rule__Route__Group__4__Impl"
    // InternalPDSL.g:731:1: rule__Route__Group__4__Impl : ( ( rule__Route__StepsAssignment_4 )* ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:735:1: ( ( ( rule__Route__StepsAssignment_4 )* ) )
            // InternalPDSL.g:736:1: ( ( rule__Route__StepsAssignment_4 )* )
            {
            // InternalPDSL.g:736:1: ( ( rule__Route__StepsAssignment_4 )* )
            // InternalPDSL.g:737:2: ( rule__Route__StepsAssignment_4 )*
            {
             before(grammarAccess.getRouteAccess().getStepsAssignment_4()); 
            // InternalPDSL.g:738:2: ( rule__Route__StepsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDSL.g:738:3: rule__Route__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Route__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRouteAccess().getStepsAssignment_4()); 

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
    // $ANTLR end "rule__Route__Group__4__Impl"


    // $ANTLR start "rule__Constraints__Group__0"
    // InternalPDSL.g:747:1: rule__Constraints__Group__0 : rule__Constraints__Group__0__Impl rule__Constraints__Group__1 ;
    public final void rule__Constraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:751:1: ( rule__Constraints__Group__0__Impl rule__Constraints__Group__1 )
            // InternalPDSL.g:752:2: rule__Constraints__Group__0__Impl rule__Constraints__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Constraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__1();

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
    // $ANTLR end "rule__Constraints__Group__0"


    // $ANTLR start "rule__Constraints__Group__0__Impl"
    // InternalPDSL.g:759:1: rule__Constraints__Group__0__Impl : ( 'constraints:' ) ;
    public final void rule__Constraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:763:1: ( ( 'constraints:' ) )
            // InternalPDSL.g:764:1: ( 'constraints:' )
            {
            // InternalPDSL.g:764:1: ( 'constraints:' )
            // InternalPDSL.g:765:2: 'constraints:'
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 

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
    // $ANTLR end "rule__Constraints__Group__0__Impl"


    // $ANTLR start "rule__Constraints__Group__1"
    // InternalPDSL.g:774:1: rule__Constraints__Group__1 : rule__Constraints__Group__1__Impl ;
    public final void rule__Constraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:778:1: ( rule__Constraints__Group__1__Impl )
            // InternalPDSL.g:779:2: rule__Constraints__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__1__Impl();

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
    // $ANTLR end "rule__Constraints__Group__1"


    // $ANTLR start "rule__Constraints__Group__1__Impl"
    // InternalPDSL.g:785:1: rule__Constraints__Group__1__Impl : ( ( rule__Constraints__ListAssignment_1 ) ) ;
    public final void rule__Constraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:789:1: ( ( ( rule__Constraints__ListAssignment_1 ) ) )
            // InternalPDSL.g:790:1: ( ( rule__Constraints__ListAssignment_1 ) )
            {
            // InternalPDSL.g:790:1: ( ( rule__Constraints__ListAssignment_1 ) )
            // InternalPDSL.g:791:2: ( rule__Constraints__ListAssignment_1 )
            {
             before(grammarAccess.getConstraintsAccess().getListAssignment_1()); 
            // InternalPDSL.g:792:2: ( rule__Constraints__ListAssignment_1 )
            // InternalPDSL.g:792:3: rule__Constraints__ListAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__ListAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__Constraints__Group__1__Impl"


    // $ANTLR start "rule__LeadVehicle__Group__0"
    // InternalPDSL.g:801:1: rule__LeadVehicle__Group__0 : rule__LeadVehicle__Group__0__Impl rule__LeadVehicle__Group__1 ;
    public final void rule__LeadVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:805:1: ( rule__LeadVehicle__Group__0__Impl rule__LeadVehicle__Group__1 )
            // InternalPDSL.g:806:2: rule__LeadVehicle__Group__0__Impl rule__LeadVehicle__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LeadVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadVehicle__Group__1();

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
    // $ANTLR end "rule__LeadVehicle__Group__0"


    // $ANTLR start "rule__LeadVehicle__Group__0__Impl"
    // InternalPDSL.g:813:1: rule__LeadVehicle__Group__0__Impl : ( 'LV' ) ;
    public final void rule__LeadVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:817:1: ( ( 'LV' ) )
            // InternalPDSL.g:818:1: ( 'LV' )
            {
            // InternalPDSL.g:818:1: ( 'LV' )
            // InternalPDSL.g:819:2: 'LV'
            {
             before(grammarAccess.getLeadVehicleAccess().getLVKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLeadVehicleAccess().getLVKeyword_0()); 

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
    // $ANTLR end "rule__LeadVehicle__Group__0__Impl"


    // $ANTLR start "rule__LeadVehicle__Group__1"
    // InternalPDSL.g:828:1: rule__LeadVehicle__Group__1 : rule__LeadVehicle__Group__1__Impl rule__LeadVehicle__Group__2 ;
    public final void rule__LeadVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:832:1: ( rule__LeadVehicle__Group__1__Impl rule__LeadVehicle__Group__2 )
            // InternalPDSL.g:833:2: rule__LeadVehicle__Group__1__Impl rule__LeadVehicle__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LeadVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadVehicle__Group__2();

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
    // $ANTLR end "rule__LeadVehicle__Group__1"


    // $ANTLR start "rule__LeadVehicle__Group__1__Impl"
    // InternalPDSL.g:840:1: rule__LeadVehicle__Group__1__Impl : ( ( rule__LeadVehicle__NameAssignment_1 ) ) ;
    public final void rule__LeadVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:844:1: ( ( ( rule__LeadVehicle__NameAssignment_1 ) ) )
            // InternalPDSL.g:845:1: ( ( rule__LeadVehicle__NameAssignment_1 ) )
            {
            // InternalPDSL.g:845:1: ( ( rule__LeadVehicle__NameAssignment_1 ) )
            // InternalPDSL.g:846:2: ( rule__LeadVehicle__NameAssignment_1 )
            {
             before(grammarAccess.getLeadVehicleAccess().getNameAssignment_1()); 
            // InternalPDSL.g:847:2: ( rule__LeadVehicle__NameAssignment_1 )
            // InternalPDSL.g:847:3: rule__LeadVehicle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LeadVehicle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeadVehicleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LeadVehicle__Group__1__Impl"


    // $ANTLR start "rule__LeadVehicle__Group__2"
    // InternalPDSL.g:855:1: rule__LeadVehicle__Group__2 : rule__LeadVehicle__Group__2__Impl rule__LeadVehicle__Group__3 ;
    public final void rule__LeadVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:859:1: ( rule__LeadVehicle__Group__2__Impl rule__LeadVehicle__Group__3 )
            // InternalPDSL.g:860:2: rule__LeadVehicle__Group__2__Impl rule__LeadVehicle__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LeadVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadVehicle__Group__3();

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
    // $ANTLR end "rule__LeadVehicle__Group__2"


    // $ANTLR start "rule__LeadVehicle__Group__2__Impl"
    // InternalPDSL.g:867:1: rule__LeadVehicle__Group__2__Impl : ( 'route' ) ;
    public final void rule__LeadVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:871:1: ( ( 'route' ) )
            // InternalPDSL.g:872:1: ( 'route' )
            {
            // InternalPDSL.g:872:1: ( 'route' )
            // InternalPDSL.g:873:2: 'route'
            {
             before(grammarAccess.getLeadVehicleAccess().getRouteKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLeadVehicleAccess().getRouteKeyword_2()); 

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
    // $ANTLR end "rule__LeadVehicle__Group__2__Impl"


    // $ANTLR start "rule__LeadVehicle__Group__3"
    // InternalPDSL.g:882:1: rule__LeadVehicle__Group__3 : rule__LeadVehicle__Group__3__Impl ;
    public final void rule__LeadVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:886:1: ( rule__LeadVehicle__Group__3__Impl )
            // InternalPDSL.g:887:2: rule__LeadVehicle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeadVehicle__Group__3__Impl();

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
    // $ANTLR end "rule__LeadVehicle__Group__3"


    // $ANTLR start "rule__LeadVehicle__Group__3__Impl"
    // InternalPDSL.g:893:1: rule__LeadVehicle__Group__3__Impl : ( ( rule__LeadVehicle__RouteAssignment_3 ) ) ;
    public final void rule__LeadVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:897:1: ( ( ( rule__LeadVehicle__RouteAssignment_3 ) ) )
            // InternalPDSL.g:898:1: ( ( rule__LeadVehicle__RouteAssignment_3 ) )
            {
            // InternalPDSL.g:898:1: ( ( rule__LeadVehicle__RouteAssignment_3 ) )
            // InternalPDSL.g:899:2: ( rule__LeadVehicle__RouteAssignment_3 )
            {
             before(grammarAccess.getLeadVehicleAccess().getRouteAssignment_3()); 
            // InternalPDSL.g:900:2: ( rule__LeadVehicle__RouteAssignment_3 )
            // InternalPDSL.g:900:3: rule__LeadVehicle__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LeadVehicle__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLeadVehicleAccess().getRouteAssignment_3()); 

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
    // $ANTLR end "rule__LeadVehicle__Group__3__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__0"
    // InternalPDSL.g:909:1: rule__FollowVehicle__Group__0 : rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1 ;
    public final void rule__FollowVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:913:1: ( rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1 )
            // InternalPDSL.g:914:2: rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FollowVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__1();

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
    // $ANTLR end "rule__FollowVehicle__Group__0"


    // $ANTLR start "rule__FollowVehicle__Group__0__Impl"
    // InternalPDSL.g:921:1: rule__FollowVehicle__Group__0__Impl : ( 'FV' ) ;
    public final void rule__FollowVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:925:1: ( ( 'FV' ) )
            // InternalPDSL.g:926:1: ( 'FV' )
            {
            // InternalPDSL.g:926:1: ( 'FV' )
            // InternalPDSL.g:927:2: 'FV'
            {
             before(grammarAccess.getFollowVehicleAccess().getFVKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getFVKeyword_0()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__0__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__1"
    // InternalPDSL.g:936:1: rule__FollowVehicle__Group__1 : rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2 ;
    public final void rule__FollowVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:940:1: ( rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2 )
            // InternalPDSL.g:941:2: rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FollowVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__2();

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
    // $ANTLR end "rule__FollowVehicle__Group__1"


    // $ANTLR start "rule__FollowVehicle__Group__1__Impl"
    // InternalPDSL.g:948:1: rule__FollowVehicle__Group__1__Impl : ( ( rule__FollowVehicle__NameAssignment_1 ) ) ;
    public final void rule__FollowVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:952:1: ( ( ( rule__FollowVehicle__NameAssignment_1 ) ) )
            // InternalPDSL.g:953:1: ( ( rule__FollowVehicle__NameAssignment_1 ) )
            {
            // InternalPDSL.g:953:1: ( ( rule__FollowVehicle__NameAssignment_1 ) )
            // InternalPDSL.g:954:2: ( rule__FollowVehicle__NameAssignment_1 )
            {
             before(grammarAccess.getFollowVehicleAccess().getNameAssignment_1()); 
            // InternalPDSL.g:955:2: ( rule__FollowVehicle__NameAssignment_1 )
            // InternalPDSL.g:955:3: rule__FollowVehicle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__1__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__2"
    // InternalPDSL.g:963:1: rule__FollowVehicle__Group__2 : rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3 ;
    public final void rule__FollowVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:967:1: ( rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3 )
            // InternalPDSL.g:968:2: rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FollowVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__3();

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
    // $ANTLR end "rule__FollowVehicle__Group__2"


    // $ANTLR start "rule__FollowVehicle__Group__2__Impl"
    // InternalPDSL.g:975:1: rule__FollowVehicle__Group__2__Impl : ( 'front' ) ;
    public final void rule__FollowVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:979:1: ( ( 'front' ) )
            // InternalPDSL.g:980:1: ( 'front' )
            {
            // InternalPDSL.g:980:1: ( 'front' )
            // InternalPDSL.g:981:2: 'front'
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getFrontKeyword_2()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__2__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__3"
    // InternalPDSL.g:990:1: rule__FollowVehicle__Group__3 : rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4 ;
    public final void rule__FollowVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:994:1: ( rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4 )
            // InternalPDSL.g:995:2: rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__FollowVehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__4();

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
    // $ANTLR end "rule__FollowVehicle__Group__3"


    // $ANTLR start "rule__FollowVehicle__Group__3__Impl"
    // InternalPDSL.g:1002:1: rule__FollowVehicle__Group__3__Impl : ( 'runner' ) ;
    public final void rule__FollowVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1006:1: ( ( 'runner' ) )
            // InternalPDSL.g:1007:1: ( 'runner' )
            {
            // InternalPDSL.g:1007:1: ( 'runner' )
            // InternalPDSL.g:1008:2: 'runner'
            {
             before(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_3()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__3__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__4"
    // InternalPDSL.g:1017:1: rule__FollowVehicle__Group__4 : rule__FollowVehicle__Group__4__Impl ;
    public final void rule__FollowVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1021:1: ( rule__FollowVehicle__Group__4__Impl )
            // InternalPDSL.g:1022:2: rule__FollowVehicle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__4__Impl();

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
    // $ANTLR end "rule__FollowVehicle__Group__4"


    // $ANTLR start "rule__FollowVehicle__Group__4__Impl"
    // InternalPDSL.g:1028:1: rule__FollowVehicle__Group__4__Impl : ( ( rule__FollowVehicle__FrontrunnerAssignment_4 ) ) ;
    public final void rule__FollowVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1032:1: ( ( ( rule__FollowVehicle__FrontrunnerAssignment_4 ) ) )
            // InternalPDSL.g:1033:1: ( ( rule__FollowVehicle__FrontrunnerAssignment_4 ) )
            {
            // InternalPDSL.g:1033:1: ( ( rule__FollowVehicle__FrontrunnerAssignment_4 ) )
            // InternalPDSL.g:1034:2: ( rule__FollowVehicle__FrontrunnerAssignment_4 )
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontrunnerAssignment_4()); 
            // InternalPDSL.g:1035:2: ( rule__FollowVehicle__FrontrunnerAssignment_4 )
            // InternalPDSL.g:1035:3: rule__FollowVehicle__FrontrunnerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__FrontrunnerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getFrontrunnerAssignment_4()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__4__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // InternalPDSL.g:1044:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1048:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalPDSL.g:1049:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Forward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__1();

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
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // InternalPDSL.g:1056:1: rule__Forward__Group__0__Impl : ( 'forward(' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1060:1: ( ( 'forward(' ) )
            // InternalPDSL.g:1061:1: ( 'forward(' )
            {
            // InternalPDSL.g:1061:1: ( 'forward(' )
            // InternalPDSL.g:1062:2: 'forward('
            {
             before(grammarAccess.getForwardAccess().getForwardKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getForwardKeyword_0()); 

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
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // InternalPDSL.g:1071:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1075:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalPDSL.g:1076:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Forward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__2();

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
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // InternalPDSL.g:1083:1: rule__Forward__Group__1__Impl : ( ( rule__Forward__DistanceAssignment_1 ) ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1087:1: ( ( ( rule__Forward__DistanceAssignment_1 ) ) )
            // InternalPDSL.g:1088:1: ( ( rule__Forward__DistanceAssignment_1 ) )
            {
            // InternalPDSL.g:1088:1: ( ( rule__Forward__DistanceAssignment_1 ) )
            // InternalPDSL.g:1089:2: ( rule__Forward__DistanceAssignment_1 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_1()); 
            // InternalPDSL.g:1090:2: ( rule__Forward__DistanceAssignment_1 )
            // InternalPDSL.g:1090:3: rule__Forward__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Forward__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__2"
    // InternalPDSL.g:1098:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1102:1: ( rule__Forward__Group__2__Impl )
            // InternalPDSL.g:1103:2: rule__Forward__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__2__Impl();

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
    // $ANTLR end "rule__Forward__Group__2"


    // $ANTLR start "rule__Forward__Group__2__Impl"
    // InternalPDSL.g:1109:1: rule__Forward__Group__2__Impl : ( ')' ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1113:1: ( ( ')' ) )
            // InternalPDSL.g:1114:1: ( ')' )
            {
            // InternalPDSL.g:1114:1: ( ')' )
            // InternalPDSL.g:1115:2: ')'
            {
             before(grammarAccess.getForwardAccess().getRightParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Forward__Group__2__Impl"


    // $ANTLR start "rule__TurnLeft__Group__0"
    // InternalPDSL.g:1125:1: rule__TurnLeft__Group__0 : rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 ;
    public final void rule__TurnLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1129:1: ( rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1 )
            // InternalPDSL.g:1130:2: rule__TurnLeft__Group__0__Impl rule__TurnLeft__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TurnLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__1();

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
    // $ANTLR end "rule__TurnLeft__Group__0"


    // $ANTLR start "rule__TurnLeft__Group__0__Impl"
    // InternalPDSL.g:1137:1: rule__TurnLeft__Group__0__Impl : ( () ) ;
    public final void rule__TurnLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1141:1: ( ( () ) )
            // InternalPDSL.g:1142:1: ( () )
            {
            // InternalPDSL.g:1142:1: ( () )
            // InternalPDSL.g:1143:2: ()
            {
             before(grammarAccess.getTurnLeftAccess().getTurnLeftAction_0()); 
            // InternalPDSL.g:1144:2: ()
            // InternalPDSL.g:1144:3: 
            {
            }

             after(grammarAccess.getTurnLeftAccess().getTurnLeftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnLeft__Group__0__Impl"


    // $ANTLR start "rule__TurnLeft__Group__1"
    // InternalPDSL.g:1152:1: rule__TurnLeft__Group__1 : rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 ;
    public final void rule__TurnLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1156:1: ( rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2 )
            // InternalPDSL.g:1157:2: rule__TurnLeft__Group__1__Impl rule__TurnLeft__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TurnLeft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2();

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
    // $ANTLR end "rule__TurnLeft__Group__1"


    // $ANTLR start "rule__TurnLeft__Group__1__Impl"
    // InternalPDSL.g:1164:1: rule__TurnLeft__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1168:1: ( ( 'turn' ) )
            // InternalPDSL.g:1169:1: ( 'turn' )
            {
            // InternalPDSL.g:1169:1: ( 'turn' )
            // InternalPDSL.g:1170:2: 'turn'
            {
             before(grammarAccess.getTurnLeftAccess().getTurnKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnLeft__Group__1__Impl"


    // $ANTLR start "rule__TurnLeft__Group__2"
    // InternalPDSL.g:1179:1: rule__TurnLeft__Group__2 : rule__TurnLeft__Group__2__Impl ;
    public final void rule__TurnLeft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1183:1: ( rule__TurnLeft__Group__2__Impl )
            // InternalPDSL.g:1184:2: rule__TurnLeft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnLeft__Group__2__Impl();

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
    // $ANTLR end "rule__TurnLeft__Group__2"


    // $ANTLR start "rule__TurnLeft__Group__2__Impl"
    // InternalPDSL.g:1190:1: rule__TurnLeft__Group__2__Impl : ( 'Left' ) ;
    public final void rule__TurnLeft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1194:1: ( ( 'Left' ) )
            // InternalPDSL.g:1195:1: ( 'Left' )
            {
            // InternalPDSL.g:1195:1: ( 'Left' )
            // InternalPDSL.g:1196:2: 'Left'
            {
             before(grammarAccess.getTurnLeftAccess().getLeftKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTurnLeftAccess().getLeftKeyword_2()); 

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
    // $ANTLR end "rule__TurnLeft__Group__2__Impl"


    // $ANTLR start "rule__TurnRight__Group__0"
    // InternalPDSL.g:1206:1: rule__TurnRight__Group__0 : rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 ;
    public final void rule__TurnRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1210:1: ( rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1 )
            // InternalPDSL.g:1211:2: rule__TurnRight__Group__0__Impl rule__TurnRight__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TurnRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__1();

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
    // $ANTLR end "rule__TurnRight__Group__0"


    // $ANTLR start "rule__TurnRight__Group__0__Impl"
    // InternalPDSL.g:1218:1: rule__TurnRight__Group__0__Impl : ( () ) ;
    public final void rule__TurnRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1222:1: ( ( () ) )
            // InternalPDSL.g:1223:1: ( () )
            {
            // InternalPDSL.g:1223:1: ( () )
            // InternalPDSL.g:1224:2: ()
            {
             before(grammarAccess.getTurnRightAccess().getTurnRightAction_0()); 
            // InternalPDSL.g:1225:2: ()
            // InternalPDSL.g:1225:3: 
            {
            }

             after(grammarAccess.getTurnRightAccess().getTurnRightAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnRight__Group__0__Impl"


    // $ANTLR start "rule__TurnRight__Group__1"
    // InternalPDSL.g:1233:1: rule__TurnRight__Group__1 : rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 ;
    public final void rule__TurnRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1237:1: ( rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2 )
            // InternalPDSL.g:1238:2: rule__TurnRight__Group__1__Impl rule__TurnRight__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TurnRight__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2();

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
    // $ANTLR end "rule__TurnRight__Group__1"


    // $ANTLR start "rule__TurnRight__Group__1__Impl"
    // InternalPDSL.g:1245:1: rule__TurnRight__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1249:1: ( ( 'turn' ) )
            // InternalPDSL.g:1250:1: ( 'turn' )
            {
            // InternalPDSL.g:1250:1: ( 'turn' )
            // InternalPDSL.g:1251:2: 'turn'
            {
             before(grammarAccess.getTurnRightAccess().getTurnKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnRight__Group__1__Impl"


    // $ANTLR start "rule__TurnRight__Group__2"
    // InternalPDSL.g:1260:1: rule__TurnRight__Group__2 : rule__TurnRight__Group__2__Impl ;
    public final void rule__TurnRight__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1264:1: ( rule__TurnRight__Group__2__Impl )
            // InternalPDSL.g:1265:2: rule__TurnRight__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnRight__Group__2__Impl();

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
    // $ANTLR end "rule__TurnRight__Group__2"


    // $ANTLR start "rule__TurnRight__Group__2__Impl"
    // InternalPDSL.g:1271:1: rule__TurnRight__Group__2__Impl : ( 'Right' ) ;
    public final void rule__TurnRight__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1275:1: ( ( 'Right' ) )
            // InternalPDSL.g:1276:1: ( 'Right' )
            {
            // InternalPDSL.g:1276:1: ( 'Right' )
            // InternalPDSL.g:1277:2: 'Right'
            {
             before(grammarAccess.getTurnRightAccess().getRightKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTurnRightAccess().getRightKeyword_2()); 

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
    // $ANTLR end "rule__TurnRight__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDSL.g:1287:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1291:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDSL.g:1292:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPDSL.g:1299:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1303:1: ( ( ( '-' )? ) )
            // InternalPDSL.g:1304:1: ( ( '-' )? )
            {
            // InternalPDSL.g:1304:1: ( ( '-' )? )
            // InternalPDSL.g:1305:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDSL.g:1306:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDSL.g:1306:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPDSL.g:1314:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1318:1: ( rule__EInt__Group__1__Impl )
            // InternalPDSL.g:1319:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPDSL.g:1325:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1329:1: ( ( RULE_INT ) )
            // InternalPDSL.g:1330:1: ( RULE_INT )
            {
            // InternalPDSL.g:1330:1: ( RULE_INT )
            // InternalPDSL.g:1331:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Headway__Group__0"
    // InternalPDSL.g:1341:1: rule__Headway__Group__0 : rule__Headway__Group__0__Impl rule__Headway__Group__1 ;
    public final void rule__Headway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1345:1: ( rule__Headway__Group__0__Impl rule__Headway__Group__1 )
            // InternalPDSL.g:1346:2: rule__Headway__Group__0__Impl rule__Headway__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Headway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Headway__Group__1();

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
    // $ANTLR end "rule__Headway__Group__0"


    // $ANTLR start "rule__Headway__Group__0__Impl"
    // InternalPDSL.g:1353:1: rule__Headway__Group__0__Impl : ( ( rule__Headway__LowboundAssignment_0 ) ) ;
    public final void rule__Headway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1357:1: ( ( ( rule__Headway__LowboundAssignment_0 ) ) )
            // InternalPDSL.g:1358:1: ( ( rule__Headway__LowboundAssignment_0 ) )
            {
            // InternalPDSL.g:1358:1: ( ( rule__Headway__LowboundAssignment_0 ) )
            // InternalPDSL.g:1359:2: ( rule__Headway__LowboundAssignment_0 )
            {
             before(grammarAccess.getHeadwayAccess().getLowboundAssignment_0()); 
            // InternalPDSL.g:1360:2: ( rule__Headway__LowboundAssignment_0 )
            // InternalPDSL.g:1360:3: rule__Headway__LowboundAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Headway__LowboundAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayAccess().getLowboundAssignment_0()); 

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
    // $ANTLR end "rule__Headway__Group__0__Impl"


    // $ANTLR start "rule__Headway__Group__1"
    // InternalPDSL.g:1368:1: rule__Headway__Group__1 : rule__Headway__Group__1__Impl rule__Headway__Group__2 ;
    public final void rule__Headway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1372:1: ( rule__Headway__Group__1__Impl rule__Headway__Group__2 )
            // InternalPDSL.g:1373:2: rule__Headway__Group__1__Impl rule__Headway__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Headway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Headway__Group__2();

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
    // $ANTLR end "rule__Headway__Group__1"


    // $ANTLR start "rule__Headway__Group__1__Impl"
    // InternalPDSL.g:1380:1: rule__Headway__Group__1__Impl : ( '<=' ) ;
    public final void rule__Headway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1384:1: ( ( '<=' ) )
            // InternalPDSL.g:1385:1: ( '<=' )
            {
            // InternalPDSL.g:1385:1: ( '<=' )
            // InternalPDSL.g:1386:2: '<='
            {
             before(grammarAccess.getHeadwayAccess().getLessThanSignEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHeadwayAccess().getLessThanSignEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Headway__Group__1__Impl"


    // $ANTLR start "rule__Headway__Group__2"
    // InternalPDSL.g:1395:1: rule__Headway__Group__2 : rule__Headway__Group__2__Impl rule__Headway__Group__3 ;
    public final void rule__Headway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1399:1: ( rule__Headway__Group__2__Impl rule__Headway__Group__3 )
            // InternalPDSL.g:1400:2: rule__Headway__Group__2__Impl rule__Headway__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Headway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Headway__Group__3();

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
    // $ANTLR end "rule__Headway__Group__2"


    // $ANTLR start "rule__Headway__Group__2__Impl"
    // InternalPDSL.g:1407:1: rule__Headway__Group__2__Impl : ( 'headway' ) ;
    public final void rule__Headway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1411:1: ( ( 'headway' ) )
            // InternalPDSL.g:1412:1: ( 'headway' )
            {
            // InternalPDSL.g:1412:1: ( 'headway' )
            // InternalPDSL.g:1413:2: 'headway'
            {
             before(grammarAccess.getHeadwayAccess().getHeadwayKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHeadwayAccess().getHeadwayKeyword_2()); 

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
    // $ANTLR end "rule__Headway__Group__2__Impl"


    // $ANTLR start "rule__Headway__Group__3"
    // InternalPDSL.g:1422:1: rule__Headway__Group__3 : rule__Headway__Group__3__Impl rule__Headway__Group__4 ;
    public final void rule__Headway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1426:1: ( rule__Headway__Group__3__Impl rule__Headway__Group__4 )
            // InternalPDSL.g:1427:2: rule__Headway__Group__3__Impl rule__Headway__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Headway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Headway__Group__4();

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
    // $ANTLR end "rule__Headway__Group__3"


    // $ANTLR start "rule__Headway__Group__3__Impl"
    // InternalPDSL.g:1434:1: rule__Headway__Group__3__Impl : ( '<=' ) ;
    public final void rule__Headway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1438:1: ( ( '<=' ) )
            // InternalPDSL.g:1439:1: ( '<=' )
            {
            // InternalPDSL.g:1439:1: ( '<=' )
            // InternalPDSL.g:1440:2: '<='
            {
             before(grammarAccess.getHeadwayAccess().getLessThanSignEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHeadwayAccess().getLessThanSignEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__Headway__Group__3__Impl"


    // $ANTLR start "rule__Headway__Group__4"
    // InternalPDSL.g:1449:1: rule__Headway__Group__4 : rule__Headway__Group__4__Impl ;
    public final void rule__Headway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1453:1: ( rule__Headway__Group__4__Impl )
            // InternalPDSL.g:1454:2: rule__Headway__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Headway__Group__4__Impl();

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
    // $ANTLR end "rule__Headway__Group__4"


    // $ANTLR start "rule__Headway__Group__4__Impl"
    // InternalPDSL.g:1460:1: rule__Headway__Group__4__Impl : ( ( rule__Headway__UpboundAssignment_4 ) ) ;
    public final void rule__Headway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1464:1: ( ( ( rule__Headway__UpboundAssignment_4 ) ) )
            // InternalPDSL.g:1465:1: ( ( rule__Headway__UpboundAssignment_4 ) )
            {
            // InternalPDSL.g:1465:1: ( ( rule__Headway__UpboundAssignment_4 ) )
            // InternalPDSL.g:1466:2: ( rule__Headway__UpboundAssignment_4 )
            {
             before(grammarAccess.getHeadwayAccess().getUpboundAssignment_4()); 
            // InternalPDSL.g:1467:2: ( rule__Headway__UpboundAssignment_4 )
            // InternalPDSL.g:1467:3: rule__Headway__UpboundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Headway__UpboundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayAccess().getUpboundAssignment_4()); 

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
    // $ANTLR end "rule__Headway__Group__4__Impl"


    // $ANTLR start "rule__World__PlatoonAssignment_0"
    // InternalPDSL.g:1476:1: rule__World__PlatoonAssignment_0 : ( rulePlatoon ) ;
    public final void rule__World__PlatoonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1480:1: ( ( rulePlatoon ) )
            // InternalPDSL.g:1481:2: ( rulePlatoon )
            {
            // InternalPDSL.g:1481:2: ( rulePlatoon )
            // InternalPDSL.g:1482:3: rulePlatoon
            {
             before(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlatoon();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__World__PlatoonAssignment_0"


    // $ANTLR start "rule__World__RoutesAssignment_1"
    // InternalPDSL.g:1491:1: rule__World__RoutesAssignment_1 : ( ruleRoute ) ;
    public final void rule__World__RoutesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1495:1: ( ( ruleRoute ) )
            // InternalPDSL.g:1496:2: ( ruleRoute )
            {
            // InternalPDSL.g:1496:2: ( ruleRoute )
            // InternalPDSL.g:1497:3: ruleRoute
            {
             before(grammarAccess.getWorldAccess().getRoutesRouteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getRoutesRouteParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__World__RoutesAssignment_1"


    // $ANTLR start "rule__World__ConstraintsAssignment_2"
    // InternalPDSL.g:1506:1: rule__World__ConstraintsAssignment_2 : ( ruleConstraints ) ;
    public final void rule__World__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1510:1: ( ( ruleConstraints ) )
            // InternalPDSL.g:1511:2: ( ruleConstraints )
            {
            // InternalPDSL.g:1511:2: ( ruleConstraints )
            // InternalPDSL.g:1512:3: ruleConstraints
            {
             before(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__World__ConstraintsAssignment_2"


    // $ANTLR start "rule__Platoon__LeaderAssignment_1"
    // InternalPDSL.g:1521:1: rule__Platoon__LeaderAssignment_1 : ( ruleLeadVehicle ) ;
    public final void rule__Platoon__LeaderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1525:1: ( ( ruleLeadVehicle ) )
            // InternalPDSL.g:1526:2: ( ruleLeadVehicle )
            {
            // InternalPDSL.g:1526:2: ( ruleLeadVehicle )
            // InternalPDSL.g:1527:3: ruleLeadVehicle
            {
             before(grammarAccess.getPlatoonAccess().getLeaderLeadVehicleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeadVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getLeaderLeadVehicleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Platoon__LeaderAssignment_1"


    // $ANTLR start "rule__Platoon__FollowersAssignment_2"
    // InternalPDSL.g:1536:1: rule__Platoon__FollowersAssignment_2 : ( ruleFollowVehicle ) ;
    public final void rule__Platoon__FollowersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1540:1: ( ( ruleFollowVehicle ) )
            // InternalPDSL.g:1541:2: ( ruleFollowVehicle )
            {
            // InternalPDSL.g:1541:2: ( ruleFollowVehicle )
            // InternalPDSL.g:1542:3: ruleFollowVehicle
            {
             before(grammarAccess.getPlatoonAccess().getFollowersFollowVehicleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFollowVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getFollowersFollowVehicleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Platoon__FollowersAssignment_2"


    // $ANTLR start "rule__Route__NameAssignment_1"
    // InternalPDSL.g:1551:1: rule__Route__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Route__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1555:1: ( ( ruleEString ) )
            // InternalPDSL.g:1556:2: ( ruleEString )
            {
            // InternalPDSL.g:1556:2: ( ruleEString )
            // InternalPDSL.g:1557:3: ruleEString
            {
             before(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Route__NameAssignment_1"


    // $ANTLR start "rule__Route__StepsAssignment_3"
    // InternalPDSL.g:1566:1: rule__Route__StepsAssignment_3 : ( ruleStep ) ;
    public final void rule__Route__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1570:1: ( ( ruleStep ) )
            // InternalPDSL.g:1571:2: ( ruleStep )
            {
            // InternalPDSL.g:1571:2: ( ruleStep )
            // InternalPDSL.g:1572:3: ruleStep
            {
             before(grammarAccess.getRouteAccess().getStepsStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getStepsStepParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Route__StepsAssignment_3"


    // $ANTLR start "rule__Route__StepsAssignment_4"
    // InternalPDSL.g:1581:1: rule__Route__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Route__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1585:1: ( ( ruleStep ) )
            // InternalPDSL.g:1586:2: ( ruleStep )
            {
            // InternalPDSL.g:1586:2: ( ruleStep )
            // InternalPDSL.g:1587:3: ruleStep
            {
             before(grammarAccess.getRouteAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getStepsStepParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Route__StepsAssignment_4"


    // $ANTLR start "rule__Constraints__ListAssignment_1"
    // InternalPDSL.g:1596:1: rule__Constraints__ListAssignment_1 : ( ruleConstraint ) ;
    public final void rule__Constraints__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1600:1: ( ( ruleConstraint ) )
            // InternalPDSL.g:1601:2: ( ruleConstraint )
            {
            // InternalPDSL.g:1601:2: ( ruleConstraint )
            // InternalPDSL.g:1602:3: ruleConstraint
            {
             before(grammarAccess.getConstraintsAccess().getListConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getListConstraintParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraints__ListAssignment_1"


    // $ANTLR start "rule__LeadVehicle__NameAssignment_1"
    // InternalPDSL.g:1611:1: rule__LeadVehicle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LeadVehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1615:1: ( ( ruleEString ) )
            // InternalPDSL.g:1616:2: ( ruleEString )
            {
            // InternalPDSL.g:1616:2: ( ruleEString )
            // InternalPDSL.g:1617:3: ruleEString
            {
             before(grammarAccess.getLeadVehicleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeadVehicleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LeadVehicle__NameAssignment_1"


    // $ANTLR start "rule__LeadVehicle__RouteAssignment_3"
    // InternalPDSL.g:1626:1: rule__LeadVehicle__RouteAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__LeadVehicle__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1630:1: ( ( ( ruleEString ) ) )
            // InternalPDSL.g:1631:2: ( ( ruleEString ) )
            {
            // InternalPDSL.g:1631:2: ( ( ruleEString ) )
            // InternalPDSL.g:1632:3: ( ruleEString )
            {
             before(grammarAccess.getLeadVehicleAccess().getRouteRouteCrossReference_3_0()); 
            // InternalPDSL.g:1633:3: ( ruleEString )
            // InternalPDSL.g:1634:4: ruleEString
            {
             before(grammarAccess.getLeadVehicleAccess().getRouteRouteEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeadVehicleAccess().getRouteRouteEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLeadVehicleAccess().getRouteRouteCrossReference_3_0()); 

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
    // $ANTLR end "rule__LeadVehicle__RouteAssignment_3"


    // $ANTLR start "rule__FollowVehicle__NameAssignment_1"
    // InternalPDSL.g:1645:1: rule__FollowVehicle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FollowVehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1649:1: ( ( ruleEString ) )
            // InternalPDSL.g:1650:2: ( ruleEString )
            {
            // InternalPDSL.g:1650:2: ( ruleEString )
            // InternalPDSL.g:1651:3: ruleEString
            {
             before(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FollowVehicle__NameAssignment_1"


    // $ANTLR start "rule__FollowVehicle__FrontrunnerAssignment_4"
    // InternalPDSL.g:1660:1: rule__FollowVehicle__FrontrunnerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__FollowVehicle__FrontrunnerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1664:1: ( ( ( ruleEString ) ) )
            // InternalPDSL.g:1665:2: ( ( ruleEString ) )
            {
            // InternalPDSL.g:1665:2: ( ( ruleEString ) )
            // InternalPDSL.g:1666:3: ( ruleEString )
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontrunnerVehicleCrossReference_4_0()); 
            // InternalPDSL.g:1667:3: ( ruleEString )
            // InternalPDSL.g:1668:4: ruleEString
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontrunnerVehicleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowVehicleAccess().getFrontrunnerVehicleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFollowVehicleAccess().getFrontrunnerVehicleCrossReference_4_0()); 

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
    // $ANTLR end "rule__FollowVehicle__FrontrunnerAssignment_4"


    // $ANTLR start "rule__Forward__DistanceAssignment_1"
    // InternalPDSL.g:1679:1: rule__Forward__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__Forward__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1683:1: ( ( ruleEInt ) )
            // InternalPDSL.g:1684:2: ( ruleEInt )
            {
            // InternalPDSL.g:1684:2: ( ruleEInt )
            // InternalPDSL.g:1685:3: ruleEInt
            {
             before(grammarAccess.getForwardAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForwardAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Forward__DistanceAssignment_1"


    // $ANTLR start "rule__Headway__LowboundAssignment_0"
    // InternalPDSL.g:1694:1: rule__Headway__LowboundAssignment_0 : ( ruleEInt ) ;
    public final void rule__Headway__LowboundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1698:1: ( ( ruleEInt ) )
            // InternalPDSL.g:1699:2: ( ruleEInt )
            {
            // InternalPDSL.g:1699:2: ( ruleEInt )
            // InternalPDSL.g:1700:3: ruleEInt
            {
             before(grammarAccess.getHeadwayAccess().getLowboundEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHeadwayAccess().getLowboundEIntParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Headway__LowboundAssignment_0"


    // $ANTLR start "rule__Headway__UpboundAssignment_4"
    // InternalPDSL.g:1709:1: rule__Headway__UpboundAssignment_4 : ( ruleEInt ) ;
    public final void rule__Headway__UpboundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDSL.g:1713:1: ( ( ruleEInt ) )
            // InternalPDSL.g:1714:2: ( ruleEInt )
            {
            // InternalPDSL.g:1714:2: ( ruleEInt )
            // InternalPDSL.g:1715:3: ruleEInt
            {
             before(grammarAccess.getHeadwayAccess().getUpboundEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHeadwayAccess().getUpboundEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Headway__UpboundAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});

}