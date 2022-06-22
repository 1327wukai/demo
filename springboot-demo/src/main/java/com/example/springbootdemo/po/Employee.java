package com.example.springbootdemo.po;


import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private Integer empNo;

    private Integer deptNo;

    private Integer userId;

    private String empName;

    private Integer gender;

    private Date birth;

    private Integer phoneNumber;

    private String address;

    private Integer empDept;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEmpDept() {
        return empDept;
    }

    public void setEmpDept(Integer empDept) {
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", deptNo=" + deptNo +
                ", userId=" + userId +
                ", empName='" + empName + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", empDept=" + empDept +
                '}';
    }
}