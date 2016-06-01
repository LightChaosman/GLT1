/**
 */
package boundingbox.util;

import boundingbox.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see boundingbox.BoundingboxPackage
 * @generated
 */
public class BoundingboxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BoundingboxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingboxSwitch() {
		if (modelPackage == null) {
			modelPackage = BoundingboxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BoundingboxPackage.WORLD: {
				World world = (World)theEObject;
				T result = caseWorld(world);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE_X: {
				MoveX moveX = (MoveX)theEObject;
				T result = caseMoveX(moveX);
				if (result == null) result = caseMove(moveX);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE_Y: {
				MoveY moveY = (MoveY)theEObject;
				T result = caseMoveY(moveY);
				if (result == null) result = caseMove(moveY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE_LEFT: {
				MoveLeft moveLeft = (MoveLeft)theEObject;
				T result = caseMoveLeft(moveLeft);
				if (result == null) result = caseMoveX(moveLeft);
				if (result == null) result = caseMove(moveLeft);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE_RIGHT: {
				MoveRight moveRight = (MoveRight)theEObject;
				T result = caseMoveRight(moveRight);
				if (result == null) result = caseMoveX(moveRight);
				if (result == null) result = caseMove(moveRight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE_UP: {
				MoveUp moveUp = (MoveUp)theEObject;
				T result = caseMoveUp(moveUp);
				if (result == null) result = caseMoveY(moveUp);
				if (result == null) result = caseMove(moveUp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BoundingboxPackage.MOVE_DOWN: {
				MoveDown moveDown = (MoveDown)theEObject;
				T result = caseMoveDown(moveDown);
				if (result == null) result = caseMoveY(moveDown);
				if (result == null) result = caseMove(moveDown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorld(World object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveX(MoveX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveY(MoveY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveLeft(MoveLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveRight(MoveRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveUp(MoveUp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveDown(MoveDown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BoundingboxSwitch
