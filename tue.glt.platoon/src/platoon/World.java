/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.World#getPlatoon <em>Platoon</em>}</li>
 *   <li>{@link platoon.World#getRoutes <em>Routes</em>}</li>
 *   <li>{@link platoon.World#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject {
	/**
	 * Returns the value of the '<em><b>Platoon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platoon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platoon</em>' containment reference.
	 * @see #setPlatoon(Platoon)
	 * @see platoon.PlatoonPackage#getWorld_Platoon()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Platoon getPlatoon();

	/**
	 * Sets the value of the '{@link platoon.World#getPlatoon <em>Platoon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platoon</em>' containment reference.
	 * @see #getPlatoon()
	 * @generated
	 */
	void setPlatoon(Platoon value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference.
	 * @see #setRoutes(Route)
	 * @see platoon.PlatoonPackage#getWorld_Routes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Route getRoutes();

	/**
	 * Sets the value of the '{@link platoon.World#getRoutes <em>Routes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routes</em>' containment reference.
	 * @see #getRoutes()
	 * @generated
	 */
	void setRoutes(Route value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(Constraints)
	 * @see platoon.PlatoonPackage#getWorld_Constraints()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraints getConstraints();

	/**
	 * Sets the value of the '{@link platoon.World#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Constraints value);

} // World
