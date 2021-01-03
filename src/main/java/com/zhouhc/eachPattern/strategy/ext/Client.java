package com.zhouhc.eachPattern.strategy.ext;

        import org.apache.commons.lang.math.RandomUtils;

/**
 * 策略枚举算法
 */
public class Client {
    public static void main(String[] args) {
        int a = RandomUtils.nextInt();
        int b = RandomUtils.nextInt();
        System.out.println(CalculatorStrategy.ADD.exec(a, b));
    }
}
