package com.zhouhc.eachPattern.memento.desc.code;

/**
 * 发起角色， 也就是需要备份这个角色的状态
 * <p>
 * ps: 因为java语言的优越性，其实发起角色人，
 * 备忘录角色，备忘录管理角色 这三个可以融为一体，
 * 详细的可以看扩展。
 */
public class Originator {
    //内部状态
    private String state;

    //getter和setter
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }

    //备忘录角色的恢复
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
