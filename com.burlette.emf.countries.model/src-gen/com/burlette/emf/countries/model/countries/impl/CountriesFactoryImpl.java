/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CountriesFactoryImpl extends EFactoryImpl implements CountriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CountriesFactory init() {
		try {
			CountriesFactory theCountriesFactory = (CountriesFactory) EPackage.Registry.INSTANCE
					.getEFactory(CountriesPackage.eNS_URI);
			if (theCountriesFactory != null) {
				return theCountriesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CountriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountriesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CountriesPackage.COUNTRY:
			return createCountry();
		case CountriesPackage.STATE:
			return createState();
		case CountriesPackage.COUNTY:
			return createCounty();
		case CountriesPackage.CITY:
			return createCity();
		case CountriesPackage.GOVERNOR:
			return createGovernor();
		case CountriesPackage.PRESIDENT:
			return createPresident();
		case CountriesPackage.COMMISSIONER:
			return createCommissioner();
		case CountriesPackage.MAYOR:
			return createMayor();
		case CountriesPackage.POLITICIAN:
			return createPolitician();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public County createCounty() {
		CountyImpl county = new CountyImpl();
		return county;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Governor createGovernor() {
		GovernorImpl governor = new GovernorImpl();
		return governor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public President createPresident() {
		PresidentImpl president = new PresidentImpl();
		return president;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commissioner createCommissioner() {
		CommissionerImpl commissioner = new CommissionerImpl();
		return commissioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor createMayor() {
		MayorImpl mayor = new MayorImpl();
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Politician createPolitician() {
		PoliticianImpl politician = new PoliticianImpl();
		return politician;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountriesPackage getCountriesPackage() {
		return (CountriesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CountriesPackage getPackage() {
		return CountriesPackage.eINSTANCE;
	}

} //CountriesFactoryImpl
