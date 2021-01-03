package com.zhouhc.eachPattern.strategy.comm;

/**
 * 吴国太开绿灯，放行
 */
public class GiveGreenLight implements IStrategy {
    @Override
    public void action() {
        System.out.println("吴国太帮忙开后门了");
    }
}
