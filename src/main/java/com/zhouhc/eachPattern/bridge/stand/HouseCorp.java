package com.zhouhc.eachPattern.bridge.stand;

public class HouseCorp extends Corp {
    //传递一个House产品进来
    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱...");
    }
}
