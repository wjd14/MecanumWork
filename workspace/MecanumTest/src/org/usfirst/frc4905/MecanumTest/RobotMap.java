// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4905.MecanumTest;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainFrontLeft;
    public static CANTalon driveTrainBackRight;
    public static CANTalon driveTrainFrontRight;
    public static CANTalon driveTrainBackLeft;
    public static RobotDrive driveTrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFrontLeft = new CANTalon(0);
        LiveWindow.addActuator("DriveTrain", "FrontLeft", driveTrainFrontLeft);
        
        driveTrainBackRight = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "BackRight", driveTrainBackRight);
        
        driveTrainFrontRight = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "FrontRight", driveTrainFrontRight);
        
        driveTrainBackLeft = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "BackLeft", driveTrainBackLeft);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainFrontLeft, driveTrainBackLeft,
              driveTrainFrontRight, driveTrainBackRight);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    

}
