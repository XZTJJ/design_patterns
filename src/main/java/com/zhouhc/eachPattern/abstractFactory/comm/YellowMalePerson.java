package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 黄人男性
 */
public class YellowMalePerson extends AbstractMalePerson {
    //显示初始化
    public YellowMalePerson() {
        super("小黄男");
    }

    public YellowMalePerson(String name) {
        super(name);
    }

    //特殊实现逻辑
    @Override
    public void HumanType() {
        System.out.println(super.name + "是一个黄人");
    }

    @Override
    public void HumanAction() {
        System.out.println(super.name + "爱劳动");
    }
}
