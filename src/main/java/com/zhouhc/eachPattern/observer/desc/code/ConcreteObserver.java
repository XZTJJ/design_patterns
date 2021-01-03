package com.zhouhc.eachPattern.observer.desc.code;

/**
 * 具体观察者 ，模拟
 * <p>
 * 其实JDK中已经提供了 观察者模式了
 * Observable 就是被观察者类(一个具体的实现类)
 * Observer 观察者接口
 * 因此一般可以直接使用了
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Object obj) {
        System.out.println("接收到消息" + obj);
    }
}
