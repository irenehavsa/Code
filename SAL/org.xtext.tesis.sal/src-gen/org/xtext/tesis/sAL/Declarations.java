/**
 */
package org.xtext.tesis.sAL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.Declarations#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.Declarations#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.Declarations#getInitialisations <em>Initialisations</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.Declarations#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tesis.sAL.SALPackage#getDeclarations()
 * @model
 * @generated
 */
public interface Declarations extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tesis.sAL.VarDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declarations</em>' containment reference list.
   * @see org.xtext.tesis.sAL.SALPackage#getDeclarations_VariableDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getVariableDeclarations();

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' attribute list.
   * @see org.xtext.tesis.sAL.SALPackage#getDeclarations_Definitions()
   * @model unique="false"
   * @generated
   */
  EList<String> getDefinitions();

  /**
   * Returns the value of the '<em><b>Initialisations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tesis.sAL.Initialisation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialisations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialisations</em>' containment reference list.
   * @see org.xtext.tesis.sAL.SALPackage#getDeclarations_Initialisations()
   * @model containment="true"
   * @generated
   */
  EList<Initialisation> getInitialisations();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tesis.sAL.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.tesis.sAL.SALPackage#getDeclarations_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Declarations
