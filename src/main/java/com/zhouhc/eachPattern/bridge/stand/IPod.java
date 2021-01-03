package com.zhouhc.eachPattern.bridge.stand;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生成出的iPod是这来样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生成出的iPod卖出去了...");
    }
}
