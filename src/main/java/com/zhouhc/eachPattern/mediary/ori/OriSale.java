package com.zhouhc.eachPattern.mediary.ori;

import com.zhouhc.eachPattern.mediary.comm.PoJoFactory;
import org.apache.commons.lang.math.RandomUtils;

/**
 * 使用 库存，销售，采购的例子，每个类都会依赖其他的两个类
 * 销售类
 */
public class OriSale {

    private OriPurchase oriPurchase;
    private OriStock oriStock;

    public void setOriPurchase(OriPurchase oriPurchase) {
        this.oriPurchase = oriPurchase;
    }

    public void setOriStock(OriStock oriStock) {
        this.oriStock = oriStock;
    }

    public OriPurchase getOriPurchase() {
        return oriPurchase;
    }

    public OriStock getOriStock() {
        return oriStock;
    }

    //销售情况
    public int saleStuts() {
        return RandomUtils.nextInt(100);
    }


    public void sellCommodity(int count) {
        if (oriStock.getTotal() < count)
            oriPurchase.buyThisThing(count, true);
    }

    public void SoldOut() {
        System.out.println("清除库存:" + oriStock.getTotal() + "件");
    }

}
