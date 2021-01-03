package com.zhouhc.eachPattern.adapter.comm;

/**
 * 鸭子的具体实现类，绿头鸭
 */
public class MailardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("绿头鸭的叫声是嘎嘎嘎....");
    }

    @Override
    public void gliding() {
        System.out.println("绿头鸭之类滑行一段距离");
    }
}
