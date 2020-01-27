/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedSubjects <em>Owned Subjects</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedActors <em>Owned Actors</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedOccurences <em>Owned Occurences</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedConditions <em>Owned Conditions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedEvents <em>Owned Events</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome()
 * @model
 * @generated
 */
public interface Home extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Subjects</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subjects</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_OwnedSubjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getOwnedSubjects();

	/**
	 * Returns the value of the '<em><b>Owned Actors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actors</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_OwnedActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getOwnedActors();

	/**
	 * Returns the value of the '<em><b>Owned Occurences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Occurences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Occurences</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_OwnedOccurences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Occurence> getOwnedOccurences();

	/**
	 * Returns the value of the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Conditions</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_OwnedConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getOwnedConditions();

	/**
	 * Returns the value of the '<em><b>Owned Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Events</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_OwnedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getOwnedEvents();

} // Home
