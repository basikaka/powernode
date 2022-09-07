package com.hongrider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringboot {

    @RequestMapping("/hello")
    public String Hello(){
        return "欢迎使用springboot框架";
    }
}
