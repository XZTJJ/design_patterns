package com.zhouhc.eachPattern.adapter.desc.code;

/**
 * 类适配模式:
 * 一般是通过继承源角色，实现目标角色，
 * 这样就转换成需要的目标角色了
 */
public class AdapterClass extends Adaptee implements Target {
    @Override
    public void request() {
        super.action();
    }
}
