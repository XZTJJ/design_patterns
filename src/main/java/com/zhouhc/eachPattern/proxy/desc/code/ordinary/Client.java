package com.zhouhc.eachPattern.proxy.desc.code.ordinary;

/**
 * 简单使用
 */
public class Client {
    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.request();
    }
}
