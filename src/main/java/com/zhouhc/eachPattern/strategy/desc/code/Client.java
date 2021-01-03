package com.zhouhc.eachPattern.strategy.desc.code;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //申明上下文
        Context context = new Context(new ConcreteStrategyA());
        context.action();
        //执行另一个策略
        context.setStrategy(new ConcreteStrategyB());
        context.action();
    }
}
