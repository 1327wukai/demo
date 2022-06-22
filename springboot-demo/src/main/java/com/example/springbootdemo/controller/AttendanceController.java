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
@RequestMapping("/oa/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    /**
     * 查询考勤
     */
    @GetMapping("/AllAttendanceList")
    @ApiOperation("所有考勤信息")
    public List<Attendance> AttendanceList(){
        List<Attendance> list=attendanceService.selectAttendanceList(new Attendance());
        return list;
    }
    /**
     * 按id查询考勤
     */
    @GetMapping("/attendanceQueryById/{attendEmpNo}")
    @ApiOperation("按id查询考勤")
    public Attendance attendanceQueryById(@PathVariable Integer attendEmpNo) {
        Attendance attendance = new Attendance();
        attendance.setAttendEmpNo(Integer.valueOf(attendEmpNo));
        List<Attendance> list = this.attendanceService.selectAttendanceByAttendEmpNo(attendEmpNo);
        return list.get(0);
    }
    /**
     * 新增考勤
     */
    @PostMapping("/addAttendance")
    @ApiOperation("新增考勤")
    public String addAttendance(@RequestBody Attendance attendance)
    {
        this.attendanceService.insertAttendance(attendance);
        return "success";
    }

    /**
     * 修改考勤
     */
    @PutMapping("/editAttendance")
    @ApiOperation("修改考勤")
    public String editAttendance(@RequestBody Attendance attendance)
    {
        this.attendanceService.updateAttendance(attendance);
        return "success";
    }

    /**
     * 删除考勤
     */
    @DeleteMapping("/deleteAttendance/{attendEmpNo}")
    @ApiOperation("按id删除考勤")
    public String deleteAttendance(@PathVariable Integer attendEmpNo)
    {
        this.attendanceService.deleteAttendanceByAttendEmpNo(Integer.valueOf(attendEmpNo));
        return "success";
    }
}
