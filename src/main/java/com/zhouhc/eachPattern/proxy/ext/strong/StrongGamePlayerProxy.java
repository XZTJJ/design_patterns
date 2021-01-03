package com.zhouhc.eachPattern.proxy.ext.strong;

/**
 * 强代理者
 */
public class StrongGamePlayerProxy implements InterfaceStrongGamePlayer {
    //被代理者
    private InterfaceStrongGamePlayer strongGamePlayer;

    // 构造函数
    public StrongGamePlayerProxy(InterfaceStrongGamePlayer strongGamePlayer) {
        this.strongGamePlayer = strongGamePlayer;
    }


    //实现逻辑，反正都是委托 给  strongGamePlayer
    @Override
    public InterfaceStrongGamePlayer getProxy() {
        return null;
    }

    @Override
    public void login(String name, String password) {
        this.strongGamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        this.strongGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.strongGamePlayer.upgrade();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
