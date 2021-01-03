package com.zhouhc.eachPattern.adapter.desc.code;

/**
 * 对象适配模式:
 * 实现方式 : 实现目标角色，聚合所有的源角色的对象，来达到目标
 * 比较适合源角色是多个的情况，这种情况下不适合继承
 */
public class AdapterObject implements Target {
    private Adaptee adaptee;

    public AdapterObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.action();
    }
}
