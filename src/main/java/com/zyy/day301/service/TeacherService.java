package com.zyy.day301.service;

import com.zyy.day301.bean.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findTeacherAll();

    int addTeacher(Teacher t);

    int delTeacher(Integer id);

    int upTeacher(Integer id);
}
