package com.zhouhc.eachPattern.factory.comm;

/**
 * 黄种人的具体实现类
 */
public class YellowHumanDetail extends AbstractYellowHuman {

    public YellowHumanDetail() {
        super("小黄");
    }

    public YellowHumanDetail(String name) {
        super(name);
    }

    public YellowHumanDetail(String firstName, Integer nameLength) {
        super(firstName + nameLength);
    }

    @Override
    public void humanAction() {
        System.out.println("我叫" + super.name + ", 我比较聪明");
    }
}
