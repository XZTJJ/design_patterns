package com.zhouhc.eachPattern.command.comm;

/**
 * 抽象工作组，将命令请求者 ，命令执行者, 以及命令分离开始
 */
public interface InterfaceGroup {
    public void find();

    public void add();

    public void delete();

    public void update();

    public void plan();

}
