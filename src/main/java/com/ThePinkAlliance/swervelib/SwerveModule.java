package com.ThePinkAlliance.swervelib;

public interface SwerveModule {
  double getDriveVelocity();

  double getSteerAngle();

  double getDrivePosition();

  void resetDrive();

  void configRampRate(double rampRate);

  void set(double driveVoltage, double steerAngle);
}
