package com.example.springbootdemo.po;

import java.io.Serializable;
import java.util.Date;

public class LeaveOfAbsence implements Serializable {

    private Integer leaveId;

    private Integer userId;

    private String leaveEmpName;

    private String leaveDeptName;

    private Integer leaveDays;

    private Date leaveTime;

    private String leaveCause;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLeaveEmpName() {
        return leaveEmpName;
    }

    public void setLeaveEmpName(String leaveEmpName) {
        this.leaveEmpName = leaveEmpName;
    }

    public String getLeaveDeptName() {
        return leaveDeptName;
    }

    public void setLeaveDeptName(String leaveDeptName) {
        this.leaveDeptName = leaveDeptName;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLeaveCause() {
        return leaveCause;
    }

    public void setLeaveCause(String leaveCause) {
        this.leaveCause = leaveCause;
    }

    @Override
    public String toString() {
        return "Leaveofabsence{" +
                "leaveId=" + leaveId +
                ", userId=" + userId +
                ", leaveEmpName='" + leaveEmpName + '\'' +
                ", leaveDeptName='" + leaveDeptName + '\'' +
                ", leaveDays=" + leaveDays +
                ", leaveTime=" + leaveTime +
                ", leaveCause='" + leaveCause + '\'' +
                '}';
    }
}
