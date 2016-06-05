/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.PlatoonFactory;
import platoon.headway;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>headway</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class headwayTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(headwayTest.class);
	}

	/**
	 * Constructs a new headway test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public headwayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this headway test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected headway getFixture() {
		return (headway)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createheadway());
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

} //headwayTest
