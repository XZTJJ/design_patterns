package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 减法表达式
 */
public class SUBExpression extends NoTerminationExpression {

    //具体减法操作
    @Override
    public Double detailOperator(TerminationExpression left, TerminationExpression right) {
        return left.interpreter() - right.interpreter();
    }
}
