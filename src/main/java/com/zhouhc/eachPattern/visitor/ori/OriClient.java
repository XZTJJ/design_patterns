package com.zhouhc.eachPattern.visitor.ori;

import com.zhouhc.eachPattern.visitor.comm.CommonEmployee;
import com.zhouhc.eachPattern.visitor.comm.Employee;
import com.zhouhc.eachPattern.visitor.comm.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public class OriClient {
    public static void main(String[] args) {
        for (Employee employee : mockEmployee())
            employee.getBaseInfo();
    }

    private static List<Employee> mockEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setName("张三");
        zhangSan.setGender("男");
        zhangSan.setJob("编写Java程序,绝对的蓝领");
        zhangSan.setSalary(1800);

        CommonEmployee liSi = new CommonEmployee();
        liSi.setName("李四");
        liSi.setGender("男");
        liSi.setJob("页面美工,审美素质太不流行");
        liSi.setSalary(1900);

        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setGender("女");
        wangWu.setPerformance("基本上是负值,但我会拍马屁");
        wangWu.setSalary(18750);
        employees.add(zhangSan);
        employees.add(liSi);
        employees.add(wangWu);
        return employees;
    }
}
