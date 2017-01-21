package org.usfirst.frc.team1405.robot;

import cpi.auto.AutoInputs;
import cpi.auto.AutoOutputs;
import cpi.auto.Auto_Drive;
import cpi.auto.SuperClass;
import cpi.auto.conditions.And;
import cpi.auto.inputDevices.Time;
import cpi.autoSupportClasses.AutonomousBase;
import cpi.autoSupportClasses.Set;

public class Autonomous extends AutonomousBase{
	static final String TEST_AUTO_MODE = "test_mode";
	static final String TEST_DRIVING   = "test_driving";
    static final String AUTO_EXP       = "experimental_auto";

	public static void robotInit(){
		AutoInputs.robotInit();
		AutoOutputs.robotInit();
		AutoInputs.resetGyro();
		Set.setDefault(TEST_DRIVING);
		Set.addName(TEST_AUTO_MODE);
		Set.addName(TEST_DRIVING);
        Set.addName(AUTO_EXP);
        System.out.println("Init");
	}

	public static void autonomousInit(){
		AutonomousInit();
		selectAutoMode(autoMode);
		System.out.println("Auto Init");
	}


	 public static void selectAutoMode(String mode){
		switch(mode){
		case(TEST_AUTO_MODE):
			Autonomous.testAutoMode();
			System.out.println("Wrong 1");
			break;
		case(TEST_DRIVING):
			//Autonomous.testDrive();
			Autonomous.experimentalAuto();
			System.out.println("Wrong 2");
			break;
        case(AUTO_EXP):
        	System.out.println("Case");
            Autonomous.experimentalAuto();
        	break; //so it'l line up
		}
	}


	/////////////////*			FULL AUTONOMOUS MODES			*////////////////////
	public static void testAutoMode(){
		autoStates = new SuperClass[][]{
			{ /*new And( , )*/ }};
	}

	public static void testDrive(){
		autoStates = new SuperClass[][]{
			{ new And(new Auto_Drive(.5), new Time(4)) }};
	}

    public static void experimentalAuto() {
    	System.out.println("Func");
        autoStates = new SuperClass[][]{
            { new And(new Auto_Drive(.5), new Time(6)) }};
  }
}    //Hello
