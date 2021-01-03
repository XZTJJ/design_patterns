package com.zhouhc.eachPattern.abstractFactory.desc.code;

/**
 * 抽象工程的实现类,只是负责创建产品的B分类
 */
public class CreatorB extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductAB();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBB();
    }
}
