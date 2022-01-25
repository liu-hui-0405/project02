package com.reflection.test1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: FieldTest
 * @Description: Field用于获取某个类的属性或该属性的属性值。
 * @Author: LH
 * @CreateDate: 2020/10/26
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/26
 * @UpdateRemark: UpdateRemark
 */
public class FieldTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, InstantiationException {

        System.out.println("--------------invoke()--------------");
        //java.lang.reflect.Method.invoke() 方法来反射调用一个方法，当然一般只用于正常情况下无法直接访问的方法（比如：private 的方法，或者无法或者该类的对象）。
        Class<?> aClass = Class.forName("com.reflection.test1.TestBase");
        TestBase testBase = (TestBase) aClass.newInstance();
        Method m = testBase.getClass().getDeclaredMethod("say");
        System.out.println(m.invoke(testBase));

        Method m2 = testBase.getClass().getDeclaredMethod("say", String.class);
        System.out.println(m2.invoke(testBase, "aaa"));

        //getType()： 获取属性声明时类型对象（返回class对象）
        //getGenericType() ： 返回属性声的Type类型
        System.out.println("----------getType(), getGenericType() -------------");

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field： " + field.getName());
            System.out.println("Type： " + field.getType().getCanonicalName());
            System.out.println("GenericType: " + field.getGenericType());
            System.out.println();
        }

        System.out.println("------------Field.set(), Field.get()--------------");
        System.out.println(aClass.getDeclaredField("str").get(testBase));

        Field a1 = aClass.getDeclaredField("a");
        //获取私有属性的属性值
        a1.setAccessible(true);
        a1.set(testBase, 11);
        System.out.println(a1.get(testBase));

        Field str = aClass.getDeclaredField("str");
        str.set(testBase, "hello,bbbb");
        System.out.println(str.get(testBase));
    }
}
