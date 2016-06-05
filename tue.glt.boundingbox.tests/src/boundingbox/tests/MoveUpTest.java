/**
 */
package boundingbox.tests;

import boundingbox.BoundingboxFactory;
import boundingbox.MoveUp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Up</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveUpTest extends MoveYTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MoveUpTest.class);
	}

	/**
	 * Constructs a new Move Up test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveUpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Move Up test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MoveUp getFixture() {
		return (MoveUp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BoundingboxFactory.eINSTANCE.createMoveUp());
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

} //MoveUpTest
