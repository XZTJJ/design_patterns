package com.zhouhc.eachPattern.flyweight.stand;

/**
 * 其实享元模式存在安全性问题
 */
public class StandClient {
    public static void main(String[] args) {
        //初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
