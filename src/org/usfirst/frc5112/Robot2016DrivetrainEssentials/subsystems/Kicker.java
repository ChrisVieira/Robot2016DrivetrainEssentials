package org.usfirst.frc5112.Robot2016DrivetrainEssentials.subsystems;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.RobotMap;
import org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.kickerCommands.StopKicker;

import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Kicker extends Subsystem {
    private final SpeedController kickerMotor = RobotMap.kickerkickerMotor;

    public void initDefaultCommand() {
    	setDefaultCommand(new StopKicker());
    }

	public void stopKicker() {
		kickerMotor.stopMotor();
	}
}

