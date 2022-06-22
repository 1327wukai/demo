package com.example.springbootdemo.serivce;

import com.example.springbootdemo.po.Attendance;

import java.util.List;

public interface AttendanceService {
    /**
     * 查询考勤
     *
     * @param attendEmpNo 考勤主键
     * @return 考勤
     */
    public List<Attendance> selectAttendanceByAttendEmpNo(Integer attendEmpNo);

    /**
     * 查询考勤列表
     *
     * @param attendance 考勤
     * @return 考勤集合
     */
    public List<Attendance> selectAttendanceList(Attendance attendance);

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
