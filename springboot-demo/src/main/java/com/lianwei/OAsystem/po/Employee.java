package com.lianwei.OAsystem.po;


import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    //员工id
    private Integer empNo;
    //部门id
    private Integer deptNo;
    //用户id
    private Integer userId;
    //部门名称
    private String empName;
    //性别
    private String gender;
    //生日
    private Date birth;
    //电话
    private String phoneNumber;
    //地址
    private String address;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", deptNo=" + deptNo +
                ", userId=" + userId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
