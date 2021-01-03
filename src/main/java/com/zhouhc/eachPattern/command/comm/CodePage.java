package com.zhouhc.eachPattern.command.comm;

/**
 * 代码组
 */
public class CodePage implements InterfaceGroup{
    @Override
    public void find() {
        System.out.println("代码组接到一下需求");
    }

    @Override
    public void add() {
        System.out.println("代码组增加一下需求");
    }

    @Override
    public void delete() {
        System.out.println("代码组删除一下需求");
    }

    @Override
    public void update() {
        System.out.println("代码组删除一下需求");
    }

    @Override
    public void plan() {
        System.out.println("代码组计划一下需求日期");
    }
}
