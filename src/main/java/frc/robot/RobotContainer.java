

package frc.robot;
import frc.robot.subsystems.Intake;
import frc.robot.commands.runKraken;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  Joystick dualsense5 = new Joystick(1);
  Intake motor = new Intake();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(dualsense5, 1).whileTrue(new runKraken(motor, 1));
    new JoystickButton(dualsense5, 2).whileTrue(new runKraken(motor, -1));
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
  }

  public Command getAutonomousCommand() {
    return null;
  }

}
