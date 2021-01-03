package com.zhouhc.eachPattern.visitor.stand;


import com.zhouhc.eachPattern.visitor.comm.CommonEmployee;
import com.zhouhc.eachPattern.visitor.comm.Employee;
import com.zhouhc.eachPattern.visitor.comm.Manager;

/**
 * 默认的观察者类
 */
public class ConcreteVisitor implements IVisitor {
    //测试方法
    @Override
    public void visit(Employee employee) {
        String info = this.getBaseInfo(employee);
        if (employee instanceof CommonEmployee)
            info += this.OtherInfo((CommonEmployee) employee);
        else
            info += this.OtherInfo((Manager) employee);
        System.out.println(info);
    }

    private String getBaseInfo(Employee employee) {
        String info = "姓名:" + employee.getName() + "\t性别:" + employee.getGender() + "\t薪水:" + employee.getSalary();
        return info;
    }

    private String OtherInfo(CommonEmployee commonEmployee) {
        String info = "工作:" + commonEmployee.getName();
        return info;
    }

    private String OtherInfo(Manager manager) {
        String info = "业绩:" + manager.getPerformance();
        return info;
    }
}
