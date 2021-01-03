package com.zhouhc.eachPattern.adapter.desc.code;

/**
 * 目标客户端
 */
public class Client {
    public static void main(String[] args) {
        Target oriTarget = new ConcreteTarget();
        oriTarget.request();
        Target classTarget = new AdapterClass();
        classTarget.request();
        Target objectTarget = new AdapterObject(new Adaptee());
        objectTarget.request();
    }
}
