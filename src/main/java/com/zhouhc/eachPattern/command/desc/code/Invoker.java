package com.zhouhc.eachPattern.command.desc.code;

/**
 * 调用者， 对应命令的请求者，
 * 命令请求和命令执行是分开的 ,
 * 其中调用者可以省略，
 * 就是原始状态的那种
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.exection();
    }
}
