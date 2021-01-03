package com.zhouhc.eachPattern.templateMethod.desc.code;

/**
 * 定义通用的抽象方法
 */
public abstract class AbstractTemplateMethodClass {
    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法。为了防止恶意修改，一般加上final关键字
    public final void templateMethod() {
        /**
         * 调用基本方法，完成相关逻辑
         */
        this.doAnything();
        this.doSomething();
    }
}
