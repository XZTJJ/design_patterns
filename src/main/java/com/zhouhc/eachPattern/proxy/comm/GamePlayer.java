package com.zhouhc.eachPattern.proxy.comm;

/**
 * 游戏玩家的一个实现类
 */
public class GamePlayer implements InterfaceGamePlayer {
    //玩家标识
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

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
