package com.zhouhc.eachPattern.mediary.ori;

import com.zhouhc.eachPattern.mediary.comm.PoJoFactory;

/**
 * 使用 库存，销售，采购的例子，每个类都会依赖其他的两个类
 * 采购类
 */
public class OriPurchase {
    private OriSale oriSale;
    private OriStock oriStock;

    public void setOriSale(OriSale oriSale) {
        this.oriSale = oriSale;
    }

    public void setOriStock(OriStock oriStock) {
        this.oriStock = oriStock;
    }

    public OriSale getOriSale() {
        return oriSale;
    }

    public OriStock getOriStock() {
        return oriStock;
    }

    public void buyThisThing(int count, boolean isAll) {
        //根据销量情况采购
        if (this.oriSale.saleStuts() > 80 || isAll) {
            System.out.println("限量良好，全部采购");
            this.oriStock.increment(count);
        } else {
            System.out.println("限量不好，折半采购");
            this.oriStock.increment(count / 2);
        }
    }

    public void dneyBuyThisThing() {
        System.out.println("停止采购该类商品");
    }
}
