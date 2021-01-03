package com.zhouhc.eachPattern.bridge.stand;

public class ShanZhaiCorp extends Corp {
    //传递一个House产品进来
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨产品同样赚钱...");
    }
}
