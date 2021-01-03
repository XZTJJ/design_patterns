package com.zhouhc.eachPattern.adapter.comm;

import com.zhouhc.eachPattern.adapter.comm.Turkey;

/**
 * 火鸡对象
 */
public class WildTurKye implements Turkey {
    @Override
    public void gobble() {
        System.out.println("火鸡的叫声是咯咯咯的");
    }

    @Override
    public void fly() {
        System.out.println("火鸡能短暂的飞行");
    }
}
