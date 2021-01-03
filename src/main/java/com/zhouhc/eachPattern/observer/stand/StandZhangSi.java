package com.zhouhc.eachPattern.observer.stand;

import com.zhouhc.eachPattern.observer.comm.Observer;

/**
 * 观察者的具体实现类 --- 张斯
 */
public class StandZhangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("张斯报告唐老板:" + context);
    }
}
