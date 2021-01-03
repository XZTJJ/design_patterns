package com.zhouhc.eachPattern.decorator.comm;

/**
 * 具体的某个年级的成绩单报告称
 */
public class FourthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("这次考试的成绩为 : 语文:60,数学78,英语:85...");
    }

    @Override
    public void sign() {
        System.out.println("XXX家长已看，签名如下");
    }
}
