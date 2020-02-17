/**
 */
package fr.unice.polytech.si5.smarthome.am.smart_home.impl;

import fr.unice.polytech.si5.smarthome.am.smart_home.HomeTimeStamp;
import fr.unice.polytech.si5.smarthome.am.smart_home.SmartHomePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home Time Stamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl#getMin <em>Min</em>}</li>
 *   <li>{@link fr.unice.polytech.si5.smarthome.am.smart_home.impl.HomeTimeStampImpl#getSec <em>Sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeTimeStampImpl extends MinimalEObjectImpl.Container implements HomeTimeStamp {
	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected int hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSec() <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected static final int SEC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSec() <em>Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSec()
	 * @generated
	 * @ordered
	 */
	protected int sec = SEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeTimeStampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartHomePackage.Literals.HOME_TIME_STAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(int newHour) {
		int oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HOME_TIME_STAMP__HOUR, oldHour,
					hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HOME_TIME_STAMP__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSec() {
		return sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSec(int newSec) {
		int oldSec = sec;
		sec = newSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartHomePackage.HOME_TIME_STAMP__SEC, oldSec, sec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartHomePackage.HOME_TIME_STAMP__HOUR:
			return getHour();
		case SmartHomePackage.HOME_TIME_STAMP__MIN:
			return getMin();
		case SmartHomePackage.HOME_TIME_STAMP__SEC:
			return getSec();
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
		case SmartHomePackage.HOME_TIME_STAMP__HOUR:
			setHour((Integer) newValue);
			return;
		case SmartHomePackage.HOME_TIME_STAMP__MIN:
			setMin((Integer) newValue);
			return;
		case SmartHomePackage.HOME_TIME_STAMP__SEC:
			setSec((Integer) newValue);
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
		case SmartHomePackage.HOME_TIME_STAMP__HOUR:
			setHour(HOUR_EDEFAULT);
			return;
		case SmartHomePackage.HOME_TIME_STAMP__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case SmartHomePackage.HOME_TIME_STAMP__SEC:
			setSec(SEC_EDEFAULT);
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
		case SmartHomePackage.HOME_TIME_STAMP__HOUR:
			return hour != HOUR_EDEFAULT;
		case SmartHomePackage.HOME_TIME_STAMP__MIN:
			return min != MIN_EDEFAULT;
		case SmartHomePackage.HOME_TIME_STAMP__SEC:
			return sec != SEC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hour: ");
		result.append(hour);
		result.append(", min: ");
		result.append(min);
		result.append(", sec: ");
		result.append(sec);
		result.append(')');
		return result.toString();
	}

} //HomeTimeStampImpl
