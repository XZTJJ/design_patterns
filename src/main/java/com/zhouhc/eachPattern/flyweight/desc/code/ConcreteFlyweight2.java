package com.zhouhc.eachPattern.flyweight.desc.code;

/**
 * 具体的享元角色
 */
public class ConcreteFlyweight2 extends Flyweight {
    //外部状态不能被改变
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    //更加外部状态进行逻辑处理
    @Override
    public void operate() {

    }
}
