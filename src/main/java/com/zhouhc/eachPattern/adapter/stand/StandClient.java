package com.zhouhc.eachPattern.adapter.stand;

import com.zhouhc.eachPattern.adapter.comm.Duck;
import com.zhouhc.eachPattern.adapter.comm.WildTurKye;

/**
 * 客户端
 */
public class StandClient {
    public static void main(String[] args) {
        System.out.println("-----类适配器------");
        Duck duck1 = new TurkeyAdapterClass();
        duck1.quack();
        duck1.gliding();
        System.out.println("-----对象适配器------");
        Duck duck2 = new TurkeyAdapterObject(new WildTurKye());
        duck2.quack();
        duck2.gliding();
    }
}
