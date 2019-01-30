/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Abom extends Subsystem {
    Solenoid abomSolenoid;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Abom() {
        abomSolenoid = new Solenoid(RobotMap.ABOM_SOLENOID_PORT);
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    // Toggles between out and in for the solenoid
    public void toggle() {
        abomSolenoid.set(!abomSolenoid.get());
    }

    // Retracts the Solenoid
    public void stop() {
        abomSolenoid.set(false);
    }
}
