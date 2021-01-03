package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 乘法表达式
 */
public class MULTExpression extends NoTerminationExpression {

    //具体乘法操作
    @Override
    public Double detailOperator(TerminationExpression left, TerminationExpression right) {
        return left.interpreter() * right.interpreter();
    }
}
