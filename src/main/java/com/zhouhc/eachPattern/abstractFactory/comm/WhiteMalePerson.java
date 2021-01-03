package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 白人男性
 */
public class WhiteMalePerson extends AbstractMalePerson {
    //显示构造函数
    public WhiteMalePerson() {
        super("小白男");
    }
    public WhiteMalePerson(String name) {
        super(name);
    }
    //特殊的逻辑
    @Override
    public void HumanType() {
        System.out.println(super.name + "是一个白人");
    }

    @Override
    public void HumanAction() {
        System.out.println(super.name + "爱冒险");
    }
}
