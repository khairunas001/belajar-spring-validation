package banganas.spring.belajar_spring_validation.stringhelper;

import org.springframework.stereotype.Component;

@Component
public class StringHelper {

    public boolean isPalindrome(String value){
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }

}
