package com.zhouhc.eachPattern.facade.ori;

import com.zhouhc.eachPattern.facade.comm.ILetterProcess;


/**
 * 原始的写信过程，直接实现最初的信件接口
 */
public class OriSendLetter implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("信的内容为:" + context);
    }

    @Override
    public void writeEnvelope(String address) {
        System.out.println("信封中的地址为:" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("信件已经装好了,翻入邮箱中");
    }

    @Override
    public void sendLetter() {
        System.out.println("信件已经被邮局寄出");
    }
}
