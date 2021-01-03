package com.zhouhc.eachPattern.builder.stand;

import com.zhouhc.eachPattern.builder.comm.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 预定义的一些品牌实例
 */
public class StandDirector {
    private AbstractVehicleBuilder abstractVehicleBuilder = new BenzVehicleBuilder();
    private List<String> orderList = new ArrayList<String>();
    private String name = "";

    public void setAbstractVehicleBuilder(AbstractVehicleBuilder abstractVehicleBuilder) {
        this.abstractVehicleBuilder = abstractVehicleBuilder;
    }

    //获取Benz A的一些实例
    public AbstractVehicle getBenzVehicleA() {
        //定义顺序
        this.orderList.clear();
        this.orderList.add("blow");
        this.orderList.add("start");
        this.orderList.add("slowDown");
        this.orderList.add("upDown");
        this.orderList.add("blow");
        this.orderList.add("slowDown");
        this.orderList.add("stop");
        //名称
        this.name = "BenzA系列车";
        BenzVehicleBuilder benzVehicleFactory = (BenzVehicleBuilder) abstractVehicleBuilder;
        return benzVehicleFactory.createBenzVehicle(BenzVehicleA.class, this.name, this.orderList);
    }

    //获取BMW A的一些实例
    public AbstractVehicle getBMWVehicleA() {
        //定义顺序
        this.orderList.clear();
        this.orderList.add("start");
        this.orderList.add("upDown");
        this.orderList.add("blow");
        this.orderList.add("slowDown");
        this.orderList.add("stop");
        //名称
        this.name = "BMWA系列车";
        BMWVehicleBuilder bmwVehicleFactory = (BMWVehicleBuilder) abstractVehicleBuilder;
        return bmwVehicleFactory.createBMWVehicle(BMWVehicleA.class, this.name, this.orderList);
    }

}
