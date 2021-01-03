package com.zhouhc.eachPattern.command.comm;

/**
 * 美工组
 */
public class PageGroup implements InterfaceGroup{
    @Override
    public void find() {
        System.out.println("页面组接到一下需求");
    }

    @Override
    public void add() {
        System.out.println("页面组增加一下需求");
    }

    @Override
    public void delete() {
        System.out.println("页面组删除一下需求");
    }

    @Override
    public void update() {
        System.out.println("页面组删除一下需求");
    }

    @Override
    public void plan() {
        System.out.println("页面组计划一下需求日期");
    }
}
