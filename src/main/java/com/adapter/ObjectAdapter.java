package com.adapter;

/**
 * @ClassName: ObjectAdapter
 * @Description: 对象适配器类
 * @Author: LH
 * @CreateDate: 2020/6/30
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2020/6/30
 * @UpdateRemark: UpdateRemark
 */
public class ObjectAdapter implements Target {
    private com.adapter.Adaptee adaptee;

    public ObjectAdapter(com.adapter.Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
