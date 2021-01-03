package com.zhouhc.eachPattern.decorator.ori;

import com.zhouhc.eachPattern.decorator.comm.FourthGradeSchoolReport;
import com.zhouhc.eachPattern.decorator.comm.SchoolReport;

/**
 * 客户端类
 */
public class OriClient {
    public static void main(String[] args) {
        SchoolReport schoolReport = new FourthGradeSchoolReport();
        schoolReport.report();
        schoolReport.sign();
    }
}
