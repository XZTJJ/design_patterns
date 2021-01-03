package com.zhouhc.eachPattern.bridge.stand;

/**
 * 抽象的工坊类，生成衣服，房子，ipod都要都工坊才行
 */
public abstract class Corp {
    //定义一个抽昂的产品对象。
    private Product product;

    //强制初始化构造函数
    public Corp(Product product) {
        this.product = product;
    }

    //公司是干什么的?赚钱
    public void makeMoney() {
        //公司所有的产品都是先生成的
        this.product.beProducted();
        //然后才销售的
        this.product.beSelled();
    }
}
