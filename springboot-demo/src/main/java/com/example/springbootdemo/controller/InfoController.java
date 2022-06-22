package com.example.springbootdemo.controller;


import com.example.springbootdemo.po.Info;
import com.example.springbootdemo.serivce.InfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@RestController
@Api(tags = "登录与修改信息")
@RequestMapping("/oa/Info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    //登录
    @GetMapping("/login")
    @ApiOperation("登录")
    public String login(String username,String password){
        Info info = new Info();
        info.setUsername(username);
        info.setPassword(password);
        Info u = infoService.findOne(username,password);
        if (u != null) {
            return "success";
        } else {
            return "error";
        }
    }

    //注册
    @PostMapping("/reg")
    @ApiOperation("注册")
    public String regInfo(@RequestBody Info info) {
        this.infoService.addOne(info);
        return "success";
    }

    //更新
    @PostMapping("/updateInfo")
    @ApiOperation("修改密码")
    public String updateInfo(@RequestBody Info info) {
        this.infoService.updateInfo(info);
        return "success";
    }
}

