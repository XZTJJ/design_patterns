package com.zhouhc.eachPattern.mediary.desc.code;

/**
 * 具体的同事类2
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    //自己的业务逻辑
    public void selfMethodB() {

    }

    //依赖中介者的业务逻辑
    public void depMethodB() {
        super.mediator.doSomethingB();
    }
}
