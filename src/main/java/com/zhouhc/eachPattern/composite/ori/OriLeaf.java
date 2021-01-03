package com.zhouhc.eachPattern.composite.ori;

/**
 * 基础的叶子节点，
 * 对应公司的小喽啰
 *
 * 按照公司的职位打印对应信息
 */
public class OriLeaf {
    //对应姓名，职位，薪水
    private String name;
    private String postion;
    private double salary;

    public OriLeaf(String postion, String name, double salary) {
        this.name = name;
        this.postion = postion;
        this.salary = salary;
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
