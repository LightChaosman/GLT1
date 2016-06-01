/**
 */
package boundingbox.impl;

import boundingbox.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundingboxFactoryImpl extends EFactoryImpl implements BoundingboxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BoundingboxFactory init() {
		try {
			BoundingboxFactory theBoundingboxFactory = (BoundingboxFactory)EPackage.Registry.INSTANCE.getEFactory(BoundingboxPackage.eNS_URI);
			if (theBoundingboxFactory != null) {
				return theBoundingboxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BoundingboxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingboxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BoundingboxPackage.WORLD: return createWorld();
			case BoundingboxPackage.MOVE_LEFT: return createMoveLeft();
			case BoundingboxPackage.MOVE_RIGHT: return createMoveRight();
			case BoundingboxPackage.MOVE_UP: return createMoveUp();
			case BoundingboxPackage.MOVE_DOWN: return createMoveDown();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World createWorld() {
		WorldImpl world = new WorldImpl();
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveLeft createMoveLeft() {
		MoveLeftImpl moveLeft = new MoveLeftImpl();
		return moveLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveRight createMoveRight() {
		MoveRightImpl moveRight = new MoveRightImpl();
		return moveRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveUp createMoveUp() {
		MoveUpImpl moveUp = new MoveUpImpl();
		return moveUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveDown createMoveDown() {
		MoveDownImpl moveDown = new MoveDownImpl();
		return moveDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingboxPackage getBoundingboxPackage() {
		return (BoundingboxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BoundingboxPackage getPackage() {
		return BoundingboxPackage.eINSTANCE;
	}

} //BoundingboxFactoryImpl
