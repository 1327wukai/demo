package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Attendance;
import com.example.springbootdemo.serivce.AttendanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "考勤管理")
@RequestMapping("/oa/Attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    /**
     * 查询考勤
     */
    @GetMapping("/allAttendanceList")
    @ApiOperation("所有考勤信息")
    public List<Attendance> selectAttendanceList(){
        List<Attendance> list=attendanceService.selectAttendanceList(new Attendance());
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
    public String insertAttendance(@RequestBody Attendance attendance)
    {
        this.attendanceService.insertAttendance(attendance);
        return "success";
    }

    /**
     * 修改考勤
     */
    @PutMapping("/updateAttendance")
    @ApiOperation("修改考勤")
    public String updateAttendance(@RequestBody Attendance attendance)
    {
        this.attendanceService.updateAttendance(attendance);
        return "success";
    }

    /**
     * 删除考勤
     */
    @DeleteMapping("/deleteAttendanceByAttendEmpNo/{attendEmpNo}")
    @ApiOperation("按id删除考勤")
    public String deleteAttendanceByAttendEmpNo(@PathVariable Integer attendEmpNo)
    {
        this.attendanceService.deleteAttendanceByAttendEmpNo(Integer.valueOf(attendEmpNo));
        return "success";
    }
}
