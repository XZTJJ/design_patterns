package com.zhouhc.eachPattern.responsibilityChain.stand;


import com.zhouhc.eachPattern.responsibilityChain.comm.EmunMark;
import com.zhouhc.eachPattern.responsibilityChain.comm.IStandHandler;
import org.apache.commons.lang.math.RandomUtils;

public class StandHusband extends IStandHandler {
    public StandHusband() {
        super(EmunMark.wife);
    }

    @Override
    protected boolean response() {
        return RandomUtils.nextInt(5) > 2;
    }

}
