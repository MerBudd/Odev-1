// Intake Main

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class Intake extends SubsystemBase {
  TalonFX krakenIntake = new TalonFX(1);

  /** Creates a new Intake. */
  public TalonFX mIntakeMotor;
  
  public Intake() {
    mIntakeMotor = new TalonFX(1);
}

  public void setSpeed(double speed) {
    krakenIntake.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}