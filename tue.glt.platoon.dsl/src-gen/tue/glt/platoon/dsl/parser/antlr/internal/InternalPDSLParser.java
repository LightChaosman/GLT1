package tue.glt.platoon.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tue.glt.platoon.dsl.services.PDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDSLParser extends AbstractInternalAntlrParser {
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

        public InternalPDSLParser(TokenStream input, PDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected PDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalPDSL.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalPDSL.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalPDSL.g:65:2: iv_ruleWorld= ruleWorld EOF
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
    // InternalPDSL.g:71:1: ruleWorld returns [EObject current=null] : ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_platoon_0_0 = null;

        EObject lv_routes_1_0 = null;

        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:77:2: ( ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) ) )
            // InternalPDSL.g:78:2: ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) )
            {
            // InternalPDSL.g:78:2: ( ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) ) )
            // InternalPDSL.g:79:3: ( (lv_platoon_0_0= rulePlatoon ) ) ( (lv_routes_1_0= ruleRoute ) ) ( (lv_constraints_2_0= ruleConstraints ) )
            {
            // InternalPDSL.g:79:3: ( (lv_platoon_0_0= rulePlatoon ) )
            // InternalPDSL.g:80:4: (lv_platoon_0_0= rulePlatoon )
            {
            // InternalPDSL.g:80:4: (lv_platoon_0_0= rulePlatoon )
            // InternalPDSL.g:81:5: lv_platoon_0_0= rulePlatoon
            {

            					newCompositeNode(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_platoon_0_0=rulePlatoon();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorldRule());
            					}
            					set(
            						current,
            						"platoon",
            						lv_platoon_0_0,
            						"tue.glt.platoon.dsl.PDSL.Platoon");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDSL.g:98:3: ( (lv_routes_1_0= ruleRoute ) )
            // InternalPDSL.g:99:4: (lv_routes_1_0= ruleRoute )
            {
            // InternalPDSL.g:99:4: (lv_routes_1_0= ruleRoute )
            // InternalPDSL.g:100:5: lv_routes_1_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getWorldAccess().getRoutesRouteParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_routes_1_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorldRule());
            					}
            					set(
            						current,
            						"routes",
            						lv_routes_1_0,
            						"tue.glt.platoon.dsl.PDSL.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDSL.g:117:3: ( (lv_constraints_2_0= ruleConstraints ) )
            // InternalPDSL.g:118:4: (lv_constraints_2_0= ruleConstraints )
            {
            // InternalPDSL.g:118:4: (lv_constraints_2_0= ruleConstraints )
            // InternalPDSL.g:119:5: lv_constraints_2_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_constraints_2_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorldRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_2_0,
            						"tue.glt.platoon.dsl.PDSL.Constraints");
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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleStep"
    // InternalPDSL.g:140:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalPDSL.g:140:45: (iv_ruleStep= ruleStep EOF )
            // InternalPDSL.g:141:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalPDSL.g:147:1: ruleStep returns [EObject current=null] : (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_Forward_0 = null;

        EObject this_TurnLeft_1 = null;

        EObject this_TurnRight_2 = null;



        	enterRule();

        try {
            // InternalPDSL.g:153:2: ( (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight ) )
            // InternalPDSL.g:154:2: (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight )
            {
            // InternalPDSL.g:154:2: (this_Forward_0= ruleForward | this_TurnLeft_1= ruleTurnLeft | this_TurnRight_2= ruleTurnRight )
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
                    // InternalPDSL.g:155:3: this_Forward_0= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getForwardParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_0=ruleForward();

                    state._fsp--;


                    			current = this_Forward_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDSL.g:164:3: this_TurnLeft_1= ruleTurnLeft
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getTurnLeftParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnLeft_1=ruleTurnLeft();

                    state._fsp--;


                    			current = this_TurnLeft_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDSL.g:173:3: this_TurnRight_2= ruleTurnRight
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getTurnRightParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnRight_2=ruleTurnRight();

                    state._fsp--;


                    			current = this_TurnRight_2;
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleConstraint"
    // InternalPDSL.g:185:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPDSL.g:185:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPDSL.g:186:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalPDSL.g:192:1: ruleConstraint returns [EObject current=null] : this_headway_0= ruleheadway ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_headway_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:198:2: (this_headway_0= ruleheadway )
            // InternalPDSL.g:199:2: this_headway_0= ruleheadway
            {

            		newCompositeNode(grammarAccess.getConstraintAccess().getHeadwayParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_headway_0=ruleheadway();

            state._fsp--;


            		current = this_headway_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePlatoon"
    // InternalPDSL.g:210:1: entryRulePlatoon returns [EObject current=null] : iv_rulePlatoon= rulePlatoon EOF ;
    public final EObject entryRulePlatoon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatoon = null;


        try {
            // InternalPDSL.g:210:48: (iv_rulePlatoon= rulePlatoon EOF )
            // InternalPDSL.g:211:2: iv_rulePlatoon= rulePlatoon EOF
            {
             newCompositeNode(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatoon=rulePlatoon();

            state._fsp--;

             current =iv_rulePlatoon; 
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
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPDSL.g:217:1: rulePlatoon returns [EObject current=null] : (otherlv_0= 'platoon:' ( (lv_leader_1_0= ruleLeadVehicle ) ) ( (lv_followers_2_0= ruleFollowVehicle ) )* ) ;
    public final EObject rulePlatoon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_leader_1_0 = null;

        EObject lv_followers_2_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:223:2: ( (otherlv_0= 'platoon:' ( (lv_leader_1_0= ruleLeadVehicle ) ) ( (lv_followers_2_0= ruleFollowVehicle ) )* ) )
            // InternalPDSL.g:224:2: (otherlv_0= 'platoon:' ( (lv_leader_1_0= ruleLeadVehicle ) ) ( (lv_followers_2_0= ruleFollowVehicle ) )* )
            {
            // InternalPDSL.g:224:2: (otherlv_0= 'platoon:' ( (lv_leader_1_0= ruleLeadVehicle ) ) ( (lv_followers_2_0= ruleFollowVehicle ) )* )
            // InternalPDSL.g:225:3: otherlv_0= 'platoon:' ( (lv_leader_1_0= ruleLeadVehicle ) ) ( (lv_followers_2_0= ruleFollowVehicle ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatoonAccess().getPlatoonKeyword_0());
            		
            // InternalPDSL.g:229:3: ( (lv_leader_1_0= ruleLeadVehicle ) )
            // InternalPDSL.g:230:4: (lv_leader_1_0= ruleLeadVehicle )
            {
            // InternalPDSL.g:230:4: (lv_leader_1_0= ruleLeadVehicle )
            // InternalPDSL.g:231:5: lv_leader_1_0= ruleLeadVehicle
            {

            					newCompositeNode(grammarAccess.getPlatoonAccess().getLeaderLeadVehicleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_leader_1_0=ruleLeadVehicle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatoonRule());
            					}
            					set(
            						current,
            						"leader",
            						lv_leader_1_0,
            						"tue.glt.platoon.dsl.PDSL.LeadVehicle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDSL.g:248:3: ( (lv_followers_2_0= ruleFollowVehicle ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDSL.g:249:4: (lv_followers_2_0= ruleFollowVehicle )
            	    {
            	    // InternalPDSL.g:249:4: (lv_followers_2_0= ruleFollowVehicle )
            	    // InternalPDSL.g:250:5: lv_followers_2_0= ruleFollowVehicle
            	    {

            	    					newCompositeNode(grammarAccess.getPlatoonAccess().getFollowersFollowVehicleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_followers_2_0=ruleFollowVehicle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatoonRule());
            	    					}
            	    					add(
            	    						current,
            	    						"followers",
            	    						lv_followers_2_0,
            	    						"tue.glt.platoon.dsl.PDSL.FollowVehicle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleRoute"
    // InternalPDSL.g:271:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalPDSL.g:271:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalPDSL.g:272:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPDSL.g:278:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:284:2: ( (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* ) )
            // InternalPDSL.g:285:2: (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )
            {
            // InternalPDSL.g:285:2: (otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )
            // InternalPDSL.g:286:3: otherlv_0= 'route' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            // InternalPDSL.g:290:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDSL.g:291:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDSL.g:291:4: (lv_name_1_0= ruleEString )
            // InternalPDSL.g:292:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"tue.glt.platoon.dsl.PDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getColonKeyword_2());
            		
            // InternalPDSL.g:313:3: ( (lv_steps_3_0= ruleStep ) )
            // InternalPDSL.g:314:4: (lv_steps_3_0= ruleStep )
            {
            // InternalPDSL.g:314:4: (lv_steps_3_0= ruleStep )
            // InternalPDSL.g:315:5: lv_steps_3_0= ruleStep
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getStepsStepParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_steps_3_0=ruleStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"steps",
            						lv_steps_3_0,
            						"tue.glt.platoon.dsl.PDSL.Step");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDSL.g:332:3: ( (lv_steps_4_0= ruleStep ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDSL.g:333:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalPDSL.g:333:4: (lv_steps_4_0= ruleStep )
            	    // InternalPDSL.g:334:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_4_0,
            	    						"tue.glt.platoon.dsl.PDSL.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleConstraints"
    // InternalPDSL.g:355:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalPDSL.g:355:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalPDSL.g:356:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPDSL.g:362:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'constraints:' ( (lv_list_1_0= ruleConstraint ) ) ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:368:2: ( (otherlv_0= 'constraints:' ( (lv_list_1_0= ruleConstraint ) ) ) )
            // InternalPDSL.g:369:2: (otherlv_0= 'constraints:' ( (lv_list_1_0= ruleConstraint ) ) )
            {
            // InternalPDSL.g:369:2: (otherlv_0= 'constraints:' ( (lv_list_1_0= ruleConstraint ) ) )
            // InternalPDSL.g:370:3: otherlv_0= 'constraints:' ( (lv_list_1_0= ruleConstraint ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
            		
            // InternalPDSL.g:374:3: ( (lv_list_1_0= ruleConstraint ) )
            // InternalPDSL.g:375:4: (lv_list_1_0= ruleConstraint )
            {
            // InternalPDSL.g:375:4: (lv_list_1_0= ruleConstraint )
            // InternalPDSL.g:376:5: lv_list_1_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getListConstraintParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_1_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_1_0,
            						"tue.glt.platoon.dsl.PDSL.Constraint");
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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleLeadVehicle"
    // InternalPDSL.g:397:1: entryRuleLeadVehicle returns [EObject current=null] : iv_ruleLeadVehicle= ruleLeadVehicle EOF ;
    public final EObject entryRuleLeadVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeadVehicle = null;


        try {
            // InternalPDSL.g:397:52: (iv_ruleLeadVehicle= ruleLeadVehicle EOF )
            // InternalPDSL.g:398:2: iv_ruleLeadVehicle= ruleLeadVehicle EOF
            {
             newCompositeNode(grammarAccess.getLeadVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeadVehicle=ruleLeadVehicle();

            state._fsp--;

             current =iv_ruleLeadVehicle; 
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
    // $ANTLR end "entryRuleLeadVehicle"


    // $ANTLR start "ruleLeadVehicle"
    // InternalPDSL.g:404:1: ruleLeadVehicle returns [EObject current=null] : (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) ) ;
    public final EObject ruleLeadVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:410:2: ( (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) ) )
            // InternalPDSL.g:411:2: (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) )
            {
            // InternalPDSL.g:411:2: (otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) )
            // InternalPDSL.g:412:3: otherlv_0= 'LV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLeadVehicleAccess().getLVKeyword_0());
            		
            // InternalPDSL.g:416:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDSL.g:417:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDSL.g:417:4: (lv_name_1_0= ruleEString )
            // InternalPDSL.g:418:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeadVehicleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeadVehicleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"tue.glt.platoon.dsl.PDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLeadVehicleAccess().getRouteKeyword_2());
            		
            // InternalPDSL.g:439:3: ( ( ruleEString ) )
            // InternalPDSL.g:440:4: ( ruleEString )
            {
            // InternalPDSL.g:440:4: ( ruleEString )
            // InternalPDSL.g:441:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeadVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLeadVehicleAccess().getRouteRouteCrossReference_3_0());
            				
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
    // $ANTLR end "ruleLeadVehicle"


    // $ANTLR start "entryRuleFollowVehicle"
    // InternalPDSL.g:459:1: entryRuleFollowVehicle returns [EObject current=null] : iv_ruleFollowVehicle= ruleFollowVehicle EOF ;
    public final EObject entryRuleFollowVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowVehicle = null;


        try {
            // InternalPDSL.g:459:54: (iv_ruleFollowVehicle= ruleFollowVehicle EOF )
            // InternalPDSL.g:460:2: iv_ruleFollowVehicle= ruleFollowVehicle EOF
            {
             newCompositeNode(grammarAccess.getFollowVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFollowVehicle=ruleFollowVehicle();

            state._fsp--;

             current =iv_ruleFollowVehicle; 
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
    // $ANTLR end "entryRuleFollowVehicle"


    // $ANTLR start "ruleFollowVehicle"
    // InternalPDSL.g:466:1: ruleFollowVehicle returns [EObject current=null] : (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) ) ;
    public final EObject ruleFollowVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:472:2: ( (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) ) )
            // InternalPDSL.g:473:2: (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) )
            {
            // InternalPDSL.g:473:2: (otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) )
            // InternalPDSL.g:474:3: otherlv_0= 'FV' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowVehicleAccess().getFVKeyword_0());
            		
            // InternalPDSL.g:478:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPDSL.g:479:4: (lv_name_1_0= ruleEString )
            {
            // InternalPDSL.g:479:4: (lv_name_1_0= ruleEString )
            // InternalPDSL.g:480:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFollowVehicleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"tue.glt.platoon.dsl.PDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFollowVehicleAccess().getFrontKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFollowVehicleAccess().getRunnerKeyword_3());
            		
            // InternalPDSL.g:505:3: ( ( ruleEString ) )
            // InternalPDSL.g:506:4: ( ruleEString )
            {
            // InternalPDSL.g:506:4: ( ruleEString )
            // InternalPDSL.g:507:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFollowVehicleAccess().getFrontrunnerVehicleCrossReference_4_0());
            				
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
    // $ANTLR end "ruleFollowVehicle"


    // $ANTLR start "entryRuleEString"
    // InternalPDSL.g:525:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPDSL.g:525:47: (iv_ruleEString= ruleEString EOF )
            // InternalPDSL.g:526:2: iv_ruleEString= ruleEString EOF
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
    // InternalPDSL.g:532:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPDSL.g:538:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPDSL.g:539:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPDSL.g:539:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPDSL.g:540:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPDSL.g:548:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleForward"
    // InternalPDSL.g:559:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalPDSL.g:559:48: (iv_ruleForward= ruleForward EOF )
            // InternalPDSL.g:560:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalPDSL.g:566:1: ruleForward returns [EObject current=null] : (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:572:2: ( (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' ) )
            // InternalPDSL.g:573:2: (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' )
            {
            // InternalPDSL.g:573:2: (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' )
            // InternalPDSL.g:574:3: otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
            		
            // InternalPDSL.g:578:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalPDSL.g:579:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalPDSL.g:579:4: (lv_distance_1_0= ruleEInt )
            // InternalPDSL.g:580:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getForwardAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"tue.glt.platoon.dsl.PDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getForwardAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleTurnLeft"
    // InternalPDSL.g:605:1: entryRuleTurnLeft returns [EObject current=null] : iv_ruleTurnLeft= ruleTurnLeft EOF ;
    public final EObject entryRuleTurnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnLeft = null;


        try {
            // InternalPDSL.g:605:49: (iv_ruleTurnLeft= ruleTurnLeft EOF )
            // InternalPDSL.g:606:2: iv_ruleTurnLeft= ruleTurnLeft EOF
            {
             newCompositeNode(grammarAccess.getTurnLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnLeft=ruleTurnLeft();

            state._fsp--;

             current =iv_ruleTurnLeft; 
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
    // $ANTLR end "entryRuleTurnLeft"


    // $ANTLR start "ruleTurnLeft"
    // InternalPDSL.g:612:1: ruleTurnLeft returns [EObject current=null] : ( () otherlv_1= 'turn' otherlv_2= 'Left' ) ;
    public final EObject ruleTurnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPDSL.g:618:2: ( ( () otherlv_1= 'turn' otherlv_2= 'Left' ) )
            // InternalPDSL.g:619:2: ( () otherlv_1= 'turn' otherlv_2= 'Left' )
            {
            // InternalPDSL.g:619:2: ( () otherlv_1= 'turn' otherlv_2= 'Left' )
            // InternalPDSL.g:620:3: () otherlv_1= 'turn' otherlv_2= 'Left'
            {
            // InternalPDSL.g:620:3: ()
            // InternalPDSL.g:621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnLeftAccess().getTurnLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnLeftAccess().getTurnKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnLeftAccess().getLeftKeyword_2());
            		

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
    // $ANTLR end "ruleTurnLeft"


    // $ANTLR start "entryRuleTurnRight"
    // InternalPDSL.g:639:1: entryRuleTurnRight returns [EObject current=null] : iv_ruleTurnRight= ruleTurnRight EOF ;
    public final EObject entryRuleTurnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnRight = null;


        try {
            // InternalPDSL.g:639:50: (iv_ruleTurnRight= ruleTurnRight EOF )
            // InternalPDSL.g:640:2: iv_ruleTurnRight= ruleTurnRight EOF
            {
             newCompositeNode(grammarAccess.getTurnRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnRight=ruleTurnRight();

            state._fsp--;

             current =iv_ruleTurnRight; 
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
    // $ANTLR end "entryRuleTurnRight"


    // $ANTLR start "ruleTurnRight"
    // InternalPDSL.g:646:1: ruleTurnRight returns [EObject current=null] : ( () otherlv_1= 'turn' otherlv_2= 'Right' ) ;
    public final EObject ruleTurnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPDSL.g:652:2: ( ( () otherlv_1= 'turn' otherlv_2= 'Right' ) )
            // InternalPDSL.g:653:2: ( () otherlv_1= 'turn' otherlv_2= 'Right' )
            {
            // InternalPDSL.g:653:2: ( () otherlv_1= 'turn' otherlv_2= 'Right' )
            // InternalPDSL.g:654:3: () otherlv_1= 'turn' otherlv_2= 'Right'
            {
            // InternalPDSL.g:654:3: ()
            // InternalPDSL.g:655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnRightAccess().getTurnRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnRightAccess().getTurnKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTurnRightAccess().getRightKeyword_2());
            		

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
    // $ANTLR end "ruleTurnRight"


    // $ANTLR start "entryRuleEInt"
    // InternalPDSL.g:673:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPDSL.g:673:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPDSL.g:674:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalPDSL.g:680:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPDSL.g:686:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPDSL.g:687:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPDSL.g:687:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPDSL.g:688:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPDSL.g:688:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDSL.g:689:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_17); 

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


    // $ANTLR start "entryRuleheadway"
    // InternalPDSL.g:706:1: entryRuleheadway returns [EObject current=null] : iv_ruleheadway= ruleheadway EOF ;
    public final EObject entryRuleheadway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleheadway = null;


        try {
            // InternalPDSL.g:706:48: (iv_ruleheadway= ruleheadway EOF )
            // InternalPDSL.g:707:2: iv_ruleheadway= ruleheadway EOF
            {
             newCompositeNode(grammarAccess.getHeadwayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleheadway=ruleheadway();

            state._fsp--;

             current =iv_ruleheadway; 
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
    // $ANTLR end "entryRuleheadway"


    // $ANTLR start "ruleheadway"
    // InternalPDSL.g:713:1: ruleheadway returns [EObject current=null] : ( ( (lv_lowbound_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_upbound_4_0= ruleEInt ) ) ) ;
    public final EObject ruleheadway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_lowbound_0_0 = null;

        AntlrDatatypeRuleToken lv_upbound_4_0 = null;



        	enterRule();

        try {
            // InternalPDSL.g:719:2: ( ( ( (lv_lowbound_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_upbound_4_0= ruleEInt ) ) ) )
            // InternalPDSL.g:720:2: ( ( (lv_lowbound_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_upbound_4_0= ruleEInt ) ) )
            {
            // InternalPDSL.g:720:2: ( ( (lv_lowbound_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_upbound_4_0= ruleEInt ) ) )
            // InternalPDSL.g:721:3: ( (lv_lowbound_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_upbound_4_0= ruleEInt ) )
            {
            // InternalPDSL.g:721:3: ( (lv_lowbound_0_0= ruleEInt ) )
            // InternalPDSL.g:722:4: (lv_lowbound_0_0= ruleEInt )
            {
            // InternalPDSL.g:722:4: (lv_lowbound_0_0= ruleEInt )
            // InternalPDSL.g:723:5: lv_lowbound_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getHeadwayAccess().getLowboundEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_lowbound_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadwayRule());
            					}
            					set(
            						current,
            						"lowbound",
            						lv_lowbound_0_0,
            						"tue.glt.platoon.dsl.PDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getHeadwayAccess().getLessThanSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadwayAccess().getHeadwayKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getHeadwayAccess().getLessThanSignEqualsSignKeyword_3());
            		
            // InternalPDSL.g:752:3: ( (lv_upbound_4_0= ruleEInt ) )
            // InternalPDSL.g:753:4: (lv_upbound_4_0= ruleEInt )
            {
            // InternalPDSL.g:753:4: (lv_upbound_4_0= ruleEInt )
            // InternalPDSL.g:754:5: lv_upbound_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getHeadwayAccess().getUpboundEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_upbound_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadwayRule());
            					}
            					set(
            						current,
            						"upbound",
            						lv_upbound_4_0,
            						"tue.glt.platoon.dsl.PDSL.EInt");
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
    // $ANTLR end "ruleheadway"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}