package com.zhouhc.eachPattern.responsibilityChain.desc.code;

public class Client {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);
        handlerA.handleMessage(new Request());
    }
}
