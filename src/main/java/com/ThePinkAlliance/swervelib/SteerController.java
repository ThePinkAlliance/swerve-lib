package com.ThePinkAlliance.swervelib;

public interface SteerController {
  double getReferenceAngle();

  void setReferenceAngle(double referenceAngleRadians);

  double getStateAngle();
}
