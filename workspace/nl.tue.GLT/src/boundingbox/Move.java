/**
 */
package boundingbox;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boundingbox.Move#getDistance <em>Distance</em>}</li>
 *   <li>{@link boundingbox.Move#getMoveCommands <em>Move Commands</em>}</li>
 * </ul>
 *
 * @see boundingbox.BoundingboxPackage#getMove()
 * @model abstract="true"
 * @generated
 */
public interface Move extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see boundingbox.BoundingboxPackage#getMove_Distance()
	 * @model required="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link boundingbox.Move#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Move Commands</b></em>' containment reference list.
	 * The list contents are of type {@link boundingbox.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Commands</em>' containment reference list.
	 * @see boundingbox.BoundingboxPackage#getMove_MoveCommands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMoveCommands();

} // Move
