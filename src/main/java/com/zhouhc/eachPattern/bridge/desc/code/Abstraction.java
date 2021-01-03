package com.zhouhc.eachPattern.bridge.desc.code;

/**
 * 类似于工坊的存在，给产品生产提供场地等资源的支持
 */
public abstract class Abstraction {
    //定义对应的产品类对象
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    //自身的行为和属性
    public void request() {
        this.implementor.doSomething();
    }

    //获得实现化角色
    public Implementor getImplementor() {
        return this.implementor;
    }
}
