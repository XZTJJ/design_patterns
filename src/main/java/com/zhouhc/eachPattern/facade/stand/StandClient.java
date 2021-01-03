package com.zhouhc.eachPattern.facade.stand;

import com.zhouhc.eachPattern.facade.comm.IFacade;

public class StandClient {
    public static void main(String[] args) {
        IFacade iFacade = new StandSendLetter();
        iFacade.letterFacade("亲爱的XXX:许久没见，你还好吗?....", "成功省成功市成功县成功大道01号");

    }
}
