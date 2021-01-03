package com.zhouhc.eachPattern.Iterator.comm;

/**
 * 抽象的项目
 */
public interface IProject {
    //只需要知道相关相关信息
    public String getProject();

    //增加项目
    public void add(int num, String name, double cost);

    //获取迭代器
    public IProjectIterator getInterrator();

}
