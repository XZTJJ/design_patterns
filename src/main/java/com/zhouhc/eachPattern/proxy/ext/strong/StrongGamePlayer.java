package com.zhouhc.eachPattern.proxy.ext.strong;

/**
 * 强代理的实现类, 代理者 必须由 被代理者 是指定才行 (代理者和被代理者双方都是知道彼此的存在)
 */
public class StrongGamePlayer implements InterfaceStrongGamePlayer {
    // 代理者 角色
    private InterfaceStrongGamePlayer strongGamePlayerProxy;
    // 玩家的名字
    private String name;

    //玩家标识
    public StrongGamePlayer(String name) {
        this.name = name;
    }

    @Override
    public InterfaceStrongGamePlayer getProxy() {
        this.strongGamePlayerProxy = new StrongGamePlayerProxy(this);
        return this.strongGamePlayerProxy;
    }

    @Override
    public void login(String name, String password) {
        //没有指定代理，不允许做任何操作
        if (!isProxy())
            return;
        System.out.println(this.name + "开始登录了, 用户名为:" + name + " , 密码为:" + password);

    }

    @Override
    public void killBoss() {
        //没有指定代理，不允许做任何操作
        if (!isProxy())
            return;
        System.out.println(this.name + "正在打怪...");
    }

    @Override
    public void upgrade() {
        //没有指定代理，不允许做任何操作
        if (!isProxy())
            return;
        System.out.println(this.name + "升级了...");
    }


    //判断是否指定代理
    private boolean isProxy() {
        if (this.strongGamePlayerProxy == null) {
            System.out.println("请使用的代理类...");
            return false;
        }  else {
            return true;
        }
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
