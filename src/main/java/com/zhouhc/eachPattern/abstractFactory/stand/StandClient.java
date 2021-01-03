package com.zhouhc.eachPattern.abstractFactory.stand;

import com.zhouhc.eachPattern.abstractFactory.comm.*;

public class StandClient {
    public static void main(String[] args) {
        //黄人创建
        PersonFactory yellowpersonFactory = new YellowPersonFactory();
        InterfacePerson yellowFemalePerson = yellowpersonFactory.createFemalePerson(YellowFemalePerson.class,"小黄女");
        InterfacePerson yellowMalePerson = yellowpersonFactory.createMalePerson(YellowMalePerson.class);
        yellowFemalePerson.HumanType();
        yellowFemalePerson.HumanGender();
        yellowFemalePerson.HumanAction();
        System.out.println("");
        yellowMalePerson.HumanType();
        yellowMalePerson.HumanGender();
        yellowMalePerson.HumanAction();

        System.out.println("----------------");

        PersonFactory blackpersonFactory = new BlackPersonFactory();
        InterfacePerson blackFemalePerson = blackpersonFactory.createFemalePerson(BlackFemalePerson.class,"小黑女");
        InterfacePerson blackMalePerson = blackpersonFactory.createMalePerson(BlackMalePerson.class);
        blackFemalePerson.HumanType();
        blackFemalePerson.HumanGender();
        blackFemalePerson.HumanAction();
        System.out.println("");
        blackMalePerson.HumanType();
        blackMalePerson.HumanGender();
        blackMalePerson.HumanAction();

    }
}
