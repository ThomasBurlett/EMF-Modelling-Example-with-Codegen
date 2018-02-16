package com.burlette.emf.countries.usingmodel;

import com.burlette.emf.countries.model.countries.*;

public class UsingEMFModel {

	public static void main(String[] args) {
		// Setup factory
		CountriesFactory factory = CountriesFactory.eINSTANCE;

		// Initialize Country and President
		Country country = factory.createCountry();
		country.setName("United States of America");
		country.setYearFounded(1776);
		country.setIsPartOfUN(true);
		President president = factory.createPresident();
		president.setName("Donald Trump");
		president.setEligibleForReelection(true);
		president.setPoliticalParty("Republican");
		president.setPresidentNumber(45);
		president.setSecretCodename("Falcon");
		president.setTotalYearsInService(2);
		country.setPresident(president);

		// Initialize State and Governor
		State state = factory.createState();
		state.setName("Ohio");
		state.setPopulation(123456);
		state.setTotalArea(1324654.5);
		Governor governor = factory.createGovernor();
		governor.setEndOfTermYear(2020);
		governor.setName("John Kasich");
		governor.setPoliticalParty("Republican");
		governor.setTotalYearsInService(20);
		governor.setYearElected(2012);
		governor.setYearsLivedInState(23);
		state.setGovernor(governor);

		// Initialize County and Commissioner
		County county = factory.createCounty();
		county.setCountyNumber(76);
		county.setLargestCity("New Philadelphia");
		county.setName("Tuscarawas");
		Commissioner commissioner = factory.createCommissioner();
		commissioner.setCongressionalDistrict(12);
		commissioner.setIsIncumbent(true);
		commissioner.setName("Steve Steve");
		commissioner.setPoliticalParty("Democrat");
		commissioner.setTotalYearsInService(25);
		commissioner.setYearElected(2018);
		county.setCommissioner(commissioner);

		// Initialize City and Mayor
		City city = factory.createCity();
		city.setIsStateCapital(false);
		city.setName("Dover");
		city.setPopulation(12000);
		Mayor mayor = factory.createMayor();
		mayor.setAddress("Maple Ave");
		mayor.setAgeElectedAsMayor(42);
		mayor.setName("Merrick Mamarella");
		mayor.setPoliticalParty("Democrat");
		mayor.setTimesElected(3);
		mayor.setTotalYearsInService(5);
		city.setMayor(mayor);

		// Add respective classes to respective containers
		country.getState().add(state);
		state.getCounty().add(county);
		county.getCity().add(city);

		// Print Statements to show it all works
		System.out.println(country);
		System.out.println(state);
		System.out.println(county);
		System.out.println(city);
		System.out.println(president);
		System.out.println(governor);
		System.out.println(commissioner);
		System.out.println(mayor);
		System.out.println("List of States in US: " + country.getState());
		System.out.println("List of Counties in Ohio: " + state.getCounty());
		System.out.println("List of Cities in Tuscarawas: " + county.getCity());

	}

}
