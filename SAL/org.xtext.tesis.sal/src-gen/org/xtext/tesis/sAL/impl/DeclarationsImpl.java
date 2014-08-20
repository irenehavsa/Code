/**
 */
package org.xtext.tesis.sAL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.tesis.sAL.Declarations;
import org.xtext.tesis.sAL.Initialisation;
import org.xtext.tesis.sAL.SALPackage;
import org.xtext.tesis.sAL.Transition;
import org.xtext.tesis.sAL.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.impl.DeclarationsImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.impl.DeclarationsImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.impl.DeclarationsImpl#getInitialisations <em>Initialisations</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.impl.DeclarationsImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationsImpl extends MinimalEObjectImpl.Container implements Declarations
{
  /**
   * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarations()
   * @generated
   * @ordered
   */
  protected EList<VarDecl> variableDeclarations;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<String> definitions;

  /**
   * The cached value of the '{@link #getInitialisations() <em>Initialisations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialisations()
   * @generated
   * @ordered
   */
  protected EList<Initialisation> initialisations;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SALPackage.Literals.DECLARATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarDecl> getVariableDeclarations()
  {
    if (variableDeclarations == null)
    {
      variableDeclarations = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, SALPackage.DECLARATIONS__VARIABLE_DECLARATIONS);
    }
    return variableDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EDataTypeEList<String>(String.class, this, SALPackage.DECLARATIONS__DEFINITIONS);
    }
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Initialisation> getInitialisations()
  {
    if (initialisations == null)
    {
      initialisations = new EObjectContainmentEList<Initialisation>(Initialisation.class, this, SALPackage.DECLARATIONS__INITIALISATIONS);
    }
    return initialisations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, SALPackage.DECLARATIONS__TRANSITIONS);
    }
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SALPackage.DECLARATIONS__VARIABLE_DECLARATIONS:
        return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
      case SALPackage.DECLARATIONS__INITIALISATIONS:
        return ((InternalEList<?>)getInitialisations()).basicRemove(otherEnd, msgs);
      case SALPackage.DECLARATIONS__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SALPackage.DECLARATIONS__VARIABLE_DECLARATIONS:
        return getVariableDeclarations();
      case SALPackage.DECLARATIONS__DEFINITIONS:
        return getDefinitions();
      case SALPackage.DECLARATIONS__INITIALISATIONS:
        return getInitialisations();
      case SALPackage.DECLARATIONS__TRANSITIONS:
        return getTransitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SALPackage.DECLARATIONS__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
        getVariableDeclarations().addAll((Collection<? extends VarDecl>)newValue);
        return;
      case SALPackage.DECLARATIONS__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends String>)newValue);
        return;
      case SALPackage.DECLARATIONS__INITIALISATIONS:
        getInitialisations().clear();
        getInitialisations().addAll((Collection<? extends Initialisation>)newValue);
        return;
      case SALPackage.DECLARATIONS__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SALPackage.DECLARATIONS__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
        return;
      case SALPackage.DECLARATIONS__DEFINITIONS:
        getDefinitions().clear();
        return;
      case SALPackage.DECLARATIONS__INITIALISATIONS:
        getInitialisations().clear();
        return;
      case SALPackage.DECLARATIONS__TRANSITIONS:
        getTransitions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SALPackage.DECLARATIONS__VARIABLE_DECLARATIONS:
        return variableDeclarations != null && !variableDeclarations.isEmpty();
      case SALPackage.DECLARATIONS__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
      case SALPackage.DECLARATIONS__INITIALISATIONS:
        return initialisations != null && !initialisations.isEmpty();
      case SALPackage.DECLARATIONS__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (definitions: ");
    result.append(definitions);
    result.append(')');
    return result.toString();
  }

} //DeclarationsImpl
