package com.zhouhc.eachPattern.factory.ext;

import com.zhouhc.eachPattern.factory.comm.InterfaceHuman;

import java.lang.reflect.Constructor;

public class SimpleHumanFactory {
    public static  <T extends InterfaceHuman> T createHuman(Class<T> c, Object... objs) {
        InterfaceHuman human = null;
        Constructor constructor = null;
        try {
            switch (objs.length) {
                case 0:
                    constructor = getThisConstructor(c);
                    break;
                case 1:
                    constructor = getThisConstructor(c, objs[0]);
                    break;
                case 2:
                    constructor = getThisConstructor(c, objs[0], objs[1]);
                    break;
                default:
                    throw new NoSuchMethodException("没有对应的构造函数,请检查或者适配");
            }
            human = (InterfaceHuman) constructor.newInstance(objs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }

    //获取构造函数
    private static Constructor getThisConstructor(Class c) {
        Constructor declaredConstructor = null;
        try {
            declaredConstructor = Class.forName(c.getName()).getDeclaredConstructor(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return declaredConstructor;
    }

    //构造函数的获取
    private static Constructor getThisConstructor(Class c, Object firstParam) {
        Constructor declaredConstructor = null;
        try {
            declaredConstructor = Class.forName(c.getName()).getDeclaredConstructor(firstParam.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return declaredConstructor;
    }

    private static Constructor getThisConstructor(Class c, Object firstParam, Object secondParam) {
        Constructor declaredConstructor = null;
        try {
            declaredConstructor = Class.forName(c.getName()).getDeclaredConstructor(firstParam.getClass(), secondParam.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return declaredConstructor;
    }
}
