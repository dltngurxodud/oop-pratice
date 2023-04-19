package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

  @DisplayName("패스워드를 초기화한다.")
  @Test
  void initPassword() {
      User user = new User();

      user.initPassword(new CorrectFixedPasswordGenerator());

      assertThat(user.getPassword()).isNotNull();
  }

  @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지 않는다.")
  @Test
  void initPasswordTest2() {
    User user = new User();

    user.initPassword(new WrongFixedPasswordGenerator());

    assertThat(user.getPassword()).isNull();
  }
}
