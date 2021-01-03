package com.zhouhc.eachPattern.command.desc.code;

/**
 * 具体的命令模式A
 */
public class ConcreteCommandB extends Command {
    //执行类
    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exection() {
        this.receiver.doSomething();
    }
}
