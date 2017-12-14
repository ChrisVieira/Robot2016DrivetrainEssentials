package org.usfirst.frc5112.Robot2016DrivetrainEssentials.subsystems;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.RobotMap;
import org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.armCommands.StopArm;

import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Arm extends Subsystem {
    private final SpeedController armMotor = RobotMap.armarmMotor;

    public void initDefaultCommand() {
    	setDefaultCommand(new StopArm());
    }
    
    public void stopArmMotor() {
    	armMotor.stopMotor();
    }
}

