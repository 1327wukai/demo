package com.example.springbootdemo.controller;

import com.example.springbootdemo.po.Notice;
import com.example.springbootdemo.serivce.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "公告管理")
@RequestMapping("/oa/Notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    /**
     * 查询所有公告列表
     */
    @GetMapping("/allNoticeList")
    @ApiOperation("所有公告列表")
    public List<Notice> selectAllNotice() {
        List<Notice> list = noticeService.selectAllNotice(new Notice());
        return list;
    }

    /**
     * 模糊查询公告列表
     */
    @GetMapping("/selectNoticeLikeList")
    @ApiOperation("模糊查询公告列表")
    public List<Notice> selectNoticeLikeList() {
        List<Notice> list = noticeService.selectNoticeLikeList(new Notice());
        return list;
    }


    /**
     * 获取公告详细信息
     */
    @GetMapping("/selectNoticeByNoticeId/{noticeId}")
    @ApiOperation("获取公告详细信息")
    public Notice selectNoticeByNoticeId(@PathVariable Integer noticeId) {
        Notice notice = new Notice();
        notice.setNoticeId(Integer.valueOf(noticeId));
        List<Notice> list=noticeService.selectNoticeByNoticeId(noticeId);
        return list.get(0);
    }

    /**
     * 新增公告
     */
    @PostMapping("/insertNotice")
    @ApiOperation("新增公告")
    public String insertNotice(@RequestBody Notice notice) {
        this.noticeService.insertNotice(notice);
        return "success";
    }

    /**
     * 修改公告
     */
    @PutMapping("/updateNotice")
    @ApiOperation("修改公告")
    public String updateNotice(@RequestBody Notice notice) {
        this.noticeService.updateNotice(notice);
        return "success";
    }

    /**
     * 删除公告
     */
    @DeleteMapping("/deleteNoticeByNoticeId/{noticeId}")
    @ApiOperation("删除公告")
    public String deleteNoticeByNoticeId(@PathVariable Integer noticeId) {
        this.noticeService.deleteNoticeByNoticeId(Integer.valueOf(noticeId));
        return "success";
    }

    /**
     * 批量删除公告
     */
    @DeleteMapping("/deleteNoticeByNoticeIds/{noticeId}")
    @ApiOperation("批量删除公告")
    public String deleteNoticeByNoticeIds(@PathVariable Integer[] noticeIds) {
        this.noticeService.deleteNoticeByNoticeIds(noticeIds);
        return "success";
    }
}
