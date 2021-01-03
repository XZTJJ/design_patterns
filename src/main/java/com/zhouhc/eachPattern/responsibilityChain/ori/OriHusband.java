package com.zhouhc.eachPattern.responsibilityChain.ori;

import com.zhouhc.eachPattern.responsibilityChain.comm.IOriHandler;
import org.apache.commons.lang.math.RandomUtils;

public class OriHusband implements IOriHandler {

    @Override
    public void response() {
        System.out.println("丈夫的回答是:" + (RandomUtils.nextInt(5) > 2 ? "同意" : "拒绝"));
    }
}
