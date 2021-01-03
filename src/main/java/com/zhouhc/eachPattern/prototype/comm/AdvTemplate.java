package com.zhouhc.eachPattern.prototype.comm;

/**
 * 抽象处理的，可以共享的对象
 */
public class AdvTemplate {

    //设置主题
    private String subject = "XX月的信用卡电子消费账单";
    //设置内容
    private String content = "尊敬的客户，本月你的消费信息如下:...";
    //设置尾项
    private String tail = "XXX信用卡中心";

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
