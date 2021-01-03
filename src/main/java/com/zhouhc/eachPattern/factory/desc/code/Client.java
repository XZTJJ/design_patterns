package com.zhouhc.eachPattern.factory.desc.code;

/**
 * 高层模块
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        //业务逻辑
        product.method1();
        product.method2();
    }
}
