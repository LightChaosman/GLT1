/**
 */
package boundingbox;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see boundingbox.BoundingboxFactory
 * @model kind="package"
 * @generated
 */
public interface BoundingboxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boundingbox";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "boundingbox";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boundingbox";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoundingboxPackage eINSTANCE = boundingbox.impl.BoundingboxPackageImpl.init();

	/**
	 * The meta object id for the '{@link boundingbox.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.WorldImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getWorld()
	 * @generated
	 */
	int WORLD = 0;

	/**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__MOVE_COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveXImpl <em>Move X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveXImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveX()
	 * @generated
	 */
	int MOVE_X = 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_X__DISTANCE = MOVE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_X__MOVE_COMMANDS = MOVE__MOVE_COMMANDS;

	/**
	 * The number of structural features of the '<em>Move X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_X_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_X_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveYImpl <em>Move Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveYImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveY()
	 * @generated
	 */
	int MOVE_Y = 3;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_Y__DISTANCE = MOVE__DISTANCE;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_Y__MOVE_COMMANDS = MOVE__MOVE_COMMANDS;

	/**
	 * The number of structural features of the '<em>Move Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_Y_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_Y_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveLeftImpl <em>Move Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveLeftImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveLeft()
	 * @generated
	 */
	int MOVE_LEFT = 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__DISTANCE = MOVE_X__DISTANCE;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT__MOVE_COMMANDS = MOVE_X__MOVE_COMMANDS;

	/**
	 * The number of structural features of the '<em>Move Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT_FEATURE_COUNT = MOVE_X_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LEFT_OPERATION_COUNT = MOVE_X_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveRightImpl <em>Move Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveRightImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveRight()
	 * @generated
	 */
	int MOVE_RIGHT = 5;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT__DISTANCE = MOVE_X__DISTANCE;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT__MOVE_COMMANDS = MOVE_X__MOVE_COMMANDS;

	/**
	 * The number of structural features of the '<em>Move Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT_FEATURE_COUNT = MOVE_X_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RIGHT_OPERATION_COUNT = MOVE_X_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveUpImpl <em>Move Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveUpImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveUp()
	 * @generated
	 */
	int MOVE_UP = 6;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP__DISTANCE = MOVE_Y__DISTANCE;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP__MOVE_COMMANDS = MOVE_Y__MOVE_COMMANDS;

	/**
	 * The number of structural features of the '<em>Move Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_FEATURE_COUNT = MOVE_Y_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_UP_OPERATION_COUNT = MOVE_Y_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boundingbox.impl.MoveDownImpl <em>Move Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boundingbox.impl.MoveDownImpl
	 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveDown()
	 * @generated
	 */
	int MOVE_DOWN = 7;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN__DISTANCE = MOVE_Y__DISTANCE;

	/**
	 * The feature id for the '<em><b>Move Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN__MOVE_COMMANDS = MOVE_Y__MOVE_COMMANDS;

	/**
	 * The number of structural features of the '<em>Move Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_FEATURE_COUNT = MOVE_Y_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_DOWN_OPERATION_COUNT = MOVE_Y_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link boundingbox.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see boundingbox.World
	 * @generated
	 */
	EClass getWorld();

	/**
	 * Returns the meta object for class '{@link boundingbox.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see boundingbox.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link boundingbox.Move#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see boundingbox.Move#getDistance()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Distance();

	/**
	 * Returns the meta object for the containment reference list '{@link boundingbox.Move#getMoveCommands <em>Move Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move Commands</em>'.
	 * @see boundingbox.Move#getMoveCommands()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_MoveCommands();

	/**
	 * Returns the meta object for class '{@link boundingbox.MoveX <em>Move X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move X</em>'.
	 * @see boundingbox.MoveX
	 * @generated
	 */
	EClass getMoveX();

	/**
	 * Returns the meta object for class '{@link boundingbox.MoveY <em>Move Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Y</em>'.
	 * @see boundingbox.MoveY
	 * @generated
	 */
	EClass getMoveY();

	/**
	 * Returns the meta object for class '{@link boundingbox.MoveLeft <em>Move Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Left</em>'.
	 * @see boundingbox.MoveLeft
	 * @generated
	 */
	EClass getMoveLeft();

	/**
	 * Returns the meta object for class '{@link boundingbox.MoveRight <em>Move Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Right</em>'.
	 * @see boundingbox.MoveRight
	 * @generated
	 */
	EClass getMoveRight();

	/**
	 * Returns the meta object for class '{@link boundingbox.MoveUp <em>Move Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Up</em>'.
	 * @see boundingbox.MoveUp
	 * @generated
	 */
	EClass getMoveUp();

	/**
	 * Returns the meta object for class '{@link boundingbox.MoveDown <em>Move Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Down</em>'.
	 * @see boundingbox.MoveDown
	 * @generated
	 */
	EClass getMoveDown();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoundingboxFactory getBoundingboxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link boundingbox.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.WorldImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getWorld()
		 * @generated
		 */
		EClass WORLD = eINSTANCE.getWorld();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__DISTANCE = eINSTANCE.getMove_Distance();

		/**
		 * The meta object literal for the '<em><b>Move Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__MOVE_COMMANDS = eINSTANCE.getMove_MoveCommands();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveXImpl <em>Move X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveXImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveX()
		 * @generated
		 */
		EClass MOVE_X = eINSTANCE.getMoveX();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveYImpl <em>Move Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveYImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveY()
		 * @generated
		 */
		EClass MOVE_Y = eINSTANCE.getMoveY();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveLeftImpl <em>Move Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveLeftImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveLeft()
		 * @generated
		 */
		EClass MOVE_LEFT = eINSTANCE.getMoveLeft();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveRightImpl <em>Move Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveRightImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveRight()
		 * @generated
		 */
		EClass MOVE_RIGHT = eINSTANCE.getMoveRight();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveUpImpl <em>Move Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveUpImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveUp()
		 * @generated
		 */
		EClass MOVE_UP = eINSTANCE.getMoveUp();

		/**
		 * The meta object literal for the '{@link boundingbox.impl.MoveDownImpl <em>Move Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boundingbox.impl.MoveDownImpl
		 * @see boundingbox.impl.BoundingboxPackageImpl#getMoveDown()
		 * @generated
		 */
		EClass MOVE_DOWN = eINSTANCE.getMoveDown();

	}

} //BoundingboxPackage
