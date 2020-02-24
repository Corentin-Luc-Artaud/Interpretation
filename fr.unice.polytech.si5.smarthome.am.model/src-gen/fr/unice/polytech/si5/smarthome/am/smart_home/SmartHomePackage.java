/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomeFactory
 * @model kind="package"
 * @generated
 */
public interface SmartHomePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smart_home";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.am.si5.polytech.unice.fr/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartHomePackage eINSTANCE = fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.NamedElementImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SubjectImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__OWNED_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__LAST_ACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActorImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl <em>Home</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getHome()
	 * @generated
	 */
	int HOME = 3;

	/**
	 * The feature id for the '<em><b>Owned Subjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__OWNED_SUBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Owned Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__OWNED_ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Owned Occurences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__OWNED_OCCURENCES = 2;

	/**
	 * The feature id for the '<em><b>Owned Barrier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__OWNED_BARRIER = 3;

	/**
	 * The feature id for the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME__INITIAL_TIME = 4;

	/**
	 * The number of structural features of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Home</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActionImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl <em>Occurence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getOccurence()
	 * @generated
	 */
	int OCCURENCE = 5;

	/**
	 * The feature id for the '<em><b>Owned Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE__OWNED_TIME = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.AConditionImpl <em>ACondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.AConditionImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getACondition()
	 * @generated
	 */
	int ACONDITION = 6;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONDITION__ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONDITION__ACTION = 1;

	/**
	 * The number of structural features of the '<em>ACondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ACondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ConditionImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.TimeEleapsedConditionImpl <em>Time Eleapsed Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.TimeEleapsedConditionImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getTimeEleapsedCondition()
	 * @generated
	 */
	int TIME_ELEAPSED_CONDITION = 9;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl <em>Home Time Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getHomeTimeStamp()
	 * @generated
	 */
	int HOME_TIME_STAMP = 7;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TIME_STAMP__HOUR = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TIME_STAMP__MIN = 1;

	/**
	 * The feature id for the '<em><b>Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TIME_STAMP__SEC = 2;

	/**
	 * The number of structural features of the '<em>Home Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TIME_STAMP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Home Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_TIME_STAMP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ACTOR = ACONDITION__ACTOR;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ACTION = ACONDITION__ACTION;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ACONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = ACONDITION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ELEAPSED_CONDITION__ACTOR = ACONDITION__ACTOR;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ELEAPSED_CONDITION__ACTION = ACONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Owned Timestamp Eleapsed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED = ACONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Eleapsed Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ELEAPSED_CONDITION_FEATURE_COUNT = ACONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Eleapsed Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ELEAPSED_CONDITION_OPERATION_COUNT = ACONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ComposeConditionImpl <em>Compose Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ComposeConditionImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getComposeCondition()
	 * @generated
	 */
	int COMPOSE_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_CONDITION__ACTOR = ACONDITION__ACTOR;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_CONDITION__ACTION = ACONDITION__ACTION;

	/**
	 * The feature id for the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_CONDITION__OWNED_CONDITIONS = ACONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compose Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_CONDITION_FEATURE_COUNT = ACONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compose Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_CONDITION_OPERATION_COUNT = ACONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ABarrierImpl <em>ABarrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ABarrierImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getABarrier()
	 * @generated
	 */
	int ABARRIER = 11;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABARRIER__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABARRIER__OWNED_CONDITION = 1;

	/**
	 * The number of structural features of the '<em>ABarrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABARRIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ABarrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABARRIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.BarrierImpl <em>Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.BarrierImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getBarrier()
	 * @generated
	 */
	int BARRIER = 12;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__ACTIONS = ABARRIER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__OWNED_CONDITION = ABARRIER__OWNED_CONDITION;

	/**
	 * The number of structural features of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_FEATURE_COUNT = ABARRIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_OPERATION_COUNT = ABARRIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.DifferedBarrierImpl <em>Differed Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.DifferedBarrierImpl
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getDifferedBarrier()
	 * @generated
	 */
	int DIFFERED_BARRIER = 13;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERED_BARRIER__ACTIONS = ABARRIER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERED_BARRIER__OWNED_CONDITION = ABARRIER__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Trigger After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERED_BARRIER__TRIGGER_AFTER = ABARRIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Differed Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERED_BARRIER_FEATURE_COUNT = ABARRIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Differed Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERED_BARRIER_OPERATION_COUNT = ABARRIER_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.smarthome.am.smart_home.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getOwnedActions <em>Owned Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actions</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getOwnedActions()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_OwnedActions();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getLastAction <em>Last Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Action</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getLastAction()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_LastAction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Home
	 * @generated
	 */
	EClass getHome();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedSubjects <em>Owned Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Subjects</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedSubjects()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_OwnedSubjects();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedActors <em>Owned Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actors</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedActors()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_OwnedActors();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedOccurences <em>Owned Occurences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Occurences</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedOccurences()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_OwnedOccurences();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedBarrier <em>Owned Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Barrier</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedBarrier()
	 * @see #getHome()
	 * @generated
	 */
	EReference getHome_OwnedBarrier();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getInitialTime <em>Initial Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Time</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Home#getInitialTime()
	 * @see #getHome()
	 * @generated
	 */
	EAttribute getHome_InitialTime();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence <em>Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurence</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Occurence
	 * @generated
	 */
	EClass getOccurence();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getOwnedTime <em>Owned Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Time</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getOwnedTime()
	 * @see #getOccurence()
	 * @generated
	 */
	EReference getOccurence_OwnedTime();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getActor()
	 * @see #getOccurence()
	 * @generated
	 */
	EReference getOccurence_Actor();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getAction()
	 * @see #getOccurence()
	 * @generated
	 */
	EReference getOccurence_Action();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ACondition <em>ACondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACondition</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ACondition
	 * @generated
	 */
	EClass getACondition();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ACondition#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ACondition#getActor()
	 * @see #getACondition()
	 * @generated
	 */
	EReference getACondition_Actor();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ACondition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ACondition#getAction()
	 * @see #getACondition()
	 * @generated
	 */
	EReference getACondition_Action();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition <em>Time Eleapsed Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Eleapsed Condition</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition
	 * @generated
	 */
	EClass getTimeEleapsedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition#getOwnedTimestampEleapsed <em>Owned Timestamp Eleapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Timestamp Eleapsed</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition#getOwnedTimestampEleapsed()
	 * @see #getTimeEleapsedCondition()
	 * @generated
	 */
	EReference getTimeEleapsedCondition_OwnedTimestampEleapsed();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition <em>Compose Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compose Condition</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition
	 * @generated
	 */
	EClass getComposeCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition#getOwnedConditions <em>Owned Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Conditions</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ComposeCondition#getOwnedConditions()
	 * @see #getComposeCondition()
	 * @generated
	 */
	EReference getComposeCondition_OwnedConditions();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier <em>ABarrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABarrier</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier
	 * @generated
	 */
	EClass getABarrier();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier#getActions()
	 * @see #getABarrier()
	 * @generated
	 */
	EReference getABarrier_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier#getOwnedCondition()
	 * @see #getABarrier()
	 * @generated
	 */
	EReference getABarrier_OwnedCondition();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Barrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barrier</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.Barrier
	 * @generated
	 */
	EClass getBarrier();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier <em>Differed Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Differed Barrier</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier
	 * @generated
	 */
	EClass getDifferedBarrier();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier#getTriggerAfter <em>Trigger After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger After</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier#getTriggerAfter()
	 * @see #getDifferedBarrier()
	 * @generated
	 */
	EReference getDifferedBarrier_TriggerAfter();

	/**
	 * Returns the meta object for class '{@link fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp <em>Home Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Time Stamp</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp
	 * @generated
	 */
	EClass getHomeTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp#getHour()
	 * @see #getHomeTimeStamp()
	 * @generated
	 */
	EAttribute getHomeTimeStamp_Hour();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp#getMin()
	 * @see #getHomeTimeStamp()
	 * @generated
	 */
	EAttribute getHomeTimeStamp_Min();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp#getSec <em>Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec</em>'.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp#getSec()
	 * @see #getHomeTimeStamp()
	 * @generated
	 */
	EAttribute getHomeTimeStamp_Sec();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartHomeFactory getSmartHomeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.NamedElementImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SubjectImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Owned Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__OWNED_ACTIONS = eINSTANCE.getSubject_OwnedActions();

		/**
		 * The meta object literal for the '<em><b>Last Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__LAST_ACTION = eINSTANCE.getSubject_LastAction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActorImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl <em>Home</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getHome()
		 * @generated
		 */
		EClass HOME = eINSTANCE.getHome();

		/**
		 * The meta object literal for the '<em><b>Owned Subjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__OWNED_SUBJECTS = eINSTANCE.getHome_OwnedSubjects();

		/**
		 * The meta object literal for the '<em><b>Owned Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__OWNED_ACTORS = eINSTANCE.getHome_OwnedActors();

		/**
		 * The meta object literal for the '<em><b>Owned Occurences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__OWNED_OCCURENCES = eINSTANCE.getHome_OwnedOccurences();

		/**
		 * The meta object literal for the '<em><b>Owned Barrier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOME__OWNED_BARRIER = eINSTANCE.getHome_OwnedBarrier();

		/**
		 * The meta object literal for the '<em><b>Initial Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME__INITIAL_TIME = eINSTANCE.getHome_InitialTime();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ActionImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl <em>Occurence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getOccurence()
		 * @generated
		 */
		EClass OCCURENCE = eINSTANCE.getOccurence();

		/**
		 * The meta object literal for the '<em><b>Owned Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURENCE__OWNED_TIME = eINSTANCE.getOccurence_OwnedTime();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURENCE__ACTOR = eINSTANCE.getOccurence_Actor();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURENCE__ACTION = eINSTANCE.getOccurence_Action();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.AConditionImpl <em>ACondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.AConditionImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getACondition()
		 * @generated
		 */
		EClass ACONDITION = eINSTANCE.getACondition();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONDITION__ACTOR = eINSTANCE.getACondition_Actor();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONDITION__ACTION = eINSTANCE.getACondition_Action();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ConditionImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.TimeEleapsedConditionImpl <em>Time Eleapsed Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.TimeEleapsedConditionImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getTimeEleapsedCondition()
		 * @generated
		 */
		EClass TIME_ELEAPSED_CONDITION = eINSTANCE.getTimeEleapsedCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Timestamp Eleapsed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED = eINSTANCE
				.getTimeEleapsedCondition_OwnedTimestampEleapsed();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ComposeConditionImpl <em>Compose Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ComposeConditionImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getComposeCondition()
		 * @generated
		 */
		EClass COMPOSE_CONDITION = eINSTANCE.getComposeCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSE_CONDITION__OWNED_CONDITIONS = eINSTANCE.getComposeCondition_OwnedConditions();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.ABarrierImpl <em>ABarrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.ABarrierImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getABarrier()
		 * @generated
		 */
		EClass ABARRIER = eINSTANCE.getABarrier();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABARRIER__ACTIONS = eINSTANCE.getABarrier_Actions();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABARRIER__OWNED_CONDITION = eINSTANCE.getABarrier_OwnedCondition();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.BarrierImpl <em>Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.BarrierImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getBarrier()
		 * @generated
		 */
		EClass BARRIER = eINSTANCE.getBarrier();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.DifferedBarrierImpl <em>Differed Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.DifferedBarrierImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getDifferedBarrier()
		 * @generated
		 */
		EClass DIFFERED_BARRIER = eINSTANCE.getDifferedBarrier();

		/**
		 * The meta object literal for the '<em><b>Trigger After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFFERED_BARRIER__TRIGGER_AFTER = eINSTANCE.getDifferedBarrier_TriggerAfter();

		/**
		 * The meta object literal for the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl <em>Home Time Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl
		 * @see fr.unice.polytech.si5.smarthome.am.smart_home.impl.SmartHomePackageImpl#getHomeTimeStamp()
		 * @generated
		 */
		EClass HOME_TIME_STAMP = eINSTANCE.getHomeTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME_TIME_STAMP__HOUR = eINSTANCE.getHomeTimeStamp_Hour();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME_TIME_STAMP__MIN = eINSTANCE.getHomeTimeStamp_Min();

		/**
		 * The meta object literal for the '<em><b>Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOME_TIME_STAMP__SEC = eINSTANCE.getHomeTimeStamp_Sec();

	}

} //SmartHomePackage
