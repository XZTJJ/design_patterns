package com.zhouhc.eachPattern.interpreter.comm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 计算类
 * <p>
 * (a+b)*c-(a+b)/e  --> a b + c * a b + e / -
 */
public class Calculator {
    //表达式上下文
    private ExpressionContext context;

    //构造函数中进行对象的初始化操作
    public Calculator() {
        this.context = new ExpressionContext();
    }

    public void readFormula() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        System.out.println("请输入表达式(不允输入=运算操作符):");
        //表达式输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String expressionStr = bufferedReader.readLine().replace(" ","");
        //处理表示式的
        this.context.handleExpressiong(expressionStr);
        //变量和值的映射处理(也就是公式中的变量赋值)
        this.readVariableMapping();
        //计算数值
        this.calculation();
    }

    //读取变量的值
    private void readVariableMapping() throws IOException {
        BufferedReader bufferedReader = null;
        String expressionStr = "";
        //读取变量的
        for (String key : this.context.variableMapping.keySet()) {
            System.out.println("请输入" + key + "的值:");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            expressionStr = bufferedReader.readLine();
            this.context.variableMapping.put(key, new Double(expressionStr));
        }
    }

    //公式的计算
    private void calculation() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.context.calculation();
        System.out.println("结算结果为:" + this.context.calculationStack.pop().interpreter());
        //计算前需要清空原来的成员变量，防止内存溢出
        this.context.clearAllFields();
    }
}
