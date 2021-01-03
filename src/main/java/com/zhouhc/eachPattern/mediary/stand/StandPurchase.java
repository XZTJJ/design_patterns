package com.zhouhc.eachPattern.mediary.stand;

import com.zhouhc.eachPattern.mediary.comm.Mediator;

/**
 * 采购类
 */
public class StandPurchase {
    //终结者类
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void buyThisThing(int count, boolean isAll) {
        mediator.needBuy(count, isAll);
    }

    public void dneyBuyThisThing() {
        System.out.println("停止采购该类商品");
    }
}
