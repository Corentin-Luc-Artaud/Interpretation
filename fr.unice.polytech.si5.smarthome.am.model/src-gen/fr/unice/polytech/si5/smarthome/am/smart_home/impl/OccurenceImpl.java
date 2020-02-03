/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.Event;
import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;

import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl#getOwnedTime <em>Owned Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurenceImpl extends MinimalEObjectImpl.Container implements Occurence {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getOwnedTime() <em>Owned Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTime()
	 * @generated
	 * @ordered
	 */
	protected HomeTimeStamp ownedTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.OCCURENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartHomePackage.OCCURENCE__EVENT,
							oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.OCCURENCE__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeTimeStamp getOwnedTime() {
		return ownedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTime(HomeTimeStamp newOwnedTime, NotificationChain msgs) {
		HomeTimeStamp oldOwnedTime = ownedTime;
		ownedTime = newOwnedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SmartHomePackage.OCCURENCE__OWNED_TIME, oldOwnedTime, newOwnedTime);
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
	public void setOwnedTime(HomeTimeStamp newOwnedTime) {
		if (newOwnedTime != ownedTime) {
			NotificationChain msgs = null;
			if (ownedTime != null)
				msgs = ((InternalEObject) ownedTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SmartHomePackage.OCCURENCE__OWNED_TIME, null, msgs);
			if (newOwnedTime != null)
				msgs = ((InternalEObject) newOwnedTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SmartHomePackage.OCCURENCE__OWNED_TIME, null, msgs);
			msgs = basicSetOwnedTime(newOwnedTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.OCCURENCE__OWNED_TIME, newOwnedTime,
					newOwnedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			return basicSetOwnedTime(null, msgs);
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
		case SmartHomePackage.OCCURENCE__EVENT:
			if (resolve)
				return getEvent();
			return basicGetEvent();
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			return getOwnedTime();
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
		case SmartHomePackage.OCCURENCE__EVENT:
			setEvent((Event) newValue);
			return;
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			setOwnedTime((HomeTimeStamp) newValue);
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
		case SmartHomePackage.OCCURENCE__EVENT:
			setEvent((Event) null);
			return;
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			setOwnedTime((HomeTimeStamp) null);
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
		case SmartHomePackage.OCCURENCE__EVENT:
			return event != null;
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			return ownedTime != null;
		}
		return super.eIsSet(featureID);
	}

} //OccurenceImpl
