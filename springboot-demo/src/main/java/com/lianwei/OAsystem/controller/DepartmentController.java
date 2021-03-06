package com.lianwei.OAsystem.controller;

import com.lianwei.OAsystem.po.Department;
import com.lianwei.OAsystem.serivce.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "部门管理")
@RequestMapping("/oa/Department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询部门数量
     */
    @GetMapping("/queryDepartmentCount")
    @ApiOperation("部门数量")
    public Long queryDepartmentCount(){
        long count=this.departmentService.queryDepartmentCount();
        return count;
    }

    /**
     * 查询部门列表
     */
    @GetMapping("/allDepartmentList")
    @ApiOperation("所有部门列表")
    public List<Department> selectAllDepartment() {
        List<Department> list = departmentService.selectAllDepartment(new Department());
        return list;
    }

    /**
     * 模糊查询部门
     */
    @GetMapping("/selectDepartmentLikeList")
    @ApiOperation("模糊查询部门列表")
    public List<Department> selectDepartmentLikeList() {
        List<Department> list = departmentService.selectDepartmentLikeList(new Department());
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

    /**
     * 批量删除部门
     */
    @DeleteMapping("/deleteDepartmentByDeptNos/{deptNos}")
    @ApiOperation("按id批量删除部门")
    public String deleteDepartmentByDeptNos(@PathVariable Integer[] deptNos) {
        this.departmentService.deleteDepartmentByDeptNos(deptNos);
        return "success";
    }

}
