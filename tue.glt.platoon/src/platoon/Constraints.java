/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Constraints#getList <em>List</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getConstraints()
 * @model
 * @generated
 */
public interface Constraints extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(Constraint)
	 * @see platoon.PlatoonPackage#getConstraints_List()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getList();

	/**
	 * Sets the value of the '{@link platoon.Constraints#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(Constraint value);

} // Constraints
