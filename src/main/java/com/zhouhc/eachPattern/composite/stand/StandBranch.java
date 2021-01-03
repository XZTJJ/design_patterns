package com.zhouhc.eachPattern.composite.stand;

import java.util.ArrayList;
import java.util.List;

/**
 * 对应公司的领导人物
 */
public class StandBranch extends StandEmployee {
    //下属信息
    private List<StandEmployee> subordinate = new ArrayList<StandEmployee>();

    //显示构造函数
    public StandBranch(String postion, String name, double salary) {
        super(postion, name, salary);
    }

    //对应的getter 和 setter方法
    public List<StandEmployee> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<StandEmployee> subordinate) {
        this.subordinate = subordinate;
    }

    //对应的添加方法
    public void addSubordinate(StandEmployee employee) {
        this.subordinate.add(employee);
    }
}
