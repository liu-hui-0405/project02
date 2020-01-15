package com.annotation;


import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class stuClass = Class.forName("com.annotation.Student");
        Method stuMethod = stuClass.getMethod("study", int.class);
        if (stuMethod.isAnnotationPresent(CherryAnnotation.class)){
            System.out.println("Student类上配置了CherryAnnotation注解！");
            CherryAnnotation cherryAnnotation = stuMethod.getAnnotation(CherryAnnotation.class);
            System.out.println("name: " + cherryAnnotation.name() + ",age: " + cherryAnnotation.age() + ",score:" + cherryAnnotation.score()[0]);
        } else {
            System.out.println("Student类上没有配置CherryAnnotation注解！");
        }
    }
}
