package com.zhouhc.eachPattern.prototype.comm;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.MissingFormatArgumentException;

/**
 * 模拟电子邮件，处理高并发的情况下，数据共享的问题
 */
public class Mail implements Cloneable{
    //接受者
    private String recevier;
    //主题
    private String subject;
    //内容
    private String content;
    //附加协议,不适用List主要是为了方便克隆
    private ArrayList<String> termsList;
    //尾项
    private String tail;

    //随机获取数组
    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getSubject();
        this.content = advTemplate.getContent();
        this.tail = advTemplate.getTail();
    }

    // getter and setter
    public String getRecevier() {
        return recevier;
    }

    public void setRecevier(String recevier) {
        this.recevier = recevier;
    }

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

    public ArrayList<String> getTermsList() {
        return termsList;
    }

    public void setTermsList(ArrayList<String> termsList) {
        this.termsList = termsList;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    //克隆标志
    @Override
    public Mail clone() {
        Mail clone = null;
        try {
            clone = (Mail) super.clone();
            clone.termsList = (ArrayList<String>) this.termsList.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }

    //主要是输出方便
    @Override
    public String toString() {
        return "{ subject:" + this.subject + " , content:" + this.content + " , recevier:" +
                this.recevier + " , termsList:" + StringUtils.join(this.termsList, ",")
                + " , tail:" + this.tail + "}";
    }
}
