package com.zhouhc.eachPattern.facade.desc.code;

/**
 * 掺杂业务的处理方式
 */
public class FacadeContext {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();

    //业务处理
    public void complexMethod(){
        this.classA.doSomethingA();
        this.classB.doSomethingB();
    }
}
