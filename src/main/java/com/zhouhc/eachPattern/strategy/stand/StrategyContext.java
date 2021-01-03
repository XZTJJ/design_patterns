package com.zhouhc.eachPattern.strategy.stand;

import com.zhouhc.eachPattern.strategy.comm.IStrategy;

/**
 * 策略模式的上下文
 */
public class StrategyContext {
    private IStrategy iStrategy;

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void exction() {
        iStrategy.action();
    }
}
