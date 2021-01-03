package com.zhouhc.eachPattern.state.desc.code;

/**
 * 抽象的状态类，定义一些基础的方法
 * 一般包含一个上下文类，在上下文类中
 * 进行状态的切换
 */
public abstract class State {
    //上下文类，状态切换的关键，子类也需要方法
    protected Context context;

    //修改上下文类，在上下文类中会调用
    public void setContext(Context context) {
        this.context = context;
    }

    //行为1
    public abstract void handler1();

    //行为2
    public abstract void handler2();
}
