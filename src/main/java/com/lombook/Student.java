package com.lombook;

import lombok.*;

@Builder(toBuilder = true)
@Getter
@ToString
public class Student {
    private int id;
    private String name;
}
