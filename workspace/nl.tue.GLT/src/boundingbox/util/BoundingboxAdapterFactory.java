/**
 */
package boundingbox.util;

import boundingbox.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see boundingbox.BoundingboxPackage
 * @generated
 */
public class BoundingboxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BoundingboxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingboxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BoundingboxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingboxSwitch<Adapter> modelSwitch =
		new BoundingboxSwitch<Adapter>() {
			@Override
			public Adapter caseWorld(World object) {
				return createWorldAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseMoveX(MoveX object) {
				return createMoveXAdapter();
			}
			@Override
			public Adapter caseMoveY(MoveY object) {
				return createMoveYAdapter();
			}
			@Override
			public Adapter caseMoveLeft(MoveLeft object) {
				return createMoveLeftAdapter();
			}
			@Override
			public Adapter caseMoveRight(MoveRight object) {
				return createMoveRightAdapter();
			}
			@Override
			public Adapter caseMoveUp(MoveUp object) {
				return createMoveUpAdapter();
			}
			@Override
			public Adapter caseMoveDown(MoveDown object) {
				return createMoveDownAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.World
	 * @generated
	 */
	public Adapter createWorldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.MoveX <em>Move X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.MoveX
	 * @generated
	 */
	public Adapter createMoveXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.MoveY <em>Move Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.MoveY
	 * @generated
	 */
	public Adapter createMoveYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.MoveLeft <em>Move Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.MoveLeft
	 * @generated
	 */
	public Adapter createMoveLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.MoveRight <em>Move Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.MoveRight
	 * @generated
	 */
	public Adapter createMoveRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.MoveUp <em>Move Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.MoveUp
	 * @generated
	 */
	public Adapter createMoveUpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boundingbox.MoveDown <em>Move Down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boundingbox.MoveDown
	 * @generated
	 */
	public Adapter createMoveDownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BoundingboxAdapterFactory
