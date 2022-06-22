package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Department;
import com.example.springbootdemo.serivce.DepartmentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "部门管理")
@RequestMapping("/oa/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询部门列表
     */
    @GetMapping("/deptList")
    @ResponseBody
    public List<Department> deptList() {
        List<Department> list = departmentService.selectDepartmentList(new Department());
        return list;
    }

    /**
     * id查询部门列表
     */
    @GetMapping("/deptById/{deptNo}")
    @ResponseBody
    public Department deptById(@PathVariable Integer deptNo) {
        Department department = new Department();
        department.setDeptNo(Integer.valueOf(deptNo));
        List<Department> list = this.departmentService.selectDepartmentByDeptNo(deptNo);
        return list.get(0);
    }
    /**
     * 新增部门
     */
    @PostMapping("/addDept")
    @ResponseBody
    public String addDept(@RequestBody Department department) {
        this.departmentService.insertDepartment(department);
        return "success";
    }

    /**
     * 修改部门
     */
    @PutMapping("/editDept")
    @ResponseBody
    public String editDept(@RequestBody Department department) {
        this.departmentService.updateDepartment(department);
        return "success";
    }

    /**
     * 删除部门
     */
    @DeleteMapping("/deleteDept/{deptNo}")
    public String deleteDept(@PathVariable Integer deptNo) {
        this.departmentService.deleteDepartmentByDeptNo(Integer.valueOf(deptNo));
        return "success";
    }
}
