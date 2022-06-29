package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Employee;
import com.example.springbootdemo.serivce.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "员工管理")
@RequestMapping("/oa/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询员工数量
     */
    @GetMapping("/queryEmployeeCount")
    @ApiOperation("员工数量")
    public Long queryEmployeeCount(){
        long count=this.employeeService.queryEmployeeCount();
        return count;
    }

    /**
     * 查询员工列表
     */
    @GetMapping("/allEmployeeList")
    @ApiOperation("所有员工列表")
    public List<Employee> selectAllEmployee()
    {
        List<Employee> list = employeeService.selectAllEmployee(new Employee());
        return list;
    }
    /**
     * 模糊查询员工列表
     */
    @GetMapping("/selectEmployeeLikeList")
    @ApiOperation("模糊查询员工列表")
    public List<Employee> selectEmployeeLikeList()
    {
        List<Employee> list = employeeService.selectEmployeeLikeList(new Employee());
        return list;
    }

    /**
     * 获取员工详细信息
     */
    @GetMapping("/selectEmployeeByEmpNo/{empNo}")
    @ApiOperation("按id获取员工详细信息")
    public Employee selectEmployeeByEmpNo(@PathVariable Integer empNo)
    {
        Employee employee = new Employee();
        employee.setEmpNo(Integer.valueOf(empNo));
        List<Employee> list = this.employeeService.selectEmployeeByEmpNo(empNo);
            return list.get(0);

    }

    /**
     * 新增员工
     */
    @PostMapping("/insertEmployee")
    @ApiOperation("新增员工")
    public String insertEmployee(@RequestBody Employee employee)
    {
        this.employeeService.insertEmployee(employee);
        return "success";
    }

    /**
     * 修改员工
     */
    @PutMapping("/updateEmployee")
    @ApiOperation("修改员工")
    public String updateEmployee(@RequestBody Employee employee)
    {
        this.employeeService.updateEmployee(employee);
        return "success";
    }

    /**
     * 删除员工
     */
    @DeleteMapping("/deleteEmployeeByEmpNo/{empNo}")
    @ApiOperation("删除员工")
    public String deleteEmployeeByEmpNo(@PathVariable Integer empNo)
    {
        this.employeeService.deleteEmployeeByEmpNo(Integer.valueOf(empNo));
        return "success";
    }

    /**
     * 批量删除员工
     */
    @DeleteMapping("/deleteEmployeeByEmpNos/{empNos}")
    @ApiOperation("删除员工")
    public String deleteEmployeeByEmpNos(@PathVariable Integer[] empNos)
    {
        this.employeeService.deleteEmployeeByEmpNos(empNos);
        return "success";
    }

}
