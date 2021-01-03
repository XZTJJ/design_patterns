package com.zhouhc.eachPattern.flyweight.desc.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 带有容器池的工厂模式
 */
public class FlyweightFactory {

    //缓存池，或者容器池
    private static Map<String, Flyweight> pool = new HashMap<String, Flyweight>();

    //从池中获得对象
    public static Flyweight getSignInfo(String key) {
        //返回对象
        Flyweight result = null;
        /**
         * 这里不使用SignInfo的subject 和 location复写equals 和 hashCode
         * 方法，是因为他们的效率比较的效率 其实没有 Java基本类型(包括String)快
         */
        if (!pool.containsKey(key)) {
            result = new ConcreteFlyweight1(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
        }
        return result;
    }
}
