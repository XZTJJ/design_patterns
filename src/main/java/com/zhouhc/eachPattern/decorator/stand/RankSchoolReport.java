package com.zhouhc.eachPattern.decorator.stand;

import com.zhouhc.eachPattern.decorator.comm.SchoolReport;

/**
 * 排名的修饰类
 */
public class RankSchoolReport extends StandDecorator {


    public RankSchoolReport(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        System.out.println("本次考试排名是:13....");
        super.report();
    }

    @Override
    public void sign() {
        System.out.println("排名不需要签字");
        super.sign();
    }
}
