package com.example.springbootdemo.controller;


import com.example.springbootdemo.po.Info;
import com.example.springbootdemo.serivce.InfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(tags = "登录")
@RequestMapping("/oa/Info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    //登录
    @GetMapping("/logon")
    public Info getInfo(@PathVariable String username, @PathVariable String password) {
        Info info = new Info();
        info.setUsername(username);
        info.setPassword(password);
        List<Info> list = this.infoService.findOne(username,password);
        return list.get(0);
    }

    //注册
    @PostMapping("/reg")
    public String regInfo(@RequestBody Info info) {
        this.infoService.addOne(info);
        return "success";
    }

    //更新
    @PostMapping("/updateInfo")
    public String updateInfo(@RequestBody Info info) {
        this.infoService.updateInfo(info);
        return "success";
    }
}

