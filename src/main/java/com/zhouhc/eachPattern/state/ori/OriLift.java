package com.zhouhc.eachPattern.state.ori;

import com.zhouhc.eachPattern.state.comm.ILift;

/**
 * 原始的电梯类型
 * 方法体里面包含大量的switch...case...
 * 这样扩展性是非常的差的
 */
public class OriLift implements ILift {
    //电梯的状态
    public final static int OPENING_STATE = 1; //开门状态；
    public final static int CLOSING_STATE = 2; //关门状态；
    public final static int RUNNING_STATE = 3; //运行门状态；
    public final static int STOPING_STATE = 4; //停止门状态；

    public OriLift() {

    }

    //标识电梯的转态
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    //开门动作
    @Override
    public void open() {

        switch (this.state) {
            // 处于 开门转态 什么都不做
            case OPENING_STATE:
                break;
            // 处于 闭门转态 可以开门
            case CLOSING_STATE:
                this.state = OPENING_STATE;
                this.openMethod();
                break;
            // 处于 运行转态 不能开门
            case RUNNING_STATE:
                break;
            // 处于 停止转态 可以开门
            case STOPING_STATE:
                this.state = OPENING_STATE;
                this.openMethod();
                break;
        }
    }

    //关门动作
    @Override
    public void close() {

        switch (this.state) {
            // 处于 开门转态 可以关门
            case OPENING_STATE:
                this.state = CLOSING_STATE;
                this.closeMethod();
                break;
            // 处于 闭门转态 门本来就是关的什么都不做
            case CLOSING_STATE:
                break;
            // 处于 运行转态 门本来就是关的什么都不做
            case RUNNING_STATE:
                break;
            // 处于 停止转态 门本来就是关的什么都不做
            case STOPING_STATE:
                break;
        }
    }

    //运行动作
    @Override
    public void run() {

        switch (this.state) {
            // 处于 开门转态  不能运行
            case OPENING_STATE:
                break;
            // 处于 闭门转态 可以运行
            case CLOSING_STATE:
                this.state = RUNNING_STATE;
                this.runMethod();
                break;
            // 处于 运行转态  什么都不做
            case RUNNING_STATE:
                break;
            // 处于 停止转态 可以运行
            case STOPING_STATE:
                this.state = RUNNING_STATE;
                this.runMethod();
                break;
        }
    }

    //停止动作
    @Override
    public void stop() {

        switch (this.state) {
            // 处于 开门转态  不能停止
            case OPENING_STATE:
                break;
            // 处于 闭门转态 可以停止
            case CLOSING_STATE:
                this.state = STOPING_STATE;
                this.stopMethod();
                break;
            // 处于 运行转态  可以停止
            case RUNNING_STATE:
                this.state = STOPING_STATE;
                this.stopMethod();
                break;
            // 处于 停止转态 什么都不做
            case STOPING_STATE:
                break;
        }
    }

    //设置开门方法处理逻辑
    private void openMethod() {
        System.out.println("电梯开门了...");
    }

    //关门方法处理逻辑
    private void closeMethod() {
        System.out.println("电梯关门了...");
    }

    //运行方法处理逻辑
    private void runMethod() {
        System.out.println("电梯运行了...");
    }

    //停止方法处理逻辑
    private void stopMethod() {
        System.out.println("电梯停止了...");
    }
}
