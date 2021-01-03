package com.zhouhc.eachPattern.strategy.desc.code;

/**
 * 策略的 上下文类
 */
public class Context {
    //策略成员
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action() {
        this.strategy.exection();
    }
}
