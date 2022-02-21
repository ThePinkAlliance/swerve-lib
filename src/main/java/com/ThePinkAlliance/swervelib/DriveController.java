package com.ThePinkAlliance.swervelib;

public interface DriveController {
  void setReferenceVoltage(double voltage);

  double getStateVelocity();

  double getPosition();

  void reset();
}
