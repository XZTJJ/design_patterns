package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 雄性抽象类
 */
public abstract class AbstractMalePerson implements InterfacePerson {
    //标识
    protected String name;
    //强制子类显示初始化
    public AbstractMalePerson(String name) {
        this.name = name;
    }
    //共用的方法
    @Override
    public void HumanGender() {
        System.out.println(this.name + "是一名男性");
    }
}
