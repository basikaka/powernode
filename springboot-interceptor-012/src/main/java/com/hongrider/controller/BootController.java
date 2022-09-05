package com.hongrider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @GetMapping("/user/account")
    public String getAccount(){
        return "访问了user/account地址";
    }

    @GetMapping("/user/login")
    public String userLogin(){
        return "访问了user/login地址";
    }
}
