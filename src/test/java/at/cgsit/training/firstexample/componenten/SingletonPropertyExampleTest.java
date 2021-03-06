package at.cgsit.training.firstexample.componenten;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SingletonPropertyExampleTest {

  @Autowired
  SingletonPropertyExample singletonPropertyExample;

  @Test void simpleTestComponentEchoTest() {

    String message = singletonPropertyExample.getMessage();

    assertThat(message).isNotNull();

  }

}
