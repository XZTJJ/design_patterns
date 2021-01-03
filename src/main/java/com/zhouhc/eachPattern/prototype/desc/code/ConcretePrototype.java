package com.zhouhc.eachPattern.prototype.desc.code;

/**
 * 按照道理来说，抽象出一个接口，改接口有一个clone方法
 * 子类负责实现该clone接口。但是由于JDK中，Object对象
 * 已经实现了clone方法，并且只需要继承Cloneable ，复写
 * clone方法，jdk就会自动克隆对象
 */
public class ConcretePrototype implements Cloneable {

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
