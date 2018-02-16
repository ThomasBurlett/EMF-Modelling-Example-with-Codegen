/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.Politician;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Politician</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.PoliticianImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.PoliticianImpl#getPoliticalParty <em>Political Party</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.PoliticianImpl#getTotalYearsInService <em>Total Years In Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoliticianImpl extends MinimalEObjectImpl.Container implements Politician {
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
	 * The default value of the '{@link #getPoliticalParty() <em>Political Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoliticalParty()
	 * @generated
	 * @ordered
	 */
	protected static final String POLITICAL_PARTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoliticalParty() <em>Political Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoliticalParty()
	 * @generated
	 * @ordered
	 */
	protected String politicalParty = POLITICAL_PARTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalYearsInService() <em>Total Years In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalYearsInService()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_YEARS_IN_SERVICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalYearsInService() <em>Total Years In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalYearsInService()
	 * @generated
	 * @ordered
	 */
	protected double totalYearsInService = TOTAL_YEARS_IN_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoliticianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.POLITICIAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.POLITICIAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoliticalParty() {
		return politicalParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoliticalParty(String newPoliticalParty) {
		String oldPoliticalParty = politicalParty;
		politicalParty = newPoliticalParty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.POLITICIAN__POLITICAL_PARTY,
					oldPoliticalParty, politicalParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalYearsInService() {
		return totalYearsInService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalYearsInService(double newTotalYearsInService) {
		double oldTotalYearsInService = totalYearsInService;
		totalYearsInService = newTotalYearsInService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE,
					oldTotalYearsInService, totalYearsInService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.POLITICIAN__NAME:
			return getName();
		case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
			return getPoliticalParty();
		case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
			return getTotalYearsInService();
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
		case CountriesPackage.POLITICIAN__NAME:
			setName((String) newValue);
			return;
		case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
			setPoliticalParty((String) newValue);
			return;
		case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
			setTotalYearsInService((Double) newValue);
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
		case CountriesPackage.POLITICIAN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
			setPoliticalParty(POLITICAL_PARTY_EDEFAULT);
			return;
		case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
			setTotalYearsInService(TOTAL_YEARS_IN_SERVICE_EDEFAULT);
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
		case CountriesPackage.POLITICIAN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CountriesPackage.POLITICIAN__POLITICAL_PARTY:
			return POLITICAL_PARTY_EDEFAULT == null ? politicalParty != null
					: !POLITICAL_PARTY_EDEFAULT.equals(politicalParty);
		case CountriesPackage.POLITICIAN__TOTAL_YEARS_IN_SERVICE:
			return totalYearsInService != TOTAL_YEARS_IN_SERVICE_EDEFAULT;
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
		result.append(", politicalParty: ");
		result.append(politicalParty);
		result.append(", totalYearsInService: ");
		result.append(totalYearsInService);
		result.append(')');
		return result.toString();
	}

} //PoliticianImpl
