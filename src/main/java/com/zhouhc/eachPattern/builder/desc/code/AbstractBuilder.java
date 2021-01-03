package com.zhouhc.eachPattern.builder.desc.code;

/**
 * 抽象的建造者类
 */
public abstract class AbstractBuilder {
    //设置不同的产品类型
    public abstract void setPart();
    //建造产品
    public abstract AbstractProduct builderProduct();
}
