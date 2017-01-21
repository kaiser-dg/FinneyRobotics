package org.usfirst.frc.team1405.robot;

import org.usfirst.frc.team1405.robot.Robot;
import cpi.outputDevices.MotorController;

public class Autotemp {
	static final double MAX_SPEED = 0.5;
	
	public Autotemp() {
		cpi.Drive.right1 =  new MotorController(3);
		cpi.Drive.right2 =  new MotorController(4);
		cpi.Drive.left1  =  new MotorController(1);
		cpi.Drive.left2  =  new MotorController(2);
	}
	
	public Boolean startR1(double Speed) {
		cpi.Drive.right1 = Speed;
	}
}
