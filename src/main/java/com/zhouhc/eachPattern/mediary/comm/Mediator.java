package com.zhouhc.eachPattern.mediary.comm;

import com.zhouhc.eachPattern.mediary.stand.StandPurchase;
import com.zhouhc.eachPattern.mediary.stand.StandSale;
import com.zhouhc.eachPattern.mediary.stand.StandStock;

public abstract class Mediator {

    protected StandPurchase standPurchase;
    protected StandSale standSale;
    protected StandStock standStock;

    public StandPurchase getStandPurchase() {
        return standPurchase;
    }

    public void setStandPurchase(StandPurchase standPurchase) {
        this.standPurchase = standPurchase;
    }

    public StandSale getStandSale() {
        return standSale;
    }

    public void setStandSale(StandSale standSale) {
        this.standSale = standSale;
    }

    public StandStock getStandStock() {
        return standStock;
    }

    public void setStandStock(StandStock standStock) {
        this.standStock = standStock;
    }

    //购买商品
    public void needBuy(int count, boolean isAll) {
        //根据销量情况采购
        if (this.standSale.saleStuts() > 80 || isAll) {
            System.out.println("限量良好，全部采购");
            this.standStock.increment(count);
        } else {
            System.out.println("限量不好，折半采购");
            this.standStock.increment(count / 2);
        }

    }

    //销售商品
    public void sellCommodity(int count) {
        if (this.standStock.getTotal() < count)
            this.standPurchase.buyThisThing(count, true);
    }

    //卖完商品
    public void soldOut() {
        System.out.println("库存太多了，必须卖完库存，库存数量为:" + this.getStandStock().getTotal());
    }

    //清库存
    public void clearWarehouse() {
        this.standPurchase.dneyBuyThisThing();
        this.standSale.SoldOut();
    }
}
