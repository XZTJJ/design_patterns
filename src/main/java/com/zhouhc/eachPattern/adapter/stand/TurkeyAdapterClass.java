package com.zhouhc.eachPattern.adapter.stand;

import com.zhouhc.eachPattern.adapter.comm.Duck;
import com.zhouhc.eachPattern.adapter.comm.WildTurKye;

/**
 * 现在的需求 : 缺少鸭子对象，但是火鸡是足够的
 * 需要使用 火鸡 来冒充 鸭子
 *
 * 这是类适配器模式
 *
 */
public class TurkeyAdapterClass extends WildTurKye implements Duck {
    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void gliding() {
        super.fly();
    }
}
