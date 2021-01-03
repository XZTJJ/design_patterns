package com.zhouhc.eachPattern.state.stand;

/**
 * 停止状态
 */
public class StopingState extends AbstractLifeState {


    /**
     * 处于 关门状态  可以开门
     * 会造成 状态 的改变，需要先改变 状态，
     * 然后在引起 该状态的  动作 的
     * 方法体内做特定逻辑处理
     */
    @Override
    public void open() {
        super.LiftStateContext.setLifeState(LiftStateContext.OPENINGSTATE);
        super.LiftStateContext.open();
    }


    /**
     * 处于 停止状态  不可以关门
     */
    @Override
    public void close() {


    }

    /**
     * 处于 停止状态  可以运行
     * 会造成 状态 的改变，需要先改变 状态，
     * 然后在引起 该状态的  动作 的
     * 方法体内做特定逻辑处理
     */
    @Override
    public void run() {
        super.LiftStateContext.setLifeState(LiftStateContext.RUNNINGSTATE);
        super.LiftStateContext.run();
    }


    /**
     * 处于 停止状态   造成停止状态的原因是 ：停止动作，
     * 因此在 停止状态 的 停止动作 下做该状态的逻辑处理
     */
    @Override
    public void stop() {
        this.stopMethod();
    }

    private void stopMethod() {
        System.out.println("电梯门停止了...");
    }
}
