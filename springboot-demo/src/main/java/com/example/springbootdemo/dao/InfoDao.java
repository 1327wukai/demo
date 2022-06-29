package com.example.springbootdemo.dao;


import com.example.springbootdemo.po.Info;
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
}
