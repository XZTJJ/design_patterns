package com.zhouhc.eachPattern.prototype.stand;

import com.zhouhc.eachPattern.prototype.comm.AdvTemplate;
import com.zhouhc.eachPattern.prototype.comm.Mail;
import com.zhouhc.eachPattern.prototype.comm.PrototypeUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class StandClient {
    public static void main(String[] args) {
        Mail mail = new Mail(new AdvTemplate());
        mail.setRecevier(PrototypeUtils.getMail());
        mail.setTermsList(new ArrayList<String>(Arrays.asList("协议一", "协议二", "协议三")));
        //高并发下，一些同步操作
        Mail clone = mail.clone();
        clone.setRecevier(PrototypeUtils.getMail());
        clone.setTermsList(new ArrayList<String>(Arrays.asList("协议一", "协议二", "协议三", "协议四")));
        PrototypeUtils.sendMessage(clone);
        PrototypeUtils.sendMessage(mail);


    }
}
