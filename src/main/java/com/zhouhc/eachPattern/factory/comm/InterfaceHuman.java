package com.zhouhc.eachPattern.factory.comm;

/**
 *
 * 通用接口,定义一个常用的方法
 *  整体的类架构为 : 一个接口，多个抽象类，每个抽象类对应一个实现类
 */
public interface InterfaceHuman {
    //属性
    public void humanType();
    //语言
    public void humanSay();
    //行为
    public void humanAction();
}
