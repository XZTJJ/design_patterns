package com.zhouhc.eachPattern.state.ori;

import com.zhouhc.eachPattern.state.comm.ILift;

public class OriClient {
    public static void main(String[] args) {
        ILift iLift = new OriLift();
        ((OriLift)iLift).setState(OriLift.STOPING_STATE);
        iLift.open();
        iLift.close();
        iLift.run();
        iLift.stop();
    }
}
