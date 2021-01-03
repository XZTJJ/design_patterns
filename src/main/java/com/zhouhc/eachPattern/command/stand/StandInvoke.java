package com.zhouhc.eachPattern.command.stand;


import com.zhouhc.eachPattern.command.comm.AbstractCommand;

/**
 * 客户端
 */
public class StandInvoke {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void Action() {
        command.execute();
    }
}
