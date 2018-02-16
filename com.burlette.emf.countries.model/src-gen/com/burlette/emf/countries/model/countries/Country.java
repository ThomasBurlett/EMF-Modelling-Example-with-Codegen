/**
 */
package com.burlette.emf.countries.model.countries;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.Country#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Country#getYearFounded <em>Year Founded</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Country#isIsPartOfUN <em>Is Part Of UN</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Country#getState <em>State</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.Country#getPresident <em>President</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
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
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Year Founded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Founded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Founded</em>' attribute.
	 * @see #setYearFounded(int)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCountry_YearFounded()
	 * @model
	 * @generated
	 */
	int getYearFounded();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Country#getYearFounded <em>Year Founded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Founded</em>' attribute.
	 * @see #getYearFounded()
	 * @generated
	 */
	void setYearFounded(int value);

	/**
	 * Returns the value of the '<em><b>Is Part Of UN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part Of UN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of UN</em>' attribute.
	 * @see #setIsPartOfUN(boolean)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCountry_IsPartOfUN()
	 * @model
	 * @generated
	 */
	boolean isIsPartOfUN();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Country#isIsPartOfUN <em>Is Part Of UN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of UN</em>' attribute.
	 * @see #isIsPartOfUN()
	 * @generated
	 */
	void setIsPartOfUN(boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link com.burlette.emf.countries.model.countries.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCountry_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>President</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>President</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>President</em>' reference.
	 * @see #setPresident(President)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getCountry_President()
	 * @model required="true"
	 * @generated
	 */
	President getPresident();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.Country#getPresident <em>President</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>President</em>' reference.
	 * @see #getPresident()
	 * @generated
	 */
	void setPresident(President value);

} // Country
