/**
 */
package boundingbox.tests;

import boundingbox.BoundingboxFactory;
import boundingbox.MoveLeft;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Left</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveLeftTest extends MoveXTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MoveLeftTest.class);
	}

	/**
	 * Constructs a new Move Left test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveLeftTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Move Left test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MoveLeft getFixture() {
		return (MoveLeft)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BoundingboxFactory.eINSTANCE.createMoveLeft());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MoveLeftTest
