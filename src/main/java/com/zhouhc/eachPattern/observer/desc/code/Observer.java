package com.zhouhc.eachPattern.observer.desc.code;

/**
 * 观察者 ，抽象类，模拟
 * <p>
 * 其实JDK中已经提供了 观察者模式了
 * Observable 就是被观察者类(一个具体的实现类)
 * Observer 观察者接口
 * 因此一般可以直接使用了
 */
public interface Observer {
    //实现方法
    public void update(Object obj);
}
