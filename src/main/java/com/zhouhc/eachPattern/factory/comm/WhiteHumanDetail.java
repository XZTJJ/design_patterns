package com.zhouhc.eachPattern.factory.comm;

/**
 * 白种人的具体实现类
 */
public class WhiteHumanDetail extends AbstractWhiteHuman {

    public WhiteHumanDetail() {
        super("小白");
    }
    //父类构造函数
    public WhiteHumanDetail(String name) {
        super(name);
    }

    @Override
    public void humanAction() {
        System.out.println("我叫" + super.name + ", 我比较勤劳");
    }
}
