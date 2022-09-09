package com.hogrider.controller;

import com.hogrider.model.Student;
import com.hogrider.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name, int age){
        Student s1 = new Student();
        s1.setAge( age);
        s1.setName( name);
        int rows = studentService.addStudent( s1);

        return "添加学生： " + rows;

    }
}
