package com.zhouhc.eachPattern.responsibilityChain.comm;

/**
 * 抽象妇女角色
 * <p>
 * 采用古代的"三从四德"的方式，
 * 所有请求都需要经过批准
 */
public interface IWomen {
    //类别 ,0表示未出嫁 1.表示出嫁，丈夫还在 3.表示出嫁，丈夫去世，孩子还在
    public int getType();

    //请求
    public void request(String str);
}
