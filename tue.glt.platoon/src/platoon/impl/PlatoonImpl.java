/**
 */
package platoon.impl;

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

import platoon.FollowVehicle;
import platoon.LeadVehicle;
import platoon.Platoon;
import platoon.PlatoonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.PlatoonImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link platoon.impl.PlatoonImpl#getFollowers <em>Followers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatoonImpl extends MinimalEObjectImpl.Container implements Platoon {
	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected LeadVehicle leader;

	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected EList<FollowVehicle> followers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatoonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.PLATOON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadVehicle getLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeader(LeadVehicle newLeader, NotificationChain msgs) {
		LeadVehicle oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__LEADER, oldLeader, newLeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(LeadVehicle newLeader) {
		if (newLeader != leader) {
			NotificationChain msgs = null;
			if (leader != null)
				msgs = ((InternalEObject)leader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.PLATOON__LEADER, null, msgs);
			if (newLeader != null)
				msgs = ((InternalEObject)newLeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.PLATOON__LEADER, null, msgs);
			msgs = basicSetLeader(newLeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__LEADER, newLeader, newLeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FollowVehicle> getFollowers() {
		if (followers == null) {
			followers = new EObjectContainmentEList<FollowVehicle>(FollowVehicle.class, this, PlatoonPackage.PLATOON__FOLLOWERS);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__LEADER:
				return basicSetLeader(null, msgs);
			case PlatoonPackage.PLATOON__FOLLOWERS:
				return ((InternalEList<?>)getFollowers()).basicRemove(otherEnd, msgs);
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
			case PlatoonPackage.PLATOON__LEADER:
				return getLeader();
			case PlatoonPackage.PLATOON__FOLLOWERS:
				return getFollowers();
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
			case PlatoonPackage.PLATOON__LEADER:
				setLeader((LeadVehicle)newValue);
				return;
			case PlatoonPackage.PLATOON__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends FollowVehicle>)newValue);
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
			case PlatoonPackage.PLATOON__LEADER:
				setLeader((LeadVehicle)null);
				return;
			case PlatoonPackage.PLATOON__FOLLOWERS:
				getFollowers().clear();
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
			case PlatoonPackage.PLATOON__LEADER:
				return leader != null;
			case PlatoonPackage.PLATOON__FOLLOWERS:
				return followers != null && !followers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatoonImpl
