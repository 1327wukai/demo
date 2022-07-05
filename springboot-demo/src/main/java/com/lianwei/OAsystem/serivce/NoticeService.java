package com.lianwei.OAsystem.serivce;

import com.lianwei.OAsystem.po.Notice;

import java.util.List;

public interface NoticeService {
    /**
     * 查询公告数量
     *
     * @param
     * @return 公告
     */
    public Long queryNoticeCount();
    /**
     * 查询公告
     *
     * @param noticeId 公告主键
     * @return 公告
     */
    public List<Notice> selectNoticeByNoticeId(Integer noticeId);

    /**
     * 查询所有公告
     *
     * @param notice 公告
     * @return 公告集合
     */
    public List<Notice> selectAllNotice(Notice notice);

    /**
     * 模糊查询公告列表
     *
     * @param notice 公告
     * @return 公告集合
     */
    public List<Notice> selectNoticeLikeList(Notice notice);

    /**
     * 新增公告
     *
     * @param notice 公告
     * @return 结果
     */
    public void insertNotice(Notice notice);

    /**
     * 修改公告
     *
     * @param notice 公告
     * @return 结果
     */
    public void updateNotice(Notice notice);

    /**
     * 删除公告
     *
     * @param noticeId 公告主键
     * @return 结果
     */
    public void deleteNoticeByNoticeId(Integer noticeId);

    /**
     * 批量删除公告
     *
     * @param noticeIds 需要删除的数据主键集合
     * @return 结果
     */
    public void deleteNoticeByNoticeIds(Integer[] noticeIds);
}
