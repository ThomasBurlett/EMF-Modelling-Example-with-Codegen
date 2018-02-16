/**
 */
package com.burlette.emf.countries.model.countries;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Politician</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.Politician#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Politician#getPoliticalParty <em>Political Party</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Politician#getTotalYearsInService <em>Total Years In Service</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPolitician()
 * @model
 * @generated
 */
public interface Politician extends EObject {
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
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPolitician_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Politician#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Political Party</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Political Party</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Political Party</em>' attribute.
	 * @see #setPoliticalParty(String)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPolitician_PoliticalParty()
	 * @model
	 * @generated
	 */
	String getPoliticalParty();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Politician#getPoliticalParty <em>Political Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Political Party</em>' attribute.
	 * @see #getPoliticalParty()
	 * @generated
	 */
	void setPoliticalParty(String value);

	/**
	 * Returns the value of the '<em><b>Total Years In Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Years In Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Years In Service</em>' attribute.
	 * @see #setTotalYearsInService(double)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getPolitician_TotalYearsInService()
	 * @model
	 * @generated
	 */
	double getTotalYearsInService();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Politician#getTotalYearsInService <em>Total Years In Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Years In Service</em>' attribute.
	 * @see #getTotalYearsInService()
	 * @generated
	 */
	void setTotalYearsInService(double value);

} // Politician
