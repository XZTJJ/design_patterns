package com.zhouhc.eachPattern.facade.comm;

/**
 * 抽象的写信过程
 */
public interface ILetterProcess {

    //首先写内容
    public void writeContext(String context);

    //写信封
    public void writeEnvelope(String address);

    //将信放到信封中
    public void letterIntoEnvelope();

    //然后通敌信封
    public void sendLetter();

}
