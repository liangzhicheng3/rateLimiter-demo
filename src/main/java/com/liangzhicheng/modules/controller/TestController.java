package com.liangzhicheng.modules.controller;

import com.liangzhicheng.common.response.Result;
import com.liangzhicheng.config.aop.annotation.RateLimit;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RateLimit
    @RequestMapping(value = "/test")
    public Result test(){
        return Result.success(10000, "success");
    }

}
