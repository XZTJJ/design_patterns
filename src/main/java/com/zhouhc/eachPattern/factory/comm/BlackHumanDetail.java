package com.zhouhc.eachPattern.factory.comm;

/**
 * 黑种人的具体实现类
 */
public class BlackHumanDetail extends AbstractBlackHuman {

    public BlackHumanDetail() {
        super("小黑");
    }

    public BlackHumanDetail(String name) {
        super(name);
    }

    @Override
    public void humanAction() {
        System.out.println("我叫" + super.name + ", 我比较懒散");
    }
}
