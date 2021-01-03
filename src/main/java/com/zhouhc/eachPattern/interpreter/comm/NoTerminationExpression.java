package com.zhouhc.eachPattern.interpreter.comm;

import java.util.UUID;

/**
 * 非终结符表达式,一般指的是操作符等，比如+
 */
public abstract class NoTerminationExpression extends AbstractExpression {

    //值操作,直接放入栈中
    public final void operator() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        TerminationExpression right = super.context.calculationStack.pop();
        TerminationExpression left = super.context.calculationStack.pop();
        Double aDouble = this.detailOperator(left, right);
        //需要将运算的结果接着放入栈中，每个临时步骤产生的结果都要存放
        String key = UUID.randomUUID().toString();
        super.context.variableMapping.put(key, aDouble);
        super.context.calculationStack.push(AbstractExpressionFactory.createTerminationExpression(OperatorEnum.Termination,
                key, super.context));
    }

    //具体的算法逻辑需要子类实现
    public abstract Double detailOperator(TerminationExpression left, TerminationExpression right);
}
