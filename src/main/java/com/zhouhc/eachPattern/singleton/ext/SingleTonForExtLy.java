package com.zhouhc.eachPattern.singleton.ext;

//懒汉式
public class SingleTonForExtLy {
    //模拟获取方式 ，方式1的
    public SingleTonForExtLyA getInstanceA() {
        return SingleTonForExtLyA.getInstance();
    }
    //模拟获取方式 ，方式2的
    public SingleTonForExtLyB getInstanceB() {
        return SingleTonForExtLyB.getInstance();
    }
}

/**
 * 懒加载的第一种方式
 */
class SingleTonForExtLyA {
    // volatile 是为了可见性，不加的话，多线程下部分线程可能看到的是 instance 部分实例
    private static volatile SingleTonForExtLyA singleTonForExtLyA;

    //构造函数私有
    private SingleTonForExtLyA() {
    }

    //获取实例的方式
    public static SingleTonForExtLyA getInstance() {
        //volatile 会强制从主内存中同步
        if (singleTonForExtLyA == null) {
            synchronized (SingleTonForExtLyA.class) {
                if (singleTonForExtLyA == null)
                    singleTonForExtLyA = new SingleTonForExtLyA();
            }
        }
        return singleTonForExtLyA;
    }
}


/**
 * 懒加载的第二种方式
 */
class SingleTonForExtLyB {

    //私有静态内部类
    private static class SingleTonForExtLyBInnerClass {
        public static SingleTonForExtLyB singleTonForExtLyB = new SingleTonForExtLyB();
    }

    //获取实例的方式
    public static SingleTonForExtLyB getInstance() {
        return SingleTonForExtLyBInnerClass.singleTonForExtLyB;
    }
}