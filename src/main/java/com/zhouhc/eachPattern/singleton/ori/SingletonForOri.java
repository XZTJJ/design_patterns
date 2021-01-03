package com.zhouhc.eachPattern.singleton.ori;

/**
 *
 * 最原始的 : 获取对象的方式，直接获取对象
 */
public class SingletonForOri {
    private String name;

    public SingletonForOri(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("获取对象 : "+this+" , 中文标示" + this.name);
    }

}
