package com.zhouhc.eachPattern.singleton.ext;

/**
 * 测试用例
 */
public class SingleTonForExtTest {
    public static void main(String[] args) {
        SingleTonForExt se1 = SingleTonForExt.getInstance();
        SingleTonForExt.say(se1);
        SingleTonForExt se2 = SingleTonForExt.getInstance();
        SingleTonForExt.say(se2);
    }
}
