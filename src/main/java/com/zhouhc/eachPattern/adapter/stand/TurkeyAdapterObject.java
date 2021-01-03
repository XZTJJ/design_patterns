package com.zhouhc.eachPattern.adapter.stand;

import com.zhouhc.eachPattern.adapter.comm.Duck;
import com.zhouhc.eachPattern.adapter.comm.WildTurKye;

/**
 * 现在的需求 : 缺少鸭子对象，但是火鸡是足够的
 * 需要使用 火鸡 来冒充 鸭子
 *
 * 这是对象适配器模式
 */
public class TurkeyAdapterObject implements Duck {
    //火鸡成员变量
    private WildTurKye wildTurKye;

    public TurkeyAdapterObject(WildTurKye wildTurKye) {
        this.wildTurKye = wildTurKye;
    }

    @Override
    public void quack() {
        this.wildTurKye.gobble();
    }

    @Override
    public void gliding() {
        this.wildTurKye.fly();
    }
}
