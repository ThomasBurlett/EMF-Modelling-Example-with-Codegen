/**
 */
package com.burlette.emf.countries.model.countries;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.State#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.State#getPopulation <em>Population</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.State#getTotalArea <em>Total Area</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.State#getCounty <em>County</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.State#getGovernor <em>Governor</em>}</li>
 * </ul>
 *
 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.State#getName <em>Name</em>}' attribute.
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
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getState_Population()
	 * @model
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.State#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Total Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Area</em>' attribute.
	 * @see #setTotalArea(double)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getState_TotalArea()
	 * @model
	 * @generated
	 */
	double getTotalArea();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.State#getTotalArea <em>Total Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Area</em>' attribute.
	 * @see #getTotalArea()
	 * @generated
	 */
	void setTotalArea(double value);

	/**
	 * Returns the value of the '<em><b>County</b></em>' containment reference list.
	 * The list contents are of type {@link com.burlette.emf.countries.model.countries.County}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County</em>' containment reference list.
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getState_County()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<County> getCounty();

	/**
	 * Returns the value of the '<em><b>Governor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Governor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Governor</em>' reference.
	 * @see #setGovernor(Governor)
	 * @see com.burlette.emf.countries.model.countries.CountriesPackage#getState_Governor()
	 * @model required="true"
	 * @generated
	 */
	Governor getGovernor();

	/**
	 * Sets the value of the '{@link com.burlette.emf.countries.model.countries.State#getGovernor <em>Governor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Governor</em>' reference.
	 * @see #getGovernor()
	 * @generated
	 */
	void setGovernor(Governor value);

} // State
