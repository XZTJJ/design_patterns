package com.zhouhc.eachPattern.builder.comm;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 抽象的汽车类，可以定义一些公用的方法, 整体的架构是 一个抽象的产品，多个具体实例的抽象产品，多个具体产品实例。
 *  一个抽象的 建造者类，多个具体品牌的抽象者类，多个具体品牌的实现类。
 *   一个导演类，负责构建 和 预定义一些可以的示例实例。
 *
 */
public abstract class AbstractVehicle {
    //定义车辆的标识
    protected String name;
    //定义车辆的启动顺序
    protected List<String> orderList;

    //对象的启动
    protected abstract void start();

    //对象的停止
    protected abstract void stop();

    //对象的加速
    protected abstract void upDown();

    //对象的减速
    protected abstract void slowDown();

    //对象的鸣笛
    protected abstract void blow();

    //属性设置
    protected void setOrderList(List<String> orderList) {
        this.orderList = orderList;
    }
    //属性设置
    protected void setName(String name) {
        this.name = name;
    }

    //定义的模板方法
    public final void runStatus() {
        if (null == this.orderList || this.orderList.size() == 0)
            return;
        for (String order : this.orderList) {
            if (StringUtils.equalsIgnoreCase(order, "start"))
                this.start();
            else if (StringUtils.equalsIgnoreCase(order, "stop"))
                this.stop();
            else if (StringUtils.equalsIgnoreCase(order, "stop"))
                this.stop();
            else if (StringUtils.equalsIgnoreCase(order, "upDown"))
                this.upDown();
            else if (StringUtils.equalsIgnoreCase(order, "slowDown"))
                this.slowDown();
            else
                this.blow();
        }

    }
}
