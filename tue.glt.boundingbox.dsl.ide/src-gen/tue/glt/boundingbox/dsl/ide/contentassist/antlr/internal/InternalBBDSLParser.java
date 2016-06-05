package tue.glt.boundingbox.dsl.ide.contentassist.antlr.internal;

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
import tue.glt.boundingbox.dsl.services.BBDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBBDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box'", "':'", "'-'", "'left'", "'right'", "'down'", "'up'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBBDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBBDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBBDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBBDSL.g"; }


    	private BBDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(BBDSLGrammarAccess grammarAccess) {
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
    // InternalBBDSL.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalBBDSL.g:54:1: ( ruleWorld EOF )
            // InternalBBDSL.g:55:1: ruleWorld EOF
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
    // InternalBBDSL.g:62:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:66:2: ( ( ( rule__World__Group__0 ) ) )
            // InternalBBDSL.g:67:2: ( ( rule__World__Group__0 ) )
            {
            // InternalBBDSL.g:67:2: ( ( rule__World__Group__0 ) )
            // InternalBBDSL.g:68:3: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // InternalBBDSL.g:69:3: ( rule__World__Group__0 )
            // InternalBBDSL.g:69:4: rule__World__Group__0
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


    // $ANTLR start "entryRuleMove"
    // InternalBBDSL.g:78:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalBBDSL.g:79:1: ( ruleMove EOF )
            // InternalBBDSL.g:80:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBBDSL.g:87:1: ruleMove : ( ( rule__Move__Alternatives ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:91:2: ( ( ( rule__Move__Alternatives ) ) )
            // InternalBBDSL.g:92:2: ( ( rule__Move__Alternatives ) )
            {
            // InternalBBDSL.g:92:2: ( ( rule__Move__Alternatives ) )
            // InternalBBDSL.g:93:3: ( rule__Move__Alternatives )
            {
             before(grammarAccess.getMoveAccess().getAlternatives()); 
            // InternalBBDSL.g:94:3: ( rule__Move__Alternatives )
            // InternalBBDSL.g:94:4: rule__Move__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Move__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalBBDSL.g:103:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBBDSL.g:104:1: ( ruleEInt EOF )
            // InternalBBDSL.g:105:1: ruleEInt EOF
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
    // InternalBBDSL.g:112:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:116:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBBDSL.g:117:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBBDSL.g:117:2: ( ( rule__EInt__Group__0 ) )
            // InternalBBDSL.g:118:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBBDSL.g:119:3: ( rule__EInt__Group__0 )
            // InternalBBDSL.g:119:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBBDSL.g:128:1: entryRuleMoveLeft : ruleMoveLeft EOF ;
    public final void entryRuleMoveLeft() throws RecognitionException {
        try {
            // InternalBBDSL.g:129:1: ( ruleMoveLeft EOF )
            // InternalBBDSL.g:130:1: ruleMoveLeft EOF
            {
             before(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveLeft();

            state._fsp--;

             after(grammarAccess.getMoveLeftRule()); 
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
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBBDSL.g:137:1: ruleMoveLeft : ( ( rule__MoveLeft__Group__0 ) ) ;
    public final void ruleMoveLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:141:2: ( ( ( rule__MoveLeft__Group__0 ) ) )
            // InternalBBDSL.g:142:2: ( ( rule__MoveLeft__Group__0 ) )
            {
            // InternalBBDSL.g:142:2: ( ( rule__MoveLeft__Group__0 ) )
            // InternalBBDSL.g:143:3: ( rule__MoveLeft__Group__0 )
            {
             before(grammarAccess.getMoveLeftAccess().getGroup()); 
            // InternalBBDSL.g:144:3: ( rule__MoveLeft__Group__0 )
            // InternalBBDSL.g:144:4: rule__MoveLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBBDSL.g:153:1: entryRuleMoveRight : ruleMoveRight EOF ;
    public final void entryRuleMoveRight() throws RecognitionException {
        try {
            // InternalBBDSL.g:154:1: ( ruleMoveRight EOF )
            // InternalBBDSL.g:155:1: ruleMoveRight EOF
            {
             before(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveRight();

            state._fsp--;

             after(grammarAccess.getMoveRightRule()); 
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
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBBDSL.g:162:1: ruleMoveRight : ( ( rule__MoveRight__Group__0 ) ) ;
    public final void ruleMoveRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:166:2: ( ( ( rule__MoveRight__Group__0 ) ) )
            // InternalBBDSL.g:167:2: ( ( rule__MoveRight__Group__0 ) )
            {
            // InternalBBDSL.g:167:2: ( ( rule__MoveRight__Group__0 ) )
            // InternalBBDSL.g:168:3: ( rule__MoveRight__Group__0 )
            {
             before(grammarAccess.getMoveRightAccess().getGroup()); 
            // InternalBBDSL.g:169:3: ( rule__MoveRight__Group__0 )
            // InternalBBDSL.g:169:4: rule__MoveRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBBDSL.g:178:1: entryRuleMoveDown : ruleMoveDown EOF ;
    public final void entryRuleMoveDown() throws RecognitionException {
        try {
            // InternalBBDSL.g:179:1: ( ruleMoveDown EOF )
            // InternalBBDSL.g:180:1: ruleMoveDown EOF
            {
             before(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveDown();

            state._fsp--;

             after(grammarAccess.getMoveDownRule()); 
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
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBBDSL.g:187:1: ruleMoveDown : ( ( rule__MoveDown__Group__0 ) ) ;
    public final void ruleMoveDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:191:2: ( ( ( rule__MoveDown__Group__0 ) ) )
            // InternalBBDSL.g:192:2: ( ( rule__MoveDown__Group__0 ) )
            {
            // InternalBBDSL.g:192:2: ( ( rule__MoveDown__Group__0 ) )
            // InternalBBDSL.g:193:3: ( rule__MoveDown__Group__0 )
            {
             before(grammarAccess.getMoveDownAccess().getGroup()); 
            // InternalBBDSL.g:194:3: ( rule__MoveDown__Group__0 )
            // InternalBBDSL.g:194:4: rule__MoveDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveDown"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBBDSL.g:203:1: entryRuleMoveUp : ruleMoveUp EOF ;
    public final void entryRuleMoveUp() throws RecognitionException {
        try {
            // InternalBBDSL.g:204:1: ( ruleMoveUp EOF )
            // InternalBBDSL.g:205:1: ruleMoveUp EOF
            {
             before(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveUp();

            state._fsp--;

             after(grammarAccess.getMoveUpRule()); 
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
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBBDSL.g:212:1: ruleMoveUp : ( ( rule__MoveUp__Group__0 ) ) ;
    public final void ruleMoveUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:216:2: ( ( ( rule__MoveUp__Group__0 ) ) )
            // InternalBBDSL.g:217:2: ( ( rule__MoveUp__Group__0 ) )
            {
            // InternalBBDSL.g:217:2: ( ( rule__MoveUp__Group__0 ) )
            // InternalBBDSL.g:218:3: ( rule__MoveUp__Group__0 )
            {
             before(grammarAccess.getMoveUpAccess().getGroup()); 
            // InternalBBDSL.g:219:3: ( rule__MoveUp__Group__0 )
            // InternalBBDSL.g:219:4: rule__MoveUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "rule__Move__Alternatives"
    // InternalBBDSL.g:227:1: rule__Move__Alternatives : ( ( ruleMoveLeft ) | ( ruleMoveRight ) | ( ruleMoveDown ) | ( ruleMoveUp ) );
    public final void rule__Move__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:231:1: ( ( ruleMoveLeft ) | ( ruleMoveRight ) | ( ruleMoveDown ) | ( ruleMoveUp ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBBDSL.g:232:2: ( ruleMoveLeft )
                    {
                    // InternalBBDSL.g:232:2: ( ruleMoveLeft )
                    // InternalBBDSL.g:233:3: ruleMoveLeft
                    {
                     before(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveLeft();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBBDSL.g:238:2: ( ruleMoveRight )
                    {
                    // InternalBBDSL.g:238:2: ( ruleMoveRight )
                    // InternalBBDSL.g:239:3: ruleMoveRight
                    {
                     before(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveRight();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBBDSL.g:244:2: ( ruleMoveDown )
                    {
                    // InternalBBDSL.g:244:2: ( ruleMoveDown )
                    // InternalBBDSL.g:245:3: ruleMoveDown
                    {
                     before(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveDown();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBBDSL.g:250:2: ( ruleMoveUp )
                    {
                    // InternalBBDSL.g:250:2: ( ruleMoveUp )
                    // InternalBBDSL.g:251:3: ruleMoveUp
                    {
                     before(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveUp();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_3()); 

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
    // $ANTLR end "rule__Move__Alternatives"


    // $ANTLR start "rule__World__Group__0"
    // InternalBBDSL.g:260:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:264:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalBBDSL.g:265:2: rule__World__Group__0__Impl rule__World__Group__1
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
    // InternalBBDSL.g:272:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:276:1: ( ( () ) )
            // InternalBBDSL.g:277:1: ( () )
            {
            // InternalBBDSL.g:277:1: ( () )
            // InternalBBDSL.g:278:2: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // InternalBBDSL.g:279:2: ()
            // InternalBBDSL.g:279:3: 
            {
            }

             after(grammarAccess.getWorldAccess().getWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__0__Impl"


    // $ANTLR start "rule__World__Group__1"
    // InternalBBDSL.g:287:1: rule__World__Group__1 : rule__World__Group__1__Impl ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:291:1: ( rule__World__Group__1__Impl )
            // InternalBBDSL.g:292:2: rule__World__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__1__Impl();

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
    // InternalBBDSL.g:298:1: rule__World__Group__1__Impl : ( ( rule__World__Group_1__0 )? ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:302:1: ( ( ( rule__World__Group_1__0 )? ) )
            // InternalBBDSL.g:303:1: ( ( rule__World__Group_1__0 )? )
            {
            // InternalBBDSL.g:303:1: ( ( rule__World__Group_1__0 )? )
            // InternalBBDSL.g:304:2: ( rule__World__Group_1__0 )?
            {
             before(grammarAccess.getWorldAccess().getGroup_1()); 
            // InternalBBDSL.g:305:2: ( rule__World__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBBDSL.g:305:3: rule__World__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__World__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorldAccess().getGroup_1()); 

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


    // $ANTLR start "rule__World__Group_1__0"
    // InternalBBDSL.g:314:1: rule__World__Group_1__0 : rule__World__Group_1__0__Impl rule__World__Group_1__1 ;
    public final void rule__World__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:318:1: ( rule__World__Group_1__0__Impl rule__World__Group_1__1 )
            // InternalBBDSL.g:319:2: rule__World__Group_1__0__Impl rule__World__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__World__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group_1__1();

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
    // $ANTLR end "rule__World__Group_1__0"


    // $ANTLR start "rule__World__Group_1__0__Impl"
    // InternalBBDSL.g:326:1: rule__World__Group_1__0__Impl : ( 'Box' ) ;
    public final void rule__World__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:330:1: ( ( 'Box' ) )
            // InternalBBDSL.g:331:1: ( 'Box' )
            {
            // InternalBBDSL.g:331:1: ( 'Box' )
            // InternalBBDSL.g:332:2: 'Box'
            {
             before(grammarAccess.getWorldAccess().getBoxKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getBoxKeyword_1_0()); 

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
    // $ANTLR end "rule__World__Group_1__0__Impl"


    // $ANTLR start "rule__World__Group_1__1"
    // InternalBBDSL.g:341:1: rule__World__Group_1__1 : rule__World__Group_1__1__Impl rule__World__Group_1__2 ;
    public final void rule__World__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:345:1: ( rule__World__Group_1__1__Impl rule__World__Group_1__2 )
            // InternalBBDSL.g:346:2: rule__World__Group_1__1__Impl rule__World__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__World__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group_1__2();

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
    // $ANTLR end "rule__World__Group_1__1"


    // $ANTLR start "rule__World__Group_1__1__Impl"
    // InternalBBDSL.g:353:1: rule__World__Group_1__1__Impl : ( ':' ) ;
    public final void rule__World__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:357:1: ( ( ':' ) )
            // InternalBBDSL.g:358:1: ( ':' )
            {
            // InternalBBDSL.g:358:1: ( ':' )
            // InternalBBDSL.g:359:2: ':'
            {
             before(grammarAccess.getWorldAccess().getColonKeyword_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__World__Group_1__1__Impl"


    // $ANTLR start "rule__World__Group_1__2"
    // InternalBBDSL.g:368:1: rule__World__Group_1__2 : rule__World__Group_1__2__Impl rule__World__Group_1__3 ;
    public final void rule__World__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:372:1: ( rule__World__Group_1__2__Impl rule__World__Group_1__3 )
            // InternalBBDSL.g:373:2: rule__World__Group_1__2__Impl rule__World__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__World__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group_1__3();

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
    // $ANTLR end "rule__World__Group_1__2"


    // $ANTLR start "rule__World__Group_1__2__Impl"
    // InternalBBDSL.g:380:1: rule__World__Group_1__2__Impl : ( ( rule__World__MoveCommandsAssignment_1_2 ) ) ;
    public final void rule__World__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:384:1: ( ( ( rule__World__MoveCommandsAssignment_1_2 ) ) )
            // InternalBBDSL.g:385:1: ( ( rule__World__MoveCommandsAssignment_1_2 ) )
            {
            // InternalBBDSL.g:385:1: ( ( rule__World__MoveCommandsAssignment_1_2 ) )
            // InternalBBDSL.g:386:2: ( rule__World__MoveCommandsAssignment_1_2 )
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_1_2()); 
            // InternalBBDSL.g:387:2: ( rule__World__MoveCommandsAssignment_1_2 )
            // InternalBBDSL.g:387:3: rule__World__MoveCommandsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__World__MoveCommandsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_1_2()); 

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
    // $ANTLR end "rule__World__Group_1__2__Impl"


    // $ANTLR start "rule__World__Group_1__3"
    // InternalBBDSL.g:395:1: rule__World__Group_1__3 : rule__World__Group_1__3__Impl ;
    public final void rule__World__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:399:1: ( rule__World__Group_1__3__Impl )
            // InternalBBDSL.g:400:2: rule__World__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group_1__3__Impl();

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
    // $ANTLR end "rule__World__Group_1__3"


    // $ANTLR start "rule__World__Group_1__3__Impl"
    // InternalBBDSL.g:406:1: rule__World__Group_1__3__Impl : ( ( rule__World__MoveCommandsAssignment_1_3 )* ) ;
    public final void rule__World__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:410:1: ( ( ( rule__World__MoveCommandsAssignment_1_3 )* ) )
            // InternalBBDSL.g:411:1: ( ( rule__World__MoveCommandsAssignment_1_3 )* )
            {
            // InternalBBDSL.g:411:1: ( ( rule__World__MoveCommandsAssignment_1_3 )* )
            // InternalBBDSL.g:412:2: ( rule__World__MoveCommandsAssignment_1_3 )*
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_1_3()); 
            // InternalBBDSL.g:413:2: ( rule__World__MoveCommandsAssignment_1_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBBDSL.g:413:3: rule__World__MoveCommandsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__World__MoveCommandsAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_1_3()); 

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
    // $ANTLR end "rule__World__Group_1__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBBDSL.g:422:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:426:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBBDSL.g:427:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBBDSL.g:434:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:438:1: ( ( ( '-' )? ) )
            // InternalBBDSL.g:439:1: ( ( '-' )? )
            {
            // InternalBBDSL.g:439:1: ( ( '-' )? )
            // InternalBBDSL.g:440:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBBDSL.g:441:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBBDSL.g:441:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalBBDSL.g:449:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:453:1: ( rule__EInt__Group__1__Impl )
            // InternalBBDSL.g:454:2: rule__EInt__Group__1__Impl
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
    // InternalBBDSL.g:460:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:464:1: ( ( RULE_INT ) )
            // InternalBBDSL.g:465:1: ( RULE_INT )
            {
            // InternalBBDSL.g:465:1: ( RULE_INT )
            // InternalBBDSL.g:466:2: RULE_INT
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


    // $ANTLR start "rule__MoveLeft__Group__0"
    // InternalBBDSL.g:476:1: rule__MoveLeft__Group__0 : rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 ;
    public final void rule__MoveLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:480:1: ( rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 )
            // InternalBBDSL.g:481:2: rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MoveLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1();

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
    // $ANTLR end "rule__MoveLeft__Group__0"


    // $ANTLR start "rule__MoveLeft__Group__0__Impl"
    // InternalBBDSL.g:488:1: rule__MoveLeft__Group__0__Impl : ( 'left' ) ;
    public final void rule__MoveLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:492:1: ( ( 'left' ) )
            // InternalBBDSL.g:493:1: ( 'left' )
            {
            // InternalBBDSL.g:493:1: ( 'left' )
            // InternalBBDSL.g:494:2: 'left'
            {
             before(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMoveLeftAccess().getLeftKeyword_0()); 

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
    // $ANTLR end "rule__MoveLeft__Group__0__Impl"


    // $ANTLR start "rule__MoveLeft__Group__1"
    // InternalBBDSL.g:503:1: rule__MoveLeft__Group__1 : rule__MoveLeft__Group__1__Impl ;
    public final void rule__MoveLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:507:1: ( rule__MoveLeft__Group__1__Impl )
            // InternalBBDSL.g:508:2: rule__MoveLeft__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1__Impl();

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
    // $ANTLR end "rule__MoveLeft__Group__1"


    // $ANTLR start "rule__MoveLeft__Group__1__Impl"
    // InternalBBDSL.g:514:1: rule__MoveLeft__Group__1__Impl : ( ( rule__MoveLeft__DistanceAssignment_1 ) ) ;
    public final void rule__MoveLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:518:1: ( ( ( rule__MoveLeft__DistanceAssignment_1 ) ) )
            // InternalBBDSL.g:519:1: ( ( rule__MoveLeft__DistanceAssignment_1 ) )
            {
            // InternalBBDSL.g:519:1: ( ( rule__MoveLeft__DistanceAssignment_1 ) )
            // InternalBBDSL.g:520:2: ( rule__MoveLeft__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); 
            // InternalBBDSL.g:521:2: ( rule__MoveLeft__DistanceAssignment_1 )
            // InternalBBDSL.g:521:3: rule__MoveLeft__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__MoveLeft__Group__1__Impl"


    // $ANTLR start "rule__MoveRight__Group__0"
    // InternalBBDSL.g:530:1: rule__MoveRight__Group__0 : rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 ;
    public final void rule__MoveRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:534:1: ( rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 )
            // InternalBBDSL.g:535:2: rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MoveRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1();

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
    // $ANTLR end "rule__MoveRight__Group__0"


    // $ANTLR start "rule__MoveRight__Group__0__Impl"
    // InternalBBDSL.g:542:1: rule__MoveRight__Group__0__Impl : ( 'right' ) ;
    public final void rule__MoveRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:546:1: ( ( 'right' ) )
            // InternalBBDSL.g:547:1: ( 'right' )
            {
            // InternalBBDSL.g:547:1: ( 'right' )
            // InternalBBDSL.g:548:2: 'right'
            {
             before(grammarAccess.getMoveRightAccess().getRightKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveRightAccess().getRightKeyword_0()); 

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
    // $ANTLR end "rule__MoveRight__Group__0__Impl"


    // $ANTLR start "rule__MoveRight__Group__1"
    // InternalBBDSL.g:557:1: rule__MoveRight__Group__1 : rule__MoveRight__Group__1__Impl ;
    public final void rule__MoveRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:561:1: ( rule__MoveRight__Group__1__Impl )
            // InternalBBDSL.g:562:2: rule__MoveRight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1__Impl();

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
    // $ANTLR end "rule__MoveRight__Group__1"


    // $ANTLR start "rule__MoveRight__Group__1__Impl"
    // InternalBBDSL.g:568:1: rule__MoveRight__Group__1__Impl : ( ( rule__MoveRight__DistanceAssignment_1 ) ) ;
    public final void rule__MoveRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:572:1: ( ( ( rule__MoveRight__DistanceAssignment_1 ) ) )
            // InternalBBDSL.g:573:1: ( ( rule__MoveRight__DistanceAssignment_1 ) )
            {
            // InternalBBDSL.g:573:1: ( ( rule__MoveRight__DistanceAssignment_1 ) )
            // InternalBBDSL.g:574:2: ( rule__MoveRight__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); 
            // InternalBBDSL.g:575:2: ( rule__MoveRight__DistanceAssignment_1 )
            // InternalBBDSL.g:575:3: rule__MoveRight__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__MoveRight__Group__1__Impl"


    // $ANTLR start "rule__MoveDown__Group__0"
    // InternalBBDSL.g:584:1: rule__MoveDown__Group__0 : rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 ;
    public final void rule__MoveDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:588:1: ( rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 )
            // InternalBBDSL.g:589:2: rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MoveDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1();

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
    // $ANTLR end "rule__MoveDown__Group__0"


    // $ANTLR start "rule__MoveDown__Group__0__Impl"
    // InternalBBDSL.g:596:1: rule__MoveDown__Group__0__Impl : ( 'down' ) ;
    public final void rule__MoveDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:600:1: ( ( 'down' ) )
            // InternalBBDSL.g:601:1: ( 'down' )
            {
            // InternalBBDSL.g:601:1: ( 'down' )
            // InternalBBDSL.g:602:2: 'down'
            {
             before(grammarAccess.getMoveDownAccess().getDownKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveDownAccess().getDownKeyword_0()); 

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
    // $ANTLR end "rule__MoveDown__Group__0__Impl"


    // $ANTLR start "rule__MoveDown__Group__1"
    // InternalBBDSL.g:611:1: rule__MoveDown__Group__1 : rule__MoveDown__Group__1__Impl ;
    public final void rule__MoveDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:615:1: ( rule__MoveDown__Group__1__Impl )
            // InternalBBDSL.g:616:2: rule__MoveDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1__Impl();

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
    // $ANTLR end "rule__MoveDown__Group__1"


    // $ANTLR start "rule__MoveDown__Group__1__Impl"
    // InternalBBDSL.g:622:1: rule__MoveDown__Group__1__Impl : ( ( rule__MoveDown__DistanceAssignment_1 ) ) ;
    public final void rule__MoveDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:626:1: ( ( ( rule__MoveDown__DistanceAssignment_1 ) ) )
            // InternalBBDSL.g:627:1: ( ( rule__MoveDown__DistanceAssignment_1 ) )
            {
            // InternalBBDSL.g:627:1: ( ( rule__MoveDown__DistanceAssignment_1 ) )
            // InternalBBDSL.g:628:2: ( rule__MoveDown__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); 
            // InternalBBDSL.g:629:2: ( rule__MoveDown__DistanceAssignment_1 )
            // InternalBBDSL.g:629:3: rule__MoveDown__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__MoveDown__Group__1__Impl"


    // $ANTLR start "rule__MoveUp__Group__0"
    // InternalBBDSL.g:638:1: rule__MoveUp__Group__0 : rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 ;
    public final void rule__MoveUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:642:1: ( rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 )
            // InternalBBDSL.g:643:2: rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MoveUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1();

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
    // $ANTLR end "rule__MoveUp__Group__0"


    // $ANTLR start "rule__MoveUp__Group__0__Impl"
    // InternalBBDSL.g:650:1: rule__MoveUp__Group__0__Impl : ( 'up' ) ;
    public final void rule__MoveUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:654:1: ( ( 'up' ) )
            // InternalBBDSL.g:655:1: ( 'up' )
            {
            // InternalBBDSL.g:655:1: ( 'up' )
            // InternalBBDSL.g:656:2: 'up'
            {
             before(grammarAccess.getMoveUpAccess().getUpKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMoveUpAccess().getUpKeyword_0()); 

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
    // $ANTLR end "rule__MoveUp__Group__0__Impl"


    // $ANTLR start "rule__MoveUp__Group__1"
    // InternalBBDSL.g:665:1: rule__MoveUp__Group__1 : rule__MoveUp__Group__1__Impl ;
    public final void rule__MoveUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:669:1: ( rule__MoveUp__Group__1__Impl )
            // InternalBBDSL.g:670:2: rule__MoveUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1__Impl();

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
    // $ANTLR end "rule__MoveUp__Group__1"


    // $ANTLR start "rule__MoveUp__Group__1__Impl"
    // InternalBBDSL.g:676:1: rule__MoveUp__Group__1__Impl : ( ( rule__MoveUp__DistanceAssignment_1 ) ) ;
    public final void rule__MoveUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:680:1: ( ( ( rule__MoveUp__DistanceAssignment_1 ) ) )
            // InternalBBDSL.g:681:1: ( ( rule__MoveUp__DistanceAssignment_1 ) )
            {
            // InternalBBDSL.g:681:1: ( ( rule__MoveUp__DistanceAssignment_1 ) )
            // InternalBBDSL.g:682:2: ( rule__MoveUp__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); 
            // InternalBBDSL.g:683:2: ( rule__MoveUp__DistanceAssignment_1 )
            // InternalBBDSL.g:683:3: rule__MoveUp__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__MoveUp__Group__1__Impl"


    // $ANTLR start "rule__World__MoveCommandsAssignment_1_2"
    // InternalBBDSL.g:692:1: rule__World__MoveCommandsAssignment_1_2 : ( ruleMove ) ;
    public final void rule__World__MoveCommandsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:696:1: ( ( ruleMove ) )
            // InternalBBDSL.g:697:2: ( ruleMove )
            {
            // InternalBBDSL.g:697:2: ( ruleMove )
            // InternalBBDSL.g:698:3: ruleMove
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__World__MoveCommandsAssignment_1_2"


    // $ANTLR start "rule__World__MoveCommandsAssignment_1_3"
    // InternalBBDSL.g:707:1: rule__World__MoveCommandsAssignment_1_3 : ( ruleMove ) ;
    public final void rule__World__MoveCommandsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:711:1: ( ( ruleMove ) )
            // InternalBBDSL.g:712:2: ( ruleMove )
            {
            // InternalBBDSL.g:712:2: ( ruleMove )
            // InternalBBDSL.g:713:3: ruleMove
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__World__MoveCommandsAssignment_1_3"


    // $ANTLR start "rule__MoveLeft__DistanceAssignment_1"
    // InternalBBDSL.g:722:1: rule__MoveLeft__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveLeft__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:726:1: ( ( ruleEInt ) )
            // InternalBBDSL.g:727:2: ( ruleEInt )
            {
            // InternalBBDSL.g:727:2: ( ruleEInt )
            // InternalBBDSL.g:728:3: ruleEInt
            {
             before(grammarAccess.getMoveLeftAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveLeftAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveLeft__DistanceAssignment_1"


    // $ANTLR start "rule__MoveRight__DistanceAssignment_1"
    // InternalBBDSL.g:737:1: rule__MoveRight__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveRight__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:741:1: ( ( ruleEInt ) )
            // InternalBBDSL.g:742:2: ( ruleEInt )
            {
            // InternalBBDSL.g:742:2: ( ruleEInt )
            // InternalBBDSL.g:743:3: ruleEInt
            {
             before(grammarAccess.getMoveRightAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveRightAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveRight__DistanceAssignment_1"


    // $ANTLR start "rule__MoveDown__DistanceAssignment_1"
    // InternalBBDSL.g:752:1: rule__MoveDown__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveDown__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:756:1: ( ( ruleEInt ) )
            // InternalBBDSL.g:757:2: ( ruleEInt )
            {
            // InternalBBDSL.g:757:2: ( ruleEInt )
            // InternalBBDSL.g:758:3: ruleEInt
            {
             before(grammarAccess.getMoveDownAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveDownAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveDown__DistanceAssignment_1"


    // $ANTLR start "rule__MoveUp__DistanceAssignment_1"
    // InternalBBDSL.g:767:1: rule__MoveUp__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__MoveUp__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBBDSL.g:771:1: ( ( ruleEInt ) )
            // InternalBBDSL.g:772:2: ( ruleEInt )
            {
            // InternalBBDSL.g:772:2: ( ruleEInt )
            // InternalBBDSL.g:773:3: ruleEInt
            {
             before(grammarAccess.getMoveUpAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveUpAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveUp__DistanceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002010L});

}