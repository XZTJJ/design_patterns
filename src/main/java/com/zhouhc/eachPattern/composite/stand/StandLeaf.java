package com.zhouhc.eachPattern.composite.stand;

/**
 * 具体的员工类，对应的就是公司的小喽啰
 * 抽象是为了更加方便的对这类人员进行扩展
 */
public class StandLeaf extends StandEmployee {
    //显示构造函数，其实不要需要复写
    public StandLeaf(String postion, String name, double salary) {
        super(postion, name, salary);
    }
}
