package com.example.springbootdemo.serivce;

import com.example.springbootdemo.dao.DepartmentDao;
import com.example.springbootdemo.po.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional

public class DepartmentServiceImp implements DepartmentService{

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    @Transactional(readOnly = true)
    public List<Department> selectDepartmentByDeptNo(Integer deptNo) {
        return this.departmentDao.selectDepartmentByDeptNo(deptNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Department> selectDepartmentList(Department department) {
        return this.departmentDao.selectDepartmentList(department);
    }

    @Override
    public void insertDepartment(Department department) {
            this.departmentDao.insertDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
            this.departmentDao.updateDepartment(department);
    }

    @Override
    public void deleteDepartmentByDeptNo(Integer deptNo) {
            this.departmentDao.deleteDepartmentByDeptNo(deptNo);
    }

    @Override
    public void deleteDepartmentByDeptNos(Integer[] deptNos) {
            this.departmentDao.deleteDepartmentByDeptNos(deptNos);
    }

}
