package com.zhouhc.eachPattern.proxy.ori;

import com.zhouhc.eachPattern.proxy.comm.GamePlayer;
import com.zhouhc.eachPattern.proxy.comm.InterfaceGamePlayer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 原始的客户端
 */
public class OriClient {

    public static void main(String[] args) {
        InterfaceGamePlayer gamePlayer = new GamePlayer("张三");
        System.out.println("开始时间: " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        gamePlayer.login("shangsan","123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        System.out.println("结束时间: " + LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
