package com.zhouhc.eachPattern.visitor.stand;


import com.zhouhc.eachPattern.visitor.comm.Employee;

/**
 * 观察者接口, 根据不同的人，看的方向也应该不同
 */
public interface IVisitor {
    //抽象的观察方法
    public void visit(Employee employee);
}
