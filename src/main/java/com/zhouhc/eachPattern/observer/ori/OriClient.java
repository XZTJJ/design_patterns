package com.zhouhc.eachPattern.observer.ori;

/**
 * 客户端类
 */
public class OriClient {
    public static void main(String[] args) throws Exception{
        OriHanFeiZI oriHanFeiZI = new OriHanFeiZI();
        OriLisi lisi = new OriLisi();

        oriHanFeiZI.havaFun();
        oriHanFeiZI.haveBreakfast();

        Spy spy = new Spy(oriHanFeiZI, lisi);
        spy.start();

        Thread.sleep(1000);
        oriHanFeiZI.havaFun();
        oriHanFeiZI.haveBreakfast();
    }
}
