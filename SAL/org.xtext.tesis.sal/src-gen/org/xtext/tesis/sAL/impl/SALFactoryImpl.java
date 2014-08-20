/**
 */
package org.xtext.tesis.sAL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.tesis.sAL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SALFactoryImpl extends EFactoryImpl implements SALFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SALFactory init()
  {
    try
    {
      SALFactory theSALFactory = (SALFactory)EPackage.Registry.INSTANCE.getEFactory(SALPackage.eNS_URI);
      if (theSALFactory != null)
      {
        return theSALFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SALFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SALFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SALPackage.CONTEXT: return createContext();
      case SALPackage.BODY: return createBody();
      case SALPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case SALPackage.MODULE_DECLARATION: return createModuleDeclaration();
      case SALPackage.MODULE: return createModule();
      case SALPackage.DECLARATIONS: return createDeclarations();
      case SALPackage.VAR_DECL: return createVarDecl();
      case SALPackage.VALUE_SET: return createValueSet();
      case SALPackage.SCALAR: return createScalar();
      case SALPackage.SUBRANGE: return createSubrange();
      case SALPackage.INITIALISATION: return createInitialisation();
      case SALPackage.TRANSITION: return createTransition();
      case SALPackage.GUARD: return createGuard();
      case SALPackage.ASSIGNMENT: return createAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDeclaration createModuleDeclaration()
  {
    ModuleDeclarationImpl moduleDeclaration = new ModuleDeclarationImpl();
    return moduleDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarations createDeclarations()
  {
    DeclarationsImpl declarations = new DeclarationsImpl();
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSet createValueSet()
  {
    ValueSetImpl valueSet = new ValueSetImpl();
    return valueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scalar createScalar()
  {
    ScalarImpl scalar = new ScalarImpl();
    return scalar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subrange createSubrange()
  {
    SubrangeImpl subrange = new SubrangeImpl();
    return subrange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialisation createInitialisation()
  {
    InitialisationImpl initialisation = new InitialisationImpl();
    return initialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SALPackage getSALPackage()
  {
    return (SALPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SALPackage getPackage()
  {
    return SALPackage.eINSTANCE;
  }

} //SALFactoryImpl
