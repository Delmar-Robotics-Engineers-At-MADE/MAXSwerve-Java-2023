package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Claw extends SubsystemBase {
    private final CANSparkMax m_claw;

    public Claw() {
        m_claw = new CANSparkMax(DriveConstants.kClawCANId, MotorType.kBrushless);
    }
    
    public void in() {
        m_claw.set(-0.9);
    }

    public void out() {
        m_claw.set(0.5);
    }

    public void shoot() {
        m_claw.set(1);
    }

    public void stop() {
        m_claw.set(0);
    }
}
