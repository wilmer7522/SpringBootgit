package com.electro.electro_app.infraestructure.utils.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy = ExistsByCountrynameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByCountryname {

    String message() default "ya exste en la base de datos, escoja otro username";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
