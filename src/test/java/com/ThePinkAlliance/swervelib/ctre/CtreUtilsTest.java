package com.ThePinkAlliance.swervelib.ctre;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.ctre.phoenix.ErrorCode;
import org.junit.jupiter.api.Test;

class CtreUtilsTest {

  @Test
  void checkNeoError() {
    // assertThrows(
    //   RuntimeException.class,
    //   () -> CtreUtils.checkCtreError(ErrorCode.GeneralError, "")
    // );
    // assertThrows(
    //   RuntimeException.class,
    //   () ->
    //     CtreUtils.checkCtreError(ErrorCode.FirmVersionCouldNotBeRetrieved, "")
    // );
    // assertDoesNotThrow(() -> CtreUtils.checkCtreError(ErrorCode.OK, ""));
    //   RuntimeException.class,
    //   () -> CtreUtils.checkCtreError(ErrorCode.GeneralError, "")
    // );
    // assertThrows(
    //   RuntimeException.class,
    //   () ->
    //     CtreUtils.checkCtreError(ErrorCode.FirmVersionCouldNotBeRetrieved, "")
    // );
    // assertDoesNotThrow(() -> CtreUtils.checkCtreError(ErrorCode.OK, ""));
  }
}
