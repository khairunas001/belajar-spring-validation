package banganas.spring.belajar_spring_validation;

import banganas.spring.belajar_spring_validation.stringhelper.SayHello;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SayHelloTest {

    @Autowired
    private SayHello sayHello;

    @Test
    void testSuccess() {
        String message = sayHello.sayHello("Wiwok detox");
        Assertions.assertEquals("Hello Wiwok detox", message);
    }

    @Test
    void testFailed() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            sayHello.sayHello("");
        });
    }

}
