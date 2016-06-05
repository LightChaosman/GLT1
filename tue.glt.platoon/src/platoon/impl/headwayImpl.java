/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platoon.PlatoonPackage;
import platoon.headway;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>headway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.headwayImpl#getLowbound <em>Lowbound</em>}</li>
 *   <li>{@link platoon.impl.headwayImpl#getUpbound <em>Upbound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class headwayImpl extends ConstraintImpl implements headway {
	/**
	 * The default value of the '{@link #getLowbound() <em>Lowbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowbound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWBOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowbound() <em>Lowbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowbound()
	 * @generated
	 * @ordered
	 */
	protected int lowbound = LOWBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpbound() <em>Upbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpbound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPBOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpbound() <em>Upbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpbound()
	 * @generated
	 * @ordered
	 */
	protected int upbound = UPBOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected headwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.HEADWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowbound() {
		return lowbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowbound(int newLowbound) {
		int oldLowbound = lowbound;
		lowbound = newLowbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.HEADWAY__LOWBOUND, oldLowbound, lowbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpbound() {
		return upbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpbound(int newUpbound) {
		int oldUpbound = upbound;
		upbound = newUpbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.HEADWAY__UPBOUND, oldUpbound, upbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.HEADWAY__LOWBOUND:
				return getLowbound();
			case PlatoonPackage.HEADWAY__UPBOUND:
				return getUpbound();
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
			case PlatoonPackage.HEADWAY__LOWBOUND:
				setLowbound((Integer)newValue);
				return;
			case PlatoonPackage.HEADWAY__UPBOUND:
				setUpbound((Integer)newValue);
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
			case PlatoonPackage.HEADWAY__LOWBOUND:
				setLowbound(LOWBOUND_EDEFAULT);
				return;
			case PlatoonPackage.HEADWAY__UPBOUND:
				setUpbound(UPBOUND_EDEFAULT);
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
			case PlatoonPackage.HEADWAY__LOWBOUND:
				return lowbound != LOWBOUND_EDEFAULT;
			case PlatoonPackage.HEADWAY__UPBOUND:
				return upbound != UPBOUND_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lowbound: ");
		result.append(lowbound);
		result.append(", upbound: ");
		result.append(upbound);
		result.append(')');
		return result.toString();
	}

} //headwayImpl
