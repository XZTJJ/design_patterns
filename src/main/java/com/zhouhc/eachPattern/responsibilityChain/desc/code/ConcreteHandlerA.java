package com.zhouhc.eachPattern.responsibilityChain.desc.code;

/**
 * 具体的处理类
 */
public class ConcreteHandlerA extends Handler {
    //标志自己的登记
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    //自定义的处理逻辑
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
