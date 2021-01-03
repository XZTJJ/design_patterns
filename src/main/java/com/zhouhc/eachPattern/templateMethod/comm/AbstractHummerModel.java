package com.zhouhc.eachPattern.templateMethod.comm;

/**
 * 抽象的方法模板方法，一个抽象类，多个具体的实现类
 */
public abstract class AbstractHummerModel {
    //车辆标识
    protected String name;

    public AbstractHummerModel(String name) {
        this.name = name;
    }

    //对象的启动
    protected abstract void start();

    //对象的停止
    protected abstract void stop();

    //对象的加速
    protected abstract void upDown();

    //是否可以加速
    protected boolean isUpDown() {
        return true;
    }

    //对象的减速
    protected abstract void slowDown();

    //是否可以加速
    protected boolean isSlowDown() {
        return true;
    }

    //对象的鸣笛
    protected abstract void blow();

    //是否可以加速
    protected boolean isBlow() {
        return true;
    }

    public final void runStatus() {
        this.start();
        if (this.isUpDown())
            this.upDown();
        if (this.isBlow())
            this.blow();
        if (this.isSlowDown())
            this.slowDown();
        this.stop();
    }
}
