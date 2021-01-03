package com.zhouhc.eachPattern.singleton.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 单例模式扩展模式 : 规定某个类的对象只有两三个实例
 * 其实就是单例模式的扩展
 */
public class SingleTonForExt {
    //创建对象
    private static final List<SingleTonForExt> slit = new ArrayList<SingleTonForExt>();
    //为了区分对象，给每个对象一个名字
    private static final List<String> sname = new ArrayList<String>();

    //对象的初始化
    static {
        for (int i = 0; i < 5; i++)
            slit.add(new SingleTonForExt("唯" + i));
    }

    private SingleTonForExt(String name) {
        sname.add(name);
    }

    public static SingleTonForExt getInstance() {
        Random random = new Random();
        return slit.get(random.nextInt(slit.size()));
    }

    //没有考虑线程安全的情况
    public static void say(SingleTonForExt se) {
        for (int i = 0; i < slit.size(); i++)
            if (se.equals(slit.get(i)))
                System.out.println("获取对象 : " + se + " , 中文标示 : " + sname.get(i));
    }
}
