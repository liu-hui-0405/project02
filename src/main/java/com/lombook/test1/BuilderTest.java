package com.lombook.test1;

public class BuilderTest {
    public static void main(String[] args) {
        // @Builder注解赋值新对象
        Student student = Student.builder()
                .id(111)
                .name("aaaa")
                .build();

        // @Builder注解修改原对象的属性值
        // 修改实体，要求实体上添加@Builder(toBuilder=true)
        Student student2 = student.toBuilder()
                .name("bbbbb")
                .build();
        System.out.println(student); // Student(id=111, name=aaaa)
        System.out.println(student2); // Student(id=111, name=bbbbb)
    }
}
