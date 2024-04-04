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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'schedule'", "'{'", "'}'", "'event'", "'start'", "'end'", "'at'", "'description'", "'recur'", "'link'", "'organizer'", "'invitees'", "'reminder'", "'time'", "'title'", "'name'", "'email'", "','", "'split'", "'by'", "'merge'", "'into'", "'modify'", "'set'", "'owner'", "'location'", "'daily'", "'weekly'", "'monthly'", "'yearly'", "'on'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==11||LA1_0==30||LA1_0==32||LA1_0==34) ) {
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
            case 30:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 34:
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
    // InternalHelperDSL.g:234:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'start' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'end' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )? )? (otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) ) )? (otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) ) )? (otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}' )? (otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) ) )? ) ;
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
        Token otherlv_13=null;
        Token lv_link_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Enumerator lv_recur_11_0 = null;

        EObject lv_daysOfWeek_12_0 = null;

        EObject lv_organizer_16_0 = null;

        EObject lv_invitees_19_0 = null;

        EObject lv_reminder_22_0 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:240:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'start' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'end' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )? )? (otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) ) )? (otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) ) )? (otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}' )? (otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) ) )? ) )
            // InternalHelperDSL.g:241:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'start' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'end' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )? )? (otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) ) )? (otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) ) )? (otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}' )? (otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) ) )? )
            {
            // InternalHelperDSL.g:241:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'start' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'end' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )? )? (otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) ) )? (otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) ) )? (otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}' )? (otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) ) )? )
            // InternalHelperDSL.g:242:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'start' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'end' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )? )? (otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) ) )? (otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) ) )? (otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}' )? (otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) ) )?
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

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getStartKeyword_2());
            		
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

            			newLeafNode(otherlv_4, grammarAccess.getEventAccess().getEndKeyword_4());
            		
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

            // InternalHelperDSL.g:356:3: (otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )? )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHelperDSL.g:357:4: otherlv_10= 'recur' ( (lv_recur_11_0= ruleRecurRule ) ) ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )?
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRecurKeyword_8_0());
                    			
                    // InternalHelperDSL.g:361:4: ( (lv_recur_11_0= ruleRecurRule ) )
                    // InternalHelperDSL.g:362:5: (lv_recur_11_0= ruleRecurRule )
                    {
                    // InternalHelperDSL.g:362:5: (lv_recur_11_0= ruleRecurRule )
                    // InternalHelperDSL.g:363:6: lv_recur_11_0= ruleRecurRule
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getRecurRecurRuleEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_recur_11_0=ruleRecurRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"recur",
                    							lv_recur_11_0,
                    							"ics.helper.HelperDSL.RecurRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHelperDSL.g:380:4: ( (lv_daysOfWeek_12_0= ruleDaysOfWeek ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=43 && LA6_0<=49)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalHelperDSL.g:381:5: (lv_daysOfWeek_12_0= ruleDaysOfWeek )
                            {
                            // InternalHelperDSL.g:381:5: (lv_daysOfWeek_12_0= ruleDaysOfWeek )
                            // InternalHelperDSL.g:382:6: lv_daysOfWeek_12_0= ruleDaysOfWeek
                            {

                            						newCompositeNode(grammarAccess.getEventAccess().getDaysOfWeekDaysOfWeekParserRuleCall_8_2_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_daysOfWeek_12_0=ruleDaysOfWeek();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getEventRule());
                            						}
                            						set(
                            							current,
                            							"daysOfWeek",
                            							lv_daysOfWeek_12_0,
                            							"ics.helper.HelperDSL.DaysOfWeek");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalHelperDSL.g:400:3: (otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHelperDSL.g:401:4: otherlv_13= 'link' ( (lv_link_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getLinkKeyword_9_0());
                    			
                    // InternalHelperDSL.g:405:4: ( (lv_link_14_0= RULE_STRING ) )
                    // InternalHelperDSL.g:406:5: (lv_link_14_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:406:5: (lv_link_14_0= RULE_STRING )
                    // InternalHelperDSL.g:407:6: lv_link_14_0= RULE_STRING
                    {
                    lv_link_14_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_link_14_0, grammarAccess.getEventAccess().getLinkSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"link",
                    							lv_link_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHelperDSL.g:424:3: (otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHelperDSL.g:425:4: otherlv_15= 'organizer' ( (lv_organizer_16_0= rulePerson ) )
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getOrganizerKeyword_10_0());
                    			
                    // InternalHelperDSL.g:429:4: ( (lv_organizer_16_0= rulePerson ) )
                    // InternalHelperDSL.g:430:5: (lv_organizer_16_0= rulePerson )
                    {
                    // InternalHelperDSL.g:430:5: (lv_organizer_16_0= rulePerson )
                    // InternalHelperDSL.g:431:6: lv_organizer_16_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getOrganizerPersonParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_organizer_16_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"organizer",
                    							lv_organizer_16_0,
                    							"ics.helper.HelperDSL.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHelperDSL.g:449:3: (otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHelperDSL.g:450:4: otherlv_17= 'invitees' otherlv_18= '{' ( (lv_invitees_19_0= rulePerson ) )+ otherlv_20= '}'
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getEventAccess().getInviteesKeyword_11_0());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalHelperDSL.g:458:4: ( (lv_invitees_19_0= rulePerson ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalHelperDSL.g:459:5: (lv_invitees_19_0= rulePerson )
                    	    {
                    	    // InternalHelperDSL.g:459:5: (lv_invitees_19_0= rulePerson )
                    	    // InternalHelperDSL.g:460:6: lv_invitees_19_0= rulePerson
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getInviteesPersonParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_invitees_19_0=rulePerson();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"invitees",
                    	    							lv_invitees_19_0,
                    	    							"ics.helper.HelperDSL.Person");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_20=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalHelperDSL.g:482:3: (otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHelperDSL.g:483:4: otherlv_21= 'reminder' ( (lv_reminder_22_0= ruleReminder ) )
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getReminderKeyword_12_0());
                    			
                    // InternalHelperDSL.g:487:4: ( (lv_reminder_22_0= ruleReminder ) )
                    // InternalHelperDSL.g:488:5: (lv_reminder_22_0= ruleReminder )
                    {
                    // InternalHelperDSL.g:488:5: (lv_reminder_22_0= ruleReminder )
                    // InternalHelperDSL.g:489:6: lv_reminder_22_0= ruleReminder
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getReminderReminderParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_reminder_22_0=ruleReminder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"reminder",
                    							lv_reminder_22_0,
                    							"ics.helper.HelperDSL.Reminder");
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


    // $ANTLR start "entryRuleReminder"
    // InternalHelperDSL.g:511:1: entryRuleReminder returns [EObject current=null] : iv_ruleReminder= ruleReminder EOF ;
    public final EObject entryRuleReminder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReminder = null;


        try {
            // InternalHelperDSL.g:511:49: (iv_ruleReminder= ruleReminder EOF )
            // InternalHelperDSL.g:512:2: iv_ruleReminder= ruleReminder EOF
            {
             newCompositeNode(grammarAccess.getReminderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReminder=ruleReminder();

            state._fsp--;

             current =iv_ruleReminder; 
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
    // $ANTLR end "entryRuleReminder"


    // $ANTLR start "ruleReminder"
    // InternalHelperDSL.g:518:1: ruleReminder returns [EObject current=null] : (otherlv_0= 'time' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleReminder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;
        Token lv_title_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:524:2: ( (otherlv_0= 'time' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) )? ) )
            // InternalHelperDSL.g:525:2: (otherlv_0= 'time' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) )? )
            {
            // InternalHelperDSL.g:525:2: (otherlv_0= 'time' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) )? )
            // InternalHelperDSL.g:526:3: otherlv_0= 'time' ( (lv_time_1_0= RULE_INT ) ) (otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getReminderAccess().getTimeKeyword_0());
            		
            // InternalHelperDSL.g:530:3: ( (lv_time_1_0= RULE_INT ) )
            // InternalHelperDSL.g:531:4: (lv_time_1_0= RULE_INT )
            {
            // InternalHelperDSL.g:531:4: (lv_time_1_0= RULE_INT )
            // InternalHelperDSL.g:532:5: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_time_1_0, grammarAccess.getReminderAccess().getTimeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReminderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalHelperDSL.g:548:3: (otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHelperDSL.g:549:4: otherlv_2= 'title' ( (lv_title_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getReminderAccess().getTitleKeyword_2_0());
                    			
                    // InternalHelperDSL.g:553:4: ( (lv_title_3_0= RULE_STRING ) )
                    // InternalHelperDSL.g:554:5: (lv_title_3_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:554:5: (lv_title_3_0= RULE_STRING )
                    // InternalHelperDSL.g:555:6: lv_title_3_0= RULE_STRING
                    {
                    lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_title_3_0, grammarAccess.getReminderAccess().getTitleSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReminderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_3_0,
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
    // $ANTLR end "ruleReminder"


    // $ANTLR start "entryRulePerson"
    // InternalHelperDSL.g:576:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalHelperDSL.g:576:47: (iv_rulePerson= rulePerson EOF )
            // InternalHelperDSL.g:577:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalHelperDSL.g:583:1: rulePerson returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_email_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:589:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) ) )
            // InternalHelperDSL.g:590:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )
            {
            // InternalHelperDSL.g:590:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )
            // InternalHelperDSL.g:591:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getNameKeyword_0());
            		
            // InternalHelperDSL.g:595:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalHelperDSL.g:596:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalHelperDSL.g:596:4: (lv_name_1_0= RULE_STRING )
            // InternalHelperDSL.g:597:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getEmailKeyword_2());
            		
            // InternalHelperDSL.g:617:3: ( (lv_email_3_0= RULE_STRING ) )
            // InternalHelperDSL.g:618:4: (lv_email_3_0= RULE_STRING )
            {
            // InternalHelperDSL.g:618:4: (lv_email_3_0= RULE_STRING )
            // InternalHelperDSL.g:619:5: lv_email_3_0= RULE_STRING
            {
            lv_email_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_email_3_0, grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_3_0,
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleDaysOfWeek"
    // InternalHelperDSL.g:639:1: entryRuleDaysOfWeek returns [EObject current=null] : iv_ruleDaysOfWeek= ruleDaysOfWeek EOF ;
    public final EObject entryRuleDaysOfWeek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaysOfWeek = null;


        try {
            // InternalHelperDSL.g:639:51: (iv_ruleDaysOfWeek= ruleDaysOfWeek EOF )
            // InternalHelperDSL.g:640:2: iv_ruleDaysOfWeek= ruleDaysOfWeek EOF
            {
             newCompositeNode(grammarAccess.getDaysOfWeekRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDaysOfWeek=ruleDaysOfWeek();

            state._fsp--;

             current =iv_ruleDaysOfWeek; 
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
    // $ANTLR end "entryRuleDaysOfWeek"


    // $ANTLR start "ruleDaysOfWeek"
    // InternalHelperDSL.g:646:1: ruleDaysOfWeek returns [EObject current=null] : ( ( (lv_days_0_0= ruleWEEKDAY ) ) (otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) ) )* ) ;
    public final EObject ruleDaysOfWeek() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_days_0_0 = null;

        Enumerator lv_days_2_0 = null;



        	enterRule();

        try {
            // InternalHelperDSL.g:652:2: ( ( ( (lv_days_0_0= ruleWEEKDAY ) ) (otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) ) )* ) )
            // InternalHelperDSL.g:653:2: ( ( (lv_days_0_0= ruleWEEKDAY ) ) (otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) ) )* )
            {
            // InternalHelperDSL.g:653:2: ( ( (lv_days_0_0= ruleWEEKDAY ) ) (otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) ) )* )
            // InternalHelperDSL.g:654:3: ( (lv_days_0_0= ruleWEEKDAY ) ) (otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) ) )*
            {
            // InternalHelperDSL.g:654:3: ( (lv_days_0_0= ruleWEEKDAY ) )
            // InternalHelperDSL.g:655:4: (lv_days_0_0= ruleWEEKDAY )
            {
            // InternalHelperDSL.g:655:4: (lv_days_0_0= ruleWEEKDAY )
            // InternalHelperDSL.g:656:5: lv_days_0_0= ruleWEEKDAY
            {

            					newCompositeNode(grammarAccess.getDaysOfWeekAccess().getDaysWEEKDAYEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_days_0_0=ruleWEEKDAY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDaysOfWeekRule());
            					}
            					add(
            						current,
            						"days",
            						lv_days_0_0,
            						"ics.helper.HelperDSL.WEEKDAY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHelperDSL.g:673:3: (otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHelperDSL.g:674:4: otherlv_1= ',' ( (lv_days_2_0= ruleWEEKDAY ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDaysOfWeekAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalHelperDSL.g:678:4: ( (lv_days_2_0= ruleWEEKDAY ) )
            	    // InternalHelperDSL.g:679:5: (lv_days_2_0= ruleWEEKDAY )
            	    {
            	    // InternalHelperDSL.g:679:5: (lv_days_2_0= ruleWEEKDAY )
            	    // InternalHelperDSL.g:680:6: lv_days_2_0= ruleWEEKDAY
            	    {

            	    						newCompositeNode(grammarAccess.getDaysOfWeekAccess().getDaysWEEKDAYEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_days_2_0=ruleWEEKDAY();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDaysOfWeekRule());
            	    						}
            	    						add(
            	    							current,
            	    							"days",
            	    							lv_days_2_0,
            	    							"ics.helper.HelperDSL.WEEKDAY");
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
    // $ANTLR end "ruleDaysOfWeek"


    // $ANTLR start "entryRuleSplitCommand"
    // InternalHelperDSL.g:702:1: entryRuleSplitCommand returns [EObject current=null] : iv_ruleSplitCommand= ruleSplitCommand EOF ;
    public final EObject entryRuleSplitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitCommand = null;


        try {
            // InternalHelperDSL.g:702:53: (iv_ruleSplitCommand= ruleSplitCommand EOF )
            // InternalHelperDSL.g:703:2: iv_ruleSplitCommand= ruleSplitCommand EOF
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
    // InternalHelperDSL.g:709:1: ruleSplitCommand returns [EObject current=null] : (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSplitCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_criteria_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:715:2: ( (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) )
            // InternalHelperDSL.g:716:2: (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            {
            // InternalHelperDSL.g:716:2: (otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            // InternalHelperDSL.g:717:3: otherlv_0= 'split' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitCommandAccess().getSplitKeyword_0());
            		
            // InternalHelperDSL.g:721:3: ( (otherlv_1= RULE_ID ) )
            // InternalHelperDSL.g:722:4: (otherlv_1= RULE_ID )
            {
            // InternalHelperDSL.g:722:4: (otherlv_1= RULE_ID )
            // InternalHelperDSL.g:723:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitCommandRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getSplitCommandAccess().getScheduleScheduleCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitCommandAccess().getByKeyword_2());
            		
            // InternalHelperDSL.g:738:3: ( (lv_criteria_3_0= RULE_STRING ) )
            // InternalHelperDSL.g:739:4: (lv_criteria_3_0= RULE_STRING )
            {
            // InternalHelperDSL.g:739:4: (lv_criteria_3_0= RULE_STRING )
            // InternalHelperDSL.g:740:5: lv_criteria_3_0= RULE_STRING
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
    // InternalHelperDSL.g:760:1: entryRuleMergeCommand returns [EObject current=null] : iv_ruleMergeCommand= ruleMergeCommand EOF ;
    public final EObject entryRuleMergeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeCommand = null;


        try {
            // InternalHelperDSL.g:760:53: (iv_ruleMergeCommand= ruleMergeCommand EOF )
            // InternalHelperDSL.g:761:2: iv_ruleMergeCommand= ruleMergeCommand EOF
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
    // InternalHelperDSL.g:767:1: ruleMergeCommand returns [EObject current=null] : (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMergeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:773:2: ( (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) )
            // InternalHelperDSL.g:774:2: (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            {
            // InternalHelperDSL.g:774:2: (otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            // InternalHelperDSL.g:775:3: otherlv_0= 'merge' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeCommandAccess().getMergeKeyword_0());
            		
            // InternalHelperDSL.g:779:3: ( (otherlv_1= RULE_ID ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHelperDSL.g:780:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalHelperDSL.g:780:4: (otherlv_1= RULE_ID )
            	    // InternalHelperDSL.g:781:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMergeCommandRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMergeCommandAccess().getSchedulesScheduleCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeCommandAccess().getIntoKeyword_2());
            		
            // InternalHelperDSL.g:796:3: ( (lv_target_3_0= RULE_ID ) )
            // InternalHelperDSL.g:797:4: (lv_target_3_0= RULE_ID )
            {
            // InternalHelperDSL.g:797:4: (lv_target_3_0= RULE_ID )
            // InternalHelperDSL.g:798:5: lv_target_3_0= RULE_ID
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
    // InternalHelperDSL.g:818:1: entryRuleModifyCommand returns [EObject current=null] : iv_ruleModifyCommand= ruleModifyCommand EOF ;
    public final EObject entryRuleModifyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyCommand = null;


        try {
            // InternalHelperDSL.g:818:54: (iv_ruleModifyCommand= ruleModifyCommand EOF )
            // InternalHelperDSL.g:819:2: iv_ruleModifyCommand= ruleModifyCommand EOF
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
    // InternalHelperDSL.g:825:1: ruleModifyCommand returns [EObject current=null] : (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) ;
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
            // InternalHelperDSL.g:831:2: ( (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) )
            // InternalHelperDSL.g:832:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            {
            // InternalHelperDSL.g:832:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            // InternalHelperDSL.g:833:3: otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyCommandAccess().getModifyKeyword_0());
            		
            // InternalHelperDSL.g:837:3: ( (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalHelperDSL.g:838:4: (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalHelperDSL.g:838:4: (otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) ) )
                    // InternalHelperDSL.g:839:5: otherlv_1= 'schedule' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getModifyCommandAccess().getScheduleKeyword_1_0_0());
                    				
                    // InternalHelperDSL.g:843:5: ( (otherlv_2= RULE_ID ) )
                    // InternalHelperDSL.g:844:6: (otherlv_2= RULE_ID )
                    {
                    // InternalHelperDSL.g:844:6: (otherlv_2= RULE_ID )
                    // InternalHelperDSL.g:845:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 

                    							newLeafNode(otherlv_2, grammarAccess.getModifyCommandAccess().getScheduleScheduleCrossReference_1_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:858:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalHelperDSL.g:858:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    // InternalHelperDSL.g:859:5: otherlv_3= 'event' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getModifyCommandAccess().getEventKeyword_1_1_0());
                    				
                    // InternalHelperDSL.g:863:5: ( (otherlv_4= RULE_ID ) )
                    // InternalHelperDSL.g:864:6: (otherlv_4= RULE_ID )
                    {
                    // InternalHelperDSL.g:864:6: (otherlv_4= RULE_ID )
                    // InternalHelperDSL.g:865:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 

                    							newLeafNode(otherlv_4, grammarAccess.getModifyCommandAccess().getEventEventCrossReference_1_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyCommandAccess().getSetKeyword_2());
            		
            // InternalHelperDSL.g:882:3: ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalHelperDSL.g:883:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:883:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:884:5: ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalHelperDSL.g:884:5: ( (lv_time_6_0= 'time' ) )
                    // InternalHelperDSL.g:885:6: (lv_time_6_0= 'time' )
                    {
                    // InternalHelperDSL.g:885:6: (lv_time_6_0= 'time' )
                    // InternalHelperDSL.g:886:7: lv_time_6_0= 'time'
                    {
                    lv_time_6_0=(Token)match(input,25,FOLLOW_9); 

                    							newLeafNode(lv_time_6_0, grammarAccess.getModifyCommandAccess().getTimeTimeKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(current, "time", lv_time_6_0, "time");
                    						

                    }


                    }

                    // InternalHelperDSL.g:898:5: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalHelperDSL.g:899:6: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:899:6: (lv_value_7_0= RULE_STRING )
                    // InternalHelperDSL.g:900:7: lv_value_7_0= RULE_STRING
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
                    // InternalHelperDSL.g:918:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:918:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:919:5: otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_9); 

                    					newLeafNode(otherlv_8, grammarAccess.getModifyCommandAccess().getOwnerKeyword_3_1_0());
                    				
                    // InternalHelperDSL.g:923:5: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalHelperDSL.g:924:6: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:924:6: (lv_value_9_0= RULE_STRING )
                    // InternalHelperDSL.g:925:7: lv_value_9_0= RULE_STRING
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
                    // InternalHelperDSL.g:943:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalHelperDSL.g:943:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalHelperDSL.g:944:5: otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_9); 

                    					newLeafNode(otherlv_10, grammarAccess.getModifyCommandAccess().getLocationKeyword_3_2_0());
                    				
                    // InternalHelperDSL.g:948:5: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalHelperDSL.g:949:6: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalHelperDSL.g:949:6: (lv_value_11_0= RULE_STRING )
                    // InternalHelperDSL.g:950:7: lv_value_11_0= RULE_STRING
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
    // InternalHelperDSL.g:972:1: ruleRecurRule returns [Enumerator current=null] : ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) ) ;
    public final Enumerator ruleRecurRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:978:2: ( ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) ) )
            // InternalHelperDSL.g:979:2: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) )
            {
            // InternalHelperDSL.g:979:2: ( (enumLiteral_0= 'daily' ) | (enumLiteral_1= 'weekly' ) | (enumLiteral_2= 'monthly' ) | (enumLiteral_3= 'yearly' ) | (enumLiteral_4= 'on' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 40:
                {
                alt18=3;
                }
                break;
            case 41:
                {
                alt18=4;
                }
                break;
            case 42:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalHelperDSL.g:980:3: (enumLiteral_0= 'daily' )
                    {
                    // InternalHelperDSL.g:980:3: (enumLiteral_0= 'daily' )
                    // InternalHelperDSL.g:981:4: enumLiteral_0= 'daily'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getDAILYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRecurRuleAccess().getDAILYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:988:3: (enumLiteral_1= 'weekly' )
                    {
                    // InternalHelperDSL.g:988:3: (enumLiteral_1= 'weekly' )
                    // InternalHelperDSL.g:989:4: enumLiteral_1= 'weekly'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getWEEKLYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRecurRuleAccess().getWEEKLYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHelperDSL.g:996:3: (enumLiteral_2= 'monthly' )
                    {
                    // InternalHelperDSL.g:996:3: (enumLiteral_2= 'monthly' )
                    // InternalHelperDSL.g:997:4: enumLiteral_2= 'monthly'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getMONTHLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRecurRuleAccess().getMONTHLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHelperDSL.g:1004:3: (enumLiteral_3= 'yearly' )
                    {
                    // InternalHelperDSL.g:1004:3: (enumLiteral_3= 'yearly' )
                    // InternalHelperDSL.g:1005:4: enumLiteral_3= 'yearly'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRecurRuleAccess().getYEARLYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRecurRuleAccess().getYEARLYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHelperDSL.g:1012:3: (enumLiteral_4= 'on' )
                    {
                    // InternalHelperDSL.g:1012:3: (enumLiteral_4= 'on' )
                    // InternalHelperDSL.g:1013:4: enumLiteral_4= 'on'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_2); 

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


    // $ANTLR start "ruleWEEKDAY"
    // InternalHelperDSL.g:1023:1: ruleWEEKDAY returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
    public final Enumerator ruleWEEKDAY() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalHelperDSL.g:1029:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalHelperDSL.g:1030:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalHelperDSL.g:1030:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            case 46:
                {
                alt19=4;
                }
                break;
            case 47:
                {
                alt19=5;
                }
                break;
            case 48:
                {
                alt19=6;
                }
                break;
            case 49:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalHelperDSL.g:1031:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalHelperDSL.g:1031:3: (enumLiteral_0= 'Monday' )
                    // InternalHelperDSL.g:1032:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getMOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWEEKDAYAccess().getMOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHelperDSL.g:1039:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalHelperDSL.g:1039:3: (enumLiteral_1= 'Tuesday' )
                    // InternalHelperDSL.g:1040:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getTUEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWEEKDAYAccess().getTUEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHelperDSL.g:1047:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalHelperDSL.g:1047:3: (enumLiteral_2= 'Wednesday' )
                    // InternalHelperDSL.g:1048:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getWEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWEEKDAYAccess().getWEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHelperDSL.g:1055:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalHelperDSL.g:1055:3: (enumLiteral_3= 'Thursday' )
                    // InternalHelperDSL.g:1056:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getTHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWEEKDAYAccess().getTHEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHelperDSL.g:1063:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalHelperDSL.g:1063:3: (enumLiteral_4= 'Friday' )
                    // InternalHelperDSL.g:1064:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getFREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWEEKDAYAccess().getFREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHelperDSL.g:1071:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalHelperDSL.g:1071:3: (enumLiteral_5= 'Saturday' )
                    // InternalHelperDSL.g:1072:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getSAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWEEKDAYAccess().getSAEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHelperDSL.g:1079:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalHelperDSL.g:1079:3: (enumLiteral_6= 'Sunday' )
                    // InternalHelperDSL.g:1080:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getWEEKDAYAccess().getSUEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWEEKDAYAccess().getSUEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleWEEKDAY"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000540000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FC0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003F80001E00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003F80000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003002000000L});

}