package com.zhouhc.eachPattern.builder.desc.code;

/**
 *具体的实现类
 */
public class ConcreteBuilder extends AbstractBuilder {
    private AbstractProduct abstractProduct = new ConcreteProduct();

    /**
     * 设置产品的零部件，调用具体的产品内部逻辑
     */
    @Override
    public void setPart() {
        abstractProduct.doSomething();
    }

    /**
     *
     * 返回对应的一个产品，并不是是写的成员变量。这里只是为了方便
     * 所以返回一个产品
     */
    @Override
    public AbstractProduct builderProduct() {
        return abstractProduct;
    }
}
