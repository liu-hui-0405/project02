package com.reflection;

import java.lang.reflect.Array;

/**
 * @ClassName: ArrayTest
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/10/26
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/26
 * @UpdateRemark: UpdateRemark
 */
public class ArrayTest {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        Class<?> c = arr.getClass().getComponentType();

        System.out.println("数组类型： " + c.getName());
        int len = Array.getLength(arr);
        System.out.println("数组长度： " + len);
        System.out.print("遍历数组： ");
        for (int i = 0; i < len; i++) {
            System.out.print(Array.get(arr, i) + " ");
        }
        System.out.println();
        //修改数组
        System.out.println("修改前的第一个元素： " + Array.get(arr, 0));
        Array.set(arr, 0, 3);
        System.out.println("修改后的第一个元素： " + Array.get(arr, 0));
    }
}
