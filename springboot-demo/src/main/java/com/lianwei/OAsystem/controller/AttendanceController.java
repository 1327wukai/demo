package com.lianwei.OAsystem.controller;

import com.lianwei.OAsystem.po.Attendance;
import com.lianwei.OAsystem.serivce.AttendanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "考勤管理")
@RequestMapping("/oa/Attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    /**
     * 查询已签到考勤数量
     */
    @GetMapping("/queryAttendanceYes")
    @ApiOperation("已签到数量")
    public Long queryAttendanceYes() {
        long count = this.attendanceService.queryAttendanceYes();
        return count;
    }

    /**
     * 查询考勤数量
     */
    @GetMapping("/queryAttendanceCount")
    @ApiOperation("考勤数量")
    public Long queryAttendanceCount() {
        long count = this.attendanceService.queryAttendanceCount();
        return count;
    }

    /**
     * 查询考勤
     */
    @GetMapping("/allAttendanceList")
    @ApiOperation("所有考勤信息")
    public List<Attendance> selectAllAttendance() {
        List<Attendance> list = attendanceService.selectAllAttendance(new Attendance());
        return list;
    }

    /**
     * 模糊查询考勤
     */
    @GetMapping("/selectAttendanceLikeList")
    @ApiOperation("模糊查询考勤信息")
    public List<Attendance> selectAttendanceLikeList() {
        List<Attendance> list = attendanceService.selectAttendanceLikeList(new Attendance());
        return list;
    }

    /**
     * 按id查询考勤
     */
    @GetMapping("/selectAttendanceByAttendEmpNo/{attendEmpNo}")
    @ApiOperation("按id查询考勤")
    public Attendance selectAttendanceByAttendEmpNo(@PathVariable Integer attendEmpNo) {
        Attendance attendance = new Attendance();
        attendance.setAttendEmpNo(Integer.valueOf(attendEmpNo));
        List<Attendance> list = this.attendanceService.selectAttendanceByAttendEmpNo(attendEmpNo);
        return list.get(0);
    }

    /**
     * 新增考勤
     */
    @PostMapping("/insertAttendance")
    @ApiOperation("新增考勤")
    public String insertAttendance(@RequestBody Attendance attendance) {
        this.attendanceService.insertAttendance(attendance);
        return "success";
    }

    /**
     * 修改考勤
     */
    @PutMapping("/updateAttendance")
    @ApiOperation("修改考勤")
    public String updateAttendance(@RequestBody Attendance attendance) {
        this.attendanceService.updateAttendance(attendance);
        return "success";
    }

    /**
     * 删除考勤
     */
    @DeleteMapping("/deleteAttendanceByAttendEmpNo/{attendEmpNo}")
    @ApiOperation("按id删除考勤")
    public String deleteAttendanceByAttendEmpNo(@PathVariable Integer attendEmpNo) {
        this.attendanceService.deleteAttendanceByAttendEmpNo(Integer.valueOf(attendEmpNo));
        return "success";
    }

    /**
     * 批量删除考勤
     */
    @DeleteMapping("/deleteAttendanceByAttendEmpNos/{attendEmpNos}")
    @ApiOperation("按id批量删除考勤")
    public String deleteAttendanceByAttendEmpNos(@PathVariable Integer[] attendEmpNos) {
        this.attendanceService.deleteAttendanceByAttendEmpNos(attendEmpNos);
        return "success";
    }
}
