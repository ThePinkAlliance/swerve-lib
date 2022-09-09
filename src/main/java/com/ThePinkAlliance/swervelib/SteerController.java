package com.ThePinkAlliance.swervelib;

import com.ctre.phoenix.motorcontrol.StatusFrame;

public interface SteerController {
  double getReferenceAngle();

  void setReferenceAngle(double referenceAngleRadians);

  void configureStatusFrame(StatusFrame frame, int period);

  double getStateAngle();
}
