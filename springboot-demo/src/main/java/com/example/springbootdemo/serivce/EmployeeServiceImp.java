package com.example.springbootdemo.serivce;

import com.example.springbootdemo.dao.EmployeeDao;
import com.example.springbootdemo.po.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> selectEmployeeByEmpNo(Integer empNo) {
        return this.employeeDao.selectEmployeeByEmpNo(empNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> selectAllEmployee(Employee employee) {
        return this.employeeDao.selectAllEmployee(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> selectEmployeeLikeList(Employee employee) {
        return this.employeeDao.selectEmployeeLikeList(employee);
    }

    @Override
    public void insertEmployee(Employee employee) {
        this.employeeDao.insertEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        this.employeeDao.updateEmployee(employee);
    }

    @Override
    public void deleteEmployeeByEmpNo(Integer empNo) {
        this.employeeDao.deleteEmployeeByEmpNo(empNo);
    }

    @Override
    public void deleteEmployeeByEmpNos(Integer[] empNos) {
        this.employeeDao.deleteEmployeeByEmpNos(empNos);
    }
}
