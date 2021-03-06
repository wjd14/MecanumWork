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

import org.usfirst.frc4905.MecanumTest.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc4905.MecanumTest.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driveController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driveController = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("TeleopDrive", new TeleopDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveController() {
        return driveController;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveGamePad() {
        return driveController;
    }

    
    
    public static boolean getAButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(1);
    	
    }
    
    public static boolean getBButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(2);
    	
    }
    
    public static boolean getXButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(3);
    	
    }
    
    public static boolean getYButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(4);
    	
    }
    
    public static boolean getLeftButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(5);
    	
    }
    
    public static boolean getRightButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(6);
    	
    }
    
    public static boolean getBackButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(7);
    	
    }
    
    public static boolean getStartButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(8);
    	
    }
    
    public static boolean getLeftStickButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(9);
    	
    }
    
    public static boolean getRightStickButton(Joystick gamepad) {
    	
    	return gamepad.getRawButton(10);
    	
    }
    
    public static double getLeftStickHorizontal (Joystick gamepad) {
    	
    	return gamepad.getRawAxis(0);
    	
    }
    
    public static double getLeftStickVertical (Joystick gamepad) {
    	
    	return gamepad.getRawAxis(1);
    	
    }
    
    public static boolean getLeftTriggerButton(Joystick gamepad) {
    	
    	return gamepad.getRawAxis(2)>0.5;
    	
    }
    
    public static double getLeftTriggerValue(Joystick gamepad) {
    	
    	return gamepad.getRawAxis(2);
    	
    }
    
    public static boolean getRightTriggerButton(Joystick gamepad) {
    	
    	return gamepad.getRawAxis(3)>0.5;
    	
    }
    
    public static double getRightTriggerValue(Joystick gamepad) {
    	
    	return gamepad.getRawAxis(3);
    	
    }
    
    public static double getRightStickHorizontal (Joystick gamepad) {
    	
    	return gamepad.getRawAxis(4);
    	
    }
    
    public static double getRightStickVertical (Joystick gamepad) {
    	
    	return gamepad.getRawAxis(5);
    	
    }
}

