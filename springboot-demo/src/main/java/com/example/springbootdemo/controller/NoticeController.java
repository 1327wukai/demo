package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Notice;
import com.example.springbootdemo.serivce.NoticeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "公告管理")
@RequestMapping("/oa/Notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 查询公告列表
     */
    @GetMapping("/list")
    public List<Notice> list() {
        List<Notice> list = noticeService.selectNoticeList(new Notice());
        return list;
    }

    /**
     * 获取公告详细信息
     */
    @GetMapping("/getNoticeInfo/{noticeId}")
    public Notice getNoticeInfo(@PathVariable Integer noticeId) {
        Notice notice = new Notice();
        notice.setNoticeId(Integer.valueOf(noticeId));
        return list().get(0);
    }

    /**
     * 新增公告
     */
    @PostMapping("/addNotice")
    public String addNotice(@RequestBody Notice notice) {
        this.noticeService.insertNotice(notice);
        return "success";
    }

    /**
     * 修改公告
     */
    @PutMapping("/editNotice")
    public String editNotice(@RequestBody Notice notice) {
        this.noticeService.updateNotice(notice);
        return "success";
    }

    /**
     * 删除公告
     */
    @DeleteMapping("/deleteNotice/{noticeId}")
    public String deleteNotice(@PathVariable Integer noticeId) {
        this.noticeService.deleteNoticeByNoticeId(Integer.valueOf(noticeId));
        return "success";
    }
}
