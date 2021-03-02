package com.zyy.day301.controller;

import com.zyy.day301.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/in")
    public String in(Model model){
        List<User> list = new ArrayList<User>();
        list.add(new User("zyy",22,"100@163.com"));
        list.add(new User("jinri",26,"101@163.com"));
        model.addAttribute("a",list);
        model.addAttribute("date",new Date());
        return "index";
    }
}
