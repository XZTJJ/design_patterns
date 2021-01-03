package com.zhouhc.eachPattern.decorator.desc.code;

/**
 * 具体的组件类
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do somethig");
    }
}
