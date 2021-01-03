package com.zhouhc.eachPattern.responsibilityChain.ori;


import com.zhouhc.eachPattern.responsibilityChain.comm.ConcreteWomen;
import com.zhouhc.eachPattern.responsibilityChain.comm.IOriHandler;
import com.zhouhc.eachPattern.responsibilityChain.comm.IWomen;

public class OriClient {
    public static void main(String[] args) {
        //女儿
        IWomen daughter  = new ConcreteWomen(1);
        daughter.request("出去逛逛");
        IOriHandler father = new OriFather();
        father.response();
        System.out.println("");
        //妻子
        IWomen wife  = new ConcreteWomen(2);
        daughter.request("出去逛逛");
        IOriHandler husband = new OriHusband();
        husband.response();
    }
}
