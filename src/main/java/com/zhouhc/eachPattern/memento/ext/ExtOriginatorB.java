package com.zhouhc.eachPattern.memento.ext;

import com.google.gson.Gson;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

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
public class ExtOriginatorB {
    //模拟一些比较苛刻的测试环境
    private String target;
    private Date date;
    private List<String> moods;

    //对应的setter 和 getter方法
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

    public ExtOriginatorB() {
    }

    //创建一个备份，为了全部都是深克隆对象，所以直接序列化就好
    public ExtMementoB createMemento() {
        String s = new Gson().toJson(this);
        ExtIMemento extIMemento = this.new InnerMemento(s);
        return new ExtMementoB(extIMemento);
    }

    //转态恢复
    public void restoreMemento(ExtMementoB extMementoB) throws IllegalAccessException, InvocationTargetException {
        InnerMemento extIMemento = (InnerMemento) extMementoB.getMemento();
        String jsonContext = extIMemento.getJsonContext();
        ExtOriginatorB extOriginatorB = (ExtOriginatorB) new Gson().fromJson(jsonContext, ExtOriginatorB.class);
        BeanUtils.copyProperties(this, extOriginatorB);
    }

    @Override
    public String toString() {
        return "{ target:" + this.target + " , date:" + this.date.toString() +
                " , moods: [" + StringUtils.join(this.moods, ",") + "]}";
    }

    /**
     * 内部类保证了，这样就只能由当前对象访问了
     */
    private class InnerMemento implements ExtIMemento {
        //非常简单的对象保存方式，直接将对象序列化成json字符串保存
        private String jsonContext;

        public InnerMemento(String jsonContext) {
            this.jsonContext = jsonContext;
        }

        public String getJsonContext() {
            return jsonContext;
        }

        public void setJsonContext(String jsonContext) {
            this.jsonContext = jsonContext;
        }
    }
}
