package com.zhouhc.eachPattern.state.comm;

/**
 * 抽象电梯接口
 */
public interface ILift {
    //开门转态
    public void open();

    //关门转态
    public void close();

    //运行转态
    public void run();

    //停止转态
    public void stop();
}
