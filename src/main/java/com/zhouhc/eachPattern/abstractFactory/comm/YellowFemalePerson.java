package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 黄人女性
 */
public class YellowFemalePerson extends AbstractFemalePerson {
    //强制构造函数
    public YellowFemalePerson() {
        super("小黄女");
    }

    public YellowFemalePerson(String name) {
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
