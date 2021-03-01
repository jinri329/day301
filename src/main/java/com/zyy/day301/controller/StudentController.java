package com.zyy.day301.controller;

import com.zyy.day301.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private Student student;
    @RequestMapping("/student")
    public String show(){
        //这样就可以直接访问在配置文件中赋值的student了
        //System.out.println(student.getAge()+","+student.getName());
        return "ok";
    }
}
