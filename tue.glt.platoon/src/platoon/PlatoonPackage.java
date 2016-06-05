/**
 */
package platoon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see platoon.PlatoonFactory
 * @model kind="package"
 * @generated
 */
public interface PlatoonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platoon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platoon";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platoon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatoonPackage eINSTANCE = platoon.impl.PlatoonPackageImpl.init();

	/**
	 * The meta object id for the '{@link platoon.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.RouteImpl
	 * @see platoon.impl.PlatoonPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.CommandImpl
	 * @see platoon.impl.PlatoonPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ForwardImpl
	 * @see platoon.impl.PlatoonPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD__DISTANCE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.TurnImpl
	 * @see platoon.impl.PlatoonPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 3;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.TurnLeftImpl
	 * @see platoon.impl.PlatoonPackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 4;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.TurnRightImpl
	 * @see platoon.impl.PlatoonPackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 5;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = TURN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_OPERATION_COUNT = TURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.PlatoonImpl <em>Platoon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.PlatoonImpl
	 * @see platoon.impl.PlatoonPackageImpl#getPlatoon()
	 * @generated
	 */
	int PLATOON = 6;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON__LEADER = 0;

	/**
	 * The feature id for the '<em><b>Followers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON__FOLLOWERS = 1;

	/**
	 * The number of structural features of the '<em>Platoon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platoon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATOON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.VehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 7;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.LeadVehicleImpl <em>Lead Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.LeadVehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getLeadVehicle()
	 * @generated
	 */
	int LEAD_VEHICLE = 8;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAD_VEHICLE__ROUTE = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lead Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAD_VEHICLE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lead Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAD_VEHICLE_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.FollowVehicleImpl <em>Follow Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.FollowVehicleImpl
	 * @see platoon.impl.PlatoonPackageImpl#getFollowVehicle()
	 * @generated
	 */
	int FOLLOW_VEHICLE = 9;

	/**
	 * The feature id for the '<em><b>Frontrunner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOW_VEHICLE__FRONTRUNNER = VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Follow Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOW_VEHICLE_FEATURE_COUNT = VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Follow Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOW_VEHICLE_OPERATION_COUNT = VEHICLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ConstraintsImpl <em>Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ConstraintsImpl
	 * @see platoon.impl.PlatoonPackageImpl#getConstraints()
	 * @generated
	 */
	int CONSTRAINTS = 10;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.ConstraintImpl
	 * @see platoon.impl.PlatoonPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link platoon.impl.headwayImpl <em>headway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.headwayImpl
	 * @see platoon.impl.PlatoonPackageImpl#getheadway()
	 * @generated
	 */
	int HEADWAY = 12;

	/**
	 * The feature id for the '<em><b>Lowbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADWAY__LOWBOUND = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADWAY__UPBOUND = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>headway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADWAY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>headway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADWAY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link platoon.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see platoon.impl.WorldImpl
	 * @see platoon.impl.PlatoonPackageImpl#getWorld()
	 * @generated
	 */
	int WORLD = 13;

	/**
	 * The feature id for the '<em><b>Platoon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__PLATOON = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__CONSTRAINTS = 2;

	/**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link platoon.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see platoon.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link platoon.Route#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see platoon.Route#getCommands()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Commands();

	/**
	 * Returns the meta object for class '{@link platoon.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see platoon.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for class '{@link platoon.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see platoon.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for the attribute '{@link platoon.Forward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see platoon.Forward#getDistance()
	 * @see #getForward()
	 * @generated
	 */
	EAttribute getForward_Distance();

	/**
	 * Returns the meta object for class '{@link platoon.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see platoon.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for class '{@link platoon.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see platoon.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for class '{@link platoon.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see platoon.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for class '{@link platoon.Platoon <em>Platoon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platoon</em>'.
	 * @see platoon.Platoon
	 * @generated
	 */
	EClass getPlatoon();

	/**
	 * Returns the meta object for the reference '{@link platoon.Platoon#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader</em>'.
	 * @see platoon.Platoon#getLeader()
	 * @see #getPlatoon()
	 * @generated
	 */
	EReference getPlatoon_Leader();

	/**
	 * Returns the meta object for the reference list '{@link platoon.Platoon#getFollowers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Followers</em>'.
	 * @see platoon.Platoon#getFollowers()
	 * @see #getPlatoon()
	 * @generated
	 */
	EReference getPlatoon_Followers();

	/**
	 * Returns the meta object for class '{@link platoon.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see platoon.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for class '{@link platoon.LeadVehicle <em>Lead Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lead Vehicle</em>'.
	 * @see platoon.LeadVehicle
	 * @generated
	 */
	EClass getLeadVehicle();

	/**
	 * Returns the meta object for the reference '{@link platoon.LeadVehicle#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see platoon.LeadVehicle#getRoute()
	 * @see #getLeadVehicle()
	 * @generated
	 */
	EReference getLeadVehicle_Route();

	/**
	 * Returns the meta object for class '{@link platoon.FollowVehicle <em>Follow Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Follow Vehicle</em>'.
	 * @see platoon.FollowVehicle
	 * @generated
	 */
	EClass getFollowVehicle();

	/**
	 * Returns the meta object for the reference '{@link platoon.FollowVehicle#getFrontrunner <em>Frontrunner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frontrunner</em>'.
	 * @see platoon.FollowVehicle#getFrontrunner()
	 * @see #getFollowVehicle()
	 * @generated
	 */
	EReference getFollowVehicle_Frontrunner();

	/**
	 * Returns the meta object for class '{@link platoon.Constraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints</em>'.
	 * @see platoon.Constraints
	 * @generated
	 */
	EClass getConstraints();

	/**
	 * Returns the meta object for the reference list '{@link platoon.Constraints#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see platoon.Constraints#getConstraints()
	 * @see #getConstraints()
	 * @generated
	 */
	EReference getConstraints_Constraints();

	/**
	 * Returns the meta object for class '{@link platoon.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see platoon.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link platoon.headway <em>headway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>headway</em>'.
	 * @see platoon.headway
	 * @generated
	 */
	EClass getheadway();

	/**
	 * Returns the meta object for the attribute '{@link platoon.headway#getLowbound <em>Lowbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowbound</em>'.
	 * @see platoon.headway#getLowbound()
	 * @see #getheadway()
	 * @generated
	 */
	EAttribute getheadway_Lowbound();

	/**
	 * Returns the meta object for the attribute '{@link platoon.headway#getUpbound <em>Upbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upbound</em>'.
	 * @see platoon.headway#getUpbound()
	 * @see #getheadway()
	 * @generated
	 */
	EAttribute getheadway_Upbound();

	/**
	 * Returns the meta object for class '{@link platoon.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see platoon.World
	 * @generated
	 */
	EClass getWorld();

	/**
	 * Returns the meta object for the reference '{@link platoon.World#getPlatoon <em>Platoon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Platoon</em>'.
	 * @see platoon.World#getPlatoon()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Platoon();

	/**
	 * Returns the meta object for the reference '{@link platoon.World#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see platoon.World#getRoute()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Route();

	/**
	 * Returns the meta object for the containment reference '{@link platoon.World#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see platoon.World#getConstraints()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Constraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatoonFactory getPlatoonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link platoon.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.RouteImpl
		 * @see platoon.impl.PlatoonPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__COMMANDS = eINSTANCE.getRoute_Commands();

		/**
		 * The meta object literal for the '{@link platoon.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.CommandImpl
		 * @see platoon.impl.PlatoonPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '{@link platoon.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ForwardImpl
		 * @see platoon.impl.PlatoonPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD__DISTANCE = eINSTANCE.getForward_Distance();

		/**
		 * The meta object literal for the '{@link platoon.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.TurnImpl
		 * @see platoon.impl.PlatoonPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '{@link platoon.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.TurnLeftImpl
		 * @see platoon.impl.PlatoonPackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '{@link platoon.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.TurnRightImpl
		 * @see platoon.impl.PlatoonPackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '{@link platoon.impl.PlatoonImpl <em>Platoon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.PlatoonImpl
		 * @see platoon.impl.PlatoonPackageImpl#getPlatoon()
		 * @generated
		 */
		EClass PLATOON = eINSTANCE.getPlatoon();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATOON__LEADER = eINSTANCE.getPlatoon_Leader();

		/**
		 * The meta object literal for the '<em><b>Followers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATOON__FOLLOWERS = eINSTANCE.getPlatoon_Followers();

		/**
		 * The meta object literal for the '{@link platoon.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.VehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '{@link platoon.impl.LeadVehicleImpl <em>Lead Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.LeadVehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getLeadVehicle()
		 * @generated
		 */
		EClass LEAD_VEHICLE = eINSTANCE.getLeadVehicle();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAD_VEHICLE__ROUTE = eINSTANCE.getLeadVehicle_Route();

		/**
		 * The meta object literal for the '{@link platoon.impl.FollowVehicleImpl <em>Follow Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.FollowVehicleImpl
		 * @see platoon.impl.PlatoonPackageImpl#getFollowVehicle()
		 * @generated
		 */
		EClass FOLLOW_VEHICLE = eINSTANCE.getFollowVehicle();

		/**
		 * The meta object literal for the '<em><b>Frontrunner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLLOW_VEHICLE__FRONTRUNNER = eINSTANCE.getFollowVehicle_Frontrunner();

		/**
		 * The meta object literal for the '{@link platoon.impl.ConstraintsImpl <em>Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ConstraintsImpl
		 * @see platoon.impl.PlatoonPackageImpl#getConstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS__CONSTRAINTS = eINSTANCE.getConstraints_Constraints();

		/**
		 * The meta object literal for the '{@link platoon.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.ConstraintImpl
		 * @see platoon.impl.PlatoonPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link platoon.impl.headwayImpl <em>headway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.headwayImpl
		 * @see platoon.impl.PlatoonPackageImpl#getheadway()
		 * @generated
		 */
		EClass HEADWAY = eINSTANCE.getheadway();

		/**
		 * The meta object literal for the '<em><b>Lowbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADWAY__LOWBOUND = eINSTANCE.getheadway_Lowbound();

		/**
		 * The meta object literal for the '<em><b>Upbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADWAY__UPBOUND = eINSTANCE.getheadway_Upbound();

		/**
		 * The meta object literal for the '{@link platoon.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see platoon.impl.WorldImpl
		 * @see platoon.impl.PlatoonPackageImpl#getWorld()
		 * @generated
		 */
		EClass WORLD = eINSTANCE.getWorld();

		/**
		 * The meta object literal for the '<em><b>Platoon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__PLATOON = eINSTANCE.getWorld_Platoon();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__ROUTE = eINSTANCE.getWorld_Route();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__CONSTRAINTS = eINSTANCE.getWorld_Constraints();

	}

} //PlatoonPackage
