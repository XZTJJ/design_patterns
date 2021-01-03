package com.zhouhc.eachPattern.responsibilityChain.stand;


import com.zhouhc.eachPattern.responsibilityChain.comm.ConcreteWomen;
import com.zhouhc.eachPattern.responsibilityChain.comm.EmunMark;
import com.zhouhc.eachPattern.responsibilityChain.comm.IStandHandler;
import com.zhouhc.eachPattern.responsibilityChain.comm.IWomen;

/**
 * 标准客户端
 */
public class StandClient {
    public static void main(String[] args) {
        //组装一下责任链
        IStandHandler father = new StandFather();
        IStandHandler husband = new StandHusband();
        IStandHandler son = new StandSon();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        //处理
        IWomen mother = new ConcreteWomen(EmunMark.mother);
        System.out.println("女性请求是:出去逛街");
        father.hanlder(mother);
        System.out.println("===========");
        mother = new ConcreteWomen(4);
        System.out.println("女性请求是:出去逛街");
        father.hanlder(mother);
        System.out.println("===========");
        mother = new ConcreteWomen(2);
        System.out.println("女性请求是:出去逛街");
        father.hanlder(mother);
    }
}
