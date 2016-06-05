/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.FollowVehicle#getFrontrunner <em>Frontrunner</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getFollowVehicle()
 * @model
 * @generated
 */
public interface FollowVehicle extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Frontrunner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frontrunner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frontrunner</em>' reference.
	 * @see #setFrontrunner(Vehicle)
	 * @see platoon.PlatoonPackage#getFollowVehicle_Frontrunner()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getFrontrunner();

	/**
	 * Sets the value of the '{@link platoon.FollowVehicle#getFrontrunner <em>Frontrunner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frontrunner</em>' reference.
	 * @see #getFrontrunner()
	 * @generated
	 */
	void setFrontrunner(Vehicle value);

} // FollowVehicle
