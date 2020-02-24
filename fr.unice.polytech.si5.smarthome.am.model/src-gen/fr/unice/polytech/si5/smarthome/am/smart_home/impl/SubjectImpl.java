/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.Action;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.SubjectImpl#getOwnedActions <em>Owned Actions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.SubjectImpl#getLastAction <em>Last Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectImpl extends NamedElementImpl implements Subject {
	/**
	 * The cached value of the '{@link #getOwnedActions() <em>Owned Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> ownedActions;

	/**
	 * The cached value of the '{@link #getLastAction() <em>Last Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAction()
	 * @generated
	 * @ordered
	 */
	protected Action lastAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOwnedActions() {
		if (ownedActions == null) {
			ownedActions = new EObjectContainmentEList<Action>(Action.class, this,
					SmartHomePackage.SUBJECT__OWNED_ACTIONS);
		}
		return ownedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getLastAction() {
		if (lastAction != null && lastAction.eIsProxy()) {
			InternalEObject oldLastAction = (InternalEObject) lastAction;
			lastAction = (Action) eResolveProxy(oldLastAction);
			if (lastAction != oldLastAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartHomePackage.SUBJECT__LAST_ACTION,
							oldLastAction, lastAction));
			}
		}
		return lastAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetLastAction() {
		return lastAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAction(Action newLastAction) {
		Action oldLastAction = lastAction;
		lastAction = newLastAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.SUBJECT__LAST_ACTION, oldLastAction,
					lastAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartHomePackage.SUBJECT__OWNED_ACTIONS:
			return ((InternalEList<?>) getOwnedActions()).basicRemove(otherEnd, msgs);
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
		case SmartHomePackage.SUBJECT__OWNED_ACTIONS:
			return getOwnedActions();
		case SmartHomePackage.SUBJECT__LAST_ACTION:
			if (resolve)
				return getLastAction();
			return basicGetLastAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmartHomePackage.SUBJECT__OWNED_ACTIONS:
			getOwnedActions().clear();
			getOwnedActions().addAll((Collection<? extends Action>) newValue);
			return;
		case SmartHomePackage.SUBJECT__LAST_ACTION:
			setLastAction((Action) newValue);
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
		case SmartHomePackage.SUBJECT__OWNED_ACTIONS:
			getOwnedActions().clear();
			return;
		case SmartHomePackage.SUBJECT__LAST_ACTION:
			setLastAction((Action) null);
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
		case SmartHomePackage.SUBJECT__OWNED_ACTIONS:
			return ownedActions != null && !ownedActions.isEmpty();
		case SmartHomePackage.SUBJECT__LAST_ACTION:
			return lastAction != null;
		}
		return super.eIsSet(featureID);
	}

} //SubjectImpl
