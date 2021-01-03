package com.zhouhc.eachPattern.observer.desc.code;

/**
 * 情景类
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //添加观察者
        concreteSubject.addObserver(new ConcreteObserver());
        //具体实现
        concreteSubject.doSomething();
    }
}
