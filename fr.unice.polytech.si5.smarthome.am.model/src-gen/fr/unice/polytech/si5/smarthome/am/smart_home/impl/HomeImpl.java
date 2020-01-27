/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.Actor;
import fr.unice.polytech.si5.smarthome.am.smart_home.Condition;
import fr.unice.polytech.si5.smarthome.am.smart_home.Event;
import fr.unice.polytech.si5.smarthome.am.smart_home.Home;
import fr.unice.polytech.si5.smarthome.am.smart_home.Occurence;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;
import fr.unice.polytech.si5.smarthome.am.smart_home.Subject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl#getOwnedSubjects <em>Owned Subjects</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl#getOwnedActors <em>Owned Actors</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl#getOwnedOccurences <em>Owned Occurences</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl#getOwnedConditions <em>Owned Conditions</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeImpl#getOwnedEvents <em>Owned Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeImpl extends MinimalEObjectImpl.Container implements Home {
	/**
	 * The cached value of the '{@link #getOwnedSubjects() <em>Owned Subjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Subject> ownedSubjects;

	/**
	 * The cached value of the '{@link #getOwnedActors() <em>Owned Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> ownedActors;

	/**
	 * The cached value of the '{@link #getOwnedOccurences() <em>Owned Occurences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOccurences()
	 * @generated
	 * @ordered
	 */
	protected EList<Occurence> ownedOccurences;

	/**
	 * The cached value of the '{@link #getOwnedConditions() <em>Owned Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> ownedConditions;

	/**
	 * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> ownedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.HOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subject> getOwnedSubjects() {
		if (ownedSubjects == null) {
			ownedSubjects = new EObjectContainmentEList<Subject>(Subject.class, this,
					SmartHomePackage.HOME__OWNED_SUBJECTS);
		}
		return ownedSubjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getOwnedActors() {
		if (ownedActors == null) {
			ownedActors = new EObjectContainmentEList<Actor>(Actor.class, this, SmartHomePackage.HOME__OWNED_ACTORS);
		}
		return ownedActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Occurence> getOwnedOccurences() {
		if (ownedOccurences == null) {
			ownedOccurences = new EObjectContainmentEList<Occurence>(Occurence.class, this,
					SmartHomePackage.HOME__OWNED_OCCURENCES);
		}
		return ownedOccurences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getOwnedConditions() {
		if (ownedConditions == null) {
			ownedConditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					SmartHomePackage.HOME__OWNED_CONDITIONS);
		}
		return ownedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getOwnedEvents() {
		if (ownedEvents == null) {
			ownedEvents = new EObjectContainmentEList<Event>(Event.class, this, SmartHomePackage.HOME__OWNED_EVENTS);
		}
		return ownedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartHomePackage.HOME__OWNED_SUBJECTS:
			return ((InternalEList<?>) getOwnedSubjects()).basicRemove(otherEnd, msgs);
		case SmartHomePackage.HOME__OWNED_ACTORS:
			return ((InternalEList<?>) getOwnedActors()).basicRemove(otherEnd, msgs);
		case SmartHomePackage.HOME__OWNED_OCCURENCES:
			return ((InternalEList<?>) getOwnedOccurences()).basicRemove(otherEnd, msgs);
		case SmartHomePackage.HOME__OWNED_CONDITIONS:
			return ((InternalEList<?>) getOwnedConditions()).basicRemove(otherEnd, msgs);
		case SmartHomePackage.HOME__OWNED_EVENTS:
			return ((InternalEList<?>) getOwnedEvents()).basicRemove(otherEnd, msgs);
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
		case SmartHomePackage.HOME__OWNED_SUBJECTS:
			return getOwnedSubjects();
		case SmartHomePackage.HOME__OWNED_ACTORS:
			return getOwnedActors();
		case SmartHomePackage.HOME__OWNED_OCCURENCES:
			return getOwnedOccurences();
		case SmartHomePackage.HOME__OWNED_CONDITIONS:
			return getOwnedConditions();
		case SmartHomePackage.HOME__OWNED_EVENTS:
			return getOwnedEvents();
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
		case SmartHomePackage.HOME__OWNED_SUBJECTS:
			getOwnedSubjects().clear();
			getOwnedSubjects().addAll((Collection<? extends Subject>) newValue);
			return;
		case SmartHomePackage.HOME__OWNED_ACTORS:
			getOwnedActors().clear();
			getOwnedActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case SmartHomePackage.HOME__OWNED_OCCURENCES:
			getOwnedOccurences().clear();
			getOwnedOccurences().addAll((Collection<? extends Occurence>) newValue);
			return;
		case SmartHomePackage.HOME__OWNED_CONDITIONS:
			getOwnedConditions().clear();
			getOwnedConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case SmartHomePackage.HOME__OWNED_EVENTS:
			getOwnedEvents().clear();
			getOwnedEvents().addAll((Collection<? extends Event>) newValue);
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
		case SmartHomePackage.HOME__OWNED_SUBJECTS:
			getOwnedSubjects().clear();
			return;
		case SmartHomePackage.HOME__OWNED_ACTORS:
			getOwnedActors().clear();
			return;
		case SmartHomePackage.HOME__OWNED_OCCURENCES:
			getOwnedOccurences().clear();
			return;
		case SmartHomePackage.HOME__OWNED_CONDITIONS:
			getOwnedConditions().clear();
			return;
		case SmartHomePackage.HOME__OWNED_EVENTS:
			getOwnedEvents().clear();
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
		case SmartHomePackage.HOME__OWNED_SUBJECTS:
			return ownedSubjects != null && !ownedSubjects.isEmpty();
		case SmartHomePackage.HOME__OWNED_ACTORS:
			return ownedActors != null && !ownedActors.isEmpty();
		case SmartHomePackage.HOME__OWNED_OCCURENCES:
			return ownedOccurences != null && !ownedOccurences.isEmpty();
		case SmartHomePackage.HOME__OWNED_CONDITIONS:
			return ownedConditions != null && !ownedConditions.isEmpty();
		case SmartHomePackage.HOME__OWNED_EVENTS:
			return ownedEvents != null && !ownedEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HomeImpl
