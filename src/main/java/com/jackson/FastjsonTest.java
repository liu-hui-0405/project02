package com.jackson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FastjsonTest {
    public static void main(String[] args) {

        Student student = new Student(1, "小明", new Date());
        //JSON.toJSONString(obj/array)	将 JSON 对象或 JSON 数组转化为字符串
        String jsonStr = JSON.toJSONString(student);
        System.out.println("对象转json" + jsonStr);
        //System.out.println(JSONObject.toJSONString(student));

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        System.out.println("json转对象" + jsonStr);
        //System.out.println("JSONObject.parseObject---" + JSONObject.parseObject(jsonStr, Student.class));

        List<Student> list = new ArrayList<Student>(){{
            add(new Student(2, "bb", new Date()));
            add(new Student(3, "cc", new Date()));
        }};
        String jsonStr4 = JSONObject.toJSONString(list);
        System.out.println(jsonStr4);
        List<Student> students = JSONObject.parseArray(jsonStr4, Student.class);
        System.out.println(students);
        JSONArray objects = JSONObject.parseArray(jsonStr4);
        System.out.println(objects);

        //JSONObject jsonObj = JSON.parseObject(jsonStr);
        //System.out.println("将字符串解析JSON对象" + jsonObj);
        //
        //JSONArray jsonArr = JSON.parseArray("[\"菜鸟教程\",\"RUNOOB\"]\n");
        //System.out.println("将字符串解析JSON数组" + jsonArr);
    }
}
