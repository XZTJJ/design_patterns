package com.zhouhc.eachPattern.state.stand;

/**
 * 运行状态
 */
public class RunningState extends AbstractLifeState {


    /**
     * 处于 运行状态  不可以开门
     */
    @Override
    public void open() {

    }


    /**
     * 处于 运行状态  不可以关门
     *
     */
    @Override
    public void close() {

    }

    /**
     * 处于 运行状态   造成运行状态的原因是 ：运行动作，
     * 因此在 运行状态 的 运行动作 下做该状态的逻辑处理
     */
    @Override
    public void run() {
        this.runMethod();
    }

    /**
     * 处于 运行状态  可以停止
     * 会造成 状态 的改变，需要先改变 状态，
     * 然后在引起 该状态的  动作 的
     * 方法体内做特定逻辑处理
     */
    @Override
    public void stop() {
        //变成停止状态，调用具体的停止动作
        super.LiftStateContext.setLifeState(LiftStateContext.STOPINGSTATE);
        super.LiftStateContext.stop();
    }

    private void runMethod() {
        System.out.println("电梯门运行了...");
    }
}
