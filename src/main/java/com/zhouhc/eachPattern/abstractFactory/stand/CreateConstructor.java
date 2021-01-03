package com.zhouhc.eachPattern.abstractFactory.stand;

import java.lang.reflect.Constructor;

/**
 * 抽象该构造方式，这样就可以避免多写了
 */
public class CreateConstructor {

    //获取构造方法
    public static Constructor getConstructor(Class tClass, Object... objs) throws Exception {
        Constructor constructor = null;
        switch (objs.length) {
            case 0:
                constructor = Class.forName(tClass.getName())
                        .getDeclaredConstructor();
                break;
            case 1:
                constructor = Class.forName(tClass.getName())
                        .getDeclaredConstructor(objs[0].getClass());
                break;
            default:
                throw new NoSuchMethodException("没有该构造函数,请检查");
        }
        return constructor;
    }
}
