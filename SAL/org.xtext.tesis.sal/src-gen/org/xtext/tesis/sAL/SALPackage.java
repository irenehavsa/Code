/**
 */
package org.xtext.tesis.sAL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.tesis.sAL.SALFactory
 * @model kind="package"
 * @generated
 */
public interface SALPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sAL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/tesis/SAL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sAL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SALPackage eINSTANCE = org.xtext.tesis.sAL.impl.SALPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.ContextImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Context Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__CONTEXT_NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__BODY = 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.BodyImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getBody()
   * @generated
   */
  int BODY = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__TYPES = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__MODULE = 1;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.TypeDeclarationImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getTypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__TYPE_NAME = 0;

  /**
   * The feature id for the '<em><b>Type Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__TYPE_VALUES = 1;

  /**
   * The number of structural features of the '<em>Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.ModuleDeclarationImpl <em>Module Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.ModuleDeclarationImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getModuleDeclaration()
   * @generated
   */
  int MODULE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Module Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECLARATION__MODULE_NAME = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECLARATION__MODULE = 1;

  /**
   * The number of structural features of the '<em>Module Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.ModuleImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getModule()
   * @generated
   */
  int MODULE = 4;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.DeclarationsImpl <em>Declarations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.DeclarationsImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getDeclarations()
   * @generated
   */
  int DECLARATIONS = 5;

  /**
   * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS__VARIABLE_DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS__DEFINITIONS = 1;

  /**
   * The feature id for the '<em><b>Initialisations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS__INITIALISATIONS = 2;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS__TRANSITIONS = 3;

  /**
   * The number of structural features of the '<em>Declarations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATIONS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.VarDeclImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 6;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VARIABLE_NAME = 0;

  /**
   * The feature id for the '<em><b>Value Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VALUE_SET = 1;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.ValueSetImpl <em>Value Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.ValueSetImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getValueSet()
   * @generated
   */
  int VALUE_SET = 7;

  /**
   * The number of structural features of the '<em>Value Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.ScalarImpl <em>Scalar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.ScalarImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getScalar()
   * @generated
   */
  int SCALAR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR__NAME = VALUE_SET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scalar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.SubrangeImpl <em>Subrange</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.SubrangeImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getSubrange()
   * @generated
   */
  int SUBRANGE = 9;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__LOWER_BOUND = VALUE_SET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE__UPPER_BOUND = VALUE_SET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subrange</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBRANGE_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.InitialisationImpl <em>Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.InitialisationImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getInitialisation()
   * @generated
   */
  int INITIALISATION = 10;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.TransitionImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 11;

  /**
   * The feature id for the '<em><b>Transition Numer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRANSITION_NUMER = 0;

  /**
   * The feature id for the '<em><b>Guards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARDS = 1;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ASSIGNMENTS = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.GuardImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 12;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__VALUE = 1;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tesis.sAL.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tesis.sAL.impl.AssignmentImpl
   * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 13;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see org.xtext.tesis.sAL.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Context#getContextName <em>Context Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context Name</em>'.
   * @see org.xtext.tesis.sAL.Context#getContextName()
   * @see #getContext()
   * @generated
   */
  EAttribute getContext_ContextName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tesis.sAL.Context#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.tesis.sAL.Context#getBody()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.tesis.sAL.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Body#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.tesis.sAL.Body#getTypes()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Types();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tesis.sAL.Body#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see org.xtext.tesis.sAL.Body#getModule()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Module();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Declaration</em>'.
   * @see org.xtext.tesis.sAL.TypeDeclaration
   * @generated
   */
  EClass getTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.TypeDeclaration#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see org.xtext.tesis.sAL.TypeDeclaration#getTypeName()
   * @see #getTypeDeclaration()
   * @generated
   */
  EAttribute getTypeDeclaration_TypeName();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.tesis.sAL.TypeDeclaration#getTypeValues <em>Type Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Values</em>'.
   * @see org.xtext.tesis.sAL.TypeDeclaration#getTypeValues()
   * @see #getTypeDeclaration()
   * @generated
   */
  EAttribute getTypeDeclaration_TypeValues();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.ModuleDeclaration <em>Module Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Declaration</em>'.
   * @see org.xtext.tesis.sAL.ModuleDeclaration
   * @generated
   */
  EClass getModuleDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.ModuleDeclaration#getModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Module Name</em>'.
   * @see org.xtext.tesis.sAL.ModuleDeclaration#getModuleName()
   * @see #getModuleDeclaration()
   * @generated
   */
  EAttribute getModuleDeclaration_ModuleName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tesis.sAL.ModuleDeclaration#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see org.xtext.tesis.sAL.ModuleDeclaration#getModule()
   * @see #getModuleDeclaration()
   * @generated
   */
  EReference getModuleDeclaration_Module();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.xtext.tesis.sAL.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Module#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see org.xtext.tesis.sAL.Module#getDeclaration()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Declaration();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Declarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarations</em>'.
   * @see org.xtext.tesis.sAL.Declarations
   * @generated
   */
  EClass getDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Declarations#getVariableDeclarations <em>Variable Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
   * @see org.xtext.tesis.sAL.Declarations#getVariableDeclarations()
   * @see #getDeclarations()
   * @generated
   */
  EReference getDeclarations_VariableDeclarations();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.tesis.sAL.Declarations#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Definitions</em>'.
   * @see org.xtext.tesis.sAL.Declarations#getDefinitions()
   * @see #getDeclarations()
   * @generated
   */
  EAttribute getDeclarations_Definitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Declarations#getInitialisations <em>Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initialisations</em>'.
   * @see org.xtext.tesis.sAL.Declarations#getInitialisations()
   * @see #getDeclarations()
   * @generated
   */
  EReference getDeclarations_Initialisations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Declarations#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.xtext.tesis.sAL.Declarations#getTransitions()
   * @see #getDeclarations()
   * @generated
   */
  EReference getDeclarations_Transitions();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see org.xtext.tesis.sAL.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.VarDecl#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.xtext.tesis.sAL.VarDecl#getVariableName()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_VariableName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tesis.sAL.VarDecl#getValueSet <em>Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Set</em>'.
   * @see org.xtext.tesis.sAL.VarDecl#getValueSet()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_ValueSet();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.ValueSet <em>Value Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Set</em>'.
   * @see org.xtext.tesis.sAL.ValueSet
   * @generated
   */
  EClass getValueSet();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Scalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar</em>'.
   * @see org.xtext.tesis.sAL.Scalar
   * @generated
   */
  EClass getScalar();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Scalar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.tesis.sAL.Scalar#getName()
   * @see #getScalar()
   * @generated
   */
  EAttribute getScalar_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Subrange <em>Subrange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subrange</em>'.
   * @see org.xtext.tesis.sAL.Subrange
   * @generated
   */
  EClass getSubrange();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Subrange#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see org.xtext.tesis.sAL.Subrange#getLowerBound()
   * @see #getSubrange()
   * @generated
   */
  EAttribute getSubrange_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Subrange#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see org.xtext.tesis.sAL.Subrange#getUpperBound()
   * @see #getSubrange()
   * @generated
   */
  EAttribute getSubrange_UpperBound();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Initialisation <em>Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialisation</em>'.
   * @see org.xtext.tesis.sAL.Initialisation
   * @generated
   */
  EClass getInitialisation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Initialisation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.tesis.sAL.Initialisation#getVariable()
   * @see #getInitialisation()
   * @generated
   */
  EAttribute getInitialisation_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Initialisation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.tesis.sAL.Initialisation#getValue()
   * @see #getInitialisation()
   * @generated
   */
  EAttribute getInitialisation_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.xtext.tesis.sAL.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Transition#getTransitionNumer <em>Transition Numer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transition Numer</em>'.
   * @see org.xtext.tesis.sAL.Transition#getTransitionNumer()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_TransitionNumer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Transition#getGuards <em>Guards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guards</em>'.
   * @see org.xtext.tesis.sAL.Transition#getGuards()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guards();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tesis.sAL.Transition#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.xtext.tesis.sAL.Transition#getAssignments()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Assignments();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.xtext.tesis.sAL.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Guard#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.tesis.sAL.Guard#getVariable()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Guard#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.tesis.sAL.Guard#getValue()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.tesis.sAL.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.xtext.tesis.sAL.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.xtext.tesis.sAL.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Variable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tesis.sAL.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.tesis.sAL.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SALFactory getSALFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.ContextImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Context Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT__CONTEXT_NAME = eINSTANCE.getContext_ContextName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__BODY = eINSTANCE.getContext_Body();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.BodyImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__TYPES = eINSTANCE.getBody_Types();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__MODULE = eINSTANCE.getBody_Module();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.TypeDeclarationImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getTypeDeclaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__TYPE_NAME = eINSTANCE.getTypeDeclaration_TypeName();

    /**
     * The meta object literal for the '<em><b>Type Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__TYPE_VALUES = eINSTANCE.getTypeDeclaration_TypeValues();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.ModuleDeclarationImpl <em>Module Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.ModuleDeclarationImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getModuleDeclaration()
     * @generated
     */
    EClass MODULE_DECLARATION = eINSTANCE.getModuleDeclaration();

    /**
     * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_DECLARATION__MODULE_NAME = eINSTANCE.getModuleDeclaration_ModuleName();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DECLARATION__MODULE = eINSTANCE.getModuleDeclaration_Module();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.ModuleImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__DECLARATION = eINSTANCE.getModule_Declaration();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.DeclarationsImpl <em>Declarations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.DeclarationsImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getDeclarations()
     * @generated
     */
    EClass DECLARATIONS = eINSTANCE.getDeclarations();

    /**
     * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATIONS__VARIABLE_DECLARATIONS = eINSTANCE.getDeclarations_VariableDeclarations();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATIONS__DEFINITIONS = eINSTANCE.getDeclarations_Definitions();

    /**
     * The meta object literal for the '<em><b>Initialisations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATIONS__INITIALISATIONS = eINSTANCE.getDeclarations_Initialisations();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATIONS__TRANSITIONS = eINSTANCE.getDeclarations_Transitions();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.VarDeclImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__VARIABLE_NAME = eINSTANCE.getVarDecl_VariableName();

    /**
     * The meta object literal for the '<em><b>Value Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__VALUE_SET = eINSTANCE.getVarDecl_ValueSet();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.ValueSetImpl <em>Value Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.ValueSetImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getValueSet()
     * @generated
     */
    EClass VALUE_SET = eINSTANCE.getValueSet();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.ScalarImpl <em>Scalar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.ScalarImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getScalar()
     * @generated
     */
    EClass SCALAR = eINSTANCE.getScalar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCALAR__NAME = eINSTANCE.getScalar_Name();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.SubrangeImpl <em>Subrange</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.SubrangeImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getSubrange()
     * @generated
     */
    EClass SUBRANGE = eINSTANCE.getSubrange();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE__LOWER_BOUND = eINSTANCE.getSubrange_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBRANGE__UPPER_BOUND = eINSTANCE.getSubrange_UpperBound();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.InitialisationImpl <em>Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.InitialisationImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getInitialisation()
     * @generated
     */
    EClass INITIALISATION = eINSTANCE.getInitialisation();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIALISATION__VARIABLE = eINSTANCE.getInitialisation_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIALISATION__VALUE = eINSTANCE.getInitialisation_Value();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.TransitionImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Transition Numer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__TRANSITION_NUMER = eINSTANCE.getTransition_TransitionNumer();

    /**
     * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARDS = eINSTANCE.getTransition_Guards();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__ASSIGNMENTS = eINSTANCE.getTransition_Assignments();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.GuardImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__VARIABLE = eINSTANCE.getGuard_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__VALUE = eINSTANCE.getGuard_Value();

    /**
     * The meta object literal for the '{@link org.xtext.tesis.sAL.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tesis.sAL.impl.AssignmentImpl
     * @see org.xtext.tesis.sAL.impl.SALPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

  }

} //SALPackage
