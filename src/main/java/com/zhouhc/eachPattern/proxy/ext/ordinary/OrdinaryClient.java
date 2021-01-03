package com.zhouhc.eachPattern.proxy.ext.ordinary;

import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

/**
 * 普通代理类的客户端, 这种情况下是客户端是不需要 被代理者
 */
public class OrdinaryClient {
    public static void main(String[] args) {
        InterfaceGamePlayer gamePlayerProxy = OrdinaryGamePlayerProxy.getInstance("张三");
        gamePlayerProxy.login("zhangsan","password");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
