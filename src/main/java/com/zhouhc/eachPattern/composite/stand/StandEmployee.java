package com.zhouhc.eachPattern.composite.stand;

/**
 * 抽象的员工信息， 包括最高层其实也是公司的员工，都是为公司服务
 */
public abstract class StandEmployee {
    //对应姓名，职位，薪水
    private String name;
    private String postion;
    private double salary;

    //显示构造
    public StandEmployee(String postion, String name, double salary) {
        this.name = name;
        this.postion = postion;
        this.salary = salary;
    }

    //对应的getter 和 setter方法
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