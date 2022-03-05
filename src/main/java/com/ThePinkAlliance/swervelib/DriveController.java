package com.ThePinkAlliance.swervelib;

public interface DriveController {
  void setReferenceVoltage(double voltage);

  void configRampRate(double rampRate);

  double getStateVelocity();

  double getPosition();

  void reset();
}
