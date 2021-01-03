package com.zhouhc.eachPattern.visitor.comm;



/**
 * 基础的员工类型
 */
public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    protected String getOtherInfo() {
        return "工作:" + this.job;
    }
}
