package com.zhouhc.eachPattern.proxy.ext.dynamic;

import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 具体的动态代理的实现类, 在Java已经有对应的实现了
 * 只需要直接使用就可以了,这里的动态代理的实现指的是
 * 所有需要委派给实现类的方法，都是由它负责委派的。
 * 其实就是利用放射就行处理的
 */
public class ConcreteDynamicHandler implements InvocationHandler {
    private InterfaceGamePlayer gamePlayer;

    public ConcreteDynamicHandler(InterfaceGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.gamePlayer, args);
    }
}
