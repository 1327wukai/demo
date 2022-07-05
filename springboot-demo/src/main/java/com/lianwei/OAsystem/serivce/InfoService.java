package com.lianwei.OAsystem.serivce;



import com.lianwei.OAsystem.po.Info;

import java.util.List;

public interface InfoService {

    /**
     * 用户登录
     *
     * @param username,password,permission
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
     * 更新
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
