package com.zhouhc.eachPattern.mediary.desc.code;

/**
 * 抽象的同事类，用于和抽象的中介者分开来
 */
public abstract class Colleague {
    protected Mediator mediator;
    //强制子类要注入中介者，如果有其他方式也是可以的
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
