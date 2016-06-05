/**
 */
package platoon.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import platoon.Platoon;
import platoon.PlatoonFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatoonTest extends TestCase {

	/**
	 * The fixture for this Platoon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Platoon fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlatoonTest.class);
	}

	/**
	 * Constructs a new Platoon test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Platoon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Platoon fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Platoon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Platoon getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createPlatoon());
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

} //PlatoonTest
