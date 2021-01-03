package com.zhouhc.eachPattern.templateMethod.ori;

/**
 * 原始的对象方法
 */
public class OriHummerModelB {
    private String name = "HummerB系列车";

    //对象的启动
    public void start() {
        System.out.println(this.name + "启动了");
    }

    //对象的停止
    public void stop() {
        System.out.println(this.name + "停止了");
    }

    //对象的加速
    public void upDown() {
        System.out.println(this.name + "加速了");
    }

    //对象的减速
    public void slowDown() {
        System.out.println(this.name + "减速了");
    }

    //对象的鸣笛
    public void blow() {
        System.out.println(this.name + "启动了");
    }

    public void runStatus() {
        this.start();
        this.upDown();
        this.blow();
        this.slowDown();
        this.stop();
    }
}
