package com.zhouhc.eachPattern.observer.stand;

import com.zhouhc.eachPattern.observer.comm.IHanFeiZi;

//客户端
public class StandClient {
    public static void main(String[] args) {
        IHanFeiZi hanFeiZi = new StandHanFeiZi();
        //为了兼容，所以没有改动接口
        ((StandHanFeiZi)hanFeiZi).addObserver(new StandLiSi());
        ((StandHanFeiZi)hanFeiZi).addObserver(new StandZhangSi());
        ((StandHanFeiZi)hanFeiZi).addObserver(new StandWangSi());
        hanFeiZi.haveBreakfast();
        hanFeiZi.havaFun();
    }
}
