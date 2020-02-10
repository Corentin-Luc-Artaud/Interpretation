/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.Actor;
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
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl#getOwnedTime <em>Owned Time</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.OccurenceImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurenceImpl extends MinimalEObjectImpl.Container implements Occurence {
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
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Actor actor;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurenceImpl() {
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
	public Actor getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject) actor;
			actor = (Actor) eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartHomePackage.OCCURENCE__ACTOR,
							oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Actor newActor) {
		Actor oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.OCCURENCE__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Action) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartHomePackage.OCCURENCE__ACTION,
							oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.OCCURENCE__ACTION, oldAction,
					action));
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
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			return getOwnedTime();
		case SmartHomePackage.OCCURENCE__ACTOR:
			if (resolve)
				return getActor();
			return basicGetActor();
		case SmartHomePackage.OCCURENCE__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
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
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			setOwnedTime((HomeTimeStamp) newValue);
			return;
		case SmartHomePackage.OCCURENCE__ACTOR:
			setActor((Actor) newValue);
			return;
		case SmartHomePackage.OCCURENCE__ACTION:
			setAction((Action) newValue);
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
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			setOwnedTime((HomeTimeStamp) null);
			return;
		case SmartHomePackage.OCCURENCE__ACTOR:
			setActor((Actor) null);
			return;
		case SmartHomePackage.OCCURENCE__ACTION:
			setAction((Action) null);
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
		case SmartHomePackage.OCCURENCE__OWNED_TIME:
			return ownedTime != null;
		case SmartHomePackage.OCCURENCE__ACTOR:
			return actor != null;
		case SmartHomePackage.OCCURENCE__ACTION:
			return action != null;
		}
		return super.eIsSet(featureID);
	}

} //OccurenceImpl
