package com.zhouhc.eachPattern.abstractFactory.stand;

import com.zhouhc.eachPattern.abstractFactory.comm.AbstractFemalePerson;
import com.zhouhc.eachPattern.abstractFactory.comm.AbstractMalePerson;
import com.zhouhc.eachPattern.abstractFactory.comm.InterfacePerson;

/**
 * 抽象的工厂接口, 抽象工厂特别需要注意的是 产品 和 种类
 */
public interface PersonFactory {
    //女性角色的创建
    public <T extends InterfacePerson> T createFemalePerson(Class<T> tClass, Object... objs);

    //男性角色的创建
    public <T extends InterfacePerson> T createMalePerson(Class<T> tClass, Object... objs);
}
