package org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.armCommands;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopArm extends Command {

    public StopArm() {
    	requires(Robot.arm);
    }

    protected void initialize() {
    	Robot.arm.stopArmMotor();
    }

    protected void execute() {
    	Robot.arm.stopArmMotor();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.arm.stopArmMotor();
    }

    protected void interrupted() {
    	Robot.arm.stopArmMotor();
    }
}
