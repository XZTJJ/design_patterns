package com.zhouhc.eachPattern.command.comm;

/**
 * 删除命令
 */
public class DeleteCommand extends AbstractCommand {
    @Override
    public void execute() {
        super.requireGroup.find();
        super.codeGroup.delete();
        super.codeGroup.plan();
        super.pageGroup.delete();
        super.pageGroup.plan();
        super.requireGroup.plan();
    }
}
