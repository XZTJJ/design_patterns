package com.zhouhc.eachPattern.visitor.desc.code;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            //创建对象并且接受访问者
            ObjectStruture.createElement().accept(new ConcreteVisitor());
    }
}
