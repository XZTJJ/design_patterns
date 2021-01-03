package com.zhouhc.eachPattern.proxy.desc.code.ordinary;

/**
 * 代理者， 代理者必须知道被代理者
 */
public class ProxySubject implements Subject {
    private Subject realSubject ;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }
    //其实是委派给 被代理者 实现的
    @Override
    public void request() {
        this.realSubject.request();
    }
}
