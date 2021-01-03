package com.zhouhc.eachPattern.bridge.desc.code;

/**
 * 某个具体的工坊类，每个工坊所能提供的材料是不一样的
 */
public class RefinedAbstraction extends Abstraction {
    //复写对应的构造函数
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 还可以添加父类的修改逻辑
     */
    @Override
    public void request() {
        super.request();
    }
}
