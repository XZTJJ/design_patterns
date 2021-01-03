package com.zhouhc.eachPattern.decorator.desc.code;

/**
 * 抽象的装饰，不适用原始的抽象类，而但是抽象装饰出来是为了更方便的扩展
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    //实际上还是委托给实际的类进行处理
    @Override
    public void operate() {
        this.component.operate();
    }
}
