package com.reflection.test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName: ConstructorTest
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/10/26
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/26
 * @UpdateRemark: UpdateRemark
 */
public class ConstructorTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.reflection.test1.TestBase");

        Constructor<?> constructor2 = aClass.getConstructor();
        System.out.println(constructor2);

        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        TestBase testBase = (TestBase)constructor.newInstance("ccc", 666);
        System.out.println(testBase.toString());
    }
}
