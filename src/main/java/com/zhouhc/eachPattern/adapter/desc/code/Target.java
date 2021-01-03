package com.zhouhc.eachPattern.adapter.desc.code;

/**
 * 目标角色，也就是我们期望角色，
 * <p>
 * 需要将其他角色转换成目标角色才行
 */
public interface Target {
    //目标角色有自己的方法
    public void request();
}
