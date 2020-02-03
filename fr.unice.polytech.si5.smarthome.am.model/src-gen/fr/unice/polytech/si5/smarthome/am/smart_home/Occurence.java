/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getOwnedTime <em>Owned Time</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getOccurence()
 * @model
 * @generated
 */
public interface Occurence extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getOccurence_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Owned Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Time</em>' containment reference.
	 * @see #setOwnedTime(HomeTimeStamp)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getOccurence_OwnedTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HomeTimeStamp getOwnedTime();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getOwnedTime <em>Owned Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Time</em>' containment reference.
	 * @see #getOwnedTime()
	 * @generated
	 */
	void setOwnedTime(HomeTimeStamp value);

} // Occurence
