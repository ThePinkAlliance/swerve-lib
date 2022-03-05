package com.ThePinkAlliance.swervelib;

public interface SwerveModule {
  double getDriveVelocity();

  double getSteerAngle();

  void resetDrive();

  void configRampRate(double rampRate);

  double getDrivePosition();

  void set(double driveVoltage, double steerAngle);
}
