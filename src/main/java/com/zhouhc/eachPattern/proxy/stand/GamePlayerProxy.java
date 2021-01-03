package com.zhouhc.eachPattern.proxy.stand;

import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;
import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayerProxy;

/**
 * 最常规和最普通的代理模式
 */
public class GamePlayerProxy implements InterfaceGamePlayer, InterfaceGamePlayerProxy {
    private InterfaceGamePlayer gamePlayer;
    private int money = 0;

    public GamePlayerProxy(InterfaceGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
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
        this.makeMoney();
    }

    //升一级10块钱
    @Override
    public void makeMoney() {
        this.money += 10;
        System.out.println("一共得到了 $" + this.money);
    }
}
