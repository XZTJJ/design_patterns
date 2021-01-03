package com.zhouhc.eachPattern.singleton.desc.code;


public class Singleton {
    private static final Singleton singlton = new Singleton();

    //构造函数私有化
    private Singleton() {

    }

    //外界获取该对象的方式
    public static Singleton getSinglton() {
        return singlton;
    }

    //其他业务处理逻辑，尽量是static的
    public static void doSomething() {
        //to do
    }
}
