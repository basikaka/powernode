package com.hogrider.service.impl;

import com.hogrider.model.Student;
import com.hogrider.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * 使用dubbo中注解暴露的服务
 */
@Component
@DubboService( interfaceClass = StudentService.class, version = "1.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student student = new Student();

        if(id == 1001){
            student.setId(1001);
            student.setName("1001-kyoka");
            student.setAge(22);
        }else if(id == 1002){
            student.setId(1002);
            student.setName("1002-hiroko");
            student.setAge(23);
        }
        return student;
    }
}
