package com.zhouhc.eachPattern.decorator.stand;

import com.zhouhc.eachPattern.decorator.comm.SchoolReport;

/**
 * 抽象的装饰
 */
public abstract class StandDecorator extends SchoolReport {

    protected SchoolReport schoolReport;

    public StandDecorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign() {
        this.schoolReport.sign();
    }
}
