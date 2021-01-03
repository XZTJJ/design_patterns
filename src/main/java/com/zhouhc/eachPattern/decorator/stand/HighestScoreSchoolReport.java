package com.zhouhc.eachPattern.decorator.stand;

import com.zhouhc.eachPattern.decorator.comm.SchoolReport;

/**
 * 最高分的修饰类
 */
public class HighestScoreSchoolReport extends StandDecorator {


    public HighestScoreSchoolReport(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        System.out.println("本次考试数学最高分 : 数学:80,我这次数学成绩是78...");
        super.report();
    }

    @Override
    public void sign() {
        System.out.println("最高分不需要签字");
        super.sign();
    }
}
