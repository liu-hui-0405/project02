package com.lombook.test1;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
public class Student {
    private int id;
    private String name;
}
