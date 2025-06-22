package banganas.spring.belajar_spring_validation;

import banganas.spring.belajar_spring_validation.data.Person;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Set;

@Slf4j
@SpringBootTest
public class ValidatorTest {

    @Autowired
    private Validator validator;


    @Test
    void testNotValid() {
        var person = new Person("", "");

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(2, constraintViolations.size());
        log.warn("constraintViolations.size() = {} -> merupakan jumlah violationnya",constraintViolations.size());

    }

    @Test
    void testValid() {
        var person = new Person("1", "Jokondo-Kondo");

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        Assertions.assertTrue(constraintViolations.isEmpty());
        Assertions.assertEquals(0, constraintViolations.size());
        log.warn("constraintViolations.size() = {} -> merupakan jumlah violationnya",constraintViolations.size());

    }
}
