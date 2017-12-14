package org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.drivetrainCommands;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopDrivetrain extends Command {

    public StopDrivetrain() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.stopDrivetrain();
    }

    protected void execute() {
    	Robot.drivetrain.stopDrivetrain();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.stopDrivetrain();
    }

    protected void interrupted() {
    	Robot.drivetrain.stopDrivetrain();
    }
}
