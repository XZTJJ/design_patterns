package com.zhouhc.eachPattern.interpreter.comm;

import org.apache.commons.lang.StringUtils;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;


/**
 * 表达式上下文，用于保存分解的表达式用处
 * 要求全局唯一，所以是单例模式
 * 计算类
 * <p>
 * (a+b)*c-(a+b)/e  --> a b + c * a b + e / -
 */

/**
 * 构建正确的 后缀表达式
 * 1. 后缀表达式 遇到 终端表达式(变量) 直接输出(弹出)；
 * 2. 如果是 终端表达式(操作符) 遵循下面的规则:
 * 2.1  左括号 无条件 入操作符
 * 2.1  右括号，不入栈，栈顶元素一直弹出，直到遇到 左括号，并且左括号也需要弹出
 * 2.3  其他符号，一直弹出，直到 操作符 栈顶符号优先级 比 该符号 优先级 低或者相等。
 * ps ： 弹出的顺序就是正确的后缀表达式的顺序(要保存的话，用队列去保存)
 * <p>
 * 后缀表达式计算
 * 1. 从左往右依次遍历，如果是数字将入栈，如果
 */
public class ExpressionContext {
    //用于保存 解析 后缀表达式
    public final Stack<OperatorEnum> postfixExpress = new Stack<OperatorEnum>();
    //用于构建 后缀表达式 的操作队列，这里面就是正确的后缀表达式，可以按照顺序获取
    public final Queue<AbstractExpression> currentPostFixQueue = new ConcurrentLinkedQueue<AbstractExpression>();
    //用于 计算后缀表达式的 运算栈
    public final Stack<TerminationExpression> calculationStack = new Stack<TerminationExpression>();
    //符号和数值的对应关系,直接用Double，整型和浮点就能计算
    public final Map<String, Double> variableMapping = new HashMap<String, Double>();

    //构造函数
    public ExpressionContext() {
    }

    //处理表达式, 将输入的表达式转成 后缀表达式
    public void handleExpressiong(String expressionStr) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //获取所有的字符
        String[] expressArrays = expressionStr.split("");
        //所有的非终端表达式
        final Set<String> opertators = OperatorEnum.getAllOperator();
        //每个表达式
        StringBuilder expression = new StringBuilder();
        //正确构建后缀表达式
        for (String c : expressArrays) {
            // 如果是非终端操作符的话，处理逻辑比较复杂
            if (this.isNoTerminationExpression(opertators, c)) {
                //获取终端表达式
                this.getTerminationExpression(expression);
                //需要考虑出栈，入栈所以比较复杂,已经在构建后缀表达式了
                this.buildCurrentPostfix(c);
            } else {
                expression.append(c);
            }
        }
        //处理最后一个变量的问题
        this.getTerminationExpression(expression);
        //处理余数
        while (this.postfixExpress.size() > 0) {
            OperatorEnum operatorEnum = this.postfixExpress.pop();
            //获取操作符类型
            NoTerminationExpression temp = AbstractExpressionFactory.createNoTerminationExpression(operatorEnum, this);
            this.currentPostFixQueue.add(temp);

        }

        //输出一下后缀表达式
        StringBuilder currentPostFixSb = new StringBuilder();
        for (AbstractExpression a : currentPostFixQueue)
            currentPostFixSb.append(a.mark).append(" ");
        System.out.println("构建好的后缀表达式为:" + currentPostFixSb.toString());
    }

    /**
     * 获取终端表达式
     * <p>
     * 首先可以获取终端表达式了(也就是公式中的变量),入栈，清空stringBuilder
     */
    private void getTerminationExpression(StringBuilder expression) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String terExpStr = expression.toString();
        //为空判断
        if (StringUtils.isBlank(terExpStr))
            return;
        //获取操作数
        TerminationExpression tempTermin = AbstractExpressionFactory.createTerminationExpression(OperatorEnum.Termination, terExpStr, this);
        this.currentPostFixQueue.add(tempTermin);
        expression.delete(0, expression.length());
        //写入 variableMapping 中
        this.variableMapping.put(terExpStr, null);
    }

    /**
     * 构建正确的 后缀表达式
     * 1. 后缀表达式 遇到 终端表达式(变量) 直接输出；
     * 2. 如果是 终端表达式(操作符) 遵循下面的规则:
     * 2.1  左括号 无条件 入操作符
     * 2.1  右括号，不入栈，栈顶元素一直弹出，直到遇到 左括号，并且左括号也需要弹出
     * 2.3  其他符号，一直弹出，直到 操作符 栈顶符号优先级 比 该符号 优先级 低(优先级相同的要按照顺序计算)。
     */
    private void buildCurrentPostfix(String operator) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        OperatorEnum operatorEnum = OperatorEnum.getOperatorEnum(operator);
        //栈顶元素
        OperatorEnum top = this.postfixExpress.size() > 0 ? this.postfixExpress.peek() : null;

        //入栈的规则 , 必须保证栈顶元素 小于 当前元素(优先级相同的要按照顺序计算), 左括号的特殊处理逻辑
        while ((top != null) &&
                (top.getPriority() >= operatorEnum.getPriority()) &&
                (!top.equals(OperatorEnum.LBRAC))) {
            //从后缀表达式栈出栈后，就要进入 操作符 栈了
            NoTerminationExpression noTerminationExpression = AbstractExpressionFactory.createNoTerminationExpression(this.postfixExpress.pop(), this);
            this.currentPostFixQueue.add(noTerminationExpression);
            //top元素后移
            top = this.postfixExpress.size() > 0 ? this.postfixExpress.peek() : null;

        }

        /**
         * 括号处理逻辑，如果是当前元素是右括号，需要弹出栈顶的左括号，
         * 当前不是右括号，则直接入库
         */
        if (operatorEnum.equals(OperatorEnum.RBRAC))
            this.postfixExpress.pop();
        else
            this.postfixExpress.push(operatorEnum);
    }


    //获取所有的非终结符表达式, 获取正确获取变量
    private boolean isNoTerminationExpression(final Set<String> opertators, String express) {
        if (opertators.contains(express))
            return true;
        else
            return false;
    }

    //正确的计算结果
    public void calculation() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //如果是操作数 ，直接入栈，操作符的话，将栈顶两个元素弹出, 进行运算，将运算结果继续入栈
        while (this.currentPostFixQueue.size() > 0) {
            AbstractExpression topExpression = this.currentPostFixQueue.poll();
            if (topExpression instanceof TerminationExpression)
                this.calculationStack.push((TerminationExpression) topExpression);
            else
                ((NoTerminationExpression) topExpression).operator();
        }
    }

    //为了防止内存溢出，需要清空一些成员变量
    public void clearAllFields() {
        this.calculationStack.clear();
        this.postfixExpress.clear();
        this.currentPostFixQueue.clear();
        this.variableMapping.clear();
    }
}
