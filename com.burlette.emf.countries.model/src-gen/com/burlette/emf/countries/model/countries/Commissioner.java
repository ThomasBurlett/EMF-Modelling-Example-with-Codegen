/**
 */
package com.burlette.emf.countries.model.countries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commissioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.Commissioner#getYearElected <em>Year Elected</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Commissioner#getCongressionalDistrict <em>Congressional District</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Commissioner#isIsIncumbent <em>Is Incumbent</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCommissioner()
 * @model
 * @generated
 */
public interface Commissioner extends Politician {
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
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCommissioner_YearElected()
	 * @model
	 * @generated
	 */
	int getYearElected();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Commissioner#getYearElected <em>Year Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Elected</em>' attribute.
	 * @see #getYearElected()
	 * @generated
	 */
	void setYearElected(int value);

	/**
	 * Returns the value of the '<em><b>Congressional District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Congressional District</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Congressional District</em>' attribute.
	 * @see #setCongressionalDistrict(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCommissioner_CongressionalDistrict()
	 * @model
	 * @generated
	 */
	int getCongressionalDistrict();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Commissioner#getCongressionalDistrict <em>Congressional District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Congressional District</em>' attribute.
	 * @see #getCongressionalDistrict()
	 * @generated
	 */
	void setCongressionalDistrict(int value);

	/**
	 * Returns the value of the '<em><b>Is Incumbent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Incumbent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Incumbent</em>' attribute.
	 * @see #setIsIncumbent(boolean)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCommissioner_IsIncumbent()
	 * @model
	 * @generated
	 */
	boolean isIsIncumbent();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Commissioner#isIsIncumbent <em>Is Incumbent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Incumbent</em>' attribute.
	 * @see #isIsIncumbent()
	 * @generated
	 */
	void setIsIncumbent(boolean value);

} // Commissioner
