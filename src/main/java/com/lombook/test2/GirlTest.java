package com.lombook.test2;

/**
 * @ClassName: GirlTest
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2020/6/16
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/16
 * @UpdateRemark: UpdateRemark
 */
public class GirlTest {
    public static void main(String[] args) {
        Girl girl = new Girl(1, "aa", 20);
        Girl girl2 = new Girl(2, "bb", 20);
        System.out.println(girl.equals(girl2));
    }
}
