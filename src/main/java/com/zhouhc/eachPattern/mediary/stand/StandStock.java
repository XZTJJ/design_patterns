package com.zhouhc.eachPattern.mediary.stand;

import com.zhouhc.eachPattern.mediary.comm.Mediator;

public class StandStock {
    //终结者类
    private Mediator mediator;
    private int total = 0;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //
    public int getTotal() {
        return this.total;
    }

    public void increment(int count) {
        this.total += count;
    }

    public void clearWarehouse() {
        this.mediator.clearWarehouse();
        this.total = 0;
    }

}
