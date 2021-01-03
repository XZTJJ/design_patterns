package com.zhouhc.eachPattern.memento.ext;


import com.google.gson.Gson;

/**
 * 扩展备忘录模式
 * <p>
 * 发起人角色, 备忘录角色, 备忘录角色 三合一
 * 直接省略掉其他的角色
 */
public class ExtOriginatorA implements Cloneable {
    //内部转态
    private String state;
    //内部备份角色
    private ExtOriginatorA bak;

    //setter 和 getter方法
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备份
    public void createMemento() {
        this.bak = this.clone();
    }

    //备份的恢复
    public void restoreMemento() {
        this.setState(this.bak.getState());
    }

    //重写clone方法，注意浅拷贝和深拷贝
    @Override
    public ExtOriginatorA clone() {
        try {
            return (ExtOriginatorA) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "state:" + this.state;
    }
}
