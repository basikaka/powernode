package com.hogrider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ServiceProvider023Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider023Application.class, args);
    }

}
