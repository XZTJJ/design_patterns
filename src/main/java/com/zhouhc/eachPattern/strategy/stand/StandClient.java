package com.zhouhc.eachPattern.strategy.stand;

import com.zhouhc.eachPattern.strategy.comm.BackDoor;
import com.zhouhc.eachPattern.strategy.comm.BlockEnemy;
import com.zhouhc.eachPattern.strategy.comm.GiveGreenLight;

public class StandClient {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.setiStrategy(new BackDoor());
        System.out.println("------初到吴国------");
        strategyContext.exction();
        System.out.println("------可不思蜀------");
        strategyContext.setiStrategy(new GiveGreenLight());
        strategyContext.exction();
        System.out.println("------追兵将至------");
        strategyContext.setiStrategy(new BlockEnemy());
        strategyContext.exction();
    }
}
