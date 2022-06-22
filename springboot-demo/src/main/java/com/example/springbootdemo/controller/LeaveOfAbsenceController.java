package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.LeaveOfAbsence;
import com.example.springbootdemo.serivce.LeaveOfAbsenceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "请假管理")
@RequestMapping("/oa/LeaveOfAbsence")
public class LeaveOfAbsenceController {

    @Autowired
    private LeaveOfAbsenceService leaveOfAbsenceService;

    /**
     * 查询请假列表
     */
    @GetMapping("/allLeaveOfAbsenceList")
    @ApiOperation("所有请假列表")
    public List<LeaveOfAbsence> selectLeaveOfAbsenceList() {
        List<LeaveOfAbsence> list = leaveOfAbsenceService.selectLeaveOfAbsenceList(new LeaveOfAbsence());
        return list;
    }

    /**
     * 获取请假详细信息
     */

    @GetMapping("/selectLeaveOfAbsenceByLeaveId/{leaveId}")
    @ApiOperation("按id获取请假信息")
    public LeaveOfAbsence selectLeaveOfAbsenceByLeaveId(@PathVariable Integer leaveId) {
        LeaveOfAbsence leaveOfAbsence = new LeaveOfAbsence();
        leaveOfAbsence.setLeaveId(Integer.valueOf(leaveId));
        List<LeaveOfAbsence> list = this.leaveOfAbsenceService.selectLeaveOfAbsenceByLeaveId(leaveId);
        return list.get(0);
    }

    /**
     * 新增请假
     */
    @PostMapping("/insertLeaveOfAbsence")
    @ApiOperation("新增请假")
    public String insertLeaveOfAbsence(@RequestBody LeaveOfAbsence leaveofabsence) {
        this.leaveOfAbsenceService.insertLeaveOfAbsence(leaveofabsence);
        return "success";
    }

    /**
     * 修改请假
     */
    @PutMapping("/updateLeaveOfAbsence")
    @ApiOperation("修改请假")
    public String updateLeaveOfAbsence(@RequestBody LeaveOfAbsence leaveofabsence) {
        this.leaveOfAbsenceService.updateLeaveOfAbsence(leaveofabsence);
        return "success";
    }

    /**
     * 删除请假
     */
    @DeleteMapping("/deleteLeaveOfAbsenceByLeaveId/{leaveId}")
    @ApiOperation("按id删除请假")
    public String deleteLeaveOfAbsenceByLeaveId(@PathVariable Integer leaveId) {
        this.leaveOfAbsenceService.deleteLeaveOfAbsenceByLeaveId(Integer.valueOf(leaveId));
        return "success";
    }
}
