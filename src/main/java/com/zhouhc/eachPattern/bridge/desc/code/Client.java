package com.zhouhc.eachPattern.bridge.desc.code;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
