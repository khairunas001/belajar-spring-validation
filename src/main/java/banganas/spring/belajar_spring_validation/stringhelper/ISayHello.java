package banganas.spring.belajar_spring_validation.stringhelper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ISayHello {

    // jika melakukanm kontrak interface annotasi validasinya harus ada di interfacenya,
    // jika tidak ada di interface maka class yang mengimplementasikkany akan mengubah datanya sehingga timbul error
    String sayHello(@NotBlank String name);
}
