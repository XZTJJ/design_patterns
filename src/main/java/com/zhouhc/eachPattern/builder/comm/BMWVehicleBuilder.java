package com.zhouhc.eachPattern.builder.comm;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * BMW的一个抽象工厂类
 */
public class BMWVehicleBuilder extends AbstractVehicleBuilder {

    //创建对应的类
    public <T extends AbstractBMWVehicle> T createBMWVehicle(Class<T> tClass, String name, List<String> orderList) {
        AbstractBMWVehicle abstractBMWVehicle = null;
        Constructor constructor = null;
        try {
            constructor = Class.forName(tClass.getName()).getDeclaredConstructor(String.class, List.class);
            abstractBMWVehicle = (AbstractBMWVehicle) constructor.newInstance(name, orderList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) abstractBMWVehicle;
    }
}
