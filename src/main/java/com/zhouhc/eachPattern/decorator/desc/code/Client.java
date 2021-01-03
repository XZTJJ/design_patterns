package com.zhouhc.eachPattern.decorator.desc.code;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecoratorA(component);
        //第二次修饰
        component = new ConcreteDecoratorB(component);
        component.operate();
    }
}
