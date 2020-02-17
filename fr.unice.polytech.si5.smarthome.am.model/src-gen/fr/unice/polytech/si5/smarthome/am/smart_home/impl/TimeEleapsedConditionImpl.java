/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;
import fr.unice.polytech.si5.smarthome.am.smart_home.TimeEleapsedCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Eleapsed Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.TimeEleapsedConditionImpl#getOwnedTimestampEleapsed <em>Owned Timestamp Eleapsed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeEleapsedConditionImpl extends AConditionImpl implements TimeEleapsedCondition {
	/**
	 * The cached value of the '{@link #getOwnedTimestampEleapsed() <em>Owned Timestamp Eleapsed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTimestampEleapsed()
	 * @generated
	 * @ordered
	 */
	protected HomeTimeStamp ownedTimestampEleapsed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEleapsedConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.TIME_ELEAPSED_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeTimeStamp getOwnedTimestampEleapsed() {
		return ownedTimestampEleapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTimestampEleapsed(HomeTimeStamp newOwnedTimestampEleapsed,
			NotificationChain msgs) {
		HomeTimeStamp oldOwnedTimestampEleapsed = ownedTimestampEleapsed;
		ownedTimestampEleapsed = newOwnedTimestampEleapsed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED, oldOwnedTimestampEleapsed,
					newOwnedTimestampEleapsed);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTimestampEleapsed(HomeTimeStamp newOwnedTimestampEleapsed) {
		if (newOwnedTimestampEleapsed != ownedTimestampEleapsed) {
			NotificationChain msgs = null;
			if (ownedTimestampEleapsed != null)
				msgs = ((InternalEObject) ownedTimestampEleapsed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED,
						null, msgs);
			if (newOwnedTimestampEleapsed != null)
				msgs = ((InternalEObject) newOwnedTimestampEleapsed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED,
						null, msgs);
			msgs = basicSetOwnedTimestampEleapsed(newOwnedTimestampEleapsed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED, newOwnedTimestampEleapsed,
					newOwnedTimestampEleapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED:
			return basicSetOwnedTimestampEleapsed(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED:
			return getOwnedTimestampEleapsed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED:
			setOwnedTimestampEleapsed((HomeTimeStamp) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED:
			setOwnedTimestampEleapsed((HomeTimeStamp) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SmartHomePackage.TIME_ELEAPSED_CONDITION__OWNED_TIMESTAMP_ELEAPSED:
			return ownedTimestampEleapsed != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeEleapsedConditionImpl
