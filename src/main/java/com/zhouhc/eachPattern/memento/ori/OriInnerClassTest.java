package com.zhouhc.eachPattern.memento.ori;

import com.zhouhc.eachPattern.memento.ext.ExtIMemento;

/**
 * 外部内对象 能否使用同类的其他对象创建的内部类,
 * 答案是可以的，同级的外部对象创建的内部类是可以彼此相互使用的, 外部类实例A ,外部类实例B 都可以使用 A 创建的内部类对象C, 尽管C的外部类指针任然指向A。
 * 与设计模式无关，突发奇想的
 */
public class OriInnerClassTest {
    private String test;

    public OriInnerClassTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public ExtIMemento createExtIMemento() {
        return this.new InnerClass(this.test);
    }

    public void restoreExtIMemento(ExtIMemento extIMemento) {
        InnerClass innerClass = (InnerClass) extIMemento;
        this.test = innerClass.getTesttestInner();
    }

    @Override
    public String toString() {
        return "test: " + this.test;
    }

    private class InnerClass implements ExtIMemento {
        //非常简单的对象保存方式，直接将对象序列化成json字符串保存
        private String testInner;

        public InnerClass(String test) {
            this.testInner = test;
        }

        public String getTesttestInner() {
            System.out.println("外部对象的this:" + OriInnerClassTest.this);
            return testInner;
        }

        public void setTesttestInner(String testtestInner) {
            this.testInner = test;
        }
    }
}
