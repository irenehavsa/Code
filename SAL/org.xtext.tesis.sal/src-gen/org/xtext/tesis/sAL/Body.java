/**
 */
package org.xtext.tesis.sAL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.Body#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.Body#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tesis.sAL.SALPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tesis.sAL.TypeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xtext.tesis.sAL.SALPackage#getBody_Types()
   * @model containment="true"
   * @generated
   */
  EList<TypeDeclaration> getTypes();

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(ModuleDeclaration)
   * @see org.xtext.tesis.sAL.SALPackage#getBody_Module()
   * @model containment="true"
   * @generated
   */
  ModuleDeclaration getModule();

  /**
   * Sets the value of the '{@link org.xtext.tesis.sAL.Body#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(ModuleDeclaration value);

} // Body
