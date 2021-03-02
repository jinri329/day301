package com.zyy.day301.dao;

import com.zyy.day301.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherDao {
    List<Teacher> findTeacherAll();

    int addTeacher(Teacher t);

    int delTeacher(Integer id);

    int upTeacher(Integer id);
}
