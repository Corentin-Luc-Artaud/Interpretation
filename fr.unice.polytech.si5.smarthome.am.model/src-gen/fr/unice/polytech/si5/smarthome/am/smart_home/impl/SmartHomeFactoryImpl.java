/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartHomeFactoryImpl extends EFactoryImpl implements SmartHomeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartHomeFactory init() {
		try {
			SmartHomeFactory theSmartHomeFactory = (SmartHomeFactory) EPackage.Registry.INSTANCE
					.getEFactory(SmartHomePackage.eNS_URI);
			if (theSmartHomeFactory != null) {
				return theSmartHomeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartHomeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SmartHomePackage.SUBJECT:
			return createSubject();
		case SmartHomePackage.ACTOR:
			return createActor();
		case SmartHomePackage.HOME:
			return createHome();
		case SmartHomePackage.ACTION:
			return createAction();
		case SmartHomePackage.OCCURENCE:
			return createOccurence();
		case SmartHomePackage.HOME_TIME_STAMP:
			return createHomeTimeStamp();
		case SmartHomePackage.CONDITION:
			return createCondition();
		case SmartHomePackage.TIME_ELEAPSED_CONDITION:
			return createTimeEleapsedCondition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject createSubject() {
		SubjectImpl subject = new SubjectImpl();
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Home createHome() {
		HomeImpl home = new HomeImpl();
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occurence createOccurence() {
		OccurenceImpl occurence = new OccurenceImpl();
		return occurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEleapsedCondition createTimeEleapsedCondition() {
		TimeEleapsedConditionImpl timeEleapsedCondition = new TimeEleapsedConditionImpl();
		return timeEleapsedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeTimeStamp createHomeTimeStamp() {
		HomeTimeStampImpl homeTimeStamp = new HomeTimeStampImpl();
		return homeTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartHomePackage getSmartHomePackage() {
		return (SmartHomePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartHomePackage getPackage() {
		return SmartHomePackage.eINSTANCE;
	}

} //SmartHomeFactoryImpl
