package org.usfirst.frc5112.Robot2016DrivetrainEssentials.subsystems;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.RobotMap;
import org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.shooterCommands.StopShooter;

import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Shooter extends Subsystem {

    private final SpeedController shooterMotorLeft = RobotMap.shootershooterMotorLeft;
    private final SpeedController shooterMotorRight = RobotMap.shootershooterMotorRight;

    public void initDefaultCommand() {
    	setDefaultCommand(new StopShooter());
    }

	public void stopShooter() {
		shooterMotorLeft.stopMotor();
		shooterMotorRight.stopMotor();
	}
	
	public void spinShooterClockwise(double speed){
		shooterMotorLeft.set(speed);
		shooterMotorRight.set(-speed);
	}
	
	public void spinShooterCounterclockwise(double speed) {
		spinShooterClockwise(-speed);
	}
}

