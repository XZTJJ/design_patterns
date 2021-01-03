package com.zhouhc.eachPattern.mediary.stand;

import com.zhouhc.eachPattern.mediary.comm.Mediator;
import org.apache.commons.lang.math.RandomUtils;

public class StandSale {
    //终结者类
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //销量情况
    public int saleStuts() {
        return RandomUtils.nextInt(100);
    }

    public void sellCommodity(int count) {
        mediator.sellCommodity(count);
    }

    public void SoldOut() {
       mediator.soldOut();
    }
}
