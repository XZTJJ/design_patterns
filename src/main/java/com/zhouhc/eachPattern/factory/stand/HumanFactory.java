package com.zhouhc.eachPattern.factory.stand;

import com.zhouhc.eachPattern.factory.comm.InterfaceHuman;

/**
 * 人类创造工厂
 */
public interface HumanFactory {
    public <T extends InterfaceHuman> T createHuman(Class<T> c, Object... objs);
}
