package com.zhouhc.eachPattern.visitor.desc.code;

/**
 * 抽象的元素类,
 *
 * Visitor 和 Element对象
 * 1. Visitor中的VisitElement()可以依赖ConcreteElement具体类 或者 Element抽象父类，
 * 如果是具体的类的话，那么 Element 有几个具体实现类，Visitor就要多少个VisitElement()，
 * 并且Element的Accept()方法具体由各个子类实现，父类只做抽象。
 * <p>
 * 2.Visitor中的VisitElement()依赖抽象类的话，Element的Accept()就可以父类中实现，子类不管，
 * 但是VisitElement()方法体中就要 多个 instandof 判断，每个Element对应一个 instandof 条件。
 */
public abstract class Element {
    //定义业务逻辑
    public abstract void  doSomething();
    //允许谁来访问
    public abstract void accept(IVisitor iVisitor);
}
