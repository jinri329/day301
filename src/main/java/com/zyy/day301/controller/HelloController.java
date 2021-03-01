package com.zyy.day301.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        //测试错误日志
        //int i = 1/0;
        return "ok";
    }
}
