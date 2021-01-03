package com.zhouhc.eachPattern.builder.stand;

import com.zhouhc.eachPattern.builder.comm.AbstractVehicle;
import com.zhouhc.eachPattern.builder.comm.BMWVehicleBuilder;
import com.zhouhc.eachPattern.builder.comm.BenzVehicleBuilder;

/**
 * 启动类
 */
public class StandClient {
    public static void main(String[] args) {
        //导演类
        StandDirector standDirector = new StandDirector();
        //获取Benz A系列的车
        standDirector.setAbstractVehicleBuilder(new BenzVehicleBuilder());
        AbstractVehicle benzVehicleA = standDirector.getBenzVehicleA();
        benzVehicleA.runStatus();
        System.out.println("============");
        //获取Benz A系列的车
        standDirector.setAbstractVehicleBuilder(new BMWVehicleBuilder());
        AbstractVehicle bmwVehicleA = standDirector.getBMWVehicleA();
        bmwVehicleA.runStatus();

    }
}
