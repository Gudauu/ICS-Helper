/**
 * generated by Xtext 2.34.0
 */
package ics.helper.helperDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recur Rule</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ics.helper.helperDSL.HelperDSLPackage#getRecurRule()
 * @model
 * @generated
 */
public enum RecurRule implements Enumerator
{
  /**
   * The '<em><b>DAILY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAILY_VALUE
   * @generated
   * @ordered
   */
  DAILY(0, "DAILY", "daily"),

  /**
   * The '<em><b>WEEKLY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEEKLY_VALUE
   * @generated
   * @ordered
   */
  WEEKLY(1, "WEEKLY", "weekly"),

  /**
   * The '<em><b>MONTHLY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTHLY_VALUE
   * @generated
   * @ordered
   */
  MONTHLY(2, "MONTHLY", "monthly"),

  /**
   * The '<em><b>YEARLY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEARLY_VALUE
   * @generated
   * @ordered
   */
  YEARLY(3, "YEARLY", "yearly"),

  /**
   * The '<em><b>BYDAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYDAY_VALUE
   * @generated
   * @ordered
   */
  BYDAY(4, "BYDAY", "weekly on");

  /**
   * The '<em><b>DAILY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAILY
   * @model literal="daily"
   * @generated
   * @ordered
   */
  public static final int DAILY_VALUE = 0;

  /**
   * The '<em><b>WEEKLY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEEKLY
   * @model literal="weekly"
   * @generated
   * @ordered
   */
  public static final int WEEKLY_VALUE = 1;

  /**
   * The '<em><b>MONTHLY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTHLY
   * @model literal="monthly"
   * @generated
   * @ordered
   */
  public static final int MONTHLY_VALUE = 2;

  /**
   * The '<em><b>YEARLY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEARLY
   * @model literal="yearly"
   * @generated
   * @ordered
   */
  public static final int YEARLY_VALUE = 3;

  /**
   * The '<em><b>BYDAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYDAY
   * @model literal="weekly on"
   * @generated
   * @ordered
   */
  public static final int BYDAY_VALUE = 4;

  /**
   * An array of all the '<em><b>Recur Rule</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RecurRule[] VALUES_ARRAY =
    new RecurRule[]
    {
      DAILY,
      WEEKLY,
      MONTHLY,
      YEARLY,
      BYDAY,
    };

  /**
   * A public read-only list of all the '<em><b>Recur Rule</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RecurRule> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Recur Rule</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RecurRule get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RecurRule result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Recur Rule</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RecurRule getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RecurRule result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Recur Rule</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RecurRule get(int value)
  {
    switch (value)
    {
      case DAILY_VALUE: return DAILY;
      case WEEKLY_VALUE: return WEEKLY;
      case MONTHLY_VALUE: return MONTHLY;
      case YEARLY_VALUE: return YEARLY;
      case BYDAY_VALUE: return BYDAY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RecurRule(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RecurRule
