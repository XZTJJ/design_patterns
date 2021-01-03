package com.zhouhc.eachPattern.responsibilityChain.comm;

import org.apache.commons.lang.math.RandomUtils;

/**
 * 抽象的处理类
 * 字段是会被子类重新继承，方法不会而是直接调用
 *
 * 采用古代的"三从四德"的方式，所有请求都需要经过批准
 */
public abstract class IStandHandler {
    //数据处理逻辑
    protected int mark;
    protected IStandHandler next;

    public IStandHandler(int mark) {
        this.mark = mark;
    }

    //设置和获取下一个责任链
    public void setNextHandler(IStandHandler nextHandler) {
        this.next = nextHandler;
    }

    //称谓
    private String getName() {
        if (this.mark == 1)
            return "父亲";
        else if (this.mark == 2)
            return "丈夫";
        else if (this.mark == 3)
            return "儿子";
        else
            return "其他人";
    }

    //处理逻辑
    protected abstract boolean response();

    //处理处理过程
    public final void hanlder(IWomen iWomen) {
        if (iWomen.getType() == this.mark) {
            System.out.println(this.getName() + "的回答是:" + (this.response() ? "同意" : "拒绝"));
        } else {
            System.out.println(this.getName() + "处理不了...");
            if (this.next != null)
                this.next.hanlder(iWomen);
            else
                System.out.println("直接拒绝...");
        }
    }
}
