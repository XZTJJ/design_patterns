package com.zhouhc.eachPattern.proxy.ext.ordinary;

import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

/**
 * 普通代理 ： 就是被代理者 要知道 代理者的存在( 代理者和被代理者双方都是知道彼此的存在 )， 并且客户端只能访问代理角色，不能访问真实角色。
 * <p>
 * 被代理者的角色，一般不会主动创建，直接由 代理角色 创建就好
 */
public class OrdinaryGamePlayer implements InterfaceGamePlayer {
    //代理者角色
    private InterfaceGamePlayer gamePlayerProxy;
    //玩家标识
    private String name;

    //通过构造函数创建，显示指定代理角色 和玩家标识
    public OrdinaryGamePlayer(InterfaceGamePlayer gamePlayerProxy, String name) {
        this.gamePlayerProxy = gamePlayerProxy;
        this.name = name;
    }

    //方法的实现
    @Override
    public void login(String name, String password) {
        System.out.println(this.name + "玩家登录了, 登录账号为 : " + name + ", 密码为 : " + password);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "正在打怪...");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "升级了...");
    }
}
