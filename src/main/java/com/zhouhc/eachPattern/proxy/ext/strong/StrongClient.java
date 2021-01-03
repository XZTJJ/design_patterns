package com.zhouhc.eachPattern.proxy.ext.strong;

/**
 * 强代理类
 */
public class StrongClient {

    public static void main(String[] args) {
        //指定对象
        InterfaceStrongGamePlayer gamePlayer  = new StrongGamePlayer("张三");
        InterfaceStrongGamePlayer gamePlayerProxy = gamePlayer.getProxy();
        //指定方法
        gamePlayer.login("zhangsan","123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

    }
}
