/**
 */
package com.burlette.emf.countries.model.countries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>President</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.President#getPresidentNumber <em>President Number</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.President#isEligibleForReelection <em>Eligible For Reelection</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.President#getSecretCodename <em>Secret Codename</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPresident()
 * @model
 * @generated
 */
public interface President extends Politician {
	/**
	 * Returns the value of the '<em><b>President Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>President Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>President Number</em>' attribute.
	 * @see #setPresidentNumber(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPresident_PresidentNumber()
	 * @model
	 * @generated
	 */
	int getPresidentNumber();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.President#getPresidentNumber <em>President Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>President Number</em>' attribute.
	 * @see #getPresidentNumber()
	 * @generated
	 */
	void setPresidentNumber(int value);

	/**
	 * Returns the value of the '<em><b>Eligible For Reelection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eligible For Reelection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligible For Reelection</em>' attribute.
	 * @see #setEligibleForReelection(boolean)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPresident_EligibleForReelection()
	 * @model
	 * @generated
	 */
	boolean isEligibleForReelection();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.President#isEligibleForReelection <em>Eligible For Reelection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligible For Reelection</em>' attribute.
	 * @see #isEligibleForReelection()
	 * @generated
	 */
	void setEligibleForReelection(boolean value);

	/**
	 * Returns the value of the '<em><b>Secret Codename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret Codename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Codename</em>' attribute.
	 * @see #setSecretCodename(String)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPresident_SecretCodename()
	 * @model
	 * @generated
	 */
	String getSecretCodename();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.President#getSecretCodename <em>Secret Codename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Codename</em>' attribute.
	 * @see #getSecretCodename()
	 * @generated
	 */
	void setSecretCodename(String value);

} // President
