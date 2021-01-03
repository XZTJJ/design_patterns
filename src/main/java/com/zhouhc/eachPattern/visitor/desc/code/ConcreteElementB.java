package com.zhouhc.eachPattern.visitor.desc.code;

/**
 * 具体的元素类型，实现自生特有的逻辑
 */
public class ConcreteElementB extends Element {

    @Override
    public void doSomething() {

    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
