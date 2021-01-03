package com.zhouhc.eachPattern.composite.ori;

import java.util.ArrayList;
import java.util.List;

/**
 * 对应公司的领导人物
 *
 * 按照公司的职位打印对应信息
 */
public class OriBranch {
    //对应下属
    private List oriSubordinate = new ArrayList<>();
    //对应姓名，职位，薪水
    private String name;
    private String postion;
    private double salary;

    public OriBranch(String postion, String name, double salary) {
        this.name = name;
        this.postion = postion;
        this.salary = salary;
    }

    //常用的getter和setter
    public List getOriSubordinate() {
        return oriSubordinate;
    }

    public void setOriSubordinate(List oriSubordinate) {
        this.oriSubordinate = oriSubordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //添加下属
    public void addSubordinate(Object subordinate) {
        this.oriSubordinate.add(subordinate);
    }

    //基本信息
    public String getInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "姓名:" + this.name + "\t职位:" + this.postion
                + "\t薪水:" + this.salary;
    }

}
