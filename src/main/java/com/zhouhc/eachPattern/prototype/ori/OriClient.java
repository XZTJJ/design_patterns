package com.zhouhc.eachPattern.prototype.ori;

import com.zhouhc.eachPattern.prototype.comm.AdvTemplate;
import com.zhouhc.eachPattern.prototype.comm.Mail;
import com.zhouhc.eachPattern.prototype.comm.PrototypeUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class OriClient {
    public static void main(String[] args) {
        Mail mail = new Mail(new AdvTemplate());
        mail.setRecevier(PrototypeUtils.getMail());
        ArrayList<String> terms = new ArrayList<String>(Arrays.asList("协议一", "协议二", "协议三"));
        mail.setTermsList(terms);
        //高并发下，一些同步操作
        PrototypeUtils.sendMessage(mail);
    }
}
