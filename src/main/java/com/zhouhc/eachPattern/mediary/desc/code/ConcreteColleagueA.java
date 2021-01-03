package com.zhouhc.eachPattern.mediary.desc.code;

/**
 * 具体的同事类
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    //自己的业务逻辑
    public void selfMethodA() {

    }

    //依赖中介者的业务逻辑
    public void depMethodA() {
        super.mediator.doSomethingA();
    }
}
