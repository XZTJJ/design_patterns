package com.zhouhc.eachPattern.facade.comm;

/**
 * 抽象的 门面模式 简化 信封的实现过程
 * 增加 一项检查功能
 */
public interface IFacade {
    //写信的门面类
    public void letterFacade(String Context, String address);
}
