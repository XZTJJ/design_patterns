package com.zhouhc.eachPattern.Iterator.desc.code;

/**
 * 抽象的迭代器模式,这里只是模拟
 * JDk已经自动实现了，而且性能更好
 *
 */
public interface Iterator {
    //获取下一个元素
    public Object next();
    //时候还有元素
    public boolean hasNext();
    //删除当前元素
    public boolean remove();
}
