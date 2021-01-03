package com.zhouhc.eachPattern.observer.ori;

import com.zhouhc.eachPattern.observer.comm.IHanFeiZi;

/**
 * 具体的韩非子类
 */
public class OriHanFeiZI implements IHanFeiZi {

    private volatile boolean isEatBreakFast = false;
    private volatile boolean isFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子吃饭了");
        isEatBreakFast = true;
    }

    @Override
    public void havaFun() {
        System.out.println("韩非子娱乐了");
        isFun = true;
    }

    public boolean isEatBreakFast() {
        return isEatBreakFast;
    }

    public boolean isFun() {
        return isFun;
    }

    public void setEatBreakFast(boolean eatBreakFast) {
        isEatBreakFast = eatBreakFast;
    }

    public void setFun(boolean fun) {
        isFun = fun;
    }
}
