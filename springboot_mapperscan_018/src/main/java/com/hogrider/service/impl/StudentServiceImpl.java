package com.hogrider.service.impl;

import com.hogrider.dao.StudentDao;
import com.hogrider.model.Student;
import com.hogrider.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
