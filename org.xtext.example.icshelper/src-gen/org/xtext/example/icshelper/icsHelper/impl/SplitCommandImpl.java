/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.icshelper.icsHelper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.icshelper.icsHelper.IcsHelperPackage;
import org.xtext.example.icshelper.icsHelper.SplitCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.icshelper.icsHelper.impl.SplitCommandImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.xtext.example.icshelper.icsHelper.impl.SplitCommandImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitCommandImpl extends CommandImpl implements SplitCommand
{
  /**
   * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected static final String SCHEDULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected String schedule = SCHEDULE_EDEFAULT;

  /**
   * The default value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
  protected static final String CRITERIA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriteria()
   * @generated
   * @ordered
   */
  protected String criteria = CRITERIA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SplitCommandImpl()
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
    return IcsHelperPackage.Literals.SPLIT_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSchedule()
  {
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSchedule(String newSchedule)
  {
    String oldSchedule = schedule;
    schedule = newSchedule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IcsHelperPackage.SPLIT_COMMAND__SCHEDULE, oldSchedule, schedule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCriteria()
  {
    return criteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCriteria(String newCriteria)
  {
    String oldCriteria = criteria;
    criteria = newCriteria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IcsHelperPackage.SPLIT_COMMAND__CRITERIA, oldCriteria, criteria));
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
      case IcsHelperPackage.SPLIT_COMMAND__SCHEDULE:
        return getSchedule();
      case IcsHelperPackage.SPLIT_COMMAND__CRITERIA:
        return getCriteria();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IcsHelperPackage.SPLIT_COMMAND__SCHEDULE:
        setSchedule((String)newValue);
        return;
      case IcsHelperPackage.SPLIT_COMMAND__CRITERIA:
        setCriteria((String)newValue);
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
      case IcsHelperPackage.SPLIT_COMMAND__SCHEDULE:
        setSchedule(SCHEDULE_EDEFAULT);
        return;
      case IcsHelperPackage.SPLIT_COMMAND__CRITERIA:
        setCriteria(CRITERIA_EDEFAULT);
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
      case IcsHelperPackage.SPLIT_COMMAND__SCHEDULE:
        return SCHEDULE_EDEFAULT == null ? schedule != null : !SCHEDULE_EDEFAULT.equals(schedule);
      case IcsHelperPackage.SPLIT_COMMAND__CRITERIA:
        return CRITERIA_EDEFAULT == null ? criteria != null : !CRITERIA_EDEFAULT.equals(criteria);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (schedule: ");
    result.append(schedule);
    result.append(", criteria: ");
    result.append(criteria);
    result.append(')');
    return result.toString();
  }

} //SplitCommandImpl