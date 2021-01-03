package com.zhouhc.eachPattern.adapter.desc.code;

/**
 * 具体的目标角色
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("具体的目标角色的实现类");
    }
}
