package com.example.springbootdemo.serivce;



import com.example.springbootdemo.po.Info;

import java.util.List;

public interface InfoService {

    /**
     * 用户登录
     *
     * @param username,password
     * @return 登录
     */
    public List<Info> findOne(String username,String password);
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
