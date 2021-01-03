package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 加法表达式
 */
public class DIVIExpression extends NoTerminationExpression {

    //具体的除法操作
    @Override
    public Double detailOperator(TerminationExpression left, TerminationExpression right) {
        return left.interpreter() / right.interpreter();
    }
}
