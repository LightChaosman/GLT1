package tue.glt.boundingbox.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tue.glt.boundingbox.dsl.services.BBDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBBDSLParser extends AbstractInternalAntlrParser {
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

        public InternalBBDSLParser(TokenStream input, BBDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected BBDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalBBDSL.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalBBDSL.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalBBDSL.g:65:2: iv_ruleWorld= ruleWorld EOF
            {
             newCompositeNode(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorld=ruleWorld();

            state._fsp--;

             current =iv_ruleWorld; 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalBBDSL.g:71:1: ruleWorld returns [EObject current=null] : ( () (otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_moveCommands_3_0 = null;

        EObject lv_moveCommands_4_0 = null;



        	enterRule();

        try {
            // InternalBBDSL.g:77:2: ( ( () (otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? ) )
            // InternalBBDSL.g:78:2: ( () (otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? )
            {
            // InternalBBDSL.g:78:2: ( () (otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )? )
            // InternalBBDSL.g:79:3: () (otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )?
            {
            // InternalBBDSL.g:79:3: ()
            // InternalBBDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorldAccess().getWorldAction_0(),
            					current);
            			

            }

            // InternalBBDSL.g:86:3: (otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBBDSL.g:87:4: otherlv_1= 'Box' otherlv_2= ':' ( (lv_moveCommands_3_0= ruleMove ) ) ( (lv_moveCommands_4_0= ruleMove ) )*
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getWorldAccess().getBoxKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorldAccess().getColonKeyword_1_1());
                    			
                    // InternalBBDSL.g:95:4: ( (lv_moveCommands_3_0= ruleMove ) )
                    // InternalBBDSL.g:96:5: (lv_moveCommands_3_0= ruleMove )
                    {
                    // InternalBBDSL.g:96:5: (lv_moveCommands_3_0= ruleMove )
                    // InternalBBDSL.g:97:6: lv_moveCommands_3_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_moveCommands_3_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorldRule());
                    						}
                    						add(
                    							current,
                    							"moveCommands",
                    							lv_moveCommands_3_0,
                    							"tue.glt.boundingbox.dsl.BBDSL.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBBDSL.g:114:4: ( (lv_moveCommands_4_0= ruleMove ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=14 && LA1_0<=17)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBBDSL.g:115:5: (lv_moveCommands_4_0= ruleMove )
                    	    {
                    	    // InternalBBDSL.g:115:5: (lv_moveCommands_4_0= ruleMove )
                    	    // InternalBBDSL.g:116:6: lv_moveCommands_4_0= ruleMove
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_moveCommands_4_0=ruleMove();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"moveCommands",
                    	    							lv_moveCommands_4_0,
                    	    							"tue.glt.boundingbox.dsl.BBDSL.Move");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBBDSL.g:138:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalBBDSL.g:138:45: (iv_ruleMove= ruleMove EOF )
            // InternalBBDSL.g:139:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBBDSL.g:145:1: ruleMove returns [EObject current=null] : (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveDown_2= ruleMoveDown | this_MoveUp_3= ruleMoveUp ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_MoveLeft_0 = null;

        EObject this_MoveRight_1 = null;

        EObject this_MoveDown_2 = null;

        EObject this_MoveUp_3 = null;



        	enterRule();

        try {
            // InternalBBDSL.g:151:2: ( (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveDown_2= ruleMoveDown | this_MoveUp_3= ruleMoveUp ) )
            // InternalBBDSL.g:152:2: (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveDown_2= ruleMoveDown | this_MoveUp_3= ruleMoveUp )
            {
            // InternalBBDSL.g:152:2: (this_MoveLeft_0= ruleMoveLeft | this_MoveRight_1= ruleMoveRight | this_MoveDown_2= ruleMoveDown | this_MoveUp_3= ruleMoveUp )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBBDSL.g:153:3: this_MoveLeft_0= ruleMoveLeft
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveLeft_0=ruleMoveLeft();

                    state._fsp--;


                    			current = this_MoveLeft_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBBDSL.g:162:3: this_MoveRight_1= ruleMoveRight
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveRight_1=ruleMoveRight();

                    state._fsp--;


                    			current = this_MoveRight_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBBDSL.g:171:3: this_MoveDown_2= ruleMoveDown
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveDown_2=ruleMoveDown();

                    state._fsp--;


                    			current = this_MoveDown_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBBDSL.g:180:3: this_MoveUp_3= ruleMoveUp
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoveUp_3=ruleMoveUp();

                    state._fsp--;


                    			current = this_MoveUp_3;
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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalBBDSL.g:192:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBBDSL.g:192:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBBDSL.g:193:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBBDSL.g:199:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBBDSL.g:205:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBBDSL.g:206:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBBDSL.g:206:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBBDSL.g:207:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBBDSL.g:207:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBBDSL.g:208:4: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBBDSL.g:225:1: entryRuleMoveLeft returns [EObject current=null] : iv_ruleMoveLeft= ruleMoveLeft EOF ;
    public final EObject entryRuleMoveLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveLeft = null;


        try {
            // InternalBBDSL.g:225:49: (iv_ruleMoveLeft= ruleMoveLeft EOF )
            // InternalBBDSL.g:226:2: iv_ruleMoveLeft= ruleMoveLeft EOF
            {
             newCompositeNode(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveLeft=ruleMoveLeft();

            state._fsp--;

             current =iv_ruleMoveLeft; 
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
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBBDSL.g:232:1: ruleMoveLeft returns [EObject current=null] : (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBBDSL.g:238:2: ( (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBBDSL.g:239:2: (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBBDSL.g:239:2: (otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBBDSL.g:240:3: otherlv_0= 'left' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveLeftAccess().getLeftKeyword_0());
            		
            // InternalBBDSL.g:244:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBBDSL.g:245:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBBDSL.g:245:4: (lv_distance_1_0= ruleEInt )
            // InternalBBDSL.g:246:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveLeftAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveLeftRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"tue.glt.boundingbox.dsl.BBDSL.EInt");
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
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBBDSL.g:267:1: entryRuleMoveRight returns [EObject current=null] : iv_ruleMoveRight= ruleMoveRight EOF ;
    public final EObject entryRuleMoveRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveRight = null;


        try {
            // InternalBBDSL.g:267:50: (iv_ruleMoveRight= ruleMoveRight EOF )
            // InternalBBDSL.g:268:2: iv_ruleMoveRight= ruleMoveRight EOF
            {
             newCompositeNode(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveRight=ruleMoveRight();

            state._fsp--;

             current =iv_ruleMoveRight; 
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
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBBDSL.g:274:1: ruleMoveRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBBDSL.g:280:2: ( (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBBDSL.g:281:2: (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBBDSL.g:281:2: (otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBBDSL.g:282:3: otherlv_0= 'right' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveRightAccess().getRightKeyword_0());
            		
            // InternalBBDSL.g:286:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBBDSL.g:287:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBBDSL.g:287:4: (lv_distance_1_0= ruleEInt )
            // InternalBBDSL.g:288:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveRightAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRightRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"tue.glt.boundingbox.dsl.BBDSL.EInt");
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
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBBDSL.g:309:1: entryRuleMoveDown returns [EObject current=null] : iv_ruleMoveDown= ruleMoveDown EOF ;
    public final EObject entryRuleMoveDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDown = null;


        try {
            // InternalBBDSL.g:309:49: (iv_ruleMoveDown= ruleMoveDown EOF )
            // InternalBBDSL.g:310:2: iv_ruleMoveDown= ruleMoveDown EOF
            {
             newCompositeNode(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveDown=ruleMoveDown();

            state._fsp--;

             current =iv_ruleMoveDown; 
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
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBBDSL.g:316:1: ruleMoveDown returns [EObject current=null] : (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBBDSL.g:322:2: ( (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBBDSL.g:323:2: (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBBDSL.g:323:2: (otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBBDSL.g:324:3: otherlv_0= 'down' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveDownAccess().getDownKeyword_0());
            		
            // InternalBBDSL.g:328:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBBDSL.g:329:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBBDSL.g:329:4: (lv_distance_1_0= ruleEInt )
            // InternalBBDSL.g:330:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveDownAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveDownRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"tue.glt.boundingbox.dsl.BBDSL.EInt");
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
    // $ANTLR end "ruleMoveDown"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBBDSL.g:351:1: entryRuleMoveUp returns [EObject current=null] : iv_ruleMoveUp= ruleMoveUp EOF ;
    public final EObject entryRuleMoveUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveUp = null;


        try {
            // InternalBBDSL.g:351:47: (iv_ruleMoveUp= ruleMoveUp EOF )
            // InternalBBDSL.g:352:2: iv_ruleMoveUp= ruleMoveUp EOF
            {
             newCompositeNode(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveUp=ruleMoveUp();

            state._fsp--;

             current =iv_ruleMoveUp; 
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
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBBDSL.g:358:1: ruleMoveUp returns [EObject current=null] : (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) ) ;
    public final EObject ruleMoveUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalBBDSL.g:364:2: ( (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) ) )
            // InternalBBDSL.g:365:2: (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) )
            {
            // InternalBBDSL.g:365:2: (otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) ) )
            // InternalBBDSL.g:366:3: otherlv_0= 'up' ( (lv_distance_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveUpAccess().getUpKeyword_0());
            		
            // InternalBBDSL.g:370:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalBBDSL.g:371:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalBBDSL.g:371:4: (lv_distance_1_0= ruleEInt )
            // InternalBBDSL.g:372:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveUpAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveUpRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"tue.glt.boundingbox.dsl.BBDSL.EInt");
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
    // $ANTLR end "ruleMoveUp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});

}