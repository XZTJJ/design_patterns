package com.zhouhc.eachPattern.interpreter.comm;

/**
 * 表达式的生成工厂
 */
public class AbstractExpressionFactory {
    /**
     * 对应的创建相关的操作数(终结符表达式)实例
     */
    public static TerminationExpression createTerminationExpression(OperatorEnum operatorEnum, String key, ExpressionContext context) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (TerminationExpression) createAbstractExpression(operatorEnum.getClassNameString(), key, context);
    }

    /**
     * 对应的创建相关的操作数符非终结符表达式)实例
     */
    public static NoTerminationExpression createNoTerminationExpression(OperatorEnum operatorEnum, ExpressionContext context) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (NoTerminationExpression) createAbstractExpression(operatorEnum.getClassNameString(), operatorEnum.getOperator(), context);
    }

    /**
     * 通用的创建类
     */
    private static AbstractExpression createAbstractExpression(String classFullName, String express, ExpressionContext context) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class aclass = Class.forName(classFullName);
        AbstractExpression expression = (AbstractExpression) aclass.newInstance();
        expression.setMark(express);
        expression.setContext(context);
        return expression;
    }
}
