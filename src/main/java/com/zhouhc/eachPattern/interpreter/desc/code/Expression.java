package com.zhouhc.eachPattern.interpreter.desc.code;

/**
 * 抽象表达式类，在表达式中只分为 终结符表达式 或者 非终结符表达式
 * 终结符表达式 比如数字或者公式中的变量
 * 非终结符表达式 比如加减等操作符
 */
public abstract class Expression {
    //按照道理来说，每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
}
