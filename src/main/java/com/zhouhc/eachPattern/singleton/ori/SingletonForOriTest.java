package com.zhouhc.eachPattern.singleton.ori;

import java.util.Random;

/**
 *原始的获取对象方式的实现
 */
public class SingletonForOriTest {
    public static void main(String[] args) {
        Random random = new Random();
        SingletonForOri s1 = new SingletonForOri("唯" + random.nextInt(100));
        SingletonForOri s2 = new SingletonForOri("唯" + random.nextInt(100));
        s1.say();
        s2.say();
    }
}
