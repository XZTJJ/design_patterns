package com.zhouhc.eachPattern.proxy.desc.code.dynamic;

/**
 * 高层代码
 */
public class Client {

    public static void main(String[] args) {
        Subject proxy = DynamicProxy.newProxyInstance(new RealSubject());
        proxy.doSomething("hahha");
    }
}
