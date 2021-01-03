package com.zhouhc.eachPattern.command.stand;


import com.zhouhc.eachPattern.command.comm.AddCommand;
import com.zhouhc.eachPattern.command.comm.DeleteCommand;

public class StandClient {
    public static void main(String[] args) {
        StandInvoke standInvoke = new StandInvoke();
        standInvoke.setCommand(new AddCommand());
        standInvoke.Action();
        System.out.println("");
        standInvoke.setCommand(new DeleteCommand());
        standInvoke.Action();
    }
}
