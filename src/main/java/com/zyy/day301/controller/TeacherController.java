package com.zyy.day301.controller;

import com.zyy.day301.bean.Teacher;
import com.zyy.day301.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/hello")
    public String show(Model model){
        List<Teacher> teacherAll = teacherService.findTeacherAll();
        model.addAttribute("t",teacherAll);
        return "index";
    }

    @RequestMapping("/add")
    public String addT(Model model){
        Teacher t =new Teacher();
        t.settName("zzz");
        t.settLevel(6);
        t.setPhone(534543);
        int i = teacherService.addTeacher(t);
        List<Teacher> teacherAll = teacherService.findTeacherAll();
        model.addAttribute("t",teacherAll);
        return "index";
    }

    @RequestMapping("/del")
    public String delT(Integer id,Model model){
        int i = teacherService.delTeacher(6);
        List<Teacher> teacherAll = teacherService.findTeacherAll();
        model.addAttribute("t",teacherAll);
        return "index";
    }

    @RequestMapping("/up")
    public String upT(Integer id,Model model){
        int i = teacherService.upTeacher(6);
        List<Teacher> teacherAll = teacherService.findTeacherAll();
        model.addAttribute("t",teacherAll);
        return "index";
    }
}
