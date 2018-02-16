/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.Commissioner;
import com.burlette.emf.countries.model.countries.CountriesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commissioner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CommissionerImpl#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CommissionerImpl#getCongressionalDistrict <em>Congressional District</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.CommissionerImpl#isIsIncumbent <em>Is Incumbent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommissionerImpl extends PoliticianImpl implements Commissioner {
	/**
	 * The default value of the '{@link #getYearElected() <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearElected()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_ELECTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearElected() <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearElected()
	 * @generated
	 * @ordered
	 */
	protected int yearElected = YEAR_ELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCongressionalDistrict() <em>Congressional District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongressionalDistrict()
	 * @generated
	 * @ordered
	 */
	protected static final int CONGRESSIONAL_DISTRICT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCongressionalDistrict() <em>Congressional District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongressionalDistrict()
	 * @generated
	 * @ordered
	 */
	protected int congressionalDistrict = CONGRESSIONAL_DISTRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsIncumbent() <em>Is Incumbent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIncumbent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INCUMBENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIncumbent() <em>Is Incumbent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIncumbent()
	 * @generated
	 * @ordered
	 */
	protected boolean isIncumbent = IS_INCUMBENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommissionerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.COMMISSIONER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearElected() {
		return yearElected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearElected(int newYearElected) {
		int oldYearElected = yearElected;
		yearElected = newYearElected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COMMISSIONER__YEAR_ELECTED,
					oldYearElected, yearElected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCongressionalDistrict() {
		return congressionalDistrict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCongressionalDistrict(int newCongressionalDistrict) {
		int oldCongressionalDistrict = congressionalDistrict;
		congressionalDistrict = newCongressionalDistrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COMMISSIONER__CONGRESSIONAL_DISTRICT,
					oldCongressionalDistrict, congressionalDistrict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIncumbent() {
		return isIncumbent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIncumbent(boolean newIsIncumbent) {
		boolean oldIsIncumbent = isIncumbent;
		isIncumbent = newIsIncumbent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.COMMISSIONER__IS_INCUMBENT,
					oldIsIncumbent, isIncumbent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.COMMISSIONER__YEAR_ELECTED:
			return getYearElected();
		case CountriesPackage.COMMISSIONER__CONGRESSIONAL_DISTRICT:
			return getCongressionalDistrict();
		case CountriesPackage.COMMISSIONER__IS_INCUMBENT:
			return isIsIncumbent();
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
		case CountriesPackage.COMMISSIONER__YEAR_ELECTED:
			setYearElected((Integer) newValue);
			return;
		case CountriesPackage.COMMISSIONER__CONGRESSIONAL_DISTRICT:
			setCongressionalDistrict((Integer) newValue);
			return;
		case CountriesPackage.COMMISSIONER__IS_INCUMBENT:
			setIsIncumbent((Boolean) newValue);
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
		case CountriesPackage.COMMISSIONER__YEAR_ELECTED:
			setYearElected(YEAR_ELECTED_EDEFAULT);
			return;
		case CountriesPackage.COMMISSIONER__CONGRESSIONAL_DISTRICT:
			setCongressionalDistrict(CONGRESSIONAL_DISTRICT_EDEFAULT);
			return;
		case CountriesPackage.COMMISSIONER__IS_INCUMBENT:
			setIsIncumbent(IS_INCUMBENT_EDEFAULT);
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
		case CountriesPackage.COMMISSIONER__YEAR_ELECTED:
			return yearElected != YEAR_ELECTED_EDEFAULT;
		case CountriesPackage.COMMISSIONER__CONGRESSIONAL_DISTRICT:
			return congressionalDistrict != CONGRESSIONAL_DISTRICT_EDEFAULT;
		case CountriesPackage.COMMISSIONER__IS_INCUMBENT:
			return isIncumbent != IS_INCUMBENT_EDEFAULT;
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
		result.append(" (yearElected: ");
		result.append(yearElected);
		result.append(", congressionalDistrict: ");
		result.append(congressionalDistrict);
		result.append(", isIncumbent: ");
		result.append(isIncumbent);
		result.append(')');
		return result.toString();
	}

} //CommissionerImpl
