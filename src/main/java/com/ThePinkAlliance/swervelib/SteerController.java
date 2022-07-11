package com.ThePinkAlliance.swervelib;

public interface SteerController {
  double getReferenceAngle();

  double getStateAngle();

  void setReferenceAngle(double referenceAngleRadians);
}
