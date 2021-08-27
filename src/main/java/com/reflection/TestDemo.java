package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: TestDemo
 * @Description: Class.getMethod():获取当前类及所有继承的父类的public修饰的方法。仅包括public
 *              Class.getDeclaredMethod():获取当前类的所有方法，包括public/private/protected/default修饰的方法。
 * @Author: LH
 * @CreateDate: 2020/10/22
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/22
 * @UpdateRemark: UpdateRemark
 */
public class TestDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException, NoSuchFieldException, InvocationTargetException {
        Class c = TestBase.class;

        // parameter type is null
        Method m = c.getDeclaredMethod("say", null);
        System.out.println("method = " + m.toString());

        // method String
        Method lMethod = c.getDeclaredMethod("say", String.class);
        System.out.println("method = " + lMethod.toString());
    }
}