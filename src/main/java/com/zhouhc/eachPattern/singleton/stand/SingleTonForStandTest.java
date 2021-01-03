package com.zhouhc.eachPattern.singleton.stand;

public class SingleTonForStandTest {
    public static void main(String[] args) {
        //不能直接new对象了
        //SingleTonForStand sd2 = new SingleTonForStand();
        SingleTonForStand.say();
        SingleTonForStand.say();

    }
}
