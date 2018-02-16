/**
 */
package com.burlette.emf.countries.model.countries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Governor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.Governor#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Governor#getEndOfTermYear <em>End Of Term Year</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Governor#getYearsLivedInState <em>Years Lived In State</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getGovernor()
 * @model
 * @generated
 */
public interface Governor extends Politician {
	/**
	 * Returns the value of the '<em><b>Year Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Elected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Elected</em>' attribute.
	 * @see #setYearElected(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getGovernor_YearElected()
	 * @model
	 * @generated
	 */
	int getYearElected();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Governor#getYearElected <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Elected</em>' attribute.
	 * @see #getYearElected()
	 * @generated
	 */
	void setYearElected(int value);

	/**
	 * Returns the value of the '<em><b>End Of Term Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Term Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Term Year</em>' attribute.
	 * @see #setEndOfTermYear(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getGovernor_EndOfTermYear()
	 * @model
	 * @generated
	 */
	int getEndOfTermYear();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Governor#getEndOfTermYear <em>End Of Term Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Term Year</em>' attribute.
	 * @see #getEndOfTermYear()
	 * @generated
	 */
	void setEndOfTermYear(int value);

	/**
	 * Returns the value of the '<em><b>Years Lived In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years Lived In State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years Lived In State</em>' attribute.
	 * @see #setYearsLivedInState(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getGovernor_YearsLivedInState()
	 * @model
	 * @generated
	 */
	int getYearsLivedInState();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Governor#getYearsLivedInState <em>Years Lived In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years Lived In State</em>' attribute.
	 * @see #getYearsLivedInState()
	 * @generated
	 */
	void setYearsLivedInState(int value);

} // Governor
