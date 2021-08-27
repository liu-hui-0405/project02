package com.adapter;

/**
 * @ClassName: ObjectAdapterTest
 * @Description: 客户端代码
 * @Author: LH
 * @CreateDate: 2020/6/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/30
 * @UpdateRemark: UpdateRemark
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
