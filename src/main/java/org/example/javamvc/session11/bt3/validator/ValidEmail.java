package org.example.javamvc.session11.bt3.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
    String message() default "Email không đúng định dạng";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}