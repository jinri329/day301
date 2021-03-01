package com.zyy.day301.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TController {
    @RequestMapping("/ok")
    public String show(Model model){
        //数据存入页面 存入对象。。。都可以
        model.addAttribute("username","zhangsan");
        model.addAttribute("imgs","/img/IMG_4618(20201112-054518).JPG");
        //当controller注解不是restful风格后
        // 返回String类型的是跳转页面 这里是直接跳转templates文件夹下的html页面
        return "index";
    }
}
