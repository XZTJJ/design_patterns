package com.zhouhc.eachPattern.command.desc.code;

/**
 * 具体的命令模式A
 */
public class ConcreteCommandA extends Command {
    //执行类
    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exection() {
        this.receiver.doSomething();
    }
}
