package ics.helper.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ics.helper.services.HelperDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelperDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'schedule'", "'{'", "'}'", "'event'", "'from'", "'to'", "'at'", "'description'", "'link'", "'split'", "'by'", "'merge'", "'into'", "'modify'", "'set'", "'time'", "'owner'", "'location'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHelperDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelperDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelperDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHelperDSL.g"; }



     	private HelperDSLGrammarAccess grammarAccess;

        public InternalHelperDSLParser(TokenStream input, HelperDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HelperDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHelperDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHelperDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalHelperDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHelperDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalHelperDSL.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalHelperDSL.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21||LA1_0==23||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHelperDSL.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalHelperDSL.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalHelperDSL.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"ics.helper.HelperDSL.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalHelperDSL.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalHelperDSL.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalHelperDSL.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalHelperDSL.g:107:1: ruleCommand returns [EObject current=null] : (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CreateCommand_0 = null;

        EObject this_SplitCommand_1 = null;

        EObject this_MergeCommand_2 = null;

        EObject this_ModifyCommand_3 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:113:2: ( (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand ) )
            // InternalHelperDSL.g:114:2: (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand )
            {
            // InternalHelperDSL.g:114:2: (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHelperDSL.g:115:3: this_CreateCommand_0= ruleCreateCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCreateCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateCommand_0=ruleCreateCommand();

                    state._fsp--;


                    			current = this_CreateCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:124:3: this_SplitCommand_1= ruleSplitCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSplitCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitCommand_1=ruleSplitCommand();

                    state._fsp--;


                    			current = this_SplitCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHelperDSL.g:133:3: this_MergeCommand_2= ruleMergeCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getMergeCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeCommand_2=ruleMergeCommand();

                    state._fsp--;


                    			current = this_MergeCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHelperDSL.g:142:3: this_ModifyCommand_3= ruleModifyCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getModifyCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModifyCommand_3=ruleModifyCommand();

                    state._fsp--;


                    			current = this_ModifyCommand_3;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCreateCommand"
    // InternalHelperDSL.g:154:1: entryRuleCreateCommand returns [EObject current=null] : iv_ruleCreateCommand= ruleCreateCommand EOF ;
    public final EObject entryRuleCreateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateCommand = null;


        try {
            // InternalHelperDSL.g:154:54: (iv_ruleCreateCommand= ruleCreateCommand EOF )
            // InternalHelperDSL.g:155:2: iv_ruleCreateCommand= ruleCreateCommand EOF
            {
             newCompositeNode(grammarAccess.getCreateCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateCommand=ruleCreateCommand();

            state._fsp--;

             current =iv_ruleCreateCommand; 
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
    // $ANTLR end "entryRuleCreateCommand"


    // $ANTLR start "ruleCreateCommand"
    // InternalHelperDSL.g:161:1: ruleCreateCommand returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) ;
    public final EObject ruleCreateCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_events_4_0 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:167:2: ( (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) )
            // InternalHelperDSL.g:168:2: (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            {
            // InternalHelperDSL.g:168:2: (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            // InternalHelperDSL.g:169:3: otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCommandAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateCommandAccess().getScheduleKeyword_1());
            		
            // InternalHelperDSL.g:177:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHelperDSL.g:178:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHelperDSL.g:178:4: (lv_name_2_0= RULE_ID )
            // InternalHelperDSL.g:179:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCreateCommandAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateCommandAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalHelperDSL.g:199:3: ( (lv_events_4_0= ruleEvent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHelperDSL.g:200:4: (lv_events_4_0= ruleEvent )
            	    {
            	    // InternalHelperDSL.g:200:4: (lv_events_4_0= ruleEvent )
            	    // InternalHelperDSL.g:201:5: lv_events_4_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getCreateCommandAccess().getEventsEventParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_events_4_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreateCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_4_0,
            	    						"ics.helper.HelperDSL.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateCommandAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCreateCommand"


    // $ANTLR start "entryRuleEvent"
    // InternalHelperDSL.g:226:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalHelperDSL.g:226:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalHelperDSL.g:227:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalHelperDSL.g:233:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_3_0=null;
        Token otherlv_4=null;
        Token lv_endTime_5_0=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token lv_link_11_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:239:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? ) )
            // InternalHelperDSL.g:240:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? )
            {
            // InternalHelperDSL.g:240:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? )
            // InternalHelperDSL.g:241:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalHelperDSL.g:245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHelperDSL.g:246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHelperDSL.g:246:4: (lv_name_1_0= RULE_ID )
            // InternalHelperDSL.g:247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getFromKeyword_2());
            		
            // InternalHelperDSL.g:267:3: ( (lv_startTime_3_0= RULE_STRING ) )
            // InternalHelperDSL.g:268:4: (lv_startTime_3_0= RULE_STRING )
            {
            // InternalHelperDSL.g:268:4: (lv_startTime_3_0= RULE_STRING )
            // InternalHelperDSL.g:269:5: lv_startTime_3_0= RULE_STRING
            {
            lv_startTime_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_startTime_3_0, grammarAccess.getEventAccess().getStartTimeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getToKeyword_4());
            		
            // InternalHelperDSL.g:289:3: ( (lv_endTime_5_0= RULE_STRING ) )
            // InternalHelperDSL.g:290:4: (lv_endTime_5_0= RULE_STRING )
            {
            // InternalHelperDSL.g:290:4: (lv_endTime_5_0= RULE_STRING )
            // InternalHelperDSL.g:291:5: lv_endTime_5_0= RULE_STRING
            {
            lv_endTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_endTime_5_0, grammarAccess.getEventAccess().getEndTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalHelperDSL.g:307:3: (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHelperDSL.g:308:4: otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getAtKeyword_6_0());
                    			
                    // InternalHelperDSL.g:312:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalHelperDSL.g:313:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:313:5: (lv_location_7_0= RULE_STRING )
                    // InternalHelperDSL.g:314:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_location_7_0, grammarAccess.getEventAccess().getLocationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHelperDSL.g:331:3: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHelperDSL.g:332:4: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalHelperDSL.g:336:4: ( (lv_description_9_0= RULE_STRING ) )
                    // InternalHelperDSL.g:337:5: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:337:5: (lv_description_9_0= RULE_STRING )
                    // InternalHelperDSL.g:338:6: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_description_9_0, grammarAccess.getEventAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHelperDSL.g:355:3: (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHelperDSL.g:356:4: otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getLinkKeyword_8_0());
                    			
                    // InternalHelperDSL.g:360:4: ( (lv_link_11_0= RULE_STRING ) )
                    // InternalHelperDSL.g:361:5: (lv_link_11_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:361:5: (lv_link_11_0= RULE_STRING )
                    // InternalHelperDSL.g:362:6: lv_link_11_0= RULE_STRING
                    {
                    lv_link_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_link_11_0, grammarAccess.getEventAccess().getLinkSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"link",
                    							lv_link_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSplitCommand"
    // InternalHelperDSL.g:383:1: entryRuleSplitCommand returns [EObject current=null] : iv_ruleSplitCommand= ruleSplitCommand EOF ;
    public final EObject entryRuleSplitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitCommand = null;


        try {
            // InternalHelperDSL.g:383:53: (iv_ruleSplitCommand= ruleSplitCommand EOF )
            // InternalHelperDSL.g:384:2: iv_ruleSplitCommand= ruleSplitCommand EOF
            {
             newCompositeNode(grammarAccess.getSplitCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitCommand=ruleSplitCommand();

            state._fsp--;

             current =iv_ruleSplitCommand; 
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
    // $ANTLR end "entryRuleSplitCommand"


    // $ANTLR start "ruleSplitCommand"
    // InternalHelperDSL.g:390:1: ruleSplitCommand returns [EObject current=null] : (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSplitCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_criteria_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:396:2: ( (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) )
            // InternalHelperDSL.g:397:2: (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            {
            // InternalHelperDSL.g:397:2: (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            // InternalHelperDSL.g:398:3: otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitCommandAccess().getSplitKeyword_0());
            		
            // InternalHelperDSL.g:402:3: ( (otherlv_1= RULE_ID ) )
            // InternalHelperDSL.g:403:4: (otherlv_1= RULE_ID )
            {
            // InternalHelperDSL.g:403:4: (otherlv_1= RULE_ID )
            // InternalHelperDSL.g:404:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitCommandRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getSplitCommandAccess().getScheduleScheduleCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitCommandAccess().getByKeyword_2());
            		
            // InternalHelperDSL.g:419:3: ( (lv_criteria_3_0= RULE_STRING ) )
            // InternalHelperDSL.g:420:4: (lv_criteria_3_0= RULE_STRING )
            {
            // InternalHelperDSL.g:420:4: (lv_criteria_3_0= RULE_STRING )
            // InternalHelperDSL.g:421:5: lv_criteria_3_0= RULE_STRING
            {
            lv_criteria_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_criteria_3_0, grammarAccess.getSplitCommandAccess().getCriteriaSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"criteria",
            						lv_criteria_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleSplitCommand"


    // $ANTLR start "entryRuleMergeCommand"
    // InternalHelperDSL.g:441:1: entryRuleMergeCommand returns [EObject current=null] : iv_ruleMergeCommand= ruleMergeCommand EOF ;
    public final EObject entryRuleMergeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeCommand = null;


        try {
            // InternalHelperDSL.g:441:53: (iv_ruleMergeCommand= ruleMergeCommand EOF )
            // InternalHelperDSL.g:442:2: iv_ruleMergeCommand= ruleMergeCommand EOF
            {
             newCompositeNode(grammarAccess.getMergeCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeCommand=ruleMergeCommand();

            state._fsp--;

             current =iv_ruleMergeCommand; 
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
    // $ANTLR end "entryRuleMergeCommand"


    // $ANTLR start "ruleMergeCommand"
    // InternalHelperDSL.g:448:1: ruleMergeCommand returns [EObject current=null] : (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMergeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:454:2: ( (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) )
            // InternalHelperDSL.g:455:2: (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            {
            // InternalHelperDSL.g:455:2: (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            // InternalHelperDSL.g:456:3: otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeCommandAccess().getMergeKeyword_0());
            		
            // InternalHelperDSL.g:460:3: ( (otherlv_1= RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHelperDSL.g:461:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalHelperDSL.g:461:4: (otherlv_1= RULE_ID )
            	    // InternalHelperDSL.g:462:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMergeCommandRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMergeCommandAccess().getSchedulesScheduleCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeCommandAccess().getIntoKeyword_2());
            		
            // InternalHelperDSL.g:477:3: ( (lv_target_3_0= RULE_ID ) )
            // InternalHelperDSL.g:478:4: (lv_target_3_0= RULE_ID )
            {
            // InternalHelperDSL.g:478:4: (lv_target_3_0= RULE_ID )
            // InternalHelperDSL.g:479:5: lv_target_3_0= RULE_ID
            {
            lv_target_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_target_3_0, grammarAccess.getMergeCommandAccess().getTargetIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleMergeCommand"


    // $ANTLR start "entryRuleModifyCommand"
    // InternalHelperDSL.g:499:1: entryRuleModifyCommand returns [EObject current=null] : iv_ruleModifyCommand= ruleModifyCommand EOF ;
    public final EObject entryRuleModifyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyCommand = null;


        try {
            // InternalHelperDSL.g:499:54: (iv_ruleModifyCommand= ruleModifyCommand EOF )
            // InternalHelperDSL.g:500:2: iv_ruleModifyCommand= ruleModifyCommand EOF
            {
             newCompositeNode(grammarAccess.getModifyCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifyCommand=ruleModifyCommand();

            state._fsp--;

             current =iv_ruleModifyCommand; 
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
    // $ANTLR end "entryRuleModifyCommand"


    // $ANTLR start "ruleModifyCommand"
    // InternalHelperDSL.g:506:1: ruleModifyCommand returns [EObject current=null] : (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleModifyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_time_6_0=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;
        Token lv_value_11_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:512:2: ( (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) )
            // InternalHelperDSL.g:513:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            {
            // InternalHelperDSL.g:513:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            // InternalHelperDSL.g:514:3: otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyCommandAccess().getModifyKeyword_0());
            		
            // InternalHelperDSL.g:518:3: ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHelperDSL.g:519:4: (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalHelperDSL.g:519:4: (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) )
                    // InternalHelperDSL.g:520:5: otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getModifyCommandAccess().getScheduleKeyword_1_0_0());
                    				
                    // InternalHelperDSL.g:524:5: ( (otherlv_2= RULE_ID ) )
                    // InternalHelperDSL.g:525:6: (otherlv_2= RULE_ID )
                    {
                    // InternalHelperDSL.g:525:6: (otherlv_2= RULE_ID )
                    // InternalHelperDSL.g:526:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

                    							newLeafNode(otherlv_2, grammarAccess.getModifyCommandAccess().getScheduleScheduleCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:539:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalHelperDSL.g:539:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    // InternalHelperDSL.g:540:5: otherlv_3= 'event' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getModifyCommandAccess().getEventKeyword_1_1_0());
                    				
                    // InternalHelperDSL.g:544:5: ( (otherlv_4= RULE_ID ) )
                    // InternalHelperDSL.g:545:6: (otherlv_4= RULE_ID )
                    {
                    // InternalHelperDSL.g:545:6: (otherlv_4= RULE_ID )
                    // InternalHelperDSL.g:546:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

                    							newLeafNode(otherlv_4, grammarAccess.getModifyCommandAccess().getEventEventCrossReference_1_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyCommandAccess().getSetKeyword_2());
            		
            // InternalHelperDSL.g:563:3: ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalHelperDSL.g:564:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:564:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:565:5: ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalHelperDSL.g:565:5: ( (lv_time_6_0= 'time' ) )
                    // InternalHelperDSL.g:566:6: (lv_time_6_0= 'time' )
                    {
                    // InternalHelperDSL.g:566:6: (lv_time_6_0= 'time' )
                    // InternalHelperDSL.g:567:7: lv_time_6_0= 'time'
                    {
                    lv_time_6_0=(Token)match(input,27,FOLLOW_9); 

                    							newLeafNode(lv_time_6_0, grammarAccess.getModifyCommandAccess().getTimeTimeKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(current, "time", lv_time_6_0, "time");
                    						

                    }


                    }

                    // InternalHelperDSL.g:579:5: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalHelperDSL.g:580:6: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:580:6: (lv_value_7_0= RULE_STRING )
                    // InternalHelperDSL.g:581:7: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_value_7_0, grammarAccess.getModifyCommandAccess().getValueSTRINGTerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:599:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:599:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:600:5: otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_9); 

                    					newLeafNode(otherlv_8, grammarAccess.getModifyCommandAccess().getOwnerKeyword_3_1_0());
                    				
                    // InternalHelperDSL.g:604:5: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalHelperDSL.g:605:6: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:605:6: (lv_value_9_0= RULE_STRING )
                    // InternalHelperDSL.g:606:7: lv_value_9_0= RULE_STRING
                    {
                    lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_value_9_0, grammarAccess.getModifyCommandAccess().getValueSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_9_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHelperDSL.g:624:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:624:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:625:5: otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_9); 

                    					newLeafNode(otherlv_10, grammarAccess.getModifyCommandAccess().getLocationKeyword_3_2_0());
                    				
                    // InternalHelperDSL.g:629:5: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalHelperDSL.g:630:6: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:630:6: (lv_value_11_0= RULE_STRING )
                    // InternalHelperDSL.g:631:7: lv_value_11_0= RULE_STRING
                    {
                    lv_value_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_value_11_0, grammarAccess.getModifyCommandAccess().getValueSTRINGTerminalRuleCall_3_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_11_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


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
    // $ANTLR end "ruleModifyCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002A00802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000038000000L});

}