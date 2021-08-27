package com.adapter;

/**
 * @ClassName: ClassAdapterTest
 * @Description: 客户端代码
 * @Author: LH
 * @CreateDate: 2020/6/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/30
 * @UpdateRemark: UpdateRemark
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
