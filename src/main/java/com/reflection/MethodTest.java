package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/**
 * @ClassName: MethodTest
 * @Description: Method类位于java.lang.reflect包下, 在Java反射中Method类描述的是类的方法信息（包括：方法修饰符、方法名称、参数列表等等）。
 * @Author: LH
 * @CreateDate: 2020/10/26
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/26
 * @UpdateRemark: UpdateRemark
 */
public class MethodTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.reflection.TestBase");
        TestBase testBase = (TestBase) aClass.newInstance();
        Method say3 = aClass.getDeclaredMethod("say3", String.class, int.class);
        System.out.println("修饰符: " + Modifier.toString(say3.getModifiers()));
        System.out.println("返回值: " + say3.getReturnType());
        System.out.println("方法名称: " + say3.getName());
        System.out.println("参数列表: " + say3.getParameterTypes());
        String result = (String) say3.invoke(testBase, "xiaoming", 2);
        System.out.println("调用say2后的运行结果:" + result);

        System.out.println();
        System.out.println("----------getParameterTypes()------------");
        Class<?>[] parameterTypes = say3.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        System.out.println("----------getGenericParameterTypes()------------");
        Type[] genericParameterTypes = say3.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
        }
    }
}
