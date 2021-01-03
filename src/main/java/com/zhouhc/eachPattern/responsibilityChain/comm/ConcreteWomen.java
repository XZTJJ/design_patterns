package com.zhouhc.eachPattern.responsibilityChain.comm;


/**
 * 具体的妇女的角色
 */
public class ConcreteWomen implements IWomen {
    private int type;
    private String str;

    public ConcreteWomen(int type) {
        this.type = type;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public void request(String str) {
        if (this.type == 1)
            System.out.println("女儿的请求是:" + str);
        else if (this.type == 2)
            System.out.println("妻子的请求是:" + str);
        else
            System.out.println("母亲的请求是:" + str);
    }
}
