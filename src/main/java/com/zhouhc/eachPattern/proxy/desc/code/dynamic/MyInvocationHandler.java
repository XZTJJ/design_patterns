package com.zhouhc.eachPattern.proxy.desc.code.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的 的  InvocationHandler , 是联系 被代理者 和 代理者 之间的桥梁
 * 必须持有 被代理者实例才行
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理者 实例
    private Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *  参数说明一下
     *  proxy其实是 代理者 实例 ，
     *
     *  method 实际要调用的方法
     *
     *  args 方法调用需要的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.realSubject,args);
    }
}
