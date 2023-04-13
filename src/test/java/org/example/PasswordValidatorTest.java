package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class OopPraticeApplicationTests {

  @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
  @Test
  void validatePasswordTest() {
    assertThatCode(() -> PasswordValidator.validate("serverwizard")).doesNotThrowAnyException();;
  }

}

