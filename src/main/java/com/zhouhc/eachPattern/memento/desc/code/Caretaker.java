package com.zhouhc.eachPattern.memento.desc.code;

/**
 * 备忘录管理角色， 就饿会死
 * <p>
 * ps: 因为java语言的优越性，其实发起人角色人，
 * 备忘录角色，备忘录管理角色 这三个可以融为一体，
 * 详细的可以看扩展。
 */
public class Caretaker {
    //备忘录角色的创建
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
