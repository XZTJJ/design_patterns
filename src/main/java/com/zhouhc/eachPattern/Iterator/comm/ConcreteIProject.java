package com.zhouhc.eachPattern.Iterator.comm;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的项目信息
 */
public class ConcreteIProject implements IProject {
    //成员变量
    private List<IProject> dataList = new ArrayList<IProject>();
    //人员数量
    private int num;
    //项目名称
    private String name;
    //花费
    private double cost;

    public ConcreteIProject() {
    }

    //对应的构造函数
    public ConcreteIProject(int num, String name, double cost) {
        this.num = num;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void add(int num, String name, double cost) {
        this.dataList.add(new ConcreteIProject(num, name, cost));
    }

    @Override
    public String getProject() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "项目名称:" + this.name + "\t项目人数:"
                + this.num + "\t项目花费:" + this.cost;
    }

    @Override
    public IProjectIterator getInterrator() {
        return new ConcreteIProjectIterator(this.dataList);
    }
}
