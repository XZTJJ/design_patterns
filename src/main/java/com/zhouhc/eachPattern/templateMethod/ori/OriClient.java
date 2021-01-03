package com.zhouhc.eachPattern.templateMethod.ori;

/**
 * 可以发现OriHummerModel的两个类非常的相似，只是有特定实现不同
 *
 */
public class OriClient {
    public static void main(String[] args) {
        OriHummerModelA oriHummerModelA = new OriHummerModelA();
        oriHummerModelA.runStatus();
        System.out.println("===========");
        OriHummerModelB oriHummerModelB = new OriHummerModelB();
        oriHummerModelB.runStatus();
    }
}
