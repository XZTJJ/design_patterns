package com.zhouhc.eachPattern.factory.desc.code;

/**
 * 工厂接口的某个实现子类，可以有很多个子类
 */
public class ConcreteCreator extends Creator {

    /**
     * 简单使用，调用无参数的构造函数
     */
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
