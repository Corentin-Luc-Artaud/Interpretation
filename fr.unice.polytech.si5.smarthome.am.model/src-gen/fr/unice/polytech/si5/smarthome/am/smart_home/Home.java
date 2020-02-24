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
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getOwnedBarrier <em>Owned Barrier</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getInitialTime <em>Initial Time</em>}</li>
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
	 * Returns the value of the '<em><b>Owned Barrier</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.ABarrier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Barrier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Barrier</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_OwnedBarrier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ABarrier> getOwnedBarrier();

	/**
	 * Returns the value of the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Time</em>' attribute.
	 * @see #setInitialTime(String)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getHome_InitialTime()
	 * @model
	 * @generated
	 */
	String getInitialTime();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Home#getInitialTime <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Time</em>' attribute.
	 * @see #getInitialTime()
	 * @generated
	 */
	void setInitialTime(String value);

} // Home
