/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.City;
import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.Mayor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CityImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CityImpl#isIsStateCapital <em>Is State Capital</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CityImpl#getMayor <em>Mayor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
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
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected int population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStateCapital() <em>Is State Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStateCapital()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATE_CAPITAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStateCapital() <em>Is State Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStateCapital()
	 * @generated
	 * @ordered
	 */
	protected boolean isStateCapital = IS_STATE_CAPITAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMayor() <em>Mayor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayor()
	 * @generated
	 * @ordered
	 */
	protected Mayor mayor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.CITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(int newPopulation) {
		int oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__POPULATION, oldPopulation,
					population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStateCapital() {
		return isStateCapital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStateCapital(boolean newIsStateCapital) {
		boolean oldIsStateCapital = isStateCapital;
		isStateCapital = newIsStateCapital;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__IS_STATE_CAPITAL,
					oldIsStateCapital, isStateCapital));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor getMayor() {
		if (mayor != null && mayor.eIsProxy()) {
			InternalEObject oldMayor = (InternalEObject) mayor;
			mayor = (Mayor) eResolveProxy(oldMayor);
			if (mayor != oldMayor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CountriesPackage.CITY__MAYOR, oldMayor,
							mayor));
			}
		}
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor basicGetMayor() {
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayor(Mayor newMayor) {
		Mayor oldMayor = mayor;
		mayor = newMayor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.CITY__MAYOR, oldMayor, mayor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.CITY__NAME:
			return getName();
		case CountriesPackage.CITY__POPULATION:
			return getPopulation();
		case CountriesPackage.CITY__IS_STATE_CAPITAL:
			return isIsStateCapital();
		case CountriesPackage.CITY__MAYOR:
			if (resolve)
				return getMayor();
			return basicGetMayor();
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
		case CountriesPackage.CITY__NAME:
			setName((String) newValue);
			return;
		case CountriesPackage.CITY__POPULATION:
			setPopulation((Integer) newValue);
			return;
		case CountriesPackage.CITY__IS_STATE_CAPITAL:
			setIsStateCapital((Boolean) newValue);
			return;
		case CountriesPackage.CITY__MAYOR:
			setMayor((Mayor) newValue);
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
		case CountriesPackage.CITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CountriesPackage.CITY__POPULATION:
			setPopulation(POPULATION_EDEFAULT);
			return;
		case CountriesPackage.CITY__IS_STATE_CAPITAL:
			setIsStateCapital(IS_STATE_CAPITAL_EDEFAULT);
			return;
		case CountriesPackage.CITY__MAYOR:
			setMayor((Mayor) null);
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
		case CountriesPackage.CITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CountriesPackage.CITY__POPULATION:
			return population != POPULATION_EDEFAULT;
		case CountriesPackage.CITY__IS_STATE_CAPITAL:
			return isStateCapital != IS_STATE_CAPITAL_EDEFAULT;
		case CountriesPackage.CITY__MAYOR:
			return mayor != null;
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
		result.append(", population: ");
		result.append(population);
		result.append(", isStateCapital: ");
		result.append(isStateCapital);
		result.append(')');
		return result.toString();
	}

} //CityImpl
