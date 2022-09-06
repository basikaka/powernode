package com.hogrider.service.impl;

import com.hogrider.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行业务接口输出：" + name);
    }
}
