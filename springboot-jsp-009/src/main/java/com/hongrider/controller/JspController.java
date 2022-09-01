package com.hongrider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {

    @GetMapping("/myjsp")
    public String doJsp(HttpServletRequest request){

        request.setAttribute("data", "springboot 使用jsp");


        /*视图的逻辑名称*/
        return "index";
    }
}
