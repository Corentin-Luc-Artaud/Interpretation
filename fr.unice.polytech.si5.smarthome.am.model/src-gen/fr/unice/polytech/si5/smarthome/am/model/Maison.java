/**
 */
package fr.unice.polytech.si5.smarthome.am.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.Maison#getSubject <em>Subject</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.Maison#getActor <em>Actor</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.Maison#getOccurence <em>Occurence</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.Maison#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getMaison()
 * @model
 * @generated
 */
public interface Maison extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.model.Subject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getMaison_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getSubject();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.model.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getMaison_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Occurence</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.model.Occurence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getMaison_Occurence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Occurence> getOccurence();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.polytech.si5.smarthome.am.model.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fr.unice.polytech.si5.smarthome.am.model.ModelPackage#getMaison_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Maison
