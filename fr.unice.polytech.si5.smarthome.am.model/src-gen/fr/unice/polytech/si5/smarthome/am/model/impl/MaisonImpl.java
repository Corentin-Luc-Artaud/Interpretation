/**
 */
package fr.unice.polytech.si5.smarthome.am.model.impl;

import fr.unice.polytech.si5.smarthome.am.model.Actor;
import fr.unice.polytech.si5.smarthome.am.model.Condition;
import fr.unice.polytech.si5.smarthome.am.model.Maison;
import fr.unice.polytech.si5.smarthome.am.model.ModelPackage;
import fr.unice.polytech.si5.smarthome.am.model.Occurence;
import fr.unice.polytech.si5.smarthome.am.model.Subject;

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
 * An implementation of the model object '<em><b>Maison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.impl.MaisonImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.impl.MaisonImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.impl.MaisonImpl#getOccurence <em>Occurence</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.model.impl.MaisonImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaisonImpl extends MinimalEObjectImpl.Container implements Maison {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Subject> subject;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getOccurence() <em>Occurence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected EList<Occurence> occurence;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MAISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subject> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Subject>(Subject.class, this, ModelPackage.MAISON__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, ModelPackage.MAISON__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Occurence> getOccurence() {
		if (occurence == null) {
			occurence = new EObjectContainmentEList<Occurence>(Occurence.class, this, ModelPackage.MAISON__OCCURENCE);
		}
		return occurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Condition>(Condition.class, this, ModelPackage.MAISON__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.MAISON__SUBJECT:
			return ((InternalEList<?>) getSubject()).basicRemove(otherEnd, msgs);
		case ModelPackage.MAISON__ACTOR:
			return ((InternalEList<?>) getActor()).basicRemove(otherEnd, msgs);
		case ModelPackage.MAISON__OCCURENCE:
			return ((InternalEList<?>) getOccurence()).basicRemove(otherEnd, msgs);
		case ModelPackage.MAISON__CONDITION:
			return ((InternalEList<?>) getCondition()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.MAISON__SUBJECT:
			return getSubject();
		case ModelPackage.MAISON__ACTOR:
			return getActor();
		case ModelPackage.MAISON__OCCURENCE:
			return getOccurence();
		case ModelPackage.MAISON__CONDITION:
			return getCondition();
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
		case ModelPackage.MAISON__SUBJECT:
			getSubject().clear();
			getSubject().addAll((Collection<? extends Subject>) newValue);
			return;
		case ModelPackage.MAISON__ACTOR:
			getActor().clear();
			getActor().addAll((Collection<? extends Actor>) newValue);
			return;
		case ModelPackage.MAISON__OCCURENCE:
			getOccurence().clear();
			getOccurence().addAll((Collection<? extends Occurence>) newValue);
			return;
		case ModelPackage.MAISON__CONDITION:
			getCondition().clear();
			getCondition().addAll((Collection<? extends Condition>) newValue);
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
		case ModelPackage.MAISON__SUBJECT:
			getSubject().clear();
			return;
		case ModelPackage.MAISON__ACTOR:
			getActor().clear();
			return;
		case ModelPackage.MAISON__OCCURENCE:
			getOccurence().clear();
			return;
		case ModelPackage.MAISON__CONDITION:
			getCondition().clear();
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
		case ModelPackage.MAISON__SUBJECT:
			return subject != null && !subject.isEmpty();
		case ModelPackage.MAISON__ACTOR:
			return actor != null && !actor.isEmpty();
		case ModelPackage.MAISON__OCCURENCE:
			return occurence != null && !occurence.isEmpty();
		case ModelPackage.MAISON__CONDITION:
			return condition != null && !condition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaisonImpl
