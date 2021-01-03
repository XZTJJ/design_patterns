package com.zhouhc.eachPattern.facade.stand;

import com.zhouhc.eachPattern.facade.comm.IFacade;
import com.zhouhc.eachPattern.facade.comm.ILetterProcess;

/**
 * 为了复用原来的接口，所以直接继承门面类，
 * 高层直接使用IFacade的外观类就好，这样就屏蔽了写信的过程了
 * ps : 其实也是可以将  ILetterProcess 做成一个成员变量来使用
 */
public class StandSendLetter implements ILetterProcess, IFacade {
    //信的门面，任然是调用原来的写信的过程
    @Override
    public void letterFacade(String Context, String address) {
        this.writeContext(Context);
        this.writeEnvelope(address);
        this.letterIntoEnvelope();
        this.checkLetter();
        this.sendLetter();
    }

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


    private void checkLetter() {
        System.out.println("邮局工作人员对" + this + "已经检查了");
    }
}
