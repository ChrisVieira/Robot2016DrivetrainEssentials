package org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.kickerCommands;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopKicker extends Command {

    public StopKicker() {
    	requires(Robot.kicker);
    }

    protected void initialize() {
    	Robot.kicker.stopKicker();
    }

    protected void execute() {
    	Robot.kicker.stopKicker();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.kicker.stopKicker();
    }

    protected void interrupted() {
    	Robot.kicker.stopKicker();
    }
}
