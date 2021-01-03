package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 黑人女性，具体的实现类
 */
public class BlackFemalePerson extends AbstractFemalePerson {
    //显示初始化
    public BlackFemalePerson() {
        super("小黑女");
    }

    public BlackFemalePerson(String name) {
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
