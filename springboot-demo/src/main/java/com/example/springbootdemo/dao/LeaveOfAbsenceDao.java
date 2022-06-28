package com.example.springbootdemo.dao;

import com.example.springbootdemo.po.LeaveOfAbsence;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface LeaveOfAbsenceDao {

    /**
     * 查询请假
     *
     * @param leaveId 请假主键
     * @return 请假
     */
    public List<LeaveOfAbsence> selectLeaveOfAbsenceByLeaveId(Integer leaveId);

    /**
     * 查询所有请假列表
     *
     * @param leaveofabsence 请假
     * @return 请假集合
     */
    public List<LeaveOfAbsence> selectAllLeaveOfAbsence(LeaveOfAbsence leaveofabsence);


    /**
     * 模糊查询请假列表
     *
     * @param leaveOfAbsence 请假
     * @return 请假集合
     */
    public List<LeaveOfAbsence> selectLeaveOfAbsenceLikeList(LeaveOfAbsence leaveOfAbsence);

    /**
     * 新增请假
     *
     * @param leaveofabsence 请假
     * @return 结果
     */
    public void insertLeaveOfAbsence(LeaveOfAbsence leaveofabsence);

    /**
     * 修改请假
     *
     * @param leaveofabsence 请假
     * @return 结果
     */
    public void updateLeaveOfAbsence(LeaveOfAbsence leaveofabsence);

    /**
     * 删除请假
     *
     * @param leaveId 请假主键
     * @return 结果
     */
    public void deleteLeaveOfAbsenceByLeaveId(Integer leaveId);

}
