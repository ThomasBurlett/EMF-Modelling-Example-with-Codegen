/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.President;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>President</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.PresidentImpl#getPresidentNumber <em>President Number</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.PresidentImpl#isEligibleForReelection <em>Eligible For Reelection</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.PresidentImpl#getSecretCodename <em>Secret Codename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresidentImpl extends PoliticianImpl implements President {
	/**
	 * The default value of the '{@link #getPresidentNumber() <em>President Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresidentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESIDENT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPresidentNumber() <em>President Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresidentNumber()
	 * @generated
	 * @ordered
	 */
	protected int presidentNumber = PRESIDENT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEligibleForReelection() <em>Eligible For Reelection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEligibleForReelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELIGIBLE_FOR_REELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEligibleForReelection() <em>Eligible For Reelection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEligibleForReelection()
	 * @generated
	 * @ordered
	 */
	protected boolean eligibleForReelection = ELIGIBLE_FOR_REELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretCodename() <em>Secret Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretCodename()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_CODENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretCodename() <em>Secret Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretCodename()
	 * @generated
	 * @ordered
	 */
	protected String secretCodename = SECRET_CODENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresidentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.PRESIDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPresidentNumber() {
		return presidentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresidentNumber(int newPresidentNumber) {
		int oldPresidentNumber = presidentNumber;
		presidentNumber = newPresidentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.PRESIDENT__PRESIDENT_NUMBER,
					oldPresidentNumber, presidentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEligibleForReelection() {
		return eligibleForReelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibleForReelection(boolean newEligibleForReelection) {
		boolean oldEligibleForReelection = eligibleForReelection;
		eligibleForReelection = newEligibleForReelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION,
					oldEligibleForReelection, eligibleForReelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretCodename() {
		return secretCodename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretCodename(String newSecretCodename) {
		String oldSecretCodename = secretCodename;
		secretCodename = newSecretCodename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.PRESIDENT__SECRET_CODENAME,
					oldSecretCodename, secretCodename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
			return getPresidentNumber();
		case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
			return isEligibleForReelection();
		case CountriesPackage.PRESIDENT__SECRET_CODENAME:
			return getSecretCodename();
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
		case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
			setPresidentNumber((Integer) newValue);
			return;
		case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
			setEligibleForReelection((Boolean) newValue);
			return;
		case CountriesPackage.PRESIDENT__SECRET_CODENAME:
			setSecretCodename((String) newValue);
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
		case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
			setPresidentNumber(PRESIDENT_NUMBER_EDEFAULT);
			return;
		case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
			setEligibleForReelection(ELIGIBLE_FOR_REELECTION_EDEFAULT);
			return;
		case CountriesPackage.PRESIDENT__SECRET_CODENAME:
			setSecretCodename(SECRET_CODENAME_EDEFAULT);
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
		case CountriesPackage.PRESIDENT__PRESIDENT_NUMBER:
			return presidentNumber != PRESIDENT_NUMBER_EDEFAULT;
		case CountriesPackage.PRESIDENT__ELIGIBLE_FOR_REELECTION:
			return eligibleForReelection != ELIGIBLE_FOR_REELECTION_EDEFAULT;
		case CountriesPackage.PRESIDENT__SECRET_CODENAME:
			return SECRET_CODENAME_EDEFAULT == null ? secretCodename != null
					: !SECRET_CODENAME_EDEFAULT.equals(secretCodename);
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
		result.append(" (presidentNumber: ");
		result.append(presidentNumber);
		result.append(", eligibleForReelection: ");
		result.append(eligibleForReelection);
		result.append(", secretCodename: ");
		result.append(secretCodename);
		result.append(')');
		return result.toString();
	}

} //PresidentImpl
