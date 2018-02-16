/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.Governor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Governor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.GovernorImpl#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.GovernorImpl#getEndOfTermYear <em>End Of Term Year</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.GovernorImpl#getYearsLivedInState <em>Years Lived In State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovernorImpl extends PoliticianImpl implements Governor {
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
	 * The default value of the '{@link #getEndOfTermYear() <em>End Of Term Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTermYear()
	 * @generated
	 * @ordered
	 */
	protected static final int END_OF_TERM_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndOfTermYear() <em>End Of Term Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTermYear()
	 * @generated
	 * @ordered
	 */
	protected int endOfTermYear = END_OF_TERM_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearsLivedInState() <em>Years Lived In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsLivedInState()
	 * @generated
	 * @ordered
	 */
	protected static final int YEARS_LIVED_IN_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearsLivedInState() <em>Years Lived In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsLivedInState()
	 * @generated
	 * @ordered
	 */
	protected int yearsLivedInState = YEARS_LIVED_IN_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GovernorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.GOVERNOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.GOVERNOR__YEAR_ELECTED,
					oldYearElected, yearElected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndOfTermYear() {
		return endOfTermYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfTermYear(int newEndOfTermYear) {
		int oldEndOfTermYear = endOfTermYear;
		endOfTermYear = newEndOfTermYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.GOVERNOR__END_OF_TERM_YEAR,
					oldEndOfTermYear, endOfTermYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYearsLivedInState() {
		return yearsLivedInState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearsLivedInState(int newYearsLivedInState) {
		int oldYearsLivedInState = yearsLivedInState;
		yearsLivedInState = newYearsLivedInState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE,
					oldYearsLivedInState, yearsLivedInState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.GOVERNOR__YEAR_ELECTED:
			return getYearElected();
		case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
			return getEndOfTermYear();
		case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
			return getYearsLivedInState();
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
		case CountriesPackage.GOVERNOR__YEAR_ELECTED:
			setYearElected((Integer) newValue);
			return;
		case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
			setEndOfTermYear((Integer) newValue);
			return;
		case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
			setYearsLivedInState((Integer) newValue);
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
		case CountriesPackage.GOVERNOR__YEAR_ELECTED:
			setYearElected(YEAR_ELECTED_EDEFAULT);
			return;
		case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
			setEndOfTermYear(END_OF_TERM_YEAR_EDEFAULT);
			return;
		case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
			setYearsLivedInState(YEARS_LIVED_IN_STATE_EDEFAULT);
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
		case CountriesPackage.GOVERNOR__YEAR_ELECTED:
			return yearElected != YEAR_ELECTED_EDEFAULT;
		case CountriesPackage.GOVERNOR__END_OF_TERM_YEAR:
			return endOfTermYear != END_OF_TERM_YEAR_EDEFAULT;
		case CountriesPackage.GOVERNOR__YEARS_LIVED_IN_STATE:
			return yearsLivedInState != YEARS_LIVED_IN_STATE_EDEFAULT;
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
		result.append(", endOfTermYear: ");
		result.append(endOfTermYear);
		result.append(", yearsLivedInState: ");
		result.append(yearsLivedInState);
		result.append(')');
		return result.toString();
	}

} //GovernorImpl
