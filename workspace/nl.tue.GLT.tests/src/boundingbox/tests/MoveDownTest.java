/**
 */
package boundingbox.tests;

import boundingbox.BoundingboxFactory;
import boundingbox.MoveDown;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Down</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoveDownTest extends MoveYTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MoveDownTest.class);
	}

	/**
	 * Constructs a new Move Down test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveDownTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Move Down test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MoveDown getFixture() {
		return (MoveDown)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BoundingboxFactory.eINSTANCE.createMoveDown());
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

} //MoveDownTest
