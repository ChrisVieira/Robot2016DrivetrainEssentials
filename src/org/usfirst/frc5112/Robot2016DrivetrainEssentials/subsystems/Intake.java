package org.usfirst.frc5112.Robot2016DrivetrainEssentials.subsystems;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.RobotMap;
import org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.intakeCommands.StopIntake;

import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	private final SpeedController intakeMotor = RobotMap.intakeintakeMotor;

	public void initDefaultCommand() {
		setDefaultCommand(new StopIntake());
	}
	
	public void stopIntakeMotor() {
		intakeMotor.stopMotor();
	}
}
