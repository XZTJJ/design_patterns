package com.zhouhc.eachPattern.observer.stand;

import com.zhouhc.eachPattern.observer.comm.Observer;

/**
 * 观察者的具体实现类 --- 李斯
 */
public class StandLiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯报告秦老板:" + context);
    }
}
