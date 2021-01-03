package com.zhouhc.eachPattern.decorator.stand;

import com.zhouhc.eachPattern.decorator.comm.FourthGradeSchoolReport;
import com.zhouhc.eachPattern.decorator.comm.SchoolReport;

/**
 * 客户端类
 */
public class StandClient {
    public static void main(String[] args) {
        SchoolReport report = new FourthGradeSchoolReport();
        report = new RankSchoolReport(report);
        report = new HighestScoreSchoolReport(report);
        report.report();
        report.sign();
    }
}
