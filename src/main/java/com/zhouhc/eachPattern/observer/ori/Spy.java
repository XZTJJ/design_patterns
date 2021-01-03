package com.zhouhc.eachPattern.observer.ori;


public class Spy extends Thread {
    private OriHanFeiZI oriHanFeiZi;
    private OriLisi lisi;

    public Spy(OriHanFeiZI oriHanFeiZi, OriLisi lisi) {
        this.oriHanFeiZi = oriHanFeiZi;
        this.lisi = lisi;
    }

    @Override
    public void run() {
        while (true) {
            if (oriHanFeiZi.isEatBreakFast()) {
                lisi.update("韩非子吃饭了");
                oriHanFeiZi.setEatBreakFast(false);
            }

            if (oriHanFeiZi.isFun()) {
                lisi.update("韩非子娱乐了");
                oriHanFeiZi.setFun(false);
            }
        }
    }
}
