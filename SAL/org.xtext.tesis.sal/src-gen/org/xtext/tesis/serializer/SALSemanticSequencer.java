package org.xtext.tesis.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.tesis.sAL.Assignment;
import org.xtext.tesis.sAL.Body;
import org.xtext.tesis.sAL.Context;
import org.xtext.tesis.sAL.Declarations;
import org.xtext.tesis.sAL.Guard;
import org.xtext.tesis.sAL.Initialisation;
import org.xtext.tesis.sAL.Module;
import org.xtext.tesis.sAL.ModuleDeclaration;
import org.xtext.tesis.sAL.SALPackage;
import org.xtext.tesis.sAL.Scalar;
import org.xtext.tesis.sAL.Subrange;
import org.xtext.tesis.sAL.Transition;
import org.xtext.tesis.sAL.TypeDeclaration;
import org.xtext.tesis.sAL.VarDecl;
import org.xtext.tesis.services.SALGrammarAccess;

@SuppressWarnings("all")
public class SALSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SALGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SALPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SALPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.DECLARATIONS:
				if(context == grammarAccess.getDeclarationsRule()) {
					sequence_Declarations(context, (Declarations) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.GUARD:
				if(context == grammarAccess.getGuardRule()) {
					sequence_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.INITIALISATION:
				if(context == grammarAccess.getInitialisationRule()) {
					sequence_Initialisation(context, (Initialisation) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.MODULE_DECLARATION:
				if(context == grammarAccess.getModuleDeclarationRule()) {
					sequence_ModuleDeclaration(context, (ModuleDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.SCALAR:
				if(context == grammarAccess.getScalarRule() ||
				   context == grammarAccess.getValueSetRule()) {
					sequence_Scalar(context, (Scalar) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.SUBRANGE:
				if(context == grammarAccess.getSubrangeRule() ||
				   context == grammarAccess.getValueSetRule()) {
					sequence_Subrange(context, (Subrange) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.TYPE_DECLARATION:
				if(context == grammarAccess.getTypeDeclarationRule()) {
					sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SALPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (variable=STRING value=STRING)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.ASSIGNMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.ASSIGNMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getVariableSTRINGTerminalRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (types+=TypeDeclaration module=ModuleDeclaration)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (contextName=STRING body=Body)
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.CONTEXT__CONTEXT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.CONTEXT__CONTEXT_NAME));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.CONTEXT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.CONTEXT__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextAccess().getContextNameSTRINGTerminalRuleCall_0_0(), semanticObject.getContextName());
		feeder.accept(grammarAccess.getContextAccess().getBodyBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         variableDeclarations+=VarDecl | 
	 *         variableDeclarations+=VarDecl | 
	 *         variableDeclarations+=VarDecl | 
	 *         definitions+=Definition | 
	 *         initialisations+=Initialisation | 
	 *         transitions+=Transition
	 *     )
	 */
	protected void sequence_Declarations(EObject context, Declarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=STRING value=STRING)
	 */
	protected void sequence_Guard(EObject context, Guard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.GUARD__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.GUARD__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.GUARD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.GUARD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardAccess().getVariableSTRINGTerminalRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getGuardAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=STRING value=STRING)
	 */
	protected void sequence_Initialisation(EObject context, Initialisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.INITIALISATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.INITIALISATION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.INITIALISATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.INITIALISATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInitialisationAccess().getVariableSTRINGTerminalRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getInitialisationAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (moduleName=STRING module=Module)
	 */
	protected void sequence_ModuleDeclaration(EObject context, ModuleDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.MODULE_DECLARATION__MODULE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.MODULE_DECLARATION__MODULE_NAME));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.MODULE_DECLARATION__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.MODULE_DECLARATION__MODULE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModuleDeclarationAccess().getModuleNameSTRINGTerminalRuleCall_0_0(), semanticObject.getModuleName());
		feeder.accept(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0(), semanticObject.getModule());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declaration+=Declarations
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Scalar(EObject context, Scalar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.SCALAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.SCALAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=INT upperBound=INT)
	 */
	protected void sequence_Subrange(EObject context, Subrange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.SUBRANGE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.SUBRANGE__LOWER_BOUND));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.SUBRANGE__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.SUBRANGE__UPPER_BOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubrangeAccess().getLowerBoundINTTerminalRuleCall_1_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getSubrangeAccess().getUpperBoundINTTerminalRuleCall_3_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (transitionNumer=STRING guards+=Guard* assignments+=Assignment*)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeName=STRING typeValues+=STRING)
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variableName=STRING valueSet=ValueSet)
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.VAR_DECL__VARIABLE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.VAR_DECL__VARIABLE_NAME));
			if(transientValues.isValueTransient(semanticObject, SALPackage.Literals.VAR_DECL__VALUE_SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SALPackage.Literals.VAR_DECL__VALUE_SET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclAccess().getVariableNameSTRINGTerminalRuleCall_0_0(), semanticObject.getVariableName());
		feeder.accept(grammarAccess.getVarDeclAccess().getValueSetValueSetParserRuleCall_2_0(), semanticObject.getValueSet());
		feeder.finish();
	}
}
