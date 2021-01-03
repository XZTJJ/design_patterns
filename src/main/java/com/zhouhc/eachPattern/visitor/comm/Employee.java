package com.zhouhc.eachPattern.visitor.comm;

import com.zhouhc.eachPattern.visitor.stand.IVisitor;

/**
 * 抽象的员工类
 * 实现一些基本的元素
 */
public abstract class Employee {
    //只需要实现一些基本的属性
    private String name;
    private String gender;
    private double salary;


    //对应的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * 设置原始模式的展示方式！！！！！！
     * 不想copy代码，所以代码复用了
     * 对于标准的观察者模式，这不是需要!!!!!!!!!!!
     */
    public final void getBaseInfo() {
        System.out.println("姓名:" + this.name + "\t性别:" + this.gender +
                "\t薪水:" + this.salary + "\t" + this.getOtherInfo());
    }

    protected abstract String getOtherInfo();


    /**
     * 设置标准的观察者的展示方式！！！！！！
     * 不想copy代码，所以代码复用了
     * 对于原始模式，这不是需要!!!!!!!!!!!
     */
    public final void getBaseInfo(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
