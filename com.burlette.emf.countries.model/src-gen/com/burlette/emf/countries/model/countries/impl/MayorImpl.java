/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.Mayor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mayor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.MayorImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.MayorImpl#getTimesElected <em>Times Elected</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.MayorImpl#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MayorImpl extends PoliticianImpl implements Mayor {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimesElected() <em>Times Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesElected()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_ELECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimesElected() <em>Times Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesElected()
	 * @generated
	 * @ordered
	 */
	protected int timesElected = TIMES_ELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgeElectedAsMayor() <em>Age Elected As Mayor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeElectedAsMayor()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_ELECTED_AS_MAYOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAgeElectedAsMayor() <em>Age Elected As Mayor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeElectedAsMayor()
	 * @generated
	 * @ordered
	 */
	protected int ageElectedAsMayor = AGE_ELECTED_AS_MAYOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MayorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.MAYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.MAYOR__ADDRESS, oldAddress,
					address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimesElected() {
		return timesElected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimesElected(int newTimesElected) {
		int oldTimesElected = timesElected;
		timesElected = newTimesElected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.MAYOR__TIMES_ELECTED,
					oldTimesElected, timesElected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAgeElectedAsMayor() {
		return ageElectedAsMayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeElectedAsMayor(int newAgeElectedAsMayor) {
		int oldAgeElectedAsMayor = ageElectedAsMayor;
		ageElectedAsMayor = newAgeElectedAsMayor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR,
					oldAgeElectedAsMayor, ageElectedAsMayor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.MAYOR__ADDRESS:
			return getAddress();
		case CountriesPackage.MAYOR__TIMES_ELECTED:
			return getTimesElected();
		case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
			return getAgeElectedAsMayor();
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
		case CountriesPackage.MAYOR__ADDRESS:
			setAddress((String) newValue);
			return;
		case CountriesPackage.MAYOR__TIMES_ELECTED:
			setTimesElected((Integer) newValue);
			return;
		case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
			setAgeElectedAsMayor((Integer) newValue);
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
		case CountriesPackage.MAYOR__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case CountriesPackage.MAYOR__TIMES_ELECTED:
			setTimesElected(TIMES_ELECTED_EDEFAULT);
			return;
		case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
			setAgeElectedAsMayor(AGE_ELECTED_AS_MAYOR_EDEFAULT);
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
		case CountriesPackage.MAYOR__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case CountriesPackage.MAYOR__TIMES_ELECTED:
			return timesElected != TIMES_ELECTED_EDEFAULT;
		case CountriesPackage.MAYOR__AGE_ELECTED_AS_MAYOR:
			return ageElectedAsMayor != AGE_ELECTED_AS_MAYOR_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(", timesElected: ");
		result.append(timesElected);
		result.append(", ageElectedAsMayor: ");
		result.append(ageElectedAsMayor);
		result.append(')');
		return result.toString();
	}

} //MayorImpl
