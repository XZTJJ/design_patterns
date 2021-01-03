package com.zhouhc.eachPattern.composite.desc.code;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        //根节点
        Composite root = new Composite();
        root.doSomething();
        //双亲节点
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        dispaly(root);
    }

    public static void dispaly(Component root) {
        root.doSomething();
        if (root instanceof Composite)
            for (Component component : ((Composite) root).getChildren())
                dispaly(component);
    }
}
