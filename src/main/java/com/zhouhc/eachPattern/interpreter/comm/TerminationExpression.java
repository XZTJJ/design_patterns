package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 终结符表达式,一般是操作数，比如 8 就是一个表达式
 * <p>
 * 需要要考虑 数值 和 字母 的映射关系
 */
public class TerminationExpression extends AbstractExpression {

    //操作数有映射的关系
    public Double interpreter() {
        return super.context.variableMapping.get(super.mark);
    }
}
