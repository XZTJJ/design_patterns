package com.zhouhc.eachPattern.templateMethod.comm;

public class HummerModelB extends AbstractHummerModel {

    public HummerModelB() {
        super("HummerB系列车");
    }

    @Override
    protected void start() {
        System.out.println(super.name + "启动了");
    }

    @Override
    protected void stop() {
        System.out.println(super.name + "停止了");
    }

    @Override
    protected void upDown() {
        System.out.println(super.name + "加速了");
    }

    @Override
    protected boolean isUpDown() {
        return false;
    }

    @Override
    protected void slowDown() {
        System.out.println(super.name + "减速了");
    }

    @Override
    protected boolean isSlowDown() {
        return false;
    }

    @Override
    protected void blow() {
        System.out.println(super.name + "鸣笛了");
    }
}
