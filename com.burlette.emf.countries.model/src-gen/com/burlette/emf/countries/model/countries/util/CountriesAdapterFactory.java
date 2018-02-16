/**
 */
package com.burlette.emf.countries.model.countries.util;

import com.burlette.emf.countries.model.countries.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.burlette.emf.countries.model.countries.CountriesPackage
 * @generated
 */
public class CountriesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CountriesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountriesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CountriesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountriesSwitch<Adapter> modelSwitch = new CountriesSwitch<Adapter>() {
		@Override
		public Adapter caseCountry(Country object) {
			return createCountryAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseCounty(County object) {
			return createCountyAdapter();
		}

		@Override
		public Adapter caseCity(City object) {
			return createCityAdapter();
		}

		@Override
		public Adapter caseGovernor(Governor object) {
			return createGovernorAdapter();
		}

		@Override
		public Adapter casePresident(President object) {
			return createPresidentAdapter();
		}

		@Override
		public Adapter caseCommissioner(Commissioner object) {
			return createCommissionerAdapter();
		}

		@Override
		public Adapter caseMayor(Mayor object) {
			return createMayorAdapter();
		}

		@Override
		public Adapter casePolitician(Politician object) {
			return createPoliticianAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.County <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.County
	 * @generated
	 */
	public Adapter createCountyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.City
	 * @generated
	 */
	public Adapter createCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.Governor <em>Governor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.Governor
	 * @generated
	 */
	public Adapter createGovernorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.President <em>President</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.President
	 * @generated
	 */
	public Adapter createPresidentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.Commissioner <em>Commissioner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.Commissioner
	 * @generated
	 */
	public Adapter createCommissionerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.Mayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.Mayor
	 * @generated
	 */
	public Adapter createMayorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.burlette.emf.countries.model.countries.Politician <em>Politician</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.burlette.emf.countries.model.countries.Politician
	 * @generated
	 */
	public Adapter createPoliticianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CountriesAdapterFactory
