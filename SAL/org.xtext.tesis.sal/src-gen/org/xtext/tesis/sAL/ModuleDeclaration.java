/**
 */
package org.xtext.tesis.sAL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.ModuleDeclaration#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.ModuleDeclaration#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tesis.sAL.SALPackage#getModuleDeclaration()
 * @model
 * @generated
 */
public interface ModuleDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Module Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Name</em>' attribute.
   * @see #setModuleName(String)
   * @see org.xtext.tesis.sAL.SALPackage#getModuleDeclaration_ModuleName()
   * @model
   * @generated
   */
  String getModuleName();

  /**
   * Sets the value of the '{@link org.xtext.tesis.sAL.ModuleDeclaration#getModuleName <em>Module Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Name</em>' attribute.
   * @see #getModuleName()
   * @generated
   */
  void setModuleName(String value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(Module)
   * @see org.xtext.tesis.sAL.SALPackage#getModuleDeclaration_Module()
   * @model containment="true"
   * @generated
   */
  Module getModule();

  /**
   * Sets the value of the '{@link org.xtext.tesis.sAL.ModuleDeclaration#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Module value);

} // ModuleDeclaration
