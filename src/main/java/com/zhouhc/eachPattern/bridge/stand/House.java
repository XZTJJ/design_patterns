package com.zhouhc.eachPattern.bridge.stand;

/**
 * 具体的产品，房子类
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
