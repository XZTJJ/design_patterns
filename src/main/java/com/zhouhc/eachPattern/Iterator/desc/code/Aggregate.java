package com.zhouhc.eachPattern.Iterator.desc.code;


/**
 * 某个抽象的容器类,模拟
 * jdk中容器已经非常多了
 */
public interface Aggregate {
    //元素添加
    public void add(Object object);
    //减少元素
    public void remove(Object object);
    //获取迭代器
    public Iterator iterator();
}
