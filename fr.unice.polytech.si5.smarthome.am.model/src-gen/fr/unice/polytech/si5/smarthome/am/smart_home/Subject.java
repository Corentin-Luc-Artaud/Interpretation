/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getOwnedActions <em>Owned Actions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getLastAction <em>Last Action</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.smart_home.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actions</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getSubject_OwnedActions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getOwnedActions();

	/**
	 * Returns the value of the '<em><b>Last Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Action</em>' reference.
	 * @see #setLastAction(Action)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getSubject_LastAction()
	 * @model
	 * @generated
	 */
	Action getLastAction();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.Subject#getLastAction <em>Last Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Action</em>' reference.
	 * @see #getLastAction()
	 * @generated
	 */
	void setLastAction(Action value);

} // Subject
