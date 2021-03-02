package com.zyy.day301.service.impl;

import com.zyy.day301.bean.Teacher;
import com.zyy.day301.dao.TeacherDao;
import com.zyy.day301.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//transactional开启事务管理
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
   @Autowired
   private TeacherDao teacherDao;
    @Override
    public List<Teacher> findTeacherAll() {
        List<Teacher> all = teacherDao.findTeacherAll();
        return all;
    }

    @Override
    public int addTeacher(Teacher t) {
        int count = teacherDao.addTeacher(t);
        return count;
    }

    @Override
    public int delTeacher(Integer id) {
        int count = teacherDao.delTeacher(id);
        return count;
    }

    @Override
    public int upTeacher(Integer id) {
        int count = teacherDao.upTeacher(id);
        return count;
    }


}
