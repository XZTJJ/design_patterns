package com.zhouhc.eachPattern.proxy.ext.strong;

import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

/**
 * 强代理接口，强制要实现一个获取代理接口
 */
public interface InterfaceStrongGamePlayer extends InterfaceGamePlayer {

    //强制获取代理类
    public InterfaceStrongGamePlayer getProxy();

}
