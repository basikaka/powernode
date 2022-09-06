package com.hogrider.service.impl;

import com.hogrider.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("sayHello: 你好  " + name);
    }
}
