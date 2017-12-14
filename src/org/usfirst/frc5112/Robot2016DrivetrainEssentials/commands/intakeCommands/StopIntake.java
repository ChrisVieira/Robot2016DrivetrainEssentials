package org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.intakeCommands;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class StopIntake extends Command {

    public StopIntake() {
    	requires(Robot.intake);
    }

    protected void initialize() {
    	Robot.intake.stopIntakeMotor();
    }

    protected void execute() {
    	Robot.intake.stopIntakeMotor();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.intake.stopIntakeMotor();
    }

    protected void interrupted() {
    	Robot.intake.stopIntakeMotor();
    }
}
