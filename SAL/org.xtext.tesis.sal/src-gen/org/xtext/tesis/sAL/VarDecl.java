/**
 */
package org.xtext.tesis.sAL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.VarDecl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.VarDecl#getValueSet <em>Value Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tesis.sAL.SALPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Name</em>' attribute.
   * @see #setVariableName(String)
   * @see org.xtext.tesis.sAL.SALPackage#getVarDecl_VariableName()
   * @model
   * @generated
   */
  String getVariableName();

  /**
   * Sets the value of the '{@link org.xtext.tesis.sAL.VarDecl#getVariableName <em>Variable Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Name</em>' attribute.
   * @see #getVariableName()
   * @generated
   */
  void setVariableName(String value);

  /**
   * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Set</em>' containment reference.
   * @see #setValueSet(ValueSet)
   * @see org.xtext.tesis.sAL.SALPackage#getVarDecl_ValueSet()
   * @model containment="true"
   * @generated
   */
  ValueSet getValueSet();

  /**
   * Sets the value of the '{@link org.xtext.tesis.sAL.VarDecl#getValueSet <em>Value Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Set</em>' containment reference.
   * @see #getValueSet()
   * @generated
   */
  void setValueSet(ValueSet value);

} // VarDecl
