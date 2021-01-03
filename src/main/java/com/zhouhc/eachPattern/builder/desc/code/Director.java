package com.zhouhc.eachPattern.builder.desc.code;

/**
 * 导演类,可以有多个，
 */
public class Director {
    private AbstractBuilder builder = new ConcreteBuilder();

    //构建不同的产品
    public AbstractProduct getAProduct() {
        /**
         * 设置不同的零件，产生不同的产品
         */
        builder.setPart();
        return builder.builderProduct();
    }
}
