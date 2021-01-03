package com.zhouhc.eachPattern.memento.ori;

import com.zhouhc.eachPattern.memento.stand.StandMemento;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 反射获取到的也是对象的引用
 *
 * 与设计模式无关，突发奇想的
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        StandMemento standMemento = new StandMemento(null, null, null);
        standMemento.setMoods(new ArrayList<>(Arrays.asList("测试一", "测试二")));

        Field moods = standMemento.getClass().getDeclaredField("moods");
        moods.setAccessible(true);
        List cloneList = (List) moods.get(standMemento);
        cloneList.add("测试三");
        System.out.println("");
    }
}
