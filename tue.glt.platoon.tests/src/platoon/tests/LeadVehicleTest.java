/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.LeadVehicle;
import platoon.PlatoonFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lead Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeadVehicleTest extends VehicleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeadVehicleTest.class);
	}

	/**
	 * Constructs a new Lead Vehicle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadVehicleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lead Vehicle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LeadVehicle getFixture() {
		return (LeadVehicle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createLeadVehicle());
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

} //LeadVehicleTest
