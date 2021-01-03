package com.zhouhc.eachPattern.flyweight.stand;

import java.util.HashMap;
import java.util.Map;

/**
 * 带有缓存池的 工厂类,这里的缓存池只是用一个
 * 简单的Map。
 */
public class SignInfoFactory {

    //缓存池，或者容器池
    private static Map<String, SignInfo> pool = new HashMap<String, SignInfo>();

    //从池中获得对象
    public static SignInfo getSignInfo(String key) {
        //返回对象
        SignInfo result = null;
        /**
         * 这里不使用SignInfo的subject 和 location复写equals 和 hashCode
         * 方法，是因为他们的效率比较的效率 其实没有 Java基本类型 (包括String) 快
         */
        if (!pool.containsKey(key)) {
            System.out.println(key + "-----建立并放置在对象中了");
            result = new SignInfo(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "直接从池中获取");
        }
        return result;
    }
}
