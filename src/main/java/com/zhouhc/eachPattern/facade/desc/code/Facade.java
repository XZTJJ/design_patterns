package com.zhouhc.eachPattern.facade.desc.code;

/**
 * 按照道理，门面对象中应该不包含业务逻辑的
 * 也就是一个方法只是提供访问子系统的通道而已
 * 不应该包含 if,else 等等的业务逻辑
 * 哪怕是一个方法中调用超过一个对象的方法就已经掺杂
 * 业务逻辑了，正确的做法是应该把  这些业务逻辑放弃另一个类中
 * 门面只是调用另一个类的结果就好。
 * <p>
 * 高层模块权限不同，应该提供不同的的门面对象，不能再一个门面对象中判断
 */
public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();
    private FacadeContext facadeContext = new FacadeContext();

    //对外提供A的方法
    public void methodA() {
        this.classA.doSomethingA();
    }

    //对外提供B的方法
    public void methodB() {
        this.classB.doSomethingB();
    }

    //对外提供C的方法
    public void methodC() {
        this.classC.doSomethingC();
    }

    //对外提供A和B业务的的方法,因为有包含业务了
    public void methodAB() {
        this.facadeContext.complexMethod();
    }
}
