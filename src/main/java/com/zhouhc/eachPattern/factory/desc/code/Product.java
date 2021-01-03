package com.zhouhc.eachPattern.factory.desc.code;

/**
 * 通过的产品类接口,可以考虑接口，抽象类
 * 也可以考虑一个接口，多个抽象类，每个抽象类都有一个实现类
 */
public abstract class Product {
    //产品的公共方法
    public void method1(){
        //公有逻辑处理
    }

    //抽象方法
    public abstract void method2();
}
