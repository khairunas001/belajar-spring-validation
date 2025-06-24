package banganas.spring.belajar_spring_validation.Palindrome;

import banganas.spring.belajar_spring_validation.stringhelper.StringHelper;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class PalindromeValidator implements ConstraintValidator<Palindrome,String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPalindrome(value);
    }
}
