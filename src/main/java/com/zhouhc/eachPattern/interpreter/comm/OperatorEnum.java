package com.zhouhc.eachPattern.interpreter.comm;

import java.util.HashSet;
import java.util.Set;

/**
 * 操作符的枚举类,枚举所有操作符
 */
public enum OperatorEnum {
    /**
     * 按照道理，左括号优先级最高,右括号优先级最低，这样他们才能无条件入栈，
     * 加减优先级没有乘除高.....
     * 这里加上一个 操作数的枚举类，这样在创建操作数时 也可以统一使用反射了
     */
    ADD("+", 1, "com.zhouhc.eachPattern.interpreter.comm.ADDExpression"),
    SUB("-", 1, "com.zhouhc.eachPattern.interpreter.comm.SUBExpression"),
    MULT("*", 2, "com.zhouhc.eachPattern.interpreter.comm.MULTExpression"),
    DIVI("/", 2, "com.zhouhc.eachPattern.interpreter.comm.DIVIExpression"),
    LBRAC("(", Integer.MAX_VALUE / 10, ""),
    RBRAC(")", Integer.MIN_VALUE / 10, ""),

    //操作数限定符，方便直接用反射
    Termination("Termination", Integer.MIN_VALUE, "com.zhouhc.eachPattern.interpreter.comm.TerminationExpression");
    //操作符英文符号,比如加号 --> +
    private String operator;
    //操作符优先级,比如 加减 优先级为1 ，乘除优先级为2等
    private int priority;
    //全限定名,反射时用到，没有直接放空
    private String classNameString;
    //保存值的集合，主要是给了后面方便操作
    private static OperatorEnum[] values = OperatorEnum.values();

    OperatorEnum(String operator, int priority, String classNameString) {
        this.operator = operator;
        this.priority = priority;
        this.classNameString = classNameString;
    }

    //setter和getter
    public String getOperator() {
        return operator;
    }

    public void setOperator(String name) {
        this.operator = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getClassNameString() {
        return classNameString;
    }

    public void setClassNameString(String classNameString) {
        this.classNameString = classNameString;
    }

    //获取操作符,
    public static Set<String> getAllOperator() {
        Set<String> allOperator = new HashSet<String>();
        for (OperatorEnum operatorEnum : values) {
            if (!operatorEnum.equals(Termination))
                allOperator.add(operatorEnum.getOperator());
        }
        return allOperator;
    }

    //获取符号对应的枚举类
    public static OperatorEnum getOperatorEnum(String name) {
        for (OperatorEnum operatorEnum : values)
            if (!operatorEnum.equals(Termination) && operatorEnum.getOperator().equals(name))
                return operatorEnum;
        return null;
    }


    //方便显示
    @Override
    public String toString() {
        return this.operator + " , " + this.priority;
    }

}
