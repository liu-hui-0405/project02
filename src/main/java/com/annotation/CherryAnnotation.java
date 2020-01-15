package com.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CherryAnnotation {
    String name();
    int age() default 18;
    int[] score();
}
