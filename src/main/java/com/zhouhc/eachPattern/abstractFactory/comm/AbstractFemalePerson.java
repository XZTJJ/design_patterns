package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 雌性抽象类
 */
public abstract class AbstractFemalePerson implements InterfacePerson {
    //表示
    protected String name;
    //强制子类显示初始化
    public AbstractFemalePerson(String name) {
        this.name = name;
    }
    //公用的抽象方法
    @Override
    public void HumanGender() {
        System.out.println(this.name + "是一名女性");
    }
}
