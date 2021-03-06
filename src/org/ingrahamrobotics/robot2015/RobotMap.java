package org.ingrahamrobotics.robot2015;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // PWM Out
    public static int driveMotor1 = 1;
    public static int steerMotor1 = 2;

    // Digital I/o
    public static int steerEncoder1A = 1;
    public static int steerEncoder1B = 2;

    // Analog
    public static int steerEncoder1Analog = 1;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
