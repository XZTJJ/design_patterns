package com.zhouhc.eachPattern.visitor.desc.code;

import org.apache.commons.lang.math.RandomUtils;

/**
 * 具体元素生成器
 */
public class ObjectStruture {
    public static Element createElement() {
        if (RandomUtils.nextInt(100) > 50)
            return new ConcreteElementA();
        else
            return new ConcreteElementB();
    }
}
