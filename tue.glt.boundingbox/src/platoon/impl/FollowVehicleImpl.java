/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platoon.FollowVehicle;
import platoon.PlatoonPackage;
import platoon.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Follow Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.FollowVehicleImpl#getFrontrunner <em>Frontrunner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FollowVehicleImpl extends VehicleImpl implements FollowVehicle {
	/**
	 * The cached value of the '{@link #getFrontrunner() <em>Frontrunner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontrunner()
	 * @generated
	 * @ordered
	 */
	protected Vehicle frontrunner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FollowVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.FOLLOW_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getFrontrunner() {
		if (frontrunner != null && frontrunner.eIsProxy()) {
			InternalEObject oldFrontrunner = (InternalEObject)frontrunner;
			frontrunner = (Vehicle)eResolveProxy(oldFrontrunner);
			if (frontrunner != oldFrontrunner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatoonPackage.FOLLOW_VEHICLE__FRONTRUNNER, oldFrontrunner, frontrunner));
			}
		}
		return frontrunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetFrontrunner() {
		return frontrunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontrunner(Vehicle newFrontrunner) {
		Vehicle oldFrontrunner = frontrunner;
		frontrunner = newFrontrunner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.FOLLOW_VEHICLE__FRONTRUNNER, oldFrontrunner, frontrunner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FRONTRUNNER:
				if (resolve) return getFrontrunner();
				return basicGetFrontrunner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FRONTRUNNER:
				setFrontrunner((Vehicle)newValue);
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
			case PlatoonPackage.FOLLOW_VEHICLE__FRONTRUNNER:
				setFrontrunner((Vehicle)null);
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
			case PlatoonPackage.FOLLOW_VEHICLE__FRONTRUNNER:
				return frontrunner != null;
		}
		return super.eIsSet(featureID);
	}

} //FollowVehicleImpl
