package com.eumn;

/**
 * @ClassName: EumnTest
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/6/23
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/23
 * @UpdateRemark: UpdateRemark
 */
public class EumnTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = PersonEumn.valueOf("Girl").getClassName();
        System.out.println(className);
        Class<?> aClass = Class.forName(className);
        System.out.println(aClass);
        Object o = aClass.newInstance();
        System.out.println(o);

    }
}
