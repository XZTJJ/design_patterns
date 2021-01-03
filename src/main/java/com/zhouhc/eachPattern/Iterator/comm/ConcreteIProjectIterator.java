package com.zhouhc.eachPattern.Iterator.comm;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的迭代器实现类
 *
 */
public class ConcreteIProjectIterator implements IProjectIterator {
    //对象
    protected List dataList = new ArrayList();
    //当前游标
    protected int currentIndex;

    public ConcreteIProjectIterator(List dataList) {
        this.dataList = dataList;
        this.currentIndex = 0;
    }

    //判断是否还有后面的元素
    public boolean hasNext() {
        if (null != this.dataList && currentIndex < dataList.size())
            return true;
        else
            return false;
    }

    //获取下一个元素
    public Object next() {
        return this.dataList.get(currentIndex++);
    }

    //删除当前元素
    public boolean delete() {
        //不实现
        return false;
    }
}
