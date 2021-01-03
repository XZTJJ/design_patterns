package com.zhouhc.eachPattern.mediary.ori;

import com.zhouhc.eachPattern.mediary.comm.PoJoFactory;

public class OriClient {
    public static void main(String[] args) {
        //
        OriPurchase purchase = PoJoFactory.getPurchase();
        OriSale oriSale = PoJoFactory.getOriSale();
        OriStock oriStock = PoJoFactory.getOriStock();

        oriSale.sellCommodity(100);
        oriStock.clearWarehouse();
    }
}
