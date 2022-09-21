package com.hogrider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 为什么用@Controller ？ 因为现在返回的是视图了，和 @RestController 的区别。
 */
@Controller
public class HelloController {

    /***
     * 访问了'/hello'，就转发到main.jsp
     */
    @RequestMapping("/hello")
    public ModelAndView hello(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("data", "Springboot打包为jar包");
        mv.setViewName("main");

        return mv;
    }
}


