package com.zhouhc.eachPattern.state.desc.code;

/**
 * 定义一个上下文类，只要负责上下文的切换
 * <p>
 * 不过上下文有两个不成文的约束:
 * 1.需要把状态对象声明为静态常量，有几个状态对象就声明几个静态常量
 * 2.上下文具有状态抽象角色定义的所有行为，具体执行使用委托行为
 */
public class Context {
    //定义状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    //当前状态
    private State CurrentState;

    //获取当前状态
    public State getCurrentState() {
        return CurrentState;
    }

    //设置当前状态
    public void setCurrentState(State currentState) {
        //切换状态
        this.CurrentState = currentState;
        //并且 为 对应的状态 设置 上下文
        this.CurrentState.setContext(this);
    }

    //行为委托
    public void handler1() {
        this.CurrentState.handler1();
    }

    public void handler2() {
        this.CurrentState.handler2();
    }
}
