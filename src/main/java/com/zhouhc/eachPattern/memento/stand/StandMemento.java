package com.zhouhc.eachPattern.memento.stand;

import com.google.gson.Gson;

import java.util.*;

/**
 * 备忘录角色，就是提供备份的角色
 * 1.可以使用克隆方式
 * 2.也可以使用序列化的方式
 * ps : 因为序列化基于IO操作，所以性能没有 clone 的好, 而且是差很多的那种
 */
public class StandMemento {
    String target;
    Date date;
    List<String> moods;

    public StandMemento(String target, Date date, List<String> moods) {
        this.target = target;
        this.date = date;
        this.moods = moods;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getMoods() {
        return moods;
    }

    public void setMoods(List<String> moods) {
        this.moods = moods;
    }

}
