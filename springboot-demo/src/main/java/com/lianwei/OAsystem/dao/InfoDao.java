package com.lianwei.OAsystem.dao;


import com.lianwei.OAsystem.po.Info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InfoDao {

    /**
     * 用户登录
     *
     * @param username,password
     * @return 登录
     */
    public Info findOne(String username,String password);
    /**
     * 根据用户名查找用户id
     *
     * @param username
     * @return userid
     */
    public Info findUserIdByUsername(String username);
    /**
     * 用户注册
     *
     * @param info
     * @return 注册
     */
    public void addOne(Info info);

    /**
     * 用户更新
     *
     * @param info
     * @return 更新
     */
    public void updateInfo(Info info);

    /**
     * 按id查询用户
     */
    public List<Info> findUserById(Integer userId);
    /**
     * 查询所有用户
     */
    public List<Info> findAllUser(Info info);
}
