package com.example.springbootdemo.serivce;

import com.example.springbootdemo.po.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询员工
     *
     * @param empNo 员工主键
     * @return 员工
     */
    public List<Employee> selectEmployeeByEmpNo(Integer empNo);

    /**
     * 查询所有员工列表
     *
     * @param employee 员工
     * @return 员工集合
     */
    public List<Employee> selectAllEmployee(Employee employee);

    /**
     * 模糊查询员工列表
     *
     * @param employee 员工
     * @return 员工集合
     */
    public List<Employee> selectEmployeeLikeList(Employee employee);

    /**
     * 新增员工
     *
     * @param employee 员工
     * @return 结果
     */
    public void insertEmployee(Employee employee);

    /**
     * 修改员工
     *
     * @param employee 员工
     * @return 结果
     */
    public void updateEmployee(Employee employee);

    /**
     * 删除员工
     *
     * @param empNo 员工主键
     * @return 结果
     */
    public void deleteEmployeeByEmpNo(Integer empNo);

    /**
     * 批量删除员工
     *
     * @param empNos 需要删除的数据主键集合
     * @return 结果
     */
    public void deleteEmployeeByEmpNos(Integer[] empNos);
}
