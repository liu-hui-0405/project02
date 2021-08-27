package com.reflection;

import java.util.Arrays;

/**
 * @ClassName: TestBase
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/10/22
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/10/22
 * @UpdateRemark: UpdateRemark
 */
public class TestBase {
    public String str = "hello,china!";

    private boolean[][] b = {{true, true}, {false, false}};

    private int a;

    public TestBase() {
    }

    public TestBase(String str, int a) {
        this.str = str;
        this.a = a;
    }

    protected String say() {
        return "hello,seo";
    }

    protected void say(String str) {
        this.str = str;
    }

    protected String say2(String str) {
        return "hello," + str;
    }

    protected String say3(String str1, int i) {
        return "hello," + str1 + i;
    }

    @Override
    public String toString() {
        return "TestBase{" +
                "str='" + str + '\'' +
                ", b=" + Arrays.toString(b) +
                ", a=" + a +
                '}';
    }
}
