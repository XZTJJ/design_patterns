package com.zhouhc.eachPattern.strategy.desc.code;

/**
 * 具体的策略A
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void exection() {
        System.out.println("策略A执行了");
    }
}
