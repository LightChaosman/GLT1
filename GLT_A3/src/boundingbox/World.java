/**
 */
package boundingbox;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link boundingbox.World#getMoveCommands <em>Move Commands</em>}</li>
 * </ul>
 *
 * @see boundingbox.BoundingboxPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject {
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
	 * @see boundingbox.BoundingboxPackage#getWorld_MoveCommands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMoveCommands();

} // World
