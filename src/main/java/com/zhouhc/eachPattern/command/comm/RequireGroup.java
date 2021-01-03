package com.zhouhc.eachPattern.command.comm;

/**
 * 项目组
 */
public class RequireGroup implements InterfaceGroup{
    @Override
    public void find() {
        System.out.println("项目组接到一下需求");
    }

    @Override
    public void add() {
        System.out.println("项目组增加一下需求");
    }

    @Override
    public void delete() {
        System.out.println("项目组删除一下需求");
    }

    @Override
    public void update() {
        System.out.println("项目组删除一下需求");
    }

    @Override
    public void plan() {
        System.out.println("项目组计划一下需求日期");
    }
}
