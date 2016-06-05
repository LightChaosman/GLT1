/**
 */
package platoon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Platoon#getLeader <em>Leader</em>}</li>
 *   <li>{@link platoon.Platoon#getFollowers <em>Followers</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getPlatoon()
 * @model
 * @generated
 */
public interface Platoon extends EObject {
	/**
	 * Returns the value of the '<em><b>Leader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' containment reference.
	 * @see #setLeader(LeadVehicle)
	 * @see platoon.PlatoonPackage#getPlatoon_Leader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeadVehicle getLeader();

	/**
	 * Sets the value of the '{@link platoon.Platoon#getLeader <em>Leader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' containment reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(LeadVehicle value);

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' containment reference list.
	 * The list contents are of type {@link platoon.FollowVehicle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Followers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' containment reference list.
	 * @see platoon.PlatoonPackage#getPlatoon_Followers()
	 * @model containment="true"
	 * @generated
	 */
	EList<FollowVehicle> getFollowers();

} // Platoon
