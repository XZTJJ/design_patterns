package com.zhouhc.eachPattern.memento.ext;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ExtClient {
    public static void main(String[] args)  throws Exception{
        //测试三合一
        ExtOriginatorA extOriginatorA = new ExtOriginatorA();
        extOriginatorA.setState("高兴");
        System.out.println("----初始转态----");
        System.out.println(extOriginatorA);
        extOriginatorA.createMemento();
        extOriginatorA.setState("伤心");
        System.out.println("----后面转态----");
        System.out.println(extOriginatorA);
        //转态还原
        extOriginatorA.restoreMemento();
        System.out.println("----还原转态----");
        System.out.println(extOriginatorA);


        //测试多转态,多次数备份
        ExtOriginatorB extOriginatorB = new ExtOriginatorB();
        ExtCaretaker caretaker = new ExtCaretaker();
        //主要角色
        extOriginatorB.setTarget("我要变得非常牛逼");
        extOriginatorB.setDate(Date.from(LocalDateTime.now().plusYears(1).atZone(ZoneId.systemDefault()).toInstant()));
        extOriginatorB.setMoods(new ArrayList<String>(Arrays.asList("高兴", "紧张", "激动")));
        //最初的状态
        System.out.println("----最开始状态----");
        System.out.println(extOriginatorB);
        //备份
        caretaker.setExtMementoB("111111",extOriginatorB.createMemento());
        //修改状态
        extOriginatorB.setTarget("感觉非常的沮丧");
        extOriginatorB.setDate(new Date());
        extOriginatorB.setMoods(new ArrayList<String>(Arrays.asList("想哭", "还是想哭", "高兴不起来")));
        System.out.println("----失败状态----");
        System.out.println(extOriginatorB);

        //状态恢复
        extOriginatorB.restoreMemento(caretaker.getExtMementoB("111111"));
        System.out.println("----状态还原----");
        System.out.println(extOriginatorB);
    }
}
