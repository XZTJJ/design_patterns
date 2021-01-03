package com.zhouhc.eachPattern.facade.ori;

import com.zhouhc.eachPattern.facade.comm.ILetterProcess;

public class OriClient {
    public static void main(String[] args) {
        ILetterProcess iLetterProcess = new OriSendLetter();
        iLetterProcess.writeContext("亲爱的XXX:许久没见，你还好吗?....");
        iLetterProcess.writeEnvelope("成功省成功市成功县成功大道01号");
        iLetterProcess.letterIntoEnvelope();
        iLetterProcess.sendLetter();
    }
}
