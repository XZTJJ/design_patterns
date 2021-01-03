package com.zhouhc.eachPattern.templateMethod.desc.code;

public class Client {
    public static void main(String[] args) {
        AbstractTemplateMethodClass templateMethodClassA = new ConcreteTemplateMethodClassA();
        AbstractTemplateMethodClass templateMethodClassB = new ConcreteTemplateMethodClassB();

        templateMethodClassA.templateMethod();
        templateMethodClassB.templateMethod();
    }
}
