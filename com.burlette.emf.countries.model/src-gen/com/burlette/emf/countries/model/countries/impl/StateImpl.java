/**
 */
package com.burlette.emf.countries.model.countries.impl;

import com.burlette.emf.countries.model.countries.CountriesPackage;
import com.burlette.emf.countries.model.countries.County;
import com.burlette.emf.countries.model.countries.Governor;
import com.burlette.emf.countries.model.countries.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.StateImpl#getPopulation <em>Population</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.StateImpl#getTotalArea <em>Total Area</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.StateImpl#getCounty <em>County</em>}</li>
 *   <li>{@link com.burlette.emf.countries.model.countries.impl.StateImpl#getGovernor <em>Governor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected int population = POPULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalArea() <em>Total Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalArea()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalArea() <em>Total Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalArea()
	 * @generated
	 * @ordered
	 */
	protected double totalArea = TOTAL_AREA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCounty() <em>County</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounty()
	 * @generated
	 * @ordered
	 */
	protected EList<County> county;

	/**
	 * The cached value of the '{@link #getGovernor() <em>Governor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernor()
	 * @generated
	 * @ordered
	 */
	protected Governor governor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CountriesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(int newPopulation) {
		int oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.STATE__POPULATION, oldPopulation,
					population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalArea() {
		return totalArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalArea(double newTotalArea) {
		double oldTotalArea = totalArea;
		totalArea = newTotalArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.STATE__TOTAL_AREA, oldTotalArea,
					totalArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<County> getCounty() {
		if (county == null) {
			county = new EObjectContainmentEList<County>(County.class, this, CountriesPackage.STATE__COUNTY);
		}
		return county;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Governor getGovernor() {
		if (governor != null && governor.eIsProxy()) {
			InternalEObject oldGovernor = (InternalEObject) governor;
			governor = (Governor) eResolveProxy(oldGovernor);
			if (governor != oldGovernor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CountriesPackage.STATE__GOVERNOR,
							oldGovernor, governor));
			}
		}
		return governor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Governor basicGetGovernor() {
		return governor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGovernor(Governor newGovernor) {
		Governor oldGovernor = governor;
		governor = newGovernor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CountriesPackage.STATE__GOVERNOR, oldGovernor,
					governor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CountriesPackage.STATE__COUNTY:
			return ((InternalEList<?>) getCounty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CountriesPackage.STATE__NAME:
			return getName();
		case CountriesPackage.STATE__POPULATION:
			return getPopulation();
		case CountriesPackage.STATE__TOTAL_AREA:
			return getTotalArea();
		case CountriesPackage.STATE__COUNTY:
			return getCounty();
		case CountriesPackage.STATE__GOVERNOR:
			if (resolve)
				return getGovernor();
			return basicGetGovernor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CountriesPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case CountriesPackage.STATE__POPULATION:
			setPopulation((Integer) newValue);
			return;
		case CountriesPackage.STATE__TOTAL_AREA:
			setTotalArea((Double) newValue);
			return;
		case CountriesPackage.STATE__COUNTY:
			getCounty().clear();
			getCounty().addAll((Collection<? extends County>) newValue);
			return;
		case CountriesPackage.STATE__GOVERNOR:
			setGovernor((Governor) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CountriesPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CountriesPackage.STATE__POPULATION:
			setPopulation(POPULATION_EDEFAULT);
			return;
		case CountriesPackage.STATE__TOTAL_AREA:
			setTotalArea(TOTAL_AREA_EDEFAULT);
			return;
		case CountriesPackage.STATE__COUNTY:
			getCounty().clear();
			return;
		case CountriesPackage.STATE__GOVERNOR:
			setGovernor((Governor) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CountriesPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CountriesPackage.STATE__POPULATION:
			return population != POPULATION_EDEFAULT;
		case CountriesPackage.STATE__TOTAL_AREA:
			return totalArea != TOTAL_AREA_EDEFAULT;
		case CountriesPackage.STATE__COUNTY:
			return county != null && !county.isEmpty();
		case CountriesPackage.STATE__GOVERNOR:
			return governor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", population: ");
		result.append(population);
		result.append(", totalArea: ");
		result.append(totalArea);
		result.append(')');
		return result.toString();
	}

} //StateImpl
