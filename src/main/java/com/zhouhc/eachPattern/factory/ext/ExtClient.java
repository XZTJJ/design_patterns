package com.zhouhc.eachPattern.factory.ext;

import com.zhouhc.eachPattern.factory.comm.BlackHumanDetail;
import com.zhouhc.eachPattern.factory.comm.InterfaceHuman;
import com.zhouhc.eachPattern.factory.comm.WhiteHumanDetail;
import com.zhouhc.eachPattern.factory.comm.YellowHumanDetail;

public class ExtClient {
    public static void main(String[] args) {
        InterfaceHuman whiteHuman = SimpleHumanFactory.createHuman(WhiteHumanDetail.class);
        whiteHuman.humanType();
        whiteHuman.humanSay();
        whiteHuman.humanAction();
        System.out.println("");
        InterfaceHuman blackHuman = SimpleHumanFactory.createHuman(BlackHumanDetail.class, "小黑");
        blackHuman.humanType();
        blackHuman.humanSay();
        blackHuman.humanAction();
        System.out.println("");
        InterfaceHuman yellowHuman = SimpleHumanFactory.createHuman(YellowHumanDetail.class, "小黄", 3);
        yellowHuman.humanType();
        yellowHuman.humanSay();
        yellowHuman.humanAction();
        System.out.println("");
    }
}
