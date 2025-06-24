package banganas.spring.belajar_spring_validation.data;

import banganas.spring.belajar_spring_validation.Palindrome.Palindrome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Foo {

    @Palindrome
    private String bar;

}
