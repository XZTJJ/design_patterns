package com.zhouhc.eachPattern.state.stand;

/**
 * 关门状态类
 */
public class ClosingState extends AbstractLifeState {

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
     * 处于 关门状态   造成关门状态的原因是 ：关门动作，
     * 因此在 关门状态 的 关门动作 下做该状态的逻辑处理
     */
    @Override
    public void close() {
        this.closeMethod();

    }

    /**
     * 处于 关门状态  可以运行
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
     * 处于 关门状态  可以停止
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

    private void closeMethod() {
        System.out.println("电梯门关闭了...");
    }
}
