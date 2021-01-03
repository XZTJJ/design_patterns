package com.zhouhc.eachPattern.state.stand;


import com.zhouhc.eachPattern.state.comm.ILift;

/**
 * 电梯状态的上下文类
 */
public class StandLift implements ILift {
    //定义的状态 的上下文类
    private AbstractLifeState LifeState;
    //预先定义的几个状态
    public final static OpeningState OPENINGSTATE = new OpeningState();
    public final static ClosingState CLOSINGSTATE = new ClosingState();
    public final static RunningState RUNNINGSTATE = new RunningState();
    public final static StopingState STOPINGSTATE = new StopingState();

    //默认的初始状态
    public StandLift() {

    }

    //设置状态
    public void setLifeState(AbstractLifeState lifeState) {
        this.LifeState = lifeState;
        this.LifeState.setLiftStateContext(this);
    }

    /**
     * 状态的切换，也就是真正触发状态的动作, 其实是委托给各个具体的状态的实现对象进行实现的
     */
    //开门动作
    public void open() {
        this.LifeState.open();
    }

    //关门动作
    public void close() {
        this.LifeState.close();
    }

    //运行动作
    public void run() {
        this.LifeState.run();
    }

    //停止动作
    public void stop() {
        this.LifeState.stop();
    }
}
