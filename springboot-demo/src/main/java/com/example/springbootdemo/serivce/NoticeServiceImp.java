package com.example.springbootdemo.serivce;

import com.example.springbootdemo.dao.NoticeDao;
import com.example.springbootdemo.po.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NoticeServiceImp implements NoticeService {

    @Autowired
    private NoticeDao noticeDao;


    @Override
    @Transactional(readOnly = true)
    public List<Notice> selectNoticeByNoticeId(Integer noticeId) {
        return this.noticeDao.selectNoticeByNoticeId(noticeId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Notice> selectAllNotice(Notice notice) {
        return this.noticeDao.selectAllNotice(notice);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Notice> selectNoticeLikeList(Notice notice) {
        return this.noticeDao.selectNoticeLikeList(notice);
    }


    @Override
    public void insertNotice(Notice notice) {
        this.noticeDao.insertNotice(notice);
    }

    @Override
    public void updateNotice(Notice notice) {
        this.noticeDao.updateNotice(notice);
    }

    @Override
    public void deleteNoticeByNoticeId(Integer noticeId) {
        this.noticeDao.deleteNoticeByNoticeId(noticeId);
    }

    @Override
    public void deleteNoticeByNoticeIds(Integer[] noticeIds) {
        this.noticeDao.deleteNoticeByNoticeIds(noticeIds);
    }
}
