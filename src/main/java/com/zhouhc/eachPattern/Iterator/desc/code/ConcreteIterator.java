package com.zhouhc.eachPattern.Iterator.desc.code;

import java.util.Vector;

/**
 * 具体的 迭代器的实现类,模拟而已
 * Dk已经自动实现了，而且性能更好
 */
public class ConcreteIterator implements Iterator {
    //集合容器，不一定要是使用Vector
    private Vector vector = new Vector();
    //游标
    private int cursor = 0;


    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext())
            result = this.vector.get(this.cursor++);
        else
            result = null;
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor < this.vector.size())
            return true;
        else
            return false;
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor) ;
        return true;
    }
}
