package org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.shooterCommands;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopShooter extends Command {

    public StopShooter() {
    	requires(Robot.shooter);
    }

    protected void initialize() {
    	Robot.shooter.stopShooter();
   }

    protected void execute() {
    	Robot.shooter.stopShooter();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.shooter.stopShooter();
    }

    protected void interrupted() {
    	Robot.shooter.stopShooter();
    }
}
