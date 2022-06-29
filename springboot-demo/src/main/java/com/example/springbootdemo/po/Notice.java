package com.example.springbootdemo.po;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {
    //公告id
    private Integer noticeId;
    //用户id
    private Integer userId;
    //公告标题
    private String noticeTopic;
    //公告内容
    private String noticeContent;
    //公告发布时间
    private Date noticeTime;
    //公告发布人
    private String noticePublisher;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNoticeTopic() {
        return noticeTopic;
    }

    public void setNoticeTopic(String noticeTopic) {
        this.noticeTopic = noticeTopic;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getNoticePublisher() {
        return noticePublisher;
    }

    public void setNoticePublisher(String noticePublisher) {
        this.noticePublisher = noticePublisher;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", userId=" + userId +
                ", noticeTopic='" + noticeTopic + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeTime=" + noticeTime +
                ", noticePublisher='" + noticePublisher + '\'' +
                '}';
    }
}
