package com.annotation;

public class Student {

    @CherryAnnotation(name = "小明", age = 23, score = {99, 88, 100})
    public void study(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Good Good Study, Day Day Up!");
        }
    }
}
