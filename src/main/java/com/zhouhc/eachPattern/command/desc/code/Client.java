package com.zhouhc.eachPattern.command.desc.code;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //调用者和请求者
        Invoker invoker = new Invoker();
        //定义接受者
        Receiver receiver = new ConcreteReceiverA();
        //命令
        Command command = new ConcreteCommandA(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
