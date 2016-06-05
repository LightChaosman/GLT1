/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import platoon.Constraints;
import platoon.Platoon;
import platoon.PlatoonPackage;
import platoon.Route;
import platoon.World;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.WorldImpl#getPlatoon <em>Platoon</em>}</li>
 *   <li>{@link platoon.impl.WorldImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link platoon.impl.WorldImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldImpl extends MinimalEObjectImpl.Container implements World {
	/**
	 * The cached value of the '{@link #getPlatoon() <em>Platoon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatoon()
	 * @generated
	 * @ordered
	 */
	protected Platoon platoon;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected Route routes;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Constraints constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.WORLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platoon getPlatoon() {
		return platoon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatoon(Platoon newPlatoon, NotificationChain msgs) {
		Platoon oldPlatoon = platoon;
		platoon = newPlatoon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.WORLD__PLATOON, oldPlatoon, newPlatoon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatoon(Platoon newPlatoon) {
		if (newPlatoon != platoon) {
			NotificationChain msgs = null;
			if (platoon != null)
				msgs = ((InternalEObject)platoon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.WORLD__PLATOON, null, msgs);
			if (newPlatoon != null)
				msgs = ((InternalEObject)newPlatoon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.WORLD__PLATOON, null, msgs);
			msgs = basicSetPlatoon(newPlatoon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.WORLD__PLATOON, newPlatoon, newPlatoon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoutes() {
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoutes(Route newRoutes, NotificationChain msgs) {
		Route oldRoutes = routes;
		routes = newRoutes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.WORLD__ROUTES, oldRoutes, newRoutes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoutes(Route newRoutes) {
		if (newRoutes != routes) {
			NotificationChain msgs = null;
			if (routes != null)
				msgs = ((InternalEObject)routes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.WORLD__ROUTES, null, msgs);
			if (newRoutes != null)
				msgs = ((InternalEObject)newRoutes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.WORLD__ROUTES, null, msgs);
			msgs = basicSetRoutes(newRoutes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.WORLD__ROUTES, newRoutes, newRoutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(Constraints newConstraints, NotificationChain msgs) {
		Constraints oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.WORLD__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Constraints newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.WORLD__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.WORLD__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.WORLD__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatoonPackage.WORLD__PLATOON:
				return basicSetPlatoon(null, msgs);
			case PlatoonPackage.WORLD__ROUTES:
				return basicSetRoutes(null, msgs);
			case PlatoonPackage.WORLD__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
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
			case PlatoonPackage.WORLD__PLATOON:
				return getPlatoon();
			case PlatoonPackage.WORLD__ROUTES:
				return getRoutes();
			case PlatoonPackage.WORLD__CONSTRAINTS:
				return getConstraints();
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
			case PlatoonPackage.WORLD__PLATOON:
				setPlatoon((Platoon)newValue);
				return;
			case PlatoonPackage.WORLD__ROUTES:
				setRoutes((Route)newValue);
				return;
			case PlatoonPackage.WORLD__CONSTRAINTS:
				setConstraints((Constraints)newValue);
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
			case PlatoonPackage.WORLD__PLATOON:
				setPlatoon((Platoon)null);
				return;
			case PlatoonPackage.WORLD__ROUTES:
				setRoutes((Route)null);
				return;
			case PlatoonPackage.WORLD__CONSTRAINTS:
				setConstraints((Constraints)null);
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
			case PlatoonPackage.WORLD__PLATOON:
				return platoon != null;
			case PlatoonPackage.WORLD__ROUTES:
				return routes != null;
			case PlatoonPackage.WORLD__CONSTRAINTS:
				return constraints != null;
		}
		return super.eIsSet(featureID);
	}

} //WorldImpl
