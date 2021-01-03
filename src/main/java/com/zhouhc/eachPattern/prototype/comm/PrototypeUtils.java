package com.zhouhc.eachPattern.prototype.comm;

import org.apache.commons.lang.RandomStringUtils;

import java.util.concurrent.TimeUnit;

/**
 * 工具类
 */
public class PrototypeUtils {
    //随机获取汉字
    public static String getCnName() {
        return RandomStringUtils.random(3, 0x4e00, 0x9fa5 - 0x4e00 + 1, false, false);
    }

    //随机获取邮箱
    public static String getMail() {
        return RandomStringUtils.random(8, 97, 122, false, false) + "@gmail.com";
    }

    //模拟发送对象
    public static void sendMessage(Mail mail) {
        try {
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(mail);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
