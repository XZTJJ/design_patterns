package com.zhouhc.eachPattern.strategy.desc.code;

/**
 * 具体的策略A
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void exection() {
        System.out.println("策略B执行了");
    }
}
