package com.zhouhc.eachPattern.observer.stand;

import com.zhouhc.eachPattern.observer.comm.IHanFeiZi;
import com.zhouhc.eachPattern.observer.comm.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的韩非子类
 */
public class StandHanFeiZi implements IHanFeiZi {
    //具体的观察者
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子吃饭了");
        this.upate("韩非子吃饭了");
    }

    @Override
    public void havaFun() {
        System.out.println("韩非子娱乐了");
        this.upate("韩非子娱乐了");
    }

    //触发更新活动
    private void upate(String context) {
        for (Observer observer : observers)
            observer.update(context);
    }

    //添加观察者
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
}
