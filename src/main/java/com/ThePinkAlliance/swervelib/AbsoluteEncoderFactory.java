package com.ThePinkAlliance.swervelib;

@FunctionalInterface
public interface AbsoluteEncoderFactory<Configuration> {
  AbsoluteEncoder create(Configuration configuration);
}
