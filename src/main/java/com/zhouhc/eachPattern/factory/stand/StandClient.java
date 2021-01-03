package com.zhouhc.eachPattern.factory.stand;

import com.zhouhc.eachPattern.factory.comm.*;

public class StandClient {
    public static void main(String[] args) {
        HumanFactory humanFactory = new ConcreteFactory();

        InterfaceHuman whiteHuman = humanFactory.createHuman(WhiteHumanDetail.class);
        whiteHuman.humanType();
        whiteHuman.humanSay();
        whiteHuman.humanAction();
        System.out.println("");
        InterfaceHuman blackHuman = humanFactory.createHuman(BlackHumanDetail.class, "小黑");
        blackHuman.humanType();
        blackHuman.humanSay();
        blackHuman.humanAction();
        System.out.println("");
        InterfaceHuman yellowHuman = humanFactory.createHuman(YellowHumanDetail.class, "小黄", 3);
        yellowHuman.humanType();
        yellowHuman.humanSay();
        yellowHuman.humanAction();
        System.out.println("");
    }
}
