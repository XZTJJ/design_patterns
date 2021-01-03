package com.zhouhc.eachPattern.factory.comm;

/**
 * 白色人种，只是实现一些基本的方法
 */
public abstract class AbstractWhiteHuman implements InterfaceHuman {
    protected String name;

    public AbstractWhiteHuman(String name) {
        this.name = name;
    }

    @Override
    public void humanType() {
        System.out.println("我叫" + this.name + ",是一名白种人");
    }

    @Override
    public void humanSay() {
        System.out.println("我叫" + this.name + ", 说话比较快");
    }
}
