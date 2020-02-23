/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.DifferedBarrier;
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Differed Barrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.DifferedBarrierImpl#getTriggerAfter <em>Trigger After</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifferedBarrierImpl extends ABarrierImpl implements DifferedBarrier {
	/**
	 * The cached value of the '{@link #getTriggerAfter() <em>Trigger After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerAfter()
	 * @generated
	 * @ordered
	 */
	protected HomeTimeStamp triggerAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DifferedBarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.DIFFERED_BARRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeTimeStamp getTriggerAfter() {
		return triggerAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerAfter(HomeTimeStamp newTriggerAfter, NotificationChain msgs) {
		HomeTimeStamp oldTriggerAfter = triggerAfter;
		triggerAfter = newTriggerAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER, oldTriggerAfter, newTriggerAfter);
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
	public void setTriggerAfter(HomeTimeStamp newTriggerAfter) {
		if (newTriggerAfter != triggerAfter) {
			NotificationChain msgs = null;
			if (triggerAfter != null)
				msgs = ((InternalEObject) triggerAfter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER, null, msgs);
			if (newTriggerAfter != null)
				msgs = ((InternalEObject) newTriggerAfter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER, null, msgs);
			msgs = basicSetTriggerAfter(newTriggerAfter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER,
					newTriggerAfter, newTriggerAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER:
			return basicSetTriggerAfter(null, msgs);
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
		case SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER:
			return getTriggerAfter();
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
		case SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER:
			setTriggerAfter((HomeTimeStamp) newValue);
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
		case SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER:
			setTriggerAfter((HomeTimeStamp) null);
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
		case SmartHomePackage.DIFFERED_BARRIER__TRIGGER_AFTER:
			return triggerAfter != null;
		}
		return super.eIsSet(featureID);
	}

} //DifferedBarrierImpl
