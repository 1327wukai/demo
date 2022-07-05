package com.lianwei.OAsystem.controller;


import com.lianwei.OAsystem.po.Info;
import com.lianwei.OAsystem.serivce.InfoService;
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
    @GetMapping("/login/{username}&{password}")
    @ApiOperation("登录")
    public Integer login(@PathVariable String username, @PathVariable String password) {
        Info info = new Info();
        info.setUsername(username);
        info.setPassword(password);
        Info u = infoService.findOne(username, password);
        if (u != null) {
            return u.getPermission();
        } else {
            return 500;
        }
    }

    //根据用户名查找用户id
    @GetMapping("/findUserIdByUsername")
    @ApiOperation("根据用户名查找用户id")
    public Integer findUserIdByUsername(String username) {
        Info info = new Info();
        info.setUsername(username);
        Info info1 = this.infoService.findUserIdByUsername(username);
        return info1.getUserId();
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


