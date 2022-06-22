package com.example.springbootdemo.po;

import java.io.Serializable;

public class Department implements Serializable {

    private Integer deptNo;

    private Integer userId;

    private String deptName;

    private String deptRemark;

    private Integer deptNum;

    private String status;

    private Integer deptLeader;

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptRemark() {
        return deptRemark;
    }

    public void setDeptRemark(String deptRemark) {
        this.deptRemark = deptRemark;
    }

    public Integer getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(Integer deptNum) {
        this.deptNum = deptNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDeptLeader() {
        return deptLeader;
    }

    public void setDeptLeader(Integer deptLeader) {
        this.deptLeader = deptLeader;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", userId=" + userId +
                ", deptName='" + deptName + '\'' +
                ", deptRemark='" + deptRemark + '\'' +
                ", deptNum=" + deptNum +
                ", status='" + status + '\'' +
                ", deptLeader=" + deptLeader +
                '}';
    }
}
