package com.zhouhc.eachPattern.state.stand;

/**
 * 开门状态类
 */
public class OpeningState extends AbstractLifeState {


    /**
     *  处于 开门状态   造成开门状态的原因是 ：开门动作，
     *   因此在 开门状态 的 开门动作 下做该状态的逻辑处理
     *
      */
    @Override
    public void open() {
        this.openMethod();
    }

    /**
     *  处于 开门状态  可以关门
     *  会造成 状态 的改变，需要先改变 状态，
     *  然后在引起 该状态的  动作 的
     *  方法体内做特定逻辑处理
      */
    @Override
    public void close() {
        //变成关门状态，调用具体的关门动作
        super.LiftStateContext.setLifeState(LiftStateContext.CLOSINGSTATE);

        super.LiftStateContext.close();
    }

    /**
     *  处于 开门状态   不可以运行
     *
     */
    @Override
    public void run() {

    }

    /**
     *  处于 开门状态  不可以停止
     *
     */
    @Override
    public void stop() {

    }

    private void openMethod() {
        System.out.println("电梯门打开了...");
    }
}
