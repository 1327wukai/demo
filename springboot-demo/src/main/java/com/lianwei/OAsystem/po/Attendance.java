package com.lianwei.OAsystem.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Attendance implements Serializable {
    //考勤id
    private Integer attendEmpNo;
    //所属部门id
    private Integer empNo;
    //用户id
    private Integer userId;
    //姓名
    private String attendEmpName;
    //签到时间
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date checkInTime;
    //签退时间
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date checkOutTime;
    //状态
    private String checkStatus;

    public Integer getAttendEmpNo() {
        return attendEmpNo;
    }

    public void setAttendEmpNo(Integer attendEmpNo) {
        this.attendEmpNo = attendEmpNo;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAttendEmpName() {
        return attendEmpName;
    }

    public void setAttendEmpName(String attendEmpName) {
        this.attendEmpName = attendEmpName;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendEmpNo=" + attendEmpNo +
                ", empNo=" + empNo +
                ", userId=" + userId +
                ", attendEmpName='" + attendEmpName + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                ", checkStatus='" + checkStatus + '\'' +
                '}';
    }
}
