package com.zhouhc.eachPattern.command.comm;


/**
 * 抽象命令接口， 将命令请求者 ，命令执行者, 以及命令分离开始
 */
public abstract class AbstractCommand {
    //对应命令组
    protected InterfaceGroup requireGroup = new RequireGroup();
    protected InterfaceGroup pageGroup = new PageGroup();
    protected InterfaceGroup codeGroup = new CodePage();

    //抽象命令组
    public abstract void execute();
}
