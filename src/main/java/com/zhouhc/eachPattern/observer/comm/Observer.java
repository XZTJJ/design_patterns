package com.zhouhc.eachPattern.observer.comm;

/**
 * 抽象接口
 */
public interface Observer {
    //只是负责更新
    public void update(String context);
}
