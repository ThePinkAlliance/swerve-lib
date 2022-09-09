package com.ThePinkAlliance.swervelib;

import com.ctre.phoenix.motorcontrol.StatusFrame;

public interface SwerveModule {
  double getDriveVelocity();

  double getSteerAngle();

  void resetDrive();

  void configRampRate(double rampRate);

  void configureStatusFrame(StatusFrame frame, int period);

  double getDrivePosition();

  void set(double driveVoltage, double steerAngle);
}
