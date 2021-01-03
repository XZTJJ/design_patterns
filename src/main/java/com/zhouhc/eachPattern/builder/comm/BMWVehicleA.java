package com.zhouhc.eachPattern.builder.comm;

import java.util.List;

/**
 * BMW的一个实例
 */
public class BMWVehicleA extends  AbstractBMWVehicle{

    public BMWVehicleA(String name, List<String> orderList) {
        super.name = name;
        super.orderList = orderList;
    }

    @Override
    protected void start() {
        System.out.println(super.name + "启动了");
    }

    @Override
    protected void stop() {
        System.out.println(super.name + "停止了");
    }

    @Override
    protected void upDown() {
        System.out.println(super.name + "加速了");
    }

    @Override
    protected void slowDown() {
        System.out.println(super.name + "减速了");
    }

    @Override
    protected void blow() {
        System.out.println(super.name + "鸣笛了");
    }

    @Override
    protected void setOrderList(List<String> orderList) {
        super.setOrderList(orderList);
    }

    @Override
    protected void setName(String name) {
        super.setName(name);
    }
}
