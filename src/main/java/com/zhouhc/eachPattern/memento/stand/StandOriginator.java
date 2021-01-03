package com.zhouhc.eachPattern.memento.stand;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 发起人角色，也就是需要备份的类
 * 1.可以使用克隆方式
 * 2.也可以使用序列化的方式
 * ps : 因为序列化基于IO操作，所以性能没有 clone 的好, 而且是差很多的那种
 */
public class StandOriginator implements Cloneable {
    String target;
    Date date;
    List<String> moods;

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

    //进行备份
    public StandMemento setMemento() {
        StandMemento bak = null;
        if (this.moods instanceof ArrayList)
            bak = new StandMemento(this.target, (Date) this.date.clone(), (ArrayList<String>) ((ArrayList) this.moods).clone());
        else if (this.moods instanceof LinkedList)
            bak = new StandMemento(this.target, (Date) this.date.clone(), (LinkedList<String>) ((LinkedList) this.moods).clone());
        return bak;
    }

    //进行恢复
    public void restoreMemento(StandMemento bak) {
        this.setDate(bak.getDate());
        this.setTarget(bak.getTarget());
        this.setMoods(bak.getMoods());
    }

    @Override
    public String toString() {
        return "{ target:" + this.target + " , date:" + this.date.toString() +
                " , moods: [" + StringUtils.join(this.moods, ",") +"]}";
    }
}
