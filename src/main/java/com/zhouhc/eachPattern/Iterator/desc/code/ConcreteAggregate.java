package com.zhouhc.eachPattern.Iterator.desc.code;

import java.util.Vector;

/**
 * 某个具体的容器类
 */
public class ConcreteAggregate implements Aggregate {
    //容纳对象的容器
    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
