package com.zhouhc.eachPattern.decorator.desc.code;

/**
 * 具体的修饰
 */
public class ConcreteDecoratorB extends Decorator {
    //显示初始化修饰
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    //特有的修饰方法
    private void method2() {

    }

    //调用父类的修饰方法,并重写
    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
