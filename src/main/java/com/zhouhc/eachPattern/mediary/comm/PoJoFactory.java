package com.zhouhc.eachPattern.mediary.comm;

import com.zhouhc.eachPattern.mediary.ori.OriPurchase;
import com.zhouhc.eachPattern.mediary.ori.OriSale;
import com.zhouhc.eachPattern.mediary.ori.OriStock;
import com.zhouhc.eachPattern.mediary.stand.ConcreteMediator;
import com.zhouhc.eachPattern.mediary.stand.StandPurchase;
import com.zhouhc.eachPattern.mediary.stand.StandSale;
import com.zhouhc.eachPattern.mediary.stand.StandStock;

/**
 * 简单的单例模式
 */
public class PoJoFactory {
    //原始模式的
    private static OriPurchase oriPurchase = new OriPurchase();
    private static OriSale oriSale = new OriSale();
    private static OriStock oriStock = new OriStock();

    //标准模式的
    private static Mediator mediator = new ConcreteMediator();
    private static StandPurchase standPurchase = new StandPurchase();
    private static StandSale standSale = new StandSale();
    private static StandStock standStock = new StandStock();

    //原始的调用方法
    public synchronized static OriPurchase getPurchase() {
        if (oriPurchase.getOriSale() == null)
            oriPurchase.setOriSale(oriSale);
        if (oriPurchase.getOriStock() == null)
            oriPurchase.setOriStock(oriStock);
        return oriPurchase;
    }

    public synchronized static OriSale getOriSale() {
        if (oriSale.getOriStock() == null)
            oriSale.setOriStock(oriStock);
        if (oriSale.getOriPurchase() == null)
            oriSale.setOriPurchase(oriPurchase);
        return oriSale;
    }

    public synchronized static OriStock getOriStock() {
        if (oriStock.getOriSale() == null)
            oriStock.setOriSale(oriSale);
        if (oriStock.getOriPurchase() == null)
            oriStock.setOriPurchase(oriPurchase);
        return oriStock;
    }


    //终结者模式的调用方法
    public synchronized static StandPurchase getStandPurchase() {
        if (standPurchase.getMediator() == null)
            standPurchase.setMediator(mediator);
        mediatorFill();
        return standPurchase;
    }

    public synchronized static StandSale getStandSale() {
        if (standSale.getMediator() == null)
            standSale.setMediator(mediator);
        mediatorFill();
        return standSale;
    }

    public synchronized static StandStock getStandStock() {
        if (standStock.getMediator() == null)
            standStock.setMediator(mediator);
        mediatorFill();
        return standStock;
    }

    private synchronized static void mediatorFill() {
        if (mediator.getStandStock() == null)
            mediator.setStandPurchase(standPurchase);
        if (mediator.getStandStock() == null)
            mediator.setStandStock(standStock);
        if (mediator.getStandSale() == null)
            mediator.setStandSale(standSale);
    }
}
