package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 加法表达式
 */
public class ADDExpression extends NoTerminationExpression {

    //具体加法操作
    @Override
    public Double detailOperator(TerminationExpression left, TerminationExpression right) {
        return left.interpreter().doubleValue() + right.interpreter().doubleValue();
    }
}
