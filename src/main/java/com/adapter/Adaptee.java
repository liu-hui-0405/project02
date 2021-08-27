package com.adapter;

/**
 * @ClassName: Adaptee
 * @Description: 适配者接口
 * @Author: LH
 * @CreateDate: 2020/6/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/30
 * @UpdateRemark: UpdateRemark
 */
public class Adaptee {
    void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
