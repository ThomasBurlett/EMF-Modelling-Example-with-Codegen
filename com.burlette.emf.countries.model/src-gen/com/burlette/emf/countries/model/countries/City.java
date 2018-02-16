/**
 */
package com.burlette.emf.countries.model.countries;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.City#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.City#getPopulation <em>Population</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.City#isIsStateCapital <em>Is State Capital</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.City#getMayor <em>Mayor</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCity_Population()
	 * @model
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.City#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Is State Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is State Capital</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is State Capital</em>' attribute.
	 * @see #setIsStateCapital(boolean)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCity_IsStateCapital()
	 * @model
	 * @generated
	 */
	boolean isIsStateCapital();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.City#isIsStateCapital <em>Is State Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is State Capital</em>' attribute.
	 * @see #isIsStateCapital()
	 * @generated
	 */
	void setIsStateCapital(boolean value);

	/**
	 * Returns the value of the '<em><b>Mayor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mayor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mayor</em>' reference.
	 * @see #setMayor(Mayor)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCity_Mayor()
	 * @model required="true"
	 * @generated
	 */
	Mayor getMayor();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.City#getMayor <em>Mayor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mayor</em>' reference.
	 * @see #getMayor()
	 * @generated
	 */
	void setMayor(Mayor value);

} // City
