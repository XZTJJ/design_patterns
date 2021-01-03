package com.zhouhc.eachPattern.mediary.stand;


import com.zhouhc.eachPattern.mediary.comm.PoJoFactory;

public class StandClient {

    public static void main(String[] args) {
        //
        StandPurchase standPurchase = PoJoFactory.getStandPurchase();
        StandSale standSale = PoJoFactory.getStandSale();
        StandStock standStock = PoJoFactory.getStandStock();

        standSale.sellCommodity(100);
        standStock.clearWarehouse();
    }
}
