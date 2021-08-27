package com.adapter;

/**
 * @ClassName: ClassAdapter
 * @Description: 类适配器类
 * @Author: LH
 * @CreateDate: 2020/6/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/30
 * @UpdateRemark: UpdateRemark
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
