package com.zhouhc.eachPattern.factory.ori;

import com.zhouhc.eachPattern.factory.comm.BlackHumanDetail;
import com.zhouhc.eachPattern.factory.comm.InterfaceHuman;
import com.zhouhc.eachPattern.factory.comm.WhiteHumanDetail;
import com.zhouhc.eachPattern.factory.comm.YellowHumanDetail;

/**
 * 原始模式客户端测试
 */
public class OriClient {

    public static void main(String[] args) {
        InterfaceHuman whiteHuman = new WhiteHumanDetail("小白");
        whiteHuman.humanType();
        whiteHuman.humanSay();
        whiteHuman.humanAction();
        System.out.println("");

        InterfaceHuman blackHuman = new BlackHumanDetail("小黑");
        blackHuman.humanType();
        blackHuman.humanSay();
        blackHuman.humanAction();
        System.out.println("");

        InterfaceHuman yellowHuman = new YellowHumanDetail("小黄");
        yellowHuman.humanType();
        yellowHuman.humanSay();
        yellowHuman.humanAction();
        System.out.println("");
    }
}
