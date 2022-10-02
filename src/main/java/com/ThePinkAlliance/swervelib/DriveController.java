package com.ThePinkAlliance.swervelib;

import com.ctre.phoenix.motorcontrol.StatusFrame;

public interface DriveController {
  void setReferenceVoltage(double voltage);

  void configRampRate(double rampRate);

  void configureStatusFrame(StatusFrame frame, int period);

  void configureZeroState(ZeroState state);

  double getStateVelocity();

  double getPosition();

  void reset();
}
