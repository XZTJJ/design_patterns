package com.zhouhc.eachPattern.builder.ori;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 自定义奔驰车的实现方式
 */
public class OriBenzModel {
    private String name = "BenzA系列车";
    //自定义顺序
    private List<String> orderList;

    //对象的启动
    public void start() {
        System.out.println(this.name + "启动了");
    }

    //对象的停止
    public void stop() {
        System.out.println(this.name + "停止了");
    }

    //对象的加速
    public void upDown() {
        System.out.println(this.name + "加速了");
    }

    //对象的减速
    public void slowDown() {
        System.out.println(this.name + "减速了");
    }

    //对象的鸣笛
    public void blow() {
        System.out.println(this.name + "启动了");
    }

    public void setOrderList(List<String> orderList) {
        this.orderList = orderList;
    }

    public void runStatus() {
        if (null == orderList || orderList.size() == 0)
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
