/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Eleapsed Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition#getOwnedTimestampEleapsed <em>Owned Timestamp Eleapsed</em>}</li>
 * </ul>
 *
 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getTimeEleapsedCondition()
 * @model
 * @generated
 */
public interface TimeEleapsedCondition extends ACondition {
	/**
	 * Returns the value of the '<em><b>Owned Timestamp Eleapsed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Timestamp Eleapsed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Timestamp Eleapsed</em>' containment reference.
	 * @see #setOwnedTimestampEleapsed(HomeTimeStamp)
	 * @see fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage#getTimeEleapsedCondition_OwnedTimestampEleapsed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HomeTimeStamp getOwnedTimestampEleapsed();

	/**
	 * Sets the value of the '{@link fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition#getOwnedTimestampEleapsed <em>Owned Timestamp Eleapsed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Timestamp Eleapsed</em>' containment reference.
	 * @see #getOwnedTimestampEleapsed()
	 * @generated
	 */
	void setOwnedTimestampEleapsed(HomeTimeStamp value);

} // TimeEleapsedCondition
