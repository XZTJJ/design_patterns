package com.zhouhc.eachPattern.factory.comm;

/**
 * 黑色人种
 */
public abstract class AbstractBlackHuman implements InterfaceHuman {
    protected String name;

    //构造函数
    public AbstractBlackHuman(String name) {
        this.name = name;
    }

    @Override
    public void humanType() {
        System.out.println("我叫" + this.name + ",是一名黑种人");
    }

    @Override
    public void humanSay() {
        System.out.println("我叫" + this.name + ", 说话一般都是rap");
    }
}
