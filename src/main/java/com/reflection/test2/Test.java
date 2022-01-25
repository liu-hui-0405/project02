package com.reflection.test2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName: Test1
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/1/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/1/13
 * @UpdateRemark: UpdateRemark
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        UserController userController = new UserController();
        UserService userService = new UserService();
        System.out.println(userService);

        Class<? extends UserController> aClass = userController.getClass();
        Field serviceField = aClass.getDeclaredField("userService");
        serviceField.setAccessible(true);
        String serviceName = serviceField.getName();
        //拼接方法名
        serviceName = serviceName.substring(0, 1).toUpperCase() + serviceName.substring(1, serviceName.length());
        String setMethodName = "set" + serviceName;
        // 通过方法注入属性对象
        Method method = aClass.getMethod(setMethodName, UserService.class);
        method.invoke(userController, userService);
        System.out.println(userController.getUserService());
    }
}
