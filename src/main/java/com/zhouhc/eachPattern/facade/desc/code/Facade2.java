package com.zhouhc.eachPattern.facade.desc.code;

/**
 * 高层模块权限不同，只能看对象B的方法
 */
public class Facade2 {

    private ClassB classB = new ClassB();

    //对外提供B的访问方法
    public void methodB() {
        this.classB.doSomethingB();
    }
}
