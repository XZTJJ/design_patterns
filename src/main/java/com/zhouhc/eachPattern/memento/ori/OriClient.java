package com.zhouhc.eachPattern.memento.ori;

import com.zhouhc.eachPattern.memento.ext.ExtIMemento;

public class OriClient {
    public static void main(String[] args) {
        OriInnerClassTest oriInnerClassTestA = new OriInnerClassTest("初始化为A");
        ExtIMemento extIMemento = oriInnerClassTestA.createExtIMemento();

        //测试B
        OriInnerClassTest oriInnerClassTestB = new OriInnerClassTest("初始化B");
        oriInnerClassTestB.restoreExtIMemento(extIMemento);
        System.out.println("");

    }
}
