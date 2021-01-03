package com.zhouhc.eachPattern.memento.ext;

import java.util.HashMap;
import java.util.Map;

/**
 * 备忘录角色的问题
 */
public class ExtCaretaker {
    private Map<String, ExtMementoB> extMementoB = new HashMap<String, ExtMementoB>();

    public ExtMementoB getExtMementoB(String idx) {
        return extMementoB.get(idx);
    }

    public void setExtMementoB(String idx, ExtMementoB extIMemento) {
        this.extMementoB.put(idx, extIMemento);
    }
}
