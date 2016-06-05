/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>headway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.headway#getLowbound <em>Lowbound</em>}</li>
 *   <li>{@link platoon.headway#getUpbound <em>Upbound</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getheadway()
 * @model
 * @generated
 */
public interface headway extends Constraint {
	/**
	 * Returns the value of the '<em><b>Lowbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lowbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowbound</em>' attribute.
	 * @see #setLowbound(int)
	 * @see platoon.PlatoonPackage#getheadway_Lowbound()
	 * @model required="true"
	 * @generated
	 */
	int getLowbound();

	/**
	 * Sets the value of the '{@link platoon.headway#getLowbound <em>Lowbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowbound</em>' attribute.
	 * @see #getLowbound()
	 * @generated
	 */
	void setLowbound(int value);

	/**
	 * Returns the value of the '<em><b>Upbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upbound</em>' attribute.
	 * @see #setUpbound(int)
	 * @see platoon.PlatoonPackage#getheadway_Upbound()
	 * @model required="true"
	 * @generated
	 */
	int getUpbound();

	/**
	 * Sets the value of the '{@link platoon.headway#getUpbound <em>Upbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upbound</em>' attribute.
	 * @see #getUpbound()
	 * @generated
	 */
	void setUpbound(int value);

} // headway
