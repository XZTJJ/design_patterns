package com.zhouhc.eachPattern.observer.stand;

import com.zhouhc.eachPattern.observer.comm.Observer;

/**
 * 观察者的具体实现类 --- 王斯
 */
public class StandWangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王斯报告武老板:" + context);
    }
}
