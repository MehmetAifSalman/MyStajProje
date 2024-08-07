package com.stajProje.stajProje.anotations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomIntegerCheck {

    String message() default "Default message";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
