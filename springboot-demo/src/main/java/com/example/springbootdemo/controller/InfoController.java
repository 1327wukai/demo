package com.example.springbootdemo.controller;


import com.example.springbootdemo.po.Info;
import com.example.springbootdemo.serivce.InfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "登录与注册")
@RequestMapping("/oa/Info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    //登录
    @GetMapping("/login/{username}&{password}&{permission}")
    @ApiOperation("登录")
    public String login(@PathVariable String username,@PathVariable String password,@PathVariable Integer permission){
        Info info = new Info();
        info.setUsername(username);
        info.setPassword(password);
        info.setPermission(permission);
        Info u = infoService.findOne(username,password,permission);
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

