package com.zhouhc.eachPattern.builder.comm;

import java.lang.reflect.Constructor;
import java.util.List;

/**
 * 这是Benz类的 创建类
 */
public class BenzVehicleBuilder extends AbstractVehicleBuilder {

    //创建对应的类
    public <T extends AbstractBenzVehicle> T createBenzVehicle(Class<T> tClass, String name, List<String> orderList) {
        AbstractBenzVehicle abstractBenzVehicle = null;
        Constructor constructor = null;
        try {
            constructor = Class.forName(tClass.getName()).getDeclaredConstructor(String.class, List.class);
            abstractBenzVehicle = (AbstractBenzVehicle) constructor.newInstance(name, orderList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) abstractBenzVehicle;
    }
}
