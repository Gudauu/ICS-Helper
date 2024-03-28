package org.xtext.example.icshelper.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.icshelper.services.IcsHelperGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIcsHelperParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'schedule'", "'{'", "'}'", "'event'", "'from'", "'to'", "'at'", "'split'", "'by'", "'merge'", "'into'", "'modify'", "'set'", "'time'", "'owner'", "'location'"
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


        public InternalIcsHelperParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIcsHelperParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIcsHelperParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIcsHelper.g"; }



     	private IcsHelperGrammarAccess grammarAccess;

        public InternalIcsHelperParser(TokenStream input, IcsHelperGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected IcsHelperGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalIcsHelper.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalIcsHelper.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalIcsHelper.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalIcsHelper.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalIcsHelper.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalIcsHelper.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalIcsHelper.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19||LA1_0==21||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIcsHelper.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalIcsHelper.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalIcsHelper.g:80:4: lv_commands_0_0= ruleCommand
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
            	    					"org.xtext.example.icshelper.IcsHelper.Command");
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
    // InternalIcsHelper.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalIcsHelper.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalIcsHelper.g:101:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalIcsHelper.g:107:1: ruleCommand returns [EObject current=null] : (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CreateCommand_0 = null;

        EObject this_SplitCommand_1 = null;

        EObject this_MergeCommand_2 = null;

        EObject this_ModifyCommand_3 = null;



        	enterRule();

        try {
            // InternalIcsHelper.g:113:2: ( (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand ) )
            // InternalIcsHelper.g:114:2: (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand )
            {
            // InternalIcsHelper.g:114:2: (this_CreateCommand_0= ruleCreateCommand | this_SplitCommand_1= ruleSplitCommand | this_MergeCommand_2= ruleMergeCommand | this_ModifyCommand_3= ruleModifyCommand )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 23:
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
                    // InternalIcsHelper.g:115:3: this_CreateCommand_0= ruleCreateCommand
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
                    // InternalIcsHelper.g:124:3: this_SplitCommand_1= ruleSplitCommand
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
                    // InternalIcsHelper.g:133:3: this_MergeCommand_2= ruleMergeCommand
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
                    // InternalIcsHelper.g:142:3: this_ModifyCommand_3= ruleModifyCommand
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
    // InternalIcsHelper.g:154:1: entryRuleCreateCommand returns [EObject current=null] : iv_ruleCreateCommand= ruleCreateCommand EOF ;
    public final EObject entryRuleCreateCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateCommand = null;


        try {
            // InternalIcsHelper.g:154:54: (iv_ruleCreateCommand= ruleCreateCommand EOF )
            // InternalIcsHelper.g:155:2: iv_ruleCreateCommand= ruleCreateCommand EOF
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
    // InternalIcsHelper.g:161:1: ruleCreateCommand returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) ;
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
            // InternalIcsHelper.g:167:2: ( (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' ) )
            // InternalIcsHelper.g:168:2: (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            {
            // InternalIcsHelper.g:168:2: (otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}' )
            // InternalIcsHelper.g:169:3: otherlv_0= 'create' otherlv_1= 'schedule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_events_4_0= ruleEvent ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateCommandAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateCommandAccess().getScheduleKeyword_1());
            		
            // InternalIcsHelper.g:177:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalIcsHelper.g:178:4: (lv_name_2_0= RULE_ID )
            {
            // InternalIcsHelper.g:178:4: (lv_name_2_0= RULE_ID )
            // InternalIcsHelper.g:179:5: lv_name_2_0= RULE_ID
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
            		
            // InternalIcsHelper.g:199:3: ( (lv_events_4_0= ruleEvent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIcsHelper.g:200:4: (lv_events_4_0= ruleEvent )
            	    {
            	    // InternalIcsHelper.g:200:4: (lv_events_4_0= ruleEvent )
            	    // InternalIcsHelper.g:201:5: lv_events_4_0= ruleEvent
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
            	    						"org.xtext.example.icshelper.IcsHelper.Event");
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
    // InternalIcsHelper.g:226:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalIcsHelper.g:226:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalIcsHelper.g:227:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalIcsHelper.g:233:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? ) ;
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


        	enterRule();

        try {
            // InternalIcsHelper.g:239:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? ) )
            // InternalIcsHelper.g:240:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? )
            {
            // InternalIcsHelper.g:240:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )? )
            // InternalIcsHelper.g:241:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalIcsHelper.g:245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIcsHelper.g:246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIcsHelper.g:246:4: (lv_name_1_0= RULE_ID )
            // InternalIcsHelper.g:247:5: lv_name_1_0= RULE_ID
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
            		
            // InternalIcsHelper.g:267:3: ( (lv_startTime_3_0= RULE_STRING ) )
            // InternalIcsHelper.g:268:4: (lv_startTime_3_0= RULE_STRING )
            {
            // InternalIcsHelper.g:268:4: (lv_startTime_3_0= RULE_STRING )
            // InternalIcsHelper.g:269:5: lv_startTime_3_0= RULE_STRING
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
            		
            // InternalIcsHelper.g:289:3: ( (lv_endTime_5_0= RULE_STRING ) )
            // InternalIcsHelper.g:290:4: (lv_endTime_5_0= RULE_STRING )
            {
            // InternalIcsHelper.g:290:4: (lv_endTime_5_0= RULE_STRING )
            // InternalIcsHelper.g:291:5: lv_endTime_5_0= RULE_STRING
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

            // InternalIcsHelper.g:307:3: (otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIcsHelper.g:308:4: otherlv_6= 'at' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getAtKeyword_6_0());
                    			
                    // InternalIcsHelper.g:312:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalIcsHelper.g:313:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalIcsHelper.g:313:5: (lv_location_7_0= RULE_STRING )
                    // InternalIcsHelper.g:314:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalIcsHelper.g:335:1: entryRuleSplitCommand returns [EObject current=null] : iv_ruleSplitCommand= ruleSplitCommand EOF ;
    public final EObject entryRuleSplitCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitCommand = null;


        try {
            // InternalIcsHelper.g:335:53: (iv_ruleSplitCommand= ruleSplitCommand EOF )
            // InternalIcsHelper.g:336:2: iv_ruleSplitCommand= ruleSplitCommand EOF
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
    // InternalIcsHelper.g:342:1: ruleSplitCommand returns [EObject current=null] : (otherlv_0= 'split' ( (lv_schedule_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSplitCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_schedule_1_0=null;
        Token otherlv_2=null;
        Token lv_criteria_3_0=null;


        	enterRule();

        try {
            // InternalIcsHelper.g:348:2: ( (otherlv_0= 'split' ( (lv_schedule_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) ) )
            // InternalIcsHelper.g:349:2: (otherlv_0= 'split' ( (lv_schedule_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            {
            // InternalIcsHelper.g:349:2: (otherlv_0= 'split' ( (lv_schedule_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) ) )
            // InternalIcsHelper.g:350:3: otherlv_0= 'split' ( (lv_schedule_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_criteria_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitCommandAccess().getSplitKeyword_0());
            		
            // InternalIcsHelper.g:354:3: ( (lv_schedule_1_0= RULE_ID ) )
            // InternalIcsHelper.g:355:4: (lv_schedule_1_0= RULE_ID )
            {
            // InternalIcsHelper.g:355:4: (lv_schedule_1_0= RULE_ID )
            // InternalIcsHelper.g:356:5: lv_schedule_1_0= RULE_ID
            {
            lv_schedule_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_schedule_1_0, grammarAccess.getSplitCommandAccess().getScheduleIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"schedule",
            						lv_schedule_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitCommandAccess().getByKeyword_2());
            		
            // InternalIcsHelper.g:376:3: ( (lv_criteria_3_0= RULE_STRING ) )
            // InternalIcsHelper.g:377:4: (lv_criteria_3_0= RULE_STRING )
            {
            // InternalIcsHelper.g:377:4: (lv_criteria_3_0= RULE_STRING )
            // InternalIcsHelper.g:378:5: lv_criteria_3_0= RULE_STRING
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
    // InternalIcsHelper.g:398:1: entryRuleMergeCommand returns [EObject current=null] : iv_ruleMergeCommand= ruleMergeCommand EOF ;
    public final EObject entryRuleMergeCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeCommand = null;


        try {
            // InternalIcsHelper.g:398:53: (iv_ruleMergeCommand= ruleMergeCommand EOF )
            // InternalIcsHelper.g:399:2: iv_ruleMergeCommand= ruleMergeCommand EOF
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
    // InternalIcsHelper.g:405:1: ruleMergeCommand returns [EObject current=null] : (otherlv_0= 'merge' ( (lv_schedules_1_0= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) ;
    public final EObject ruleMergeCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_schedules_1_0=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;


        	enterRule();

        try {
            // InternalIcsHelper.g:411:2: ( (otherlv_0= 'merge' ( (lv_schedules_1_0= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) ) )
            // InternalIcsHelper.g:412:2: (otherlv_0= 'merge' ( (lv_schedules_1_0= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            {
            // InternalIcsHelper.g:412:2: (otherlv_0= 'merge' ( (lv_schedules_1_0= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) ) )
            // InternalIcsHelper.g:413:3: otherlv_0= 'merge' ( (lv_schedules_1_0= RULE_ID ) )+ otherlv_2= 'into' ( (lv_target_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeCommandAccess().getMergeKeyword_0());
            		
            // InternalIcsHelper.g:417:3: ( (lv_schedules_1_0= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIcsHelper.g:418:4: (lv_schedules_1_0= RULE_ID )
            	    {
            	    // InternalIcsHelper.g:418:4: (lv_schedules_1_0= RULE_ID )
            	    // InternalIcsHelper.g:419:5: lv_schedules_1_0= RULE_ID
            	    {
            	    lv_schedules_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    					newLeafNode(lv_schedules_1_0, grammarAccess.getMergeCommandAccess().getSchedulesIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMergeCommandRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"schedules",
            	    						lv_schedules_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeCommandAccess().getIntoKeyword_2());
            		
            // InternalIcsHelper.g:439:3: ( (lv_target_3_0= RULE_ID ) )
            // InternalIcsHelper.g:440:4: (lv_target_3_0= RULE_ID )
            {
            // InternalIcsHelper.g:440:4: (lv_target_3_0= RULE_ID )
            // InternalIcsHelper.g:441:5: lv_target_3_0= RULE_ID
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
    // InternalIcsHelper.g:461:1: entryRuleModifyCommand returns [EObject current=null] : iv_ruleModifyCommand= ruleModifyCommand EOF ;
    public final EObject entryRuleModifyCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyCommand = null;


        try {
            // InternalIcsHelper.g:461:54: (iv_ruleModifyCommand= ruleModifyCommand EOF )
            // InternalIcsHelper.g:462:2: iv_ruleModifyCommand= ruleModifyCommand EOF
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
    // InternalIcsHelper.g:468:1: ruleModifyCommand returns [EObject current=null] : (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleModifyCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_schedule_2_0=null;
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
            // InternalIcsHelper.g:474:2: ( (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) ) )
            // InternalIcsHelper.g:475:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            {
            // InternalIcsHelper.g:475:2: (otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) ) )
            // InternalIcsHelper.g:476:3: otherlv_0= 'modify' ( (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) ) otherlv_5= 'set' ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyCommandAccess().getModifyKeyword_0());
            		
            // InternalIcsHelper.g:480:3: ( (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) ) | (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIcsHelper.g:481:4: (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) )
                    {
                    // InternalIcsHelper.g:481:4: (otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) ) )
                    // InternalIcsHelper.g:482:5: otherlv_1= 'schedule' ( (lv_schedule_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getModifyCommandAccess().getScheduleKeyword_1_0_0());
                    				
                    // InternalIcsHelper.g:486:5: ( (lv_schedule_2_0= RULE_ID ) )
                    // InternalIcsHelper.g:487:6: (lv_schedule_2_0= RULE_ID )
                    {
                    // InternalIcsHelper.g:487:6: (lv_schedule_2_0= RULE_ID )
                    // InternalIcsHelper.g:488:7: lv_schedule_2_0= RULE_ID
                    {
                    lv_schedule_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(lv_schedule_2_0, grammarAccess.getModifyCommandAccess().getScheduleIDTerminalRuleCall_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"schedule",
                    								lv_schedule_2_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIcsHelper.g:506:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalIcsHelper.g:506:4: (otherlv_3= 'event' ( (otherlv_4= RULE_ID ) ) )
                    // InternalIcsHelper.g:507:5: otherlv_3= 'event' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getModifyCommandAccess().getEventKeyword_1_1_0());
                    				
                    // InternalIcsHelper.g:511:5: ( (otherlv_4= RULE_ID ) )
                    // InternalIcsHelper.g:512:6: (otherlv_4= RULE_ID )
                    {
                    // InternalIcsHelper.g:512:6: (otherlv_4= RULE_ID )
                    // InternalIcsHelper.g:513:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

                    							newLeafNode(otherlv_4, grammarAccess.getModifyCommandAccess().getEventEventCrossReference_1_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyCommandAccess().getSetKeyword_2());
            		
            // InternalIcsHelper.g:530:3: ( ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) ) | (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) ) | (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIcsHelper.g:531:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalIcsHelper.g:531:4: ( ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalIcsHelper.g:532:5: ( (lv_time_6_0= 'time' ) ) ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalIcsHelper.g:532:5: ( (lv_time_6_0= 'time' ) )
                    // InternalIcsHelper.g:533:6: (lv_time_6_0= 'time' )
                    {
                    // InternalIcsHelper.g:533:6: (lv_time_6_0= 'time' )
                    // InternalIcsHelper.g:534:7: lv_time_6_0= 'time'
                    {
                    lv_time_6_0=(Token)match(input,25,FOLLOW_9); 

                    							newLeafNode(lv_time_6_0, grammarAccess.getModifyCommandAccess().getTimeTimeKeyword_3_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifyCommandRule());
                    							}
                    							setWithLastConsumed(current, "time", lv_time_6_0, "time");
                    						

                    }


                    }

                    // InternalIcsHelper.g:546:5: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalIcsHelper.g:547:6: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalIcsHelper.g:547:6: (lv_value_7_0= RULE_STRING )
                    // InternalIcsHelper.g:548:7: lv_value_7_0= RULE_STRING
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
                    // InternalIcsHelper.g:566:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    {
                    // InternalIcsHelper.g:566:4: (otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) ) )
                    // InternalIcsHelper.g:567:5: otherlv_8= 'owner' ( (lv_value_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_9); 

                    					newLeafNode(otherlv_8, grammarAccess.getModifyCommandAccess().getOwnerKeyword_3_1_0());
                    				
                    // InternalIcsHelper.g:571:5: ( (lv_value_9_0= RULE_STRING ) )
                    // InternalIcsHelper.g:572:6: (lv_value_9_0= RULE_STRING )
                    {
                    // InternalIcsHelper.g:572:6: (lv_value_9_0= RULE_STRING )
                    // InternalIcsHelper.g:573:7: lv_value_9_0= RULE_STRING
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
                    // InternalIcsHelper.g:591:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    {
                    // InternalIcsHelper.g:591:4: (otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) ) )
                    // InternalIcsHelper.g:592:5: otherlv_10= 'location' ( (lv_value_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_9); 

                    					newLeafNode(otherlv_10, grammarAccess.getModifyCommandAccess().getLocationKeyword_3_2_0());
                    				
                    // InternalIcsHelper.g:596:5: ( (lv_value_11_0= RULE_STRING ) )
                    // InternalIcsHelper.g:597:6: (lv_value_11_0= RULE_STRING )
                    {
                    // InternalIcsHelper.g:597:6: (lv_value_11_0= RULE_STRING )
                    // InternalIcsHelper.g:598:7: lv_value_11_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000A80802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E000000L});

}