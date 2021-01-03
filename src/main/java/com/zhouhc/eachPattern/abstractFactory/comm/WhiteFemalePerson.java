package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 白人女性 具体实现类
 */
public class WhiteFemalePerson extends AbstractFemalePerson {
    //显示初始化
    public WhiteFemalePerson() {
        super("小白女");
    }

    public WhiteFemalePerson(String name) {
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
