package com.example.springbootdemo.serivce;

import com.example.springbootdemo.po.Attendance;

import java.util.List;

public interface AttendanceService {
    /**
     * 查询已签到考勤数量
     *
     * @param
     * @return 考勤
     */
    public Long queryAttendanceYes();

    /**
     * 查询考勤数量
     *
     * @param
     * @return 考勤
     */
    public Long queryAttendanceCount();
    /**
     * 查询考勤
     *
     * @param attendEmpNo 考勤主键
     * @return 考勤
     */
    public List<Attendance> selectAttendanceByAttendEmpNo(Integer attendEmpNo);

    /**
     * 查询所有考勤列表
     *
     * @param attendance 考勤
     * @return 考勤集合
     */
    public List<Attendance> selectAllAttendance(Attendance attendance);

    /**
     * 模糊查询考勤列表
     *
     * @param attendance 考勤
     * @return 考勤集合
     */
    public List<Attendance> selectAttendanceLikeList(Attendance attendance);

    /**
     * 新增考勤
     *
     * @param attendance 考勤
     * @return 结果
     */
    public void insertAttendance(Attendance attendance);

    /**
     * 修改考勤
     *
     * @param attendance 考勤
     * @return 结果
     */
    public void updateAttendance(Attendance attendance);

    /**
     * 删除考勤
     *
     * @param attendEmpNo 考勤主键
     * @return 结果
     */
    public void deleteAttendanceByAttendEmpNo(Integer attendEmpNo);

    /**
     * 批量删除考勤
     *
     * @param attendEmpNos 需要删除的数据主键集合
     * @return 结果
     */
    public void deleteAttendanceByAttendEmpNos(Integer[] attendEmpNos);
}
