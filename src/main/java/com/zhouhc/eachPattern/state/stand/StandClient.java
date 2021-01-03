package com.zhouhc.eachPattern.state.stand;


import com.zhouhc.eachPattern.state.comm.ILift;

/**
 * 标准状态
 */
public class StandClient {
    public static void main(String[] args) {
        ILift standLift = new StandLift();
        ((StandLift)standLift).setLifeState(StandLift.STOPINGSTATE);
        standLift.open();
        standLift.close();
        standLift.run();
        standLift.stop();
    }
}
