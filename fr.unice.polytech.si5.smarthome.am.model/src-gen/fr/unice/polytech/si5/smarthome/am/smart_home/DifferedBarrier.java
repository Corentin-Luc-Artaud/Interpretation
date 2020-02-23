/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Differed Barrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier#getTriggerAfter <em>Trigger After</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getDifferedBarrier()
 * @model
 * @generated
 */
public interface DifferedBarrier extends ABarrier {
	/**
	 * Returns the value of the '<em><b>Trigger After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger After</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger After</em>' containment reference.
	 * @see #setTriggerAfter(HomeTimeStamp)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getDifferedBarrier_TriggerAfter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HomeTimeStamp getTriggerAfter();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier#getTriggerAfter <em>Trigger After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger After</em>' containment reference.
	 * @see #getTriggerAfter()
	 * @generated
	 */
	void setTriggerAfter(HomeTimeStamp value);

} // DifferedBarrier
