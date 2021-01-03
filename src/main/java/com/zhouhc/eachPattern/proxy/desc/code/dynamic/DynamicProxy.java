package com.zhouhc.eachPattern.proxy.desc.code.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理实例 创建的地方
 */
public class DynamicProxy<T> {
    //原始版本的,需要传入多个参数
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces,
                                         InvocationHandler invocationHandler) {
        //检验是否符合连接点表达式，其实在 InvocationHandler 也可以有连接点
        if (true) {
            //执行前置的通知
            new BeforeAdvice().exec();
        }

        //生成代理对象
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }

    //简化版本的,只是传入一个参数
    public static <T> T newProxyInstance(Subject realSubjct) {
        //检验是否符合连接点表达式，其实在 InvocationHandler 也可以有连接点
        if (true) {
            //执行前置的通知
            new BeforeAdvice().exec();
        }
        //获取加载器 和 接口集合
        ClassLoader classLoader = realSubjct.getClass().getClassLoader();
        Class<?>[] interfaces = realSubjct.getClass().getInterfaces();
        //生成一个 InvocationHandler
        InvocationHandler invocationHandler = new MyInvocationHandler(realSubjct);
        //生成代理对象
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }

}
