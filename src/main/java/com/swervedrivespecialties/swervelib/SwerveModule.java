package com.swervedrivespecialties.swervelib;

public interface SwerveModule {
  double getDriveVelocity();

  double getSteerAngle();

  void resetDrive();

  double getDrivePosition();

  void set(double driveVoltage, double steerAngle);
}
