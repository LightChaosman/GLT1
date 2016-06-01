/**
 */
package boundingbox.tests;

import boundingbox.BoundingboxFactory;
import boundingbox.MoveRight;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Right</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveRightTest extends MoveXTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MoveRightTest.class);
	}

	/**
	 * Constructs a new Move Right test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveRightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Move Right test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MoveRight getFixture() {
		return (MoveRight)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BoundingboxFactory.eINSTANCE.createMoveRight());
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

} //MoveRightTest
