package com.lianwei.OAsystem.dao;

import com.lianwei.OAsystem.po.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentDao {
    /**
     * 查询部门数量
     *
     * @param
     * @return 部门
     */
    public Long queryDepartmentCount();
    /**
     * 查询部门
     *
     * @param deptNo 部门主键
     * @return 部门
     */
    public List<Department> selectDepartmentByDeptNo(Integer deptNo);

    /**
     * 查询所有部门列表
     *
     * @param department 部门
     * @return 部门集合
     */
    public List<Department> selectAllDepartment(Department department);

    /**
     * 模糊查询部门列表
     *
     * @param department 部门
     * @return 部门集合
     */
    public List<Department> selectDepartmentLikeList(Department department);
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
