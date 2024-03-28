/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.icshelper.icsHelper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.icshelper.icsHelper.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IcsHelperFactoryImpl extends EFactoryImpl implements IcsHelperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IcsHelperFactory init()
  {
    try
    {
      IcsHelperFactory theIcsHelperFactory = (IcsHelperFactory)EPackage.Registry.INSTANCE.getEFactory(IcsHelperPackage.eNS_URI);
      if (theIcsHelperFactory != null)
      {
        return theIcsHelperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IcsHelperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IcsHelperFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IcsHelperPackage.MODEL: return createModel();
      case IcsHelperPackage.COMMAND: return createCommand();
      case IcsHelperPackage.CREATE_COMMAND: return createCreateCommand();
      case IcsHelperPackage.EVENT: return createEvent();
      case IcsHelperPackage.SPLIT_COMMAND: return createSplitCommand();
      case IcsHelperPackage.MERGE_COMMAND: return createMergeCommand();
      case IcsHelperPackage.MODIFY_COMMAND: return createModifyCommand();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateCommand createCreateCommand()
  {
    CreateCommandImpl createCommand = new CreateCommandImpl();
    return createCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SplitCommand createSplitCommand()
  {
    SplitCommandImpl splitCommand = new SplitCommandImpl();
    return splitCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MergeCommand createMergeCommand()
  {
    MergeCommandImpl mergeCommand = new MergeCommandImpl();
    return mergeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModifyCommand createModifyCommand()
  {
    ModifyCommandImpl modifyCommand = new ModifyCommandImpl();
    return modifyCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IcsHelperPackage getIcsHelperPackage()
  {
    return (IcsHelperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IcsHelperPackage getPackage()
  {
    return IcsHelperPackage.eINSTANCE;
  }

} //IcsHelperFactoryImpl
