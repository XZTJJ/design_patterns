package com.zhouhc.eachPattern.abstractFactory.stand;

import com.zhouhc.eachPattern.abstractFactory.comm.AbstractFemalePerson;
import com.zhouhc.eachPattern.abstractFactory.comm.AbstractMalePerson;
import com.zhouhc.eachPattern.abstractFactory.comm.InterfacePerson;

import java.lang.reflect.Constructor;

/**
 * 黄人创建工厂
 */
public class YellowPersonFactory implements PersonFactory {

    @Override
    public <T extends InterfacePerson> T createFemalePerson(Class<T> tClass, Object... objs) {
        AbstractFemalePerson femalePerson = null;
        Constructor constructor = null;
        try {
            constructor = CreateConstructor.getConstructor(tClass, objs);
            femalePerson = (AbstractFemalePerson) constructor.newInstance(objs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) femalePerson;
    }

    @Override
    public <T extends InterfacePerson> T createMalePerson(Class<T> tClass, Object... objs) {
        AbstractMalePerson malePerson = null;
        Constructor constructor = null;
        try {
            constructor = CreateConstructor.getConstructor(tClass, objs);
            malePerson = (AbstractMalePerson) constructor.newInstance(objs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) malePerson;
    }


}
