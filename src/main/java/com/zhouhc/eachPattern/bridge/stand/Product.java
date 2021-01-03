package com.zhouhc.eachPattern.bridge.stand;

/**
 * 抽象产品类，桥梁模式的关键是就是抽象
 */
public abstract class Product {
    //产品的生产
    public abstract void beProducted();

    //产品的销售
    public abstract void beSelled();
}
