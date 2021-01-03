package com.zhouhc.eachPattern.templateMethod.comm;

/**
 * 模板方式的一个实现
 */
public class HummerModelA extends AbstractHummerModel {

    public HummerModelA() {
        super("HummerA系列车");
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
    protected void slowDown() {
        System.out.println(super.name + "减速了");
    }

    @Override
    protected void blow() {
        System.out.println(super.name + "鸣笛了");
    }
}
