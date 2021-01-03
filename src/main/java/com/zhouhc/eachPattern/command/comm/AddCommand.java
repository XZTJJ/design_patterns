package com.zhouhc.eachPattern.command.comm;

/**
 * 增加需求具体命令
 */
public class AddCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.requireGroup.find();
        super.codeGroup.add();
        super.codeGroup.plan();
        super.pageGroup.add();
        super.pageGroup.plan();
        super.requireGroup.plan();
    }
}
