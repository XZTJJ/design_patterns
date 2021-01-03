package com.zhouhc.eachPattern.memento.ext;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象的多状态拷贝，因为涉及到多个转态
 * 已经深浅拷贝的问题，所以其实 使用clone
 * 就不是很方便,因为还是需要拆分出来才方便。
 * 使用gson是为了更加方法的深拷贝
 * <p>
 * 并且为了 安全性考虑，只能让当前类对象克隆
 * 因此就可以使用内部类的方式。
 * <p>
 * 注意备份角色使用Map，主要是为了通用性，
 * 这样就可以非常容易扩展，不过是备份全部数据
 * 还是按照时间戳备份，都是可以的
 * <p>
 * ExtIMemento 仅仅是标识作用
 */
public class ExtMementoB {
    //内部细节备份
    private ExtIMemento memento;

    public ExtMementoB(ExtIMemento backMap) {
        this.memento = backMap;
    }

    //添加对应的备份
    public void setMemento(ExtIMemento backMap) {
        this.memento = backMap;
    }

    //获取备份条件
    public ExtIMemento getMemento() {
        return memento;
    }
}
