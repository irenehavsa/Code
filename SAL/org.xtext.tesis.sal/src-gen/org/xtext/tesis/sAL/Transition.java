/**
 */
package org.xtext.tesis.sAL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.Transition#getTransitionNumer <em>Transition Numer</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.Transition#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.Transition#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tesis.sAL.SALPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Transition Numer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Numer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Numer</em>' attribute.
   * @see #setTransitionNumer(String)
   * @see org.xtext.tesis.sAL.SALPackage#getTransition_TransitionNumer()
   * @model
   * @generated
   */
  String getTransitionNumer();

  /**
   * Sets the value of the '{@link org.xtext.tesis.sAL.Transition#getTransitionNumer <em>Transition Numer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition Numer</em>' attribute.
   * @see #getTransitionNumer()
   * @generated
   */
  void setTransitionNumer(String value);

  /**
   * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tesis.sAL.Guard}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guards</em>' containment reference list.
   * @see org.xtext.tesis.sAL.SALPackage#getTransition_Guards()
   * @model containment="true"
   * @generated
   */
  EList<Guard> getGuards();

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tesis.sAL.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.xtext.tesis.sAL.SALPackage#getTransition_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getAssignments();

} // Transition
