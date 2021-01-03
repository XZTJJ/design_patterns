package com.zhouhc.eachPattern.singleton.stand;


/**
 * 标准的单例模式
 */
public class SingleTonForStand {
    //初始化就创建
    private static SingleTonForStand sd = new SingleTonForStand();
    //
    private static String name = "唯一";

    private SingleTonForStand() {

    }

    public static SingleTonForStand getInstance() {
        return sd;
    }

    public static void say() {
        System.out.println("获取对象 : " + sd + " , 中文标示 : " + name);
    }
}
