package com.zhouhc.eachPattern.abstractFactory.desc.code;

/**
 * 抽象工厂类,是以产品为维度进行划分的
 */
public abstract class AbstractCreator {
    //创建A类产品
    public abstract AbstractProductA createProductA();
    //创建B类产品
    public abstract AbstractProductB createProductB();
}
