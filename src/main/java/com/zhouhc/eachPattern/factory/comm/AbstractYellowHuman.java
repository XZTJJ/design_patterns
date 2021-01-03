package com.zhouhc.eachPattern.factory.comm;

public abstract class AbstractYellowHuman implements InterfaceHuman {
    protected String name;

    public AbstractYellowHuman(String name) {
        this.name = name;
    }

    @Override
    public void humanType() {
        System.out.println("我叫" + this.name + ",是一名黄种人");
    }

    @Override
    public void humanSay() {
        System.out.println("我叫" + this.name + ",说话一般都是比较慢");
    }
}
