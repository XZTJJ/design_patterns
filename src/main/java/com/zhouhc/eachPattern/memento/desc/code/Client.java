package com.zhouhc.eachPattern.memento.desc.code;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //定义发起人
        Originator originator = new Originator();
        //定义管理者
        Caretaker caretaker = new Caretaker();
        //创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        //恢复角色
        originator.restoreMemento(caretaker.getMemento());
    }
}
