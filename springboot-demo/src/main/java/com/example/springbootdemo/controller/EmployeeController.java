package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Employee;
import com.example.springbootdemo.serivce.EmployeeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "员工管理")
@RequestMapping("/oa/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询员工列表
     */
    @GetMapping("/list")
    public List<Employee> list()
    {
        List<Employee> list = employeeService.selectEmployeeList(new Employee());
        return list;
    }


    /**
     * 获取员工详细信息
     */
    @GetMapping("/getEmployeeInfo/{empNo}")
    public Employee getEmployeeInfo(@PathVariable Integer empNo)
    {
        Employee employee = new Employee();
        employee.setEmpNo(Integer.valueOf(empNo));
        List<Employee> list = this.employeeService.selectEmployeeByEmpNo(empNo);
        return list.get(0);
    }

    /**
     * 新增员工
     */
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee)
    {
        this.employeeService.insertEmployee(employee);
        return "success";
    }

    /**
     * 修改员工
     */
    @PutMapping("/editEmployee")
    public String editEmployee(@RequestBody Employee employee)
    {
        this.employeeService.updateEmployee(employee);
        return "success";
    }

    /**
     * 删除员工
     */
    @DeleteMapping("/deleteEmployee/{empNo}")
    public String delete(@PathVariable Integer empNo)
    {
        this.employeeService.deleteEmployeeByEmpNo(Integer.valueOf(empNo));
        return "success";
    }

}
