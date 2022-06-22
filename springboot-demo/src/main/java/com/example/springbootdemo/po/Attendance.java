package com.example.springbootdemo.po;

import java.io.Serializable;
import java.sql.Date;

public class Attendance implements Serializable {

    private Integer attendEmpNo;

    private Integer empNo;

    private Integer userId;

    private String attendEmpName;

    private Date checkInTime;

    private Date checkOutTime;

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

    @Override
    public String toString() {
        return "Attendance{" +
                "attendEmpNo=" + attendEmpNo +
                ", empNo=" + empNo +
                ", userId=" + userId +
                ", attendEmpName='" + attendEmpName + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                '}';
    }
}
