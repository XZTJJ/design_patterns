package com.zhouhc.eachPattern.templateMethod.stand;

import com.zhouhc.eachPattern.templateMethod.comm.AbstractHummerModel;
import com.zhouhc.eachPattern.templateMethod.comm.HummerModelA;
import com.zhouhc.eachPattern.templateMethod.comm.HummerModelB;

public class StandClient {
    public static void main(String[] args) {
        AbstractHummerModel hummerModelA = new HummerModelA();
        AbstractHummerModel hummerModelB = new HummerModelB();
        hummerModelA.runStatus();
        System.out.println("=========");
        hummerModelB.runStatus();
    }
}
