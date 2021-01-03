package com.zhouhc.eachPattern.proxy.ext.dynamic;

import com.zhouhc.eachPattern.proxy.comm.GamePlayer;
import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

import java.lang.reflect.Proxy;

/**
 * 动态代理的实现
 */
public class DynamicClient  {
    public static void main(String[] args) {
        //创建被代理者
        InterfaceGamePlayer gamePlayer = new GamePlayer("张三");
        ConcreteDynamicHandler concreteDynamicHandler = new ConcreteDynamicHandler(gamePlayer);
        //代理对象
        InterfaceGamePlayer gamePlayerProxy = (InterfaceGamePlayer)Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), new Class[]{InterfaceGamePlayer.class},
                concreteDynamicHandler);
        gamePlayerProxy.login("zhangsan","password");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
