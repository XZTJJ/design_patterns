package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 黑人男性
 */
public class BlackMalePerson extends AbstractMalePerson {
    //显示构造逻辑
    public BlackMalePerson() {
        super("小黑男");
    }

    public BlackMalePerson(String name) {
        super(name);
    }

    //特殊实现逻辑
    @Override
    public void HumanType() {
        System.out.println(super.name + "是一个黑人");
    }

    @Override
    public void HumanAction() {
        System.out.println(super.name + "爱休息");
    }
}
