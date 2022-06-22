package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Department;
import com.example.springbootdemo.serivce.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "部门管理")
@RequestMapping("/oa/Department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询部门列表
     */
    @GetMapping("/allDepartmentList")
    @ApiOperation("所有部门列表")
    public List<Department> selectDepartmentList() {
        List<Department> list = departmentService.selectDepartmentList(new Department());
        return list;
    }

    /**
     * id查询部门列表
     */
    @GetMapping("/selectDepartmentByDeptNo/{deptNo}")
    @ApiOperation("id查询部门列表")
    public Department selectDepartmentByDeptNo(@PathVariable Integer deptNo) {
        Department department = new Department();
        department.setDeptNo(Integer.valueOf(deptNo));
        List<Department> list = this.departmentService.selectDepartmentByDeptNo(deptNo);
        return list.get(0);
    }
    /**
     * 新增部门
     */
    @PostMapping("/insertDepartment")
    @ApiOperation("新增部门")
    public String insertDepartment(@RequestBody Department department) {
        this.departmentService.insertDepartment(department);
        return "success";
    }

    /**
     * 修改部门
     */
    @PutMapping("/updateDepartment")
    @ApiOperation("修改部门")
    public String updateDepartment(@RequestBody Department department) {
        this.departmentService.updateDepartment(department);
        return "success";
    }

    /**
     * 删除部门
     */
    @DeleteMapping("/deleteDepartmentByDeptNo/{deptNo}")
    @ApiOperation("按id删除部门")
    public String deleteDepartmentByDeptNo(@PathVariable Integer deptNo) {
        this.departmentService.deleteDepartmentByDeptNo(Integer.valueOf(deptNo));
        return "success";
    }
}
