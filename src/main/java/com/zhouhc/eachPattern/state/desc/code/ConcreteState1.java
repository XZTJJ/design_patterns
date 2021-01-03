package com.zhouhc.eachPattern.state.desc.code;

/**
 * 具体的状态，只在引起本状态的动作方法下处理本状态的逻辑
 * 同时，负责状态的过渡，负责调用过渡状态的方法
 */
public class ConcreteState1 extends State {
    //只做本状态的逻辑处理
    @Override
    public void handler1() {
        //只做本状态的逻辑处理
    }

    /**
     * 状态过渡的处理逻辑,handler2动作可以将 state1
     * 状态变成 state2
     */
    @Override
    public void handler2() {
        //将上下文中的状态转成 state2
        super.context.setCurrentState(Context.STATE2);
        //并且调用 state2 对应的动作
        super.context.handler2();
    }
}
