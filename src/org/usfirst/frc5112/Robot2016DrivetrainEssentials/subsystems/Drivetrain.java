package org.usfirst.frc5112.Robot2016DrivetrainEssentials.subsystems;

import org.usfirst.frc5112.Robot2016DrivetrainEssentials.RobotMap;
import org.usfirst.frc5112.Robot2016DrivetrainEssentials.commands.drivetrainCommands.OperatorControl;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;


public class Drivetrain extends Subsystem {
    private final RobotDrive drivetrain = RobotMap.drivetraindrivetrain;
	private boolean invertedRotating = false;
	private double throttle = 0.7;
	private double turningThrottle = 0.7;
	private final double INITIAL_THROTTLE = 0.7;
	private final double FINAL_THROTTLE = 1.0;
	public double switchYSign = -1;

    public void initDefaultCommand() {
    	setDefaultCommand(new OperatorControl());
    }
    
    public void stopDrivetrain() {
    	drivetrain.stopMotor();
    }
    
    public void driveForwards(double speed) {
    	drivetrain.drive(speed, 0);
    }
    
    public void driveBackwards(double speed) {
    	driveForwards(-speed);
    }
    
    public void operatorControl(Joystick stick) {
    	if (stick.getRawButton(1)) {
			throttle = FINAL_THROTTLE;
		} else {
			throttle = INITIAL_THROTTLE;
		}
		if (!invertedRotating) {
			if (stick.getY() < -0.1 || stick.getY() > 0.1) {
				if (stick.getY() <= -0.1){
					drivetrain.arcadeDrive(((stick.getY() + 0.1) * 10 / 9 * throttle) * switchYSign, stick.getZ() * turningThrottle);
				}else {
					drivetrain.arcadeDrive(((stick.getY() - 0.1) * 10 / 9 * throttle) * switchYSign, stick.getZ() * turningThrottle);
				}
			} else {
				drivetrain.arcadeDrive(0, stick.getZ() * turningThrottle);
			}
		} else {
			if (stick.getY() < -0.1 || stick.getY() > 0.1) {
				if (stick.getY() <= -0.1){
					drivetrain.arcadeDrive(((stick.getY() + 0.1) * 10 / 9 * throttle) * switchYSign, stick.getZ()* -1 * turningThrottle);
				}else {
					drivetrain.arcadeDrive(((stick.getY() - 0.1) * 10 / 9 * throttle) * switchYSign, stick.getZ()* -1 * turningThrottle);
				}
			} else {
				drivetrain.arcadeDrive(0, stick.getZ() * turningThrottle * -1);
			}
		}
    }
}

