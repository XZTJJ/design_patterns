package com.zhouhc.eachPattern.adapter.desc.code;

/**
 * 这是源角色，也就是已经存在的角色，可以直接拿来使用的角色(不需要创建的),
 * 一般情况下他是一个类,直接用就好。
 * ps : 如果非要创建一个新的源角色，套用适配器模式也是可以的
 */
public class Adaptee {
    //原有的业务逻辑
    public void action(){
        System.out.println("源角色的实现方法，直接用的");
    }
}
