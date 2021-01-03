package com.zhouhc.eachPattern.strategy.ori;

import com.zhouhc.eachPattern.strategy.comm.BackDoor;
import com.zhouhc.eachPattern.strategy.comm.BlockEnemy;
import com.zhouhc.eachPattern.strategy.comm.GiveGreenLight;

/**
 * 策略模式好像没有什么可以解释的
 * 原始的不符合依赖导致的原则
 */
public class OriClass {
    public static void main(String[] args) {
        System.out.println("------初到吴国------");
        BackDoor backDoor = new BackDoor();
        backDoor.action();
        System.out.println("------可不思蜀------");
        GiveGreenLight giveGreenLight = new GiveGreenLight();
        giveGreenLight.action();
        System.out.println("------追兵将至------");
        BlockEnemy blockEnemy = new BlockEnemy();
        blockEnemy.action();
    }
}
