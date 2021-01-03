package com.zhouhc.eachPattern.mediary.ori;

import com.zhouhc.eachPattern.mediary.comm.PoJoFactory;

/**
 * 使用 库存，销售，采购的例子，每个类都会依赖其他的两个类
 * 库存类
 */
public class OriStock {

    private OriPurchase oriPurchase;
    private OriSale oriSale;

    private int total = 0;

    public OriPurchase getOriPurchase() {
        return oriPurchase;
    }

    public void setOriPurchase(OriPurchase oriPurchase) {
        this.oriPurchase = oriPurchase;
    }

    public OriSale getOriSale() {
        return oriSale;
    }

    public void setOriSale(OriSale oriSale) {
        this.oriSale = oriSale;
    }

    public int getTotal() {
        return this.total;
    }

    public void increment(int count) {
        this.total += count;
    }

    public void clearWarehouse() {
        oriPurchase.dneyBuyThisThing();
        oriSale.SoldOut();
    }
}
