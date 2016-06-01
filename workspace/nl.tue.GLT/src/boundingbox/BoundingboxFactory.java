/**
 */
package boundingbox;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see boundingbox.BoundingboxPackage
 * @generated
 */
public interface BoundingboxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoundingboxFactory eINSTANCE = boundingbox.impl.BoundingboxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>World</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World</em>'.
	 * @generated
	 */
	World createWorld();

	/**
	 * Returns a new object of class '<em>Move Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Left</em>'.
	 * @generated
	 */
	MoveLeft createMoveLeft();

	/**
	 * Returns a new object of class '<em>Move Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Right</em>'.
	 * @generated
	 */
	MoveRight createMoveRight();

	/**
	 * Returns a new object of class '<em>Move Up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Up</em>'.
	 * @generated
	 */
	MoveUp createMoveUp();

	/**
	 * Returns a new object of class '<em>Move Down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Down</em>'.
	 * @generated
	 */
	MoveDown createMoveDown();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BoundingboxPackage getBoundingboxPackage();

} //BoundingboxFactory
