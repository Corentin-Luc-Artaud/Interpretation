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
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getOwnedTime <em>Owned Time</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getActor <em>Actor</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getOccurence()
 * @model
 * @generated
 */
public interface Occurence extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getOccurence_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getOccurence_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Occurence#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Occurence
