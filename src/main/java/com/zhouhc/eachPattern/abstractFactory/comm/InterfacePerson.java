package com.zhouhc.eachPattern.abstractFactory.comm;

/**
 * 同样以人种为例, 一个接口，多个抽象类，每个抽象类都包含一个具体类
 */
public interface InterfacePerson {
    //人种
    public void HumanType();

    //性别
    public void HumanGender();

    //属性
    public void HumanAction();
}
