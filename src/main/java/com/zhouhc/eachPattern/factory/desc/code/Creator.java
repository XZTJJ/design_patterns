package com.zhouhc.eachPattern.factory.desc.code;

/**
 * 抽象的工厂接口
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，输入的参数类型可以自行设置
     * 一般使用String, Enum, Class等
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
