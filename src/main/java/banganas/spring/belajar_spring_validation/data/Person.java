package banganas.spring.belajar_spring_validation.data;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {

    @NotBlank
    private String id;

    @NotBlank
    private String name;
}
