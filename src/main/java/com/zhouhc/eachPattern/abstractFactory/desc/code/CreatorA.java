package com.zhouhc.eachPattern.abstractFactory.desc.code;

/**
 * 抽象工程的实现类,只是负责创建产品的A分类
 */
public class CreatorA extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductAA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBA();
    }
}
