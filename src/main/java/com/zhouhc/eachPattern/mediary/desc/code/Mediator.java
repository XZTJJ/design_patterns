package com.zhouhc.eachPattern.mediary.desc.code;

/**
 * 抽象的中介者类，需要定义依赖的同事类
 */
public abstract class Mediator {
    //定义同事类
    protected ConcreteColleagueA concreteColleagueA;
    protected ConcreteColleagueB concreteColleagueB;

    public ConcreteColleagueA getConcreteColleagueA() {
        return concreteColleagueA;
    }

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public ConcreteColleagueB getConcreteColleagueB() {
        return concreteColleagueB;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    //中介者的业务逻辑
    public abstract void doSomethingA();

    public abstract void doSomethingB();
}
