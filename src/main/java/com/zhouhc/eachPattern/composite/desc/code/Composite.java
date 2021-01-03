package com.zhouhc.eachPattern.composite.desc.code;

import java.util.ArrayList;

/**
 * 树杈节点，相当于二叉树中非叶子节点(双亲节点)，
 */
public class Composite extends Component {
    //通常情况下包含一些基本的构件
    private ArrayList<Component> components = new ArrayList<Component>();

    //可以增加节点
    public void add(Component component) {
        this.components.add(component);
    }

    //删除叶子节点
    public void remove(Component component) {
        this.components.remove(component);
    }

    //获得某个分支节点
    public ArrayList<Component> getChildren() {
        return this.components;
    }
}
