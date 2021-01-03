package com.zhouhc.eachPattern.strategy.comm;

/**
 * 孙夫人断后
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void action() {
        System.out.println("有孙夫人断后,基本不用担心");
    }
}
