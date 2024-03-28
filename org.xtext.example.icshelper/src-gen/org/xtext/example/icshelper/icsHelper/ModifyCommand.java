/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.icshelper.icsHelper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.icshelper.icsHelper.IcsHelperPackage#getModifyCommand()
 * @model
 * @generated
 */
public interface ModifyCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Schedule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schedule</em>' attribute.
   * @see #setSchedule(String)
   * @see org.xtext.example.icshelper.icsHelper.IcsHelperPackage#getModifyCommand_Schedule()
   * @model
   * @generated
   */
  String getSchedule();

  /**
   * Sets the value of the '{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getSchedule <em>Schedule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schedule</em>' attribute.
   * @see #getSchedule()
   * @generated
   */
  void setSchedule(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see org.xtext.example.icshelper.icsHelper.IcsHelperPackage#getModifyCommand_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see org.xtext.example.icshelper.icsHelper.IcsHelperPackage#getModifyCommand_Time()
   * @model
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.icshelper.icsHelper.IcsHelperPackage#getModifyCommand_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.icshelper.icsHelper.ModifyCommand#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ModifyCommand