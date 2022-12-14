package com.hogrider;

import com.hogrider.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootContainer010Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootContainer010Application.class, args);

        UserService userService = (UserService) ctx.getBean("userService");

        userService.sayHello("野猪大学");

    }

}
