package com.zhouhc.eachPattern.abstractFactory.ori;

import com.zhouhc.eachPattern.abstractFactory.comm.*;

/**
 * 原始场景类
 */
public class OriClient {
    public static void main(String[] args) {
        //女性
        InterfacePerson whiteFemalePerson = new WhiteFemalePerson();
        whiteFemalePerson.HumanType();
        whiteFemalePerson.HumanGender();
        whiteFemalePerson.HumanAction();
        System.out.println("");
        InterfacePerson blackFemalePerson = new BlackFemalePerson();
        blackFemalePerson.HumanType();
        blackFemalePerson.HumanGender();
        blackFemalePerson.HumanAction();
        System.out.println("");
        InterfacePerson yellowFemalePerson = new YellowFemalePerson();
        yellowFemalePerson.HumanType();
        yellowFemalePerson.HumanGender();
        yellowFemalePerson.HumanAction();
        System.out.println("");

        //男性
        InterfacePerson whiteMalePerson = new WhiteMalePerson();
        whiteMalePerson.HumanType();
        whiteMalePerson.HumanGender();
        whiteMalePerson.HumanAction();
        System.out.println("");
        InterfacePerson blackMalePerson = new BlackMalePerson();
        blackMalePerson.HumanType();
        blackMalePerson.HumanGender();
        blackMalePerson.HumanAction();
        System.out.println("");
        InterfacePerson yellowMalePerson = new YellowMalePerson();
        yellowMalePerson.HumanType();
        yellowMalePerson.HumanGender();
        yellowMalePerson.HumanAction();
        System.out.println("");
    }
}
