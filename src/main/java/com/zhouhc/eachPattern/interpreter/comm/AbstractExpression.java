package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 抽象的表达式，操作符,操作数都是表达式的一部分
 */
public abstract class AbstractExpression {
    //表达式上下文
    protected ExpressionContext context;
    //符号表示，便于显示
    protected String mark;

    //设置对应的上下文
    public void setContext(ExpressionContext context) {
        this.context = context;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
