package com.zhouhc.eachPattern.builder.ori;

import java.util.ArrayList;
import java.util.List;

public class OriClient {
    public static void main(String[] args) {
        List<String> orderList = new ArrayList<String>();
        orderList.add("start");
        orderList.add("upDown");
        orderList.add("blow");
        orderList.add("slowDown");
        orderList.add("stop");
        OriBenzModel oriBenzModel = new OriBenzModel();
        oriBenzModel.setOrderList(orderList);
        oriBenzModel.runStatus();
        System.out.println("============");
        OriBMWModel oriBWMModel = new OriBMWModel();
        oriBWMModel.setOrderList(orderList);
        oriBWMModel.runStatus();

    }
}
