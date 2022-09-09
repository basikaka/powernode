package com.hogrider.service.impl;

import com.hogrider.dao.StudentMapper;
import com.hogrider.model.Student;
import com.hogrider.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentDao;

    @Transactional
    @Override
    public int addStudent(Student student) {

        System.out.println("业务方法addStudnet执行");
        int rows = studentDao.insert(student);
        System.out.println("执行sql语句");

        //抛出一个运行时异常，目的是回滚事务
        //int i = 10/0;
        return rows;

    }
}
