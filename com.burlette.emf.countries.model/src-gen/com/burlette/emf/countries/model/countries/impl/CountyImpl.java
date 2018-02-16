/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.City;
import com.burlette.emf.countries.model.countries.Commissioner;
import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.County;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>County</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CountyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CountyImpl#getCountyNumber <em>County Number</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CountyImpl#getLargestCity <em>Largest City</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CountyImpl#getCity <em>City</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CountyImpl#getCommissioner <em>Commissioner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountyImpl extends MinimalEObjectImpl.Container implements County {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountyNumber() <em>County Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTY_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountyNumber() <em>County Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyNumber()
	 * @generated
	 * @ordered
	 */
	protected int countyNumber = COUNTY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargestCity() <em>Largest City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargestCity()
	 * @generated
	 * @ordered
	 */
	protected static final String LARGEST_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargestCity() <em>Largest City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargestCity()
	 * @generated
	 * @ordered
	 */
	protected String largestCity = LARGEST_CITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected EList<City> city;

	/**
	 * The cached value of the '{@link #getCommissioner() <em>Commissioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommissioner()
	 * @generated
	 * @ordered
	 */
	protected Commissioner commissioner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.COUNTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountyNumber() {
		return countyNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountyNumber(int newCountyNumber) {
		int oldCountyNumber = countyNumber;
		countyNumber = newCountyNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__COUNTY_NUMBER,
					oldCountyNumber, countyNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLargestCity() {
		return largestCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargestCity(String newLargestCity) {
		String oldLargestCity = largestCity;
		largestCity = newLargestCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__LARGEST_CITY, oldLargestCity,
					largestCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCity() {
		if (city == null) {
			city = new EObjectContainmentEList<City>(City.class, this, CountriesPackage.COUNTY__CITY);
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commissioner getCommissioner() {
		if (commissioner != null && commissioner.eIsProxy()) {
			InternalEObject oldCommissioner = (InternalEObject) commissioner;
			commissioner = (Commissioner) eResolveProxy(oldCommissioner);
			if (commissioner != oldCommissioner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CountriesPackage.COUNTY__COMMISSIONER,
							oldCommissioner, commissioner));
			}
		}
		return commissioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commissioner basicGetCommissioner() {
		return commissioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommissioner(Commissioner newCommissioner) {
		Commissioner oldCommissioner = commissioner;
		commissioner = newCommissioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COUNTY__COMMISSIONER,
					oldCommissioner, commissioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CountriesPackage.COUNTY__CITY:
			return ((InternalEList<?>) getCity()).basicRemove(otherEnd, msgs);
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
		case CountriesPackage.COUNTY__NAME:
			return getName();
		case CountriesPackage.COUNTY__COUNTY_NUMBER:
			return getCountyNumber();
		case CountriesPackage.COUNTY__LARGEST_CITY:
			return getLargestCity();
		case CountriesPackage.COUNTY__CITY:
			return getCity();
		case CountriesPackage.COUNTY__COMMISSIONER:
			if (resolve)
				return getCommissioner();
			return basicGetCommissioner();
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
		case CountriesPackage.COUNTY__NAME:
			setName((String) newValue);
			return;
		case CountriesPackage.COUNTY__COUNTY_NUMBER:
			setCountyNumber((Integer) newValue);
			return;
		case CountriesPackage.COUNTY__LARGEST_CITY:
			setLargestCity((String) newValue);
			return;
		case CountriesPackage.COUNTY__CITY:
			getCity().clear();
			getCity().addAll((Collection<? extends City>) newValue);
			return;
		case CountriesPackage.COUNTY__COMMISSIONER:
			setCommissioner((Commissioner) newValue);
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
		case CountriesPackage.COUNTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CountriesPackage.COUNTY__COUNTY_NUMBER:
			setCountyNumber(COUNTY_NUMBER_EDEFAULT);
			return;
		case CountriesPackage.COUNTY__LARGEST_CITY:
			setLargestCity(LARGEST_CITY_EDEFAULT);
			return;
		case CountriesPackage.COUNTY__CITY:
			getCity().clear();
			return;
		case CountriesPackage.COUNTY__COMMISSIONER:
			setCommissioner((Commissioner) null);
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
		case CountriesPackage.COUNTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CountriesPackage.COUNTY__COUNTY_NUMBER:
			return countyNumber != COUNTY_NUMBER_EDEFAULT;
		case CountriesPackage.COUNTY__LARGEST_CITY:
			return LARGEST_CITY_EDEFAULT == null ? largestCity != null : !LARGEST_CITY_EDEFAULT.equals(largestCity);
		case CountriesPackage.COUNTY__CITY:
			return city != null && !city.isEmpty();
		case CountriesPackage.COUNTY__COMMISSIONER:
			return commissioner != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", countyNumber: ");
		result.append(countyNumber);
		result.append(", largestCity: ");
		result.append(largestCity);
		result.append(')');
		return result.toString();
	}

} //CountyImpl
