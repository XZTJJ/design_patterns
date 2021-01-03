package com.zhouhc.eachPattern.memento.desc.code;

/**
 * 备忘录角色， 也就是备份发起人的状态
 * <p>
 * ps: 因为java语言的优越性，其实发起角色，
 * 备忘录角色，备忘录管理角色 这三个可以融为一体，
 * 详细的可以看扩展。
 */
public class Memento {
    //内部状态
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
