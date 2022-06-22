package com.example.springbootdemo.dao;

import com.example.springbootdemo.po.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentDao {
    /**
     * 查询部门
     *
     * @param deptNo 部门主键
     * @return 部门
     */
    public List<Department> selectDepartmentByDeptNo(Integer deptNo);

    /**
     * 查询部门列表
     *
     * @param department 部门
     * @return 部门集合
     */
    public List<Department> selectDepartmentList(Department department);

    /**
     * 新增部门
     *
     * @param department 部门
     * @return 结果
     */
    public void insertDepartment(Department department);

    /**
     * 修改部门
     *
     * @param department 部门
     * @return 结果
     */
    public void updateDepartment(Department department);

    /**
     * 删除部门
     *
     * @param deptNo 部门主键
     * @return 结果
     */
    public void deleteDepartmentByDeptNo(Integer deptNo);

    /**
     * 批量删除部门
     *
     * @param deptNos 需要删除的数据主键集合
     * @return 结果
     */
    public void deleteDepartmentByDeptNos(Integer[] deptNos);
}