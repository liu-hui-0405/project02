package com.reflection.test1;

/**
 * @ClassName: IsPrimitiveTest
 * @Description: Class.isPrimitive()判定指定的Class对象是否表示一个Java的基类型（boolean、char、byte、short、int、long、float、double）。
 * @Author: LH
 * @CreateDate: 2020/10/26
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/26
 * @UpdateRemark: UpdateRemark
 */
public class IsPrimitiveTest {
    public static void main(String[] args) {
        String str = "abc";
        Class cls1 = str.getClass();
        Class cls2 = String.class;
        Class cls3 = null;//必须要加上null
        try {
            cls3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);

        System.out.println("cls1.isPrimitive(): " + cls1.isPrimitive());
        System.out.println("int.class.isPrimitive(): " + int.class.isPrimitive());//判定指定的 Class 对象是否表示一个基本类型。
        System.out.println(int.class == Integer.class);
        System.out.println(int.class == Integer.TYPE);
        System.out.println(int[].class.isPrimitive());
        System.out.println(int[].class.isArray());
    }
}
