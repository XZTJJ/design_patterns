package com.zhouhc.eachPattern.Iterator.desc.code;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("111");
        aggregate.add("222");
        aggregate.add("333");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
