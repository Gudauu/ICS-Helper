/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.icshelper.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class IcsHelperGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.Model");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//Model:
		//    commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCreateCommandParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSplitCommandParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMergeCommandParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cModifyCommandParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Command:
		//    CreateCommand | SplitCommand | MergeCommand | ModifyCommand;
		@Override public ParserRule getRule() { return rule; }
		
		//CreateCommand | SplitCommand | MergeCommand | ModifyCommand
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CreateCommand
		public RuleCall getCreateCommandParserRuleCall_0() { return cCreateCommandParserRuleCall_0; }
		
		//SplitCommand
		public RuleCall getSplitCommandParserRuleCall_1() { return cSplitCommandParserRuleCall_1; }
		
		//MergeCommand
		public RuleCall getMergeCommandParserRuleCall_2() { return cMergeCommandParserRuleCall_2; }
		
		//ModifyCommand
		public RuleCall getModifyCommandParserRuleCall_3() { return cModifyCommandParserRuleCall_3; }
	}
	public class CreateCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.CreateCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCreateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cScheduleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEventsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEventsEventParserRuleCall_4_0 = (RuleCall)cEventsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//CreateCommand:
		//    'create' 'schedule' name=ID '{'
		//        events+=Event*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'create' 'schedule' name=ID '{'
		//    events+=Event*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'create'
		public Keyword getCreateKeyword_0() { return cCreateKeyword_0; }
		
		//'schedule'
		public Keyword getScheduleKeyword_1() { return cScheduleKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//events+=Event*
		public Assignment getEventsAssignment_4() { return cEventsAssignment_4; }
		
		//Event
		public RuleCall getEventsEventParserRuleCall_4_0() { return cEventsEventParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEventKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStartTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_3_0 = (RuleCall)cStartTimeAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEndTimeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_5_0 = (RuleCall)cEndTimeAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cAtKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cLocationAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cLocationSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cLocationAssignment_6_1.eContents().get(0);
		
		//Event:
		//    'event' name=ID 'from' startTime=STRING 'to' endTime=STRING ('at' location=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'event' name=ID 'from' startTime=STRING 'to' endTime=STRING ('at' location=STRING)?
		public Group getGroup() { return cGroup; }
		
		//'event'
		public Keyword getEventKeyword_0() { return cEventKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_3() { return cStartTimeAssignment_3; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_3_0() { return cStartTimeSTRINGTerminalRuleCall_3_0; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_5() { return cEndTimeAssignment_5; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_5_0() { return cEndTimeSTRINGTerminalRuleCall_5_0; }
		
		//('at' location=STRING)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'at'
		public Keyword getAtKeyword_6_0() { return cAtKeyword_6_0; }
		
		//location=STRING
		public Assignment getLocationAssignment_6_1() { return cLocationAssignment_6_1; }
		
		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_6_1_0() { return cLocationSTRINGTerminalRuleCall_6_1_0; }
	}
	public class LoadAllICSCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.LoadAllICSCommand");
		private final Keyword cLoadAllICSKeyword = (Keyword)rule.eContents().get(1);
		
		//LoadAllICSCommand:
		//    'loadAllICS';
		@Override public ParserRule getRule() { return rule; }
		
		//'loadAllICS'
		public Keyword getLoadAllICSKeyword() { return cLoadAllICSKeyword; }
	}
	public class SplitCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.SplitCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSplitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cScheduleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cScheduleIDTerminalRuleCall_1_0 = (RuleCall)cScheduleAssignment_1.eContents().get(0);
		private final Keyword cByKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCriteriaAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCriteriaSTRINGTerminalRuleCall_3_0 = (RuleCall)cCriteriaAssignment_3.eContents().get(0);
		
		//SplitCommand:
		//    'split' schedule=ID 'by' criteria=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'split' schedule=ID 'by' criteria=STRING
		public Group getGroup() { return cGroup; }
		
		//'split'
		public Keyword getSplitKeyword_0() { return cSplitKeyword_0; }
		
		//schedule=ID
		public Assignment getScheduleAssignment_1() { return cScheduleAssignment_1; }
		
		//ID
		public RuleCall getScheduleIDTerminalRuleCall_1_0() { return cScheduleIDTerminalRuleCall_1_0; }
		
		//'by'
		public Keyword getByKeyword_2() { return cByKeyword_2; }
		
		//criteria=STRING
		public Assignment getCriteriaAssignment_3() { return cCriteriaAssignment_3; }
		
		//STRING
		public RuleCall getCriteriaSTRINGTerminalRuleCall_3_0() { return cCriteriaSTRINGTerminalRuleCall_3_0; }
	}
	public class MergeCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.MergeCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMergeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSchedulesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSchedulesIDTerminalRuleCall_1_0 = (RuleCall)cSchedulesAssignment_1.eContents().get(0);
		private final Keyword cIntoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTargetIDTerminalRuleCall_3_0 = (RuleCall)cTargetAssignment_3.eContents().get(0);
		
		//MergeCommand:
		//    'merge' schedules+=ID+ 'into' target=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'merge' schedules+=ID+ 'into' target=ID
		public Group getGroup() { return cGroup; }
		
		//'merge'
		public Keyword getMergeKeyword_0() { return cMergeKeyword_0; }
		
		//schedules+=ID+
		public Assignment getSchedulesAssignment_1() { return cSchedulesAssignment_1; }
		
		//ID
		public RuleCall getSchedulesIDTerminalRuleCall_1_0() { return cSchedulesIDTerminalRuleCall_1_0; }
		
		//'into'
		public Keyword getIntoKeyword_2() { return cIntoKeyword_2; }
		
		//target=ID
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }
		
		//ID
		public RuleCall getTargetIDTerminalRuleCall_3_0() { return cTargetIDTerminalRuleCall_3_0; }
	}
	public class ModifyCommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.icshelper.IcsHelper.ModifyCommand");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModifyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cScheduleKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cScheduleAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cScheduleIDTerminalRuleCall_1_0_1_0 = (RuleCall)cScheduleAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cEventKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cEventAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final CrossReference cEventEventCrossReference_1_1_1_0 = (CrossReference)cEventAssignment_1_1_1.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_1_1_1_0_1 = (RuleCall)cEventEventCrossReference_1_1_1_0.eContents().get(1);
		private final Keyword cSetKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Assignment cTimeAssignment_3_0_0 = (Assignment)cGroup_3_0.eContents().get(0);
		private final Keyword cTimeTimeKeyword_3_0_0_0 = (Keyword)cTimeAssignment_3_0_0.eContents().get(0);
		private final Assignment cValueAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_0_1_0 = (RuleCall)cValueAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cOwnerKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cValueAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cValueAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cAlternatives_3.eContents().get(2);
		private final Keyword cLocationKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cValueAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_3_2_1_0 = (RuleCall)cValueAssignment_3_2_1.eContents().get(0);
		
		//ModifyCommand:
		//    'modify' ('schedule' schedule=ID | 'event' event=[Event]) 'set' (time='time' value=STRING | 'owner' value=STRING | 'location' value=STRING);
		@Override public ParserRule getRule() { return rule; }
		
		//'modify' ('schedule' schedule=ID | 'event' event=[Event]) 'set' (time='time' value=STRING | 'owner' value=STRING | 'location' value=STRING)
		public Group getGroup() { return cGroup; }
		
		//'modify'
		public Keyword getModifyKeyword_0() { return cModifyKeyword_0; }
		
		//('schedule' schedule=ID | 'event' event=[Event])
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'schedule' schedule=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'schedule'
		public Keyword getScheduleKeyword_1_0_0() { return cScheduleKeyword_1_0_0; }
		
		//schedule=ID
		public Assignment getScheduleAssignment_1_0_1() { return cScheduleAssignment_1_0_1; }
		
		//ID
		public RuleCall getScheduleIDTerminalRuleCall_1_0_1_0() { return cScheduleIDTerminalRuleCall_1_0_1_0; }
		
		//'event' event=[Event]
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'event'
		public Keyword getEventKeyword_1_1_0() { return cEventKeyword_1_1_0; }
		
		//event=[Event]
		public Assignment getEventAssignment_1_1_1() { return cEventAssignment_1_1_1; }
		
		//[Event]
		public CrossReference getEventEventCrossReference_1_1_1_0() { return cEventEventCrossReference_1_1_1_0; }
		
		//ID
		public RuleCall getEventEventIDTerminalRuleCall_1_1_1_0_1() { return cEventEventIDTerminalRuleCall_1_1_1_0_1; }
		
		//'set'
		public Keyword getSetKeyword_2() { return cSetKeyword_2; }
		
		//(time='time' value=STRING | 'owner' value=STRING | 'location' value=STRING)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//time='time' value=STRING
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//time='time'
		public Assignment getTimeAssignment_3_0_0() { return cTimeAssignment_3_0_0; }
		
		//'time'
		public Keyword getTimeTimeKeyword_3_0_0_0() { return cTimeTimeKeyword_3_0_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_3_0_1() { return cValueAssignment_3_0_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_0_1_0() { return cValueSTRINGTerminalRuleCall_3_0_1_0; }
		
		//'owner' value=STRING
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'owner'
		public Keyword getOwnerKeyword_3_1_0() { return cOwnerKeyword_3_1_0; }
		
		//value=STRING
		public Assignment getValueAssignment_3_1_1() { return cValueAssignment_3_1_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_1_1_0() { return cValueSTRINGTerminalRuleCall_3_1_1_0; }
		
		//'location' value=STRING
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'location'
		public Keyword getLocationKeyword_3_2_0() { return cLocationKeyword_3_2_0; }
		
		//value=STRING
		public Assignment getValueAssignment_3_2_1() { return cValueAssignment_3_2_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_3_2_1_0() { return cValueSTRINGTerminalRuleCall_3_2_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final CommandElements pCommand;
	private final CreateCommandElements pCreateCommand;
	private final EventElements pEvent;
	private final LoadAllICSCommandElements pLoadAllICSCommand;
	private final SplitCommandElements pSplitCommand;
	private final MergeCommandElements pMergeCommand;
	private final ModifyCommandElements pModifyCommand;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IcsHelperGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCommand = new CommandElements();
		this.pCreateCommand = new CreateCommandElements();
		this.pEvent = new EventElements();
		this.pLoadAllICSCommand = new LoadAllICSCommandElements();
		this.pSplitCommand = new SplitCommandElements();
		this.pMergeCommand = new MergeCommandElements();
		this.pModifyCommand = new ModifyCommandElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.icshelper.IcsHelper".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    commands+=Command*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Command:
	//    CreateCommand | SplitCommand | MergeCommand | ModifyCommand;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//CreateCommand:
	//    'create' 'schedule' name=ID '{'
	//        events+=Event*
	//    '}';
	public CreateCommandElements getCreateCommandAccess() {
		return pCreateCommand;
	}
	
	public ParserRule getCreateCommandRule() {
		return getCreateCommandAccess().getRule();
	}
	
	//Event:
	//    'event' name=ID 'from' startTime=STRING 'to' endTime=STRING ('at' location=STRING)?;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//LoadAllICSCommand:
	//    'loadAllICS';
	public LoadAllICSCommandElements getLoadAllICSCommandAccess() {
		return pLoadAllICSCommand;
	}
	
	public ParserRule getLoadAllICSCommandRule() {
		return getLoadAllICSCommandAccess().getRule();
	}
	
	//SplitCommand:
	//    'split' schedule=ID 'by' criteria=STRING;
	public SplitCommandElements getSplitCommandAccess() {
		return pSplitCommand;
	}
	
	public ParserRule getSplitCommandRule() {
		return getSplitCommandAccess().getRule();
	}
	
	//MergeCommand:
	//    'merge' schedules+=ID+ 'into' target=ID;
	public MergeCommandElements getMergeCommandAccess() {
		return pMergeCommand;
	}
	
	public ParserRule getMergeCommandRule() {
		return getMergeCommandAccess().getRule();
	}
	
	//ModifyCommand:
	//    'modify' ('schedule' schedule=ID | 'event' event=[Event]) 'set' (time='time' value=STRING | 'owner' value=STRING | 'location' value=STRING);
	public ModifyCommandElements getModifyCommandAccess() {
		return pModifyCommand;
	}
	
	public ParserRule getModifyCommandRule() {
		return getModifyCommandAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
