package org.ingrahamrobotics.robot2015.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.PIDSubsystem;

import org.ingrahamrobotics.robot2015.RobotMap;

public class Steer extends PIDSubsystem{

	Talon motor = Talon(RobotMap.driveMotor1);
	Encoder encoder = Encoder(RobotMap.driveEncoder1A, RobotMap.driveMotor1B);

	boolean speedBased;

	public Drive(boolean speedBased){
		super("Drive", 2.0, 0.0, 0.0);
		setAbsoluteTolerance(.05);
		getPIDController().setContinuous(false);

		speedBased = speedBased;
	}

	protected double returnPIDInput(){
		return val = speedBased ? encoder.getRate() : encoder.getDistance();
	}
	
	protected void usePIDOutput(double output){
		motor.pidWrite(output);
	}
}
