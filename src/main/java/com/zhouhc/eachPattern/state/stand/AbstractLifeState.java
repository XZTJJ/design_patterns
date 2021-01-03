package com.zhouhc.eachPattern.state.stand;


/**
 * 抽象的电梯状态类，
 * 现在换另一种思路:
 * 当前状态的转换是由哪个动作引起的，
 * 当前状态下触发某个动作，状态会怎么转移
 * 因此需要每个状态下都要实现所有的动作，只不过在该状态下，某些动作无效
 * 每个转态都有对应的引起该转态的动作,一般需要在该动作下做该状态的处理逻辑
 * 其他动作引起状态转换的，先转换状态，再调用对应的状态动作。
 * 比如: 开门状态对应的动作是开门状态，应该在开门动作下实现开门状态的处理逻辑
 * 开门状态 下的 关门 动作，因先将电梯转成关门状态，在 关门状态 的关门动作下
 * 做对应的处理逻辑
 */
public abstract class AbstractLifeState {
    //电梯状态保存,方便子类使用
    protected StandLift LiftStateContext;

    public void setLiftStateContext(StandLift liftStateContext) {
        this.LiftStateContext = liftStateContext;
    }

    //罗列出所有动作
    //开门动作
    public abstract void open();

    //关门动作
    public abstract void close();

    //运行动作
    public abstract void run();

    //停止动作
    public abstract void stop();

}
