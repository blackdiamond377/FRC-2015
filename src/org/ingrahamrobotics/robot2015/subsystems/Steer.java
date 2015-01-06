package org.ingrahamrobotics.robot2015.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.PIDSubsystem;

import org.ingrahamrobotics.robot2015.RobotMap;

public class Steer extends PIDSubsystem{

	Talon motor = Talon(RobotMap.steerMotor1);

	AnalogInput encoder = AnalogInput(RobotMap.steerEncoder1Analog);

	public Steer(){
		super("Drive", 2.0, 0.0, 0.0);
		setAbsoluteTolerance(.05);
		getPIDController().setContinuous(true);
	}

	protected double returnPIDInput(){
		return encoder.getAverageVoltage();
	}
	protected void usePIDOutput(double output){
		motor.pidWrite(output);
	}
}
