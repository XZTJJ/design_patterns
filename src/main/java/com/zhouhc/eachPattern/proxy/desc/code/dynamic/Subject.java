package com.zhouhc.eachPattern.proxy.desc.code.dynamic;

/**
 * 动态代理， 业务处理类 和 实际的代理类分类，实际的代理其实动态生成， 实际的代理 有一个 InvocationHandler 实例
 * 而 InvocationHandler 实例 持有以 被代理者的实例。调用的过程就是 动态代理者 调用 InvocationHandler ，而 InvocationHandler 将方法
 * 分给 被代理者 执行
 *
 * jdk 自带的 动态代理，要求 被代理者 必须是某个接口的实现，也就是只能代理接口，原因猜测是: 接口实现比较加单，接口只能接口，不用考虑抽象类 和 实际类
 * 这样就会减少非常多的 类型 查找 抽象方法的实现，提高性能。
 */
public interface Subject {
    //模拟业务逻辑
    public void doSomething(String str);
}
