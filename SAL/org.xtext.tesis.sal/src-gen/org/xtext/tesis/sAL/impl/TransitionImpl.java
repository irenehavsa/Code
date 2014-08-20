/**
 */
package org.xtext.tesis.sAL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.tesis.sAL.Assignment;
import org.xtext.tesis.sAL.Guard;
import org.xtext.tesis.sAL.SALPackage;
import org.xtext.tesis.sAL.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.tesis.sAL.impl.TransitionImpl#getTransitionNumer <em>Transition Numer</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.impl.TransitionImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link org.xtext.tesis.sAL.impl.TransitionImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getTransitionNumer() <em>Transition Numer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionNumer()
   * @generated
   * @ordered
   */
  protected static final String TRANSITION_NUMER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransitionNumer() <em>Transition Numer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionNumer()
   * @generated
   * @ordered
   */
  protected String transitionNumer = TRANSITION_NUMER_EDEFAULT;

  /**
   * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuards()
   * @generated
   * @ordered
   */
  protected EList<Guard> guards;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return SALPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransitionNumer()
  {
    return transitionNumer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionNumer(String newTransitionNumer)
  {
    String oldTransitionNumer = transitionNumer;
    transitionNumer = newTransitionNumer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SALPackage.TRANSITION__TRANSITION_NUMER, oldTransitionNumer, transitionNumer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Guard> getGuards()
  {
    if (guards == null)
    {
      guards = new EObjectContainmentEList<Guard>(Guard.class, this, SALPackage.TRANSITION__GUARDS);
    }
    return guards;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, SALPackage.TRANSITION__ASSIGNMENTS);
    }
    return assignments;
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
      case SALPackage.TRANSITION__GUARDS:
        return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
      case SALPackage.TRANSITION__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
      case SALPackage.TRANSITION__TRANSITION_NUMER:
        return getTransitionNumer();
      case SALPackage.TRANSITION__GUARDS:
        return getGuards();
      case SALPackage.TRANSITION__ASSIGNMENTS:
        return getAssignments();
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
      case SALPackage.TRANSITION__TRANSITION_NUMER:
        setTransitionNumer((String)newValue);
        return;
      case SALPackage.TRANSITION__GUARDS:
        getGuards().clear();
        getGuards().addAll((Collection<? extends Guard>)newValue);
        return;
      case SALPackage.TRANSITION__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
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
      case SALPackage.TRANSITION__TRANSITION_NUMER:
        setTransitionNumer(TRANSITION_NUMER_EDEFAULT);
        return;
      case SALPackage.TRANSITION__GUARDS:
        getGuards().clear();
        return;
      case SALPackage.TRANSITION__ASSIGNMENTS:
        getAssignments().clear();
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
      case SALPackage.TRANSITION__TRANSITION_NUMER:
        return TRANSITION_NUMER_EDEFAULT == null ? transitionNumer != null : !TRANSITION_NUMER_EDEFAULT.equals(transitionNumer);
      case SALPackage.TRANSITION__GUARDS:
        return guards != null && !guards.isEmpty();
      case SALPackage.TRANSITION__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
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
    result.append(" (transitionNumer: ");
    result.append(transitionNumer);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
