package com.zhouhc.eachPattern.proxy.ext.ordinary;

import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

/**
 * 普通代理 ： 就是被代理者 要知道 代理者的存在(其实是双向的:因为代理者实际上所有的方法都是通过被代理者来实现的，是必须知道被代理者的)， 并且客户端只能访问代理角色，不能访问真实角色。
 * <p>
 * 代理者的角色
 */
public class OrdinaryGamePlayerProxy implements InterfaceGamePlayer {
    //被代理者角色，因为所有的方法实际就是它执行的
    private InterfaceGamePlayer gamePlayer;

    /**
     * 为了防止保存在创建的代理者的时候，把自己传递给被代理者
     * ，同时为了保证this 指针不逸出 构造函数私有
     */
    private OrdinaryGamePlayerProxy() {
    }

    //对外提供或者这个对象的方法,需要指定玩家的姓名
    public static OrdinaryGamePlayerProxy getInstance(String name) {
        //这样就可以防止 this 指针逸出了
        OrdinaryGamePlayerProxy ordinaryGamePlayerProxy = new OrdinaryGamePlayerProxy();
        ordinaryGamePlayerProxy.gamePlayer = new OrdinaryGamePlayer(ordinaryGamePlayerProxy, name);
        return ordinaryGamePlayerProxy;
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
