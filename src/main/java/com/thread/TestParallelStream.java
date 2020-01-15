package com.thread;

import java.util.ArrayList;
import java.util.List;

public class TestParallelStream {
    public static void main(String[] args) {
        List<Student> data = new ArrayList<Student>();
        for (int i = 0; i <1000000; i++) {
            data.add(new Student(i, "aaaa"));
        }
        long before = System.currentTimeMillis();
        data.parallelStream().forEach(d -> d.setName("bbbb" + d.getName()));
        System.out.println(before);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - before);

        data.forEach(d -> d.setName("bbbb" + d.getName()));
        System.out.println(before);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - before);

    }

}
