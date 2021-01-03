package com.zhouhc.eachPattern.proxy.comm;

/**
 *  游戏玩家的抽象接口
 */
public interface InterfaceGamePlayer {
    //登录接口
    public void login(String name ,String password);
    //打怪接口
    public void killBoss();
    //升级接口
    public void upgrade();
}
