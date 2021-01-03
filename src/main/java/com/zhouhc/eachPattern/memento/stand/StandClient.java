package com.zhouhc.eachPattern.memento.stand;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StandClient {
    public static void main(String[] args) {
        //备份角色
        StandCaretaker caretaker = new StandCaretaker();
        //主要角色
        StandOriginator standOriginator = new StandOriginator();
        standOriginator.setTarget("我要变得非常牛逼");
        standOriginator.setDate(Date.from(LocalDateTime.now().plusYears(1).atZone(ZoneId.systemDefault()).toInstant()));
        standOriginator.setMoods(new ArrayList<String>(Arrays.asList("高兴", "紧张", "激动")));
        //最初的状态
        System.out.println("----最开始状态----");
        System.out.println(standOriginator);
        //备份
        caretaker.setStandMemento(standOriginator.setMemento());
        //修改状态
        standOriginator.setTarget("感觉非常的沮丧");
        standOriginator.setDate(new Date());
        standOriginator.setMoods(new ArrayList<String>(Arrays.asList("想哭", "还是想哭", "高兴不起来")));
        System.out.println("----失败状态----");
        System.out.println(standOriginator);

        //状态恢复
        standOriginator.restoreMemento(caretaker.getStandMemento());
        System.out.println("----状态还原----");
        System.out.println(standOriginator);

    }
}
