package com.zhouhc.eachPattern.responsibilityChain.comm;

/**
 * 抽象处理类
 *
 * 采用古代的"三从四德"的方式，
 * 所有请求都需要经过批准
 */
public interface IOriHandler {

    public void response();
}
