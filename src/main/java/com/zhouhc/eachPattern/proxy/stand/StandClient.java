package com.zhouhc.eachPattern.proxy.stand;

import com.zhouhc.eachPattern.proxy.comm.GamePlayer;
import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StandClient {
    public static void main(String[] args) {
        InterfaceGamePlayer gamePlayerProxy = new GamePlayerProxy(new GamePlayer("张三"));
        System.out.println("开始时间: " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        gamePlayerProxy.login("shangsan","123456");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
        System.out.println("结束时间: " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
