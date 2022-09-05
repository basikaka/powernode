package com.hongrider.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 自定义拦截器
* */
public class LoginInterceptor implements HandlerInterceptor {
    /*
    *
    * @handler: 被拦截的控制器对象。
    * */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        System.out.println("执行了");
        return true;
    }
}
