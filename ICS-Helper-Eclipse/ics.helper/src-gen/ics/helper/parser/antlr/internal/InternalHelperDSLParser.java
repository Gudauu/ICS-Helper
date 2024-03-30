package ics.helper.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'schedule'", "'{'", "'}'", "'event'", "'from'", "'to'", "'at'", "'description'", "'link'", "'recur'", "'split'", "'by'", "'merge'", "'into'", "'modify'", "'set'", "'time'", "'owner'", "'location'", "'daily'", "'weekly'", "'monthly'", "'yearly'", "'on'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalHelperDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHelperDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalHelperDSL.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalHelperDSL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:78:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalHelperDSL.g:79:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalHelperDSL.g:79:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==22||LA1_0==24||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHelperDSL.g:80:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalHelperDSL.g:80:3: (lv_commands_0_0= ruleCommand )
            	    // InternalHelperDSL.g:81:4: lv_commands_0_0= ruleCommand
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
    // InternalHelperDSL.g:101:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalHelperDSL.g:101:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalHelperDSL.g:102:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalHelperDSL.g:108:1: ruleCommand returns [EObject current=null] : (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CreateCommand_0 = null;

        EObject this_SplitCommand_1 = null;

        EObject this_MergeCommand_2 = null;

        EObject this_ModifyCommand_3 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:114:2: ( (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand ) )
            // InternalHelperDSL.g:115:2: (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand )
            {
            // InternalHelperDSL.g:115:2: (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 26:
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
                    // InternalHelperDSL.g:116:3: this_CreateCommand_0= ruleCreateCommand
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
                    // InternalHelperDSL.g:125:3: this_SplitCommand_1= ruleSplitCommand
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
                    // InternalHelperDSL.g:134:3: this_MergeCommand_2= ruleMergeCommand
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
                    // InternalHelperDSL.g:143:3: this_ModifyCommand_3= ruleModifyCommand
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
    // InternalHelperDSL.g:155:1: entryRuleCreateCommand returns [EObject current=null] : iv_ruleCreateCommand= ruleCreateCommand EOF ;
    public final EObject entryRuleCreateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateCommand = null;


        try {
            // InternalHelperDSL.g:155:54: (iv_ruleCreateCommand= ruleCreateCommand EOF )
            // InternalHelperDSL.g:156:2: iv_ruleCreateCommand= ruleCreateCommand EOF
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
    // InternalHelperDSL.g:162:1: ruleCreateCommand returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) ;
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
            // InternalHelperDSL.g:168:2: ( (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) )
            // InternalHelperDSL.g:169:2: (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            {
            // InternalHelperDSL.g:169:2: (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            // InternalHelperDSL.g:170:3: otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCommandAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateCommandAccess().getScheduleKeyword_1());
            		
            // InternalHelperDSL.g:178:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHelperDSL.g:179:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHelperDSL.g:179:4: (lv_name_2_0= RULE_ID )
            // InternalHelperDSL.g:180:5: lv_name_2_0= RULE_ID
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
            		
            // InternalHelperDSL.g:200:3: ( (lv_events_4_0= ruleEvent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHelperDSL.g:201:4: (lv_events_4_0= ruleEvent )
            	    {
            	    // InternalHelperDSL.g:201:4: (lv_events_4_0= ruleEvent )
            	    // InternalHelperDSL.g:202:5: lv_events_4_0= ruleEvent
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
    // InternalHelperDSL.g:227:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalHelperDSL.g:227:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalHelperDSL.g:228:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalHelperDSL.g:234:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? (otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) ) )? ) ;
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
        Token otherlv_12=null;
        Enumerator lv_recur_13_0 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:240:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? (otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) ) )? ) )
            // InternalHelperDSL.g:241:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? (otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) ) )? )
            {
            // InternalHelperDSL.g:241:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? (otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) ) )? )
            // InternalHelperDSL.g:242:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )? (otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalHelperDSL.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHelperDSL.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHelperDSL.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalHelperDSL.g:248:5: lv_name_1_0= RULE_ID
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
            		
            // InternalHelperDSL.g:268:3: ( (lv_startTime_3_0= RULE_STRING ) )
            // InternalHelperDSL.g:269:4: (lv_startTime_3_0= RULE_STRING )
            {
            // InternalHelperDSL.g:269:4: (lv_startTime_3_0= RULE_STRING )
            // InternalHelperDSL.g:270:5: lv_startTime_3_0= RULE_STRING
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
            		
            // InternalHelperDSL.g:290:3: ( (lv_endTime_5_0= RULE_STRING ) )
            // InternalHelperDSL.g:291:4: (lv_endTime_5_0= RULE_STRING )
            {
            // InternalHelperDSL.g:291:4: (lv_endTime_5_0= RULE_STRING )
            // InternalHelperDSL.g:292:5: lv_endTime_5_0= RULE_STRING
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

            // InternalHelperDSL.g:308:3: (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHelperDSL.g:309:4: otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getAtKeyword_6_0());
                    			
                    // InternalHelperDSL.g:313:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalHelperDSL.g:314:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:314:5: (lv_location_7_0= RULE_STRING )
                    // InternalHelperDSL.g:315:6: lv_location_7_0= RULE_STRING
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

            // InternalHelperDSL.g:332:3: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHelperDSL.g:333:4: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalHelperDSL.g:337:4: ( (lv_description_9_0= RULE_STRING ) )
                    // InternalHelperDSL.g:338:5: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:338:5: (lv_description_9_0= RULE_STRING )
                    // InternalHelperDSL.g:339:6: lv_description_9_0= RULE_STRING
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

            // InternalHelperDSL.g:356:3: (otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHelperDSL.g:357:4: otherlv_10= 'link' ( (lv_link_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getLinkKeyword_8_0());
                    			
                    // InternalHelperDSL.g:361:4: ( (lv_link_11_0= RULE_STRING ) )
                    // InternalHelperDSL.g:362:5: (lv_link_11_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:362:5: (lv_link_11_0= RULE_STRING )
                    // InternalHelperDSL.g:363:6: lv_link_11_0= RULE_STRING
                    {
                    lv_link_11_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalHelperDSL.g:380:3: (otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHelperDSL.g:381:4: otherlv_12= 'recur' ( (lv_recur_13_0= ruleRecurRule ) )
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getEventAccess().getRecurKeyword_9_0());
                    			
                    // InternalHelperDSL.g:385:4: ( (lv_recur_13_0= ruleRecurRule ) )
                    // InternalHelperDSL.g:386:5: (lv_recur_13_0= ruleRecurRule )
                    {
                    // InternalHelperDSL.g:386:5: (lv_recur_13_0= ruleRecurRule )
                    // InternalHelperDSL.g:387:6: lv_recur_13_0= ruleRecurRule
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getRecurRecurRuleEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_recur_13_0=ruleRecurRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"recur",
                    							lv_recur_13_0,
                    							"ics.helper.HelperDSL.RecurRule");
                    						afterParserOrEnumRuleCall();
                    					

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
    // InternalHelperDSL.g:409:1: entryRuleSplitCommand returns [EObject current=null] : iv_ruleSplitCommand= ruleSplitCommand EOF ;
    public final EObject entryRuleSplitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitCommand = null;


        try {
            // InternalHelperDSL.g:409:53: (iv_ruleSplitCommand= ruleSplitCommand EOF )
            // InternalHelperDSL.g:410:2: iv_ruleSplitCommand= ruleSplitCommand EOF
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
    // InternalHelperDSL.g:416:1: ruleSplitCommand returns [EObject current=null] : (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSplitCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_criteria_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:422:2: ( (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) )
            // InternalHelperDSL.g:423:2: (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            {
            // InternalHelperDSL.g:423:2: (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            // InternalHelperDSL.g:424:3: otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitCommandAccess().getSplitKeyword_0());
            		
            // InternalHelperDSL.g:428:3: ( (otherlv_1= RULE_ID ) )
            // InternalHelperDSL.g:429:4: (otherlv_1= RULE_ID )
            {
            // InternalHelperDSL.g:429:4: (otherlv_1= RULE_ID )
            // InternalHelperDSL.g:430:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitCommandRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getSplitCommandAccess().getScheduleScheduleCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitCommandAccess().getByKeyword_2());
            		
            // InternalHelperDSL.g:445:3: ( (lv_criteria_3_0= RULE_STRING ) )
            // InternalHelperDSL.g:446:4: (lv_criteria_3_0= RULE_STRING )
            {
            // InternalHelperDSL.g:446:4: (lv_criteria_3_0= RULE_STRING )
            // InternalHelperDSL.g:447:5: lv_criteria_3_0= RULE_STRING
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
    // InternalHelperDSL.g:467:1: entryRuleMergeCommand returns [EObject current=null] : iv_ruleMergeCommand= ruleMergeCommand EOF ;
    public final EObject entryRuleMergeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeCommand = null;


        try {
            // InternalHelperDSL.g:467:53: (iv_ruleMergeCommand= ruleMergeCommand EOF )
            // InternalHelperDSL.g:468:2: iv_ruleMergeCommand= ruleMergeCommand EOF
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
    // InternalHelperDSL.g:474:1: ruleMergeCommand returns [EObject current=null] : (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMergeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:480:2: ( (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) )
            // InternalHelperDSL.g:481:2: (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            {
            // InternalHelperDSL.g:481:2: (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            // InternalHelperDSL.g:482:3: otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeCommandAccess().getMergeKeyword_0());
            		
            // InternalHelperDSL.g:486:3: ( (otherlv_1= RULE_ID ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHelperDSL.g:487:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalHelperDSL.g:487:4: (otherlv_1= RULE_ID )
            	    // InternalHelperDSL.g:488:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMergeCommandRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMergeCommandAccess().getSchedulesScheduleCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeCommandAccess().getIntoKeyword_2());
            		
            // InternalHelperDSL.g:503:3: ( (lv_target_3_0= RULE_ID ) )
            // InternalHelperDSL.g:504:4: (lv_target_3_0= RULE_ID )
            {
            // InternalHelperDSL.g:504:4: (lv_target_3_0= RULE_ID )
            // InternalHelperDSL.g:505:5: lv_target_3_0= RULE_ID
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
    // InternalHelperDSL.g:525:1: entryRuleModifyCommand returns [EObject current=null] : iv_ruleModifyCommand= ruleModifyCommand EOF ;
    public final EObject entryRuleModifyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyCommand = null;


        try {
            // InternalHelperDSL.g:525:54: (iv_ruleModifyCommand= ruleModifyCommand EOF )
            // InternalHelperDSL.g:526:2: iv_ruleModifyCommand= ruleModifyCommand EOF
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
    // InternalHelperDSL.g:532:1: ruleModifyCommand returns [EObject current=null] : (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) ;
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
            // InternalHelperDSL.g:538:2: ( (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) )
            // InternalHelperDSL.g:539:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            {
            // InternalHelperDSL.g:539:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            // InternalHelperDSL.g:540:3: otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyCommandAccess().getModifyKeyword_0());
            		
            // InternalHelperDSL.g:544:3: ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHelperDSL.g:545:4: (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalHelperDSL.g:545:4: (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) )
                    // InternalHelperDSL.g:546:5: otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getModifyCommandAccess().getScheduleKeyword_1_0_0());
                    				
                    // InternalHelperDSL.g:550:5: ( (otherlv_2= RULE_ID ) )
                    // InternalHelperDSL.g:551:6: (otherlv_2= RULE_ID )
                    {
                    // InternalHelperDSL.g:551:6: (otherlv_2= RULE_ID )
                    // InternalHelperDSL.g:552:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

                    							newLeafNode(otherlv_2, grammarAccess.getModifyCommandAccess().getScheduleScheduleCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:565:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalHelperDSL.g:565:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    // InternalHelperDSL.g:566:5: otherlv_3= 'event' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getModifyCommandAccess().getEventKeyword_1_1_0());
                    				
                    // InternalHelperDSL.g:570:5: ( (otherlv_4= RULE_ID ) )
                    // InternalHelperDSL.g:571:6: (otherlv_4= RULE_ID )
                    {
                    // InternalHelperDSL.g:571:6: (otherlv_4= RULE_ID )
                    // InternalHelperDSL.g:572:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

                    							newLeafNode(otherlv_4, grammarAccess.getModifyCommandAccess().getEventEventCrossReference_1_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyCommandAccess().getSetKeyword_2());
            		
            // InternalHelperDSL.g:589:3: ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHelperDSL.g:590:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:590:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:591:5: ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalHelperDSL.g:591:5: ( (lv_time_6_0= 'time' ) )
                    // InternalHelperDSL.g:592:6: (lv_time_6_0= 'time' )
                    {
                    // InternalHelperDSL.g:592:6: (lv_time_6_0= 'time' )
                    // InternalHelperDSL.g:593:7: lv_time_6_0= 'time'
                    {
                    lv_time_6_0=(Token)match(input,28,FOLLOW_9); 

                    							newLeafNode(lv_time_6_0, grammarAccess.getModifyCommandAccess().getTimeTimeKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(current, "time", lv_time_6_0, "time");
                    						

                    }


                    }

                    // InternalHelperDSL.g:605:5: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalHelperDSL.g:606:6: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:606:6: (lv_value_7_0= RULE_STRING )
                    // InternalHelperDSL.g:607:7: lv_value_7_0= RULE_STRING
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
                    // InternalHelperDSL.g:625:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:625:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:626:5: otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_9); 

                    					newLeafNode(otherlv_8, grammarAccess.getModifyCommandAccess().getOwnerKeyword_3_1_0());
                    				
                    // InternalHelperDSL.g:630:5: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalHelperDSL.g:631:6: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:631:6: (lv_value_9_0= RULE_STRING )
                    // InternalHelperDSL.g:632:7: lv_value_9_0= RULE_STRING
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
                    // InternalHelperDSL.g:650:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:650:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:651:5: otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_9); 

                    					newLeafNode(otherlv_10, grammarAccess.getModifyCommandAccess().getLocationKeyword_3_2_0());
                    				
                    // InternalHelperDSL.g:655:5: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalHelperDSL.g:656:6: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:656:6: (lv_value_11_0= RULE_STRING )
                    // InternalHelperDSL.g:657:7: lv_value_11_0= RULE_STRING
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


    // $ANTLR start "ruleRecurRule"
    // InternalHelperDSL.g:679:1: ruleRecurRule returns [Enumerator current=null] : ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) ) ;
    public final Enumerator ruleRecurRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:685:2: ( ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) ) )
            // InternalHelperDSL.g:686:2: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) )
            {
            // InternalHelperDSL.g:686:2: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            case 34:
                {
                alt11=4;
                }
                break;
            case 35:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalHelperDSL.g:687:3: (enumLiteral_0= 'daily' )
                    {
                    // InternalHelperDSL.g:687:3: (enumLiteral_0= 'daily' )
                    // InternalHelperDSL.g:688:4: enumLiteral_0= 'daily'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getDAILYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRecurRuleAccess().getDAILYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:695:3: (enumLiteral_1= 'weekly' )
                    {
                    // InternalHelperDSL.g:695:3: (enumLiteral_1= 'weekly' )
                    // InternalHelperDSL.g:696:4: enumLiteral_1= 'weekly'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getWEEKLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRecurRuleAccess().getWEEKLYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHelperDSL.g:703:3: (enumLiteral_2= 'monthly' )
                    {
                    // InternalHelperDSL.g:703:3: (enumLiteral_2= 'monthly' )
                    // InternalHelperDSL.g:704:4: enumLiteral_2= 'monthly'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getMONTHLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRecurRuleAccess().getMONTHLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHelperDSL.g:711:3: (enumLiteral_3= 'yearly' )
                    {
                    // InternalHelperDSL.g:711:3: (enumLiteral_3= 'yearly' )
                    // InternalHelperDSL.g:712:4: enumLiteral_3= 'yearly'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getYEARLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRecurRuleAccess().getYEARLYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHelperDSL.g:719:3: (enumLiteral_4= 'on' )
                    {
                    // InternalHelperDSL.g:719:3: (enumLiteral_4= 'on' )
                    // InternalHelperDSL.g:720:4: enumLiteral_4= 'on'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getBYDAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRecurRuleAccess().getBYDAYEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleRecurRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000005400802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});

}