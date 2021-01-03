package com.zhouhc.eachPattern.flyweight.desc.code;

/**
 * 具体的享元角色
 */
public class ConcreteFlyweight1 extends Flyweight {
    //外部状态不能被改变
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    //更加外部状态进行逻辑处理
    @Override
    public void operate() {

    }
}
