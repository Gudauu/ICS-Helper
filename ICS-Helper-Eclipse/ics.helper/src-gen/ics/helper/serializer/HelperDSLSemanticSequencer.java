/*
 * generated by Xtext 2.34.0
 */
package ics.helper.serializer;

import com.google.inject.Inject;
import ics.helper.helperDSL.CreateCommand;
import ics.helper.helperDSL.DaysOfWeek;
import ics.helper.helperDSL.Event;
import ics.helper.helperDSL.HelperDSLPackage;
import ics.helper.helperDSL.MergeCommand;
import ics.helper.helperDSL.Model;
import ics.helper.helperDSL.ModifyCommand;
import ics.helper.helperDSL.Schedule;
import ics.helper.helperDSL.SplitCommand;
import ics.helper.services.HelperDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class HelperDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HelperDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == HelperDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case HelperDSLPackage.CREATE_COMMAND:
				sequence_CreateCommand(context, (CreateCommand) semanticObject); 
				return; 
			case HelperDSLPackage.DAYS_OF_WEEK:
				sequence_DaysOfWeek(context, (DaysOfWeek) semanticObject); 
				return; 
			case HelperDSLPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case HelperDSLPackage.MERGE_COMMAND:
				sequence_MergeCommand(context, (MergeCommand) semanticObject); 
				return; 
			case HelperDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case HelperDSLPackage.MODIFY_COMMAND:
				sequence_ModifyCommand(context, (ModifyCommand) semanticObject); 
				return; 
			case HelperDSLPackage.SCHEDULE:
				sequence_Schedule(context, (Schedule) semanticObject); 
				return; 
			case HelperDSLPackage.SPLIT_COMMAND:
				sequence_SplitCommand(context, (SplitCommand) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns CreateCommand
	 *     CreateCommand returns CreateCommand
	 *
	 * Constraint:
	 *     (name=ID events+=Event*)
	 * </pre>
	 */
	protected void sequence_CreateCommand(ISerializationContext context, CreateCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DaysOfWeek returns DaysOfWeek
	 *
	 * Constraint:
	 *     (day=ID day=ID*)
	 * </pre>
	 */
	protected void sequence_DaysOfWeek(ISerializationContext context, DaysOfWeek semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         startTime=STRING 
	 *         endTime=STRING 
	 *         location=STRING? 
	 *         description=STRING? 
	 *         link=STRING? 
	 *         recur=RecurRule?
	 *     )
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns MergeCommand
	 *     MergeCommand returns MergeCommand
	 *
	 * Constraint:
	 *     (schedules+=[Schedule|ID]+ target=ID)
	 * </pre>
	 */
	protected void sequence_MergeCommand(ISerializationContext context, MergeCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     commands+=Command+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns ModifyCommand
	 *     ModifyCommand returns ModifyCommand
	 *
	 * Constraint:
	 *     ((schedule=[Schedule|ID] | event=[Event|ID]) ((time='time' value=STRING) | value=STRING | value=STRING))
	 * </pre>
	 */
	protected void sequence_ModifyCommand(ISerializationContext context, ModifyCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Schedule returns Schedule
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Schedule(ISerializationContext context, Schedule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HelperDSLPackage.Literals.SCHEDULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelperDSLPackage.Literals.SCHEDULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScheduleAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns SplitCommand
	 *     SplitCommand returns SplitCommand
	 *
	 * Constraint:
	 *     (schedule=[Schedule|ID] criteria=STRING)
	 * </pre>
	 */
	protected void sequence_SplitCommand(ISerializationContext context, SplitCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, HelperDSLPackage.Literals.SPLIT_COMMAND__SCHEDULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelperDSLPackage.Literals.SPLIT_COMMAND__SCHEDULE));
			if (transientValues.isValueTransient(semanticObject, HelperDSLPackage.Literals.SPLIT_COMMAND__CRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelperDSLPackage.Literals.SPLIT_COMMAND__CRITERIA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSplitCommandAccess().getScheduleScheduleIDTerminalRuleCall_1_0_1(), semanticObject.eGet(HelperDSLPackage.Literals.SPLIT_COMMAND__SCHEDULE, false));
		feeder.accept(grammarAccess.getSplitCommandAccess().getCriteriaSTRINGTerminalRuleCall_3_0(), semanticObject.getCriteria());
		feeder.finish();
	}
	
	
}
