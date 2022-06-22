package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.LeaveOfAbsence;
import com.example.springbootdemo.serivce.LeaveOfAbsenceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "请假管理")
@RequestMapping("/oa/LeaveOfAbsence")
public class LeaveOfAbsenceController {

    @Autowired
    private LeaveOfAbsenceService leaveOfAbsenceService;

    /**
     * 查询请假列表
     */
    @GetMapping("/list")
    @ResponseBody
    public List<LeaveOfAbsence> list() {
        List<LeaveOfAbsence> list = leaveOfAbsenceService.selectLeaveOfAbsenceList(new LeaveOfAbsence());
        return list;
    }

    /**
     * 获取请假详细信息
     */

    @GetMapping("/getLeaveInfo/{leaveId}")
    @ResponseBody
    public LeaveOfAbsence getLeaveInfo(@PathVariable Integer leaveId) {
        LeaveOfAbsence leaveOfAbsence = new LeaveOfAbsence();
        leaveOfAbsence.setLeaveId(Integer.valueOf(leaveId));
        List<LeaveOfAbsence> list = this.leaveOfAbsenceService.selectLeaveOfAbsenceByLeaveId(leaveId);
        return list.get(0);
    }

    /**
     * 新增请假
     */
    @PostMapping("/addLeave")
    @ResponseBody
    public String addLeave(@RequestBody LeaveOfAbsence leaveofabsence) {
        this.leaveOfAbsenceService.insertLeaveOfAbsence(leaveofabsence);
        return "success";
    }

    /**
     * 修改请假
     */
    @PutMapping("/editLeave")
    @ResponseBody
    public String editLeave(@RequestBody LeaveOfAbsence leaveofabsence) {
        this.leaveOfAbsenceService.updateLeaveOfAbsence(leaveofabsence);
        return "success";
    }

    /**
     * 删除请假
     */
    @DeleteMapping("/deleteLeave/{leaveId}")
    @ResponseBody
    public String deleteLeave(@PathVariable Integer leaveId) {
        this.leaveOfAbsenceService.deleteLeaveOfAbsenceByLeaveId(Integer.valueOf(leaveId));
        return "success";
    }
}
