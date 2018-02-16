/**
 */
package com.burlette.emf.countries.model.countries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mayor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.Mayor#getAddress <em>Address</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Mayor#getTimesElected <em>Times Elected</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Mayor#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getMayor()
 * @model
 * @generated
 */
public interface Mayor extends Politician {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getMayor_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Mayor#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Times Elected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times Elected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times Elected</em>' attribute.
	 * @see #setTimesElected(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getMayor_TimesElected()
	 * @model
	 * @generated
	 */
	int getTimesElected();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Mayor#getTimesElected <em>Times Elected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times Elected</em>' attribute.
	 * @see #getTimesElected()
	 * @generated
	 */
	void setTimesElected(int value);

	/**
	 * Returns the value of the '<em><b>Age Elected As Mayor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age Elected As Mayor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Elected As Mayor</em>' attribute.
	 * @see #setAgeElectedAsMayor(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getMayor_AgeElectedAsMayor()
	 * @model
	 * @generated
	 */
	int getAgeElectedAsMayor();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Mayor#getAgeElectedAsMayor <em>Age Elected As Mayor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age Elected As Mayor</em>' attribute.
	 * @see #getAgeElectedAsMayor()
	 * @generated
	 */
	void setAgeElectedAsMayor(int value);

} // Mayor
