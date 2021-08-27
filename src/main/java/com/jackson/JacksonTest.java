package com.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JacksonTest {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //setDateFormat()：修改转换石的时间格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //1、对象与json字符串、byte数组
        Student student = new Student(1, "小明", new Date());
        String jsonStr = objectMapper.writeValueAsString(student);
        System.out.println("对象转为字符串：" + jsonStr);
        byte[] byteArr = objectMapper.writeValueAsBytes(student);
        System.out.println("对象转为byte数组：" + byteArr);

        Student stu = objectMapper.readValue(jsonStr, Student.class);
        System.out.println("json字符串转为对象：" + stu);
        Student stu2 = objectMapper.readValue(byteArr, Student.class);
        System.out.println("byte数组转为对象：" + stu2);

        System.out.println();
        //2、list集合与json字符串
        ArrayList<Student> stuList = new ArrayList<Student>(){{
            add(new Student(1, "aaa", new Date()));
            add(new Student(2, "bbb", new Date()));
        }};
        String jsonStr2 = objectMapper.writeValueAsString(stuList);
        System.out.println("集合转为字符串：" + jsonStr2);
        List<Student> list = objectMapper.readValue(jsonStr2, List.class);
        System.out.println("字符串转集合：" + list);

        System.out.println();
        //3、map与json字符串
        Map<String, Object> map = new HashMap<String, Object>(){{
            put("id", 1);
            put("name", "aaa");
            put("date", new Date());
        }};
        String jsonMap = objectMapper.writeValueAsString(map);
        System.out.println("Map转为字符串：" + jsonMap);
        Map newMap = objectMapper.readValue(jsonMap, Map.class);
        System.out.println("字符串转Map：" + newMap);
    }
}
