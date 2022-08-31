package com.hongrider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${school.name}")
    private String name;

    @Value("${school.site}")
    private String site;

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String path;

    @GetMapping("/hello")
    public String doSome(){
        return "欢迎来到 spring boot 框架";
    }

    @GetMapping("/school")
    public String school(){
        return name + "site: " + site + " 访问的项目路径： " + path + " 端口号： " + port;
    }

}
