package com.hogrider.controller;

import com.hogrider.model.Student;
import com.hogrider.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/student/query")
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return student.toString();
    }
}
