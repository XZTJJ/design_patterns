package com.zhouhc.eachPattern.responsibilityChain.stand;


import com.zhouhc.eachPattern.responsibilityChain.comm.EmunMark;
import com.zhouhc.eachPattern.responsibilityChain.comm.IStandHandler;
import org.apache.commons.lang.math.RandomUtils;

public class StandFather extends IStandHandler {
    public StandFather() {
        super(EmunMark.daughter);
    }

    @Override
    protected boolean response() {
        return RandomUtils.nextInt(5) > 2;
    }

}
