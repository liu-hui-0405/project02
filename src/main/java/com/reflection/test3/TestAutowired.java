package com.reflection.test3;

import java.util.stream.Stream;

/**
 * @ClassName: Test2
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/1/13
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/1/13
 * @UpdateRemark: UpdateRemark
 */
public class TestAutowired {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Class<? extends UserController> aClass = userController.getClass();
        UserService userService = new UserService();
        System.out.println(userService);

        Stream.of(aClass.getDeclaredFields()).forEach(f -> {
            if (null != f.getAnnotation(Autowired.class)) {
                f.setAccessible(true);
                // 获取属性类型
                Class<?> type = f.getType();
                try {
                    Object o = type.newInstance();
                    f.set(userController, o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        });
        System.out.println(userController.getUserService());
    }
}
