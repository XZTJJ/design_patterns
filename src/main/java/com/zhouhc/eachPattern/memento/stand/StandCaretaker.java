package com.zhouhc.eachPattern.memento.stand;

/**
 * 这是管理备份的类
 */
public class StandCaretaker {
    //复制备忘录对象
    private StandMemento standMemento;

    public StandMemento getStandMemento() {
        return standMemento;
    }

    public void setStandMemento(StandMemento standMemento) {
        this.standMemento = standMemento;
    }
}
