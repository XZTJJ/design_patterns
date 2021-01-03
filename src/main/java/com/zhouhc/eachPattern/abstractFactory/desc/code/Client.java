package com.zhouhc.eachPattern.abstractFactory.desc.code;



public class Client {
    public static void main(String[] args) {

        AbstractCreator creatorA = new CreatorA(); 
        AbstractCreator creatorB = new CreatorB(); 
        //产生A产品的不同分类
        AbstractProductA productAA = creatorA.createProductA();
        AbstractProductA productAB = creatorB.createProductA();
        //产生B产品的不同分类
        AbstractProductB productBA = creatorA.createProductB();
        AbstractProductB productBB = creatorB.createProductB();
    }
}
