package com.zhouhc.eachPattern.mediary.desc.code;

/**
 * 具体的中介者代码
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomethingA() {
        super.concreteColleagueA.selfMethodA();
        super.concreteColleagueB.depMethodB();
    }

    @Override
    public void doSomethingB() {
        super.concreteColleagueB.selfMethodB();
        super.concreteColleagueA.depMethodA();
    }
}
