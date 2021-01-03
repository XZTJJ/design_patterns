package com.zhouhc.eachPattern.observer.desc.code;

import java.util.Vector;

/**
 * 被观察者 ，抽象类，模拟
 * <p>
 * 其实JDK中已经提供了 观察者模式了
 * Observable 就是被观察者类(一个具体的实现类)
 * Observer 观察者接口
 * 因此一般可以直接使用了
 */
public abstract class Subject {
    //定义观察者组
    private Vector<Observer> observers = new Vector<Observer>();

    //增加和删除观察者
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void delObserver(Observer observer) {
        this.observers.remove(observer);
    }

    //通知方法
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(null);
    }
}
