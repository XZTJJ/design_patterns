package com.zhouhc.eachPattern.decorator.desc.code;

/**
 * 具体的修饰
 */
public class ConcreteDecoratorA extends Decorator {
    //显示初始化修饰
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    //特有的修饰方法
    private void method1() {

    }

    //调用父类的修饰方法,并重写
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
