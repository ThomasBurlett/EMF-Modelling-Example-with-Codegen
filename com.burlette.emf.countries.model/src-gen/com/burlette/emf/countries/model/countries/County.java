/**
 */
package com.burlette.emf.countries.model.countries;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>County</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.County#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.County#getCountyNumber <em>County Number</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.County#getLargestCity <em>Largest City</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.County#getCity <em>City</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.County#getCommissioner <em>Commissioner</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCounty()
 * @model
 * @generated
 */
public interface County extends EObject {
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
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCounty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.County#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>County Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Number</em>' attribute.
	 * @see #setCountyNumber(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCounty_CountyNumber()
	 * @model
	 * @generated
	 */
	int getCountyNumber();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.County#getCountyNumber <em>County Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Number</em>' attribute.
	 * @see #getCountyNumber()
	 * @generated
	 */
	void setCountyNumber(int value);

	/**
	 * Returns the value of the '<em><b>Largest City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largest City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largest City</em>' attribute.
	 * @see #setLargestCity(String)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCounty_LargestCity()
	 * @model
	 * @generated
	 */
	String getLargestCity();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.County#getLargestCity <em>Largest City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largest City</em>' attribute.
	 * @see #getLargestCity()
	 * @generated
	 */
	void setLargestCity(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' containment reference list.
	 * The list contents are of type {@link com.burlette.emf.countries.model.countries.City}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' containment reference list.
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCounty_City()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<City> getCity();

	/**
	 * Returns the value of the '<em><b>Commissioner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commissioner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commissioner</em>' reference.
	 * @see #setCommissioner(Commissioner)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCounty_Commissioner()
	 * @model required="true"
	 * @generated
	 */
	Commissioner getCommissioner();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.County#getCommissioner <em>Commissioner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commissioner</em>' reference.
	 * @see #getCommissioner()
	 * @generated
	 */
	void setCommissioner(Commissioner value);

} // County
