package com.zhouhc.eachPattern.visitor.desc.code;

/**
 * 具体的访问者实现类
 */
public class ConcreteVisitor implements IVisitor {
    @Override
    public void visit(ConcreteElementA elA) {
        elA.doSomething();
    }

    @Override
    public void visit(ConcreteElementB elB) {
        elB.doSomething();
    }
}
