/**
 */
package fr.unice.polytech.si5.smarthome.am.model;

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
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.Subject#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.model.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getSubject_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Subject
